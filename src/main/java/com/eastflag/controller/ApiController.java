package com.eastflag.controller;

import com.eastflag.Constant;
import com.eastflag.domain.AttachVO;
import com.eastflag.domain.BoardVO;
import com.eastflag.domain.Result;
import com.eastflag.persistence.BoardMapper;
import com.eastflag.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    public Result addBoard(@RequestBody BoardVO board) {
        System.out.println("board: " + board);

        boardMapper.insertBoard(board);

        return new Result(0, "success");
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
    public Result removeBoard(@PathVariable String board_id) {
        System.out.println("board_id: " + board_id);

        return new Result(0, "success");
    }

    //단일 파일 업로드 테스트 : 원본 이름 그대로 저장하기
    @RequestMapping(method = RequestMethod.POST, value = "/api/upload/test")
    public Result upload(@RequestParam("name") String name,
                         @RequestParam(value = "file", required = false) MultipartFile file) {
        File rootFolder = new File(Constant.UPLOAD_FOLDER);

        if (!file.isEmpty()) {
            try {
                File saveFile = new File(rootFolder.getAbsolutePath(), file.getOriginalFilename());
                file.transferTo(saveFile);
            }
            catch (Exception e) {
                return new Result(100, "fail");
            }
        }

        return new Result(0, "success");
    }

    //다중 파일 업로드 : 이름 변경하여 저장
    @RequestMapping(method = RequestMethod.POST, value = "/api/upload")
    public Result multiUpload(@ModelAttribute BoardVO board) {
        System.out.println("user_id:" + board.getUser_id());
        System.out.println("content:" + board.getContent());
        System.out.println("title:" + board.getTitle());

        //게시판 저장
        boardMapper.insertBoard(board); //insert 하고 나면 board 객체에 자동생성된 board_id가 리턴된다.

        File rootFolder = new File(Constant.UPLOAD_FOLDER);

        if(board.getFiles() != null && board.getFiles().size() > 0) {
            try {
                //파일을 지정된 경로에 저장후 저장된 정보를 돌려받는다.
                List<AttachVO> list = FileUtil.fileUpload(board.getFiles(), rootFolder.getAbsolutePath());
                //파일 정보를 DB에 저장
                for(AttachVO attach: list) {
                    attach.setBoard_id(board.getBoard_id()); //위에서 자동생성된 board_id를 넣어준다.
                    boardMapper.insertAttach(attach);
                }
            } catch (IOException e) {
                return new Result(100, "fail");
            }
        }

        return new Result(0, "success");
    }
}
