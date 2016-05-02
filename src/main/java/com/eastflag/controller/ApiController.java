package com.eastflag.controller;

import com.eastflag.domain.BoardVO;
import com.eastflag.domain.Result;
import com.eastflag.persistence.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
}
