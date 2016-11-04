package com.eastflag.controller;

import com.eastflag.Constant;
import com.eastflag.domain.AttachVO;
import com.eastflag.domain.BoardVO;
import com.eastflag.domain.ResultVO;
import com.eastflag.persistence.BoardMapper;
import com.eastflag.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by eastflag on 2016-04-25.
 */
@RestController
public class ApiController {
    @Autowired
    private BoardMapper boardMapper;

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello test";
    }

    //게시판 생성 API
    @RequestMapping(method = RequestMethod.POST, value = "/api/board")
    public ResultVO addBoard(@RequestBody BoardVO board) {
        System.out.println("board: " + board);

        boardMapper.insertBoard(board);

        return new ResultVO(0, "success");
    }

    //게시판 글 상세 보기
    @RequestMapping(method = RequestMethod.GET, value = "/api/board/{board_id}")
    public BoardVO getBoard(@PathVariable int board_id) {
        System.out.println("board_id: " + board_id);
        /*BoardVO board = new BoardVO();
        board.setTitle("제목");
        board.setContent("내용입니다.");*/
        BoardVO board = boardMapper.findById(board_id);

        return board;
    }

    //게시판 글 목록 보기
    @RequestMapping(method = RequestMethod.GET, value = "/api/board")
    public List<BoardVO> getBoardList() {

        return boardMapper.findAll();
    }

    //게시판 글 수정하기
    @RequestMapping(method = RequestMethod.PUT, value = "/api/board/{board_id}")
    public BoardVO modifyBoard(@PathVariable int board_id, @RequestBody BoardVO inBoard) {
        System.out.println("board_id: " + board_id);

        BoardVO board = new BoardVO();
        board.setBoard_id(board_id);
        if (inBoard.getContent() != null) {
            board.setContent(inBoard.getContent());
        }

        return board;
    }

    //게시판 글 삭제하기
    @RequestMapping(method = RequestMethod.DELETE, value = "/api/board/{board_id}")
    public ResultVO removeBoard(@PathVariable String board_id) {
        System.out.println("board_id: " + board_id);

        return new ResultVO(0, "success");
    }

    //단일 파일 업로드 테스트 : 원본 이름 그대로 저장하기
    @RequestMapping(method = RequestMethod.POST, value = "/api/upload/test")
    public ResultVO upload(@RequestParam("name") String name,
                           @RequestParam(value = "file", required = false) MultipartFile file) {
        File rootFolder = new File(Constant.ROOT_FOLDER + Constant.UPLOAD_FOLDER);

        //폴더가 존재하지 않는다면 생성
        if(!rootFolder.exists()){
            rootFolder.mkdirs();
        }

        if (!file.isEmpty()) {
            try {
                File saveFile = new File(rootFolder.getAbsolutePath(), file.getOriginalFilename());
                file.transferTo(saveFile);
            }
            catch (Exception e) {
                return new ResultVO(100, "fail");
            }
        }

        return new ResultVO(0, "success");
    }

    //다중 파일 업로드 : 이름 변경하여 저장
    @RequestMapping(method = RequestMethod.POST, value = "/api/upload")
    public ResultVO multiUpload(@ModelAttribute BoardVO board) {
        System.out.println("user_id:" + board.getUser_id());
        System.out.println("content:" + board.getContent());
        System.out.println("title:" + board.getTitle());

        //게시판 저장
        boardMapper.insertBoard(board); //insert 하고 나면 board 객체에 자동생성된 board_id가 리턴된다.
        System.out.println("board_id:" + board.getBoard_id());

        File rootFolder = new File(Constant.ROOT_FOLDER + Constant.UPLOAD_FOLDER);

        if(board.getFiles() != null && board.getFiles().size() > 0) {
            System.out.println("files size:" + board.getFiles().size());
            try {
                //파일을 지정된 경로에 저장후 저장된 정보를 돌려받는다.
                List<AttachVO> list = FileUtil.fileUpload(board.getFiles(), rootFolder.getAbsolutePath());
                //파일 정보를 DB에 저장
                for(AttachVO attach: list) {
                    attach.setBoard_id(board.getBoard_id()); //위에서 자동생성된 board_id를 넣어준다.
                    boardMapper.insertAttach(attach);
                }
            } catch (IOException e) {
                return new ResultVO(100, "fail");
            }
        }

        return new ResultVO(0, "success");
    }
}
