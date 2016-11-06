package com.eastflag.controller;

import com.eastflag.Constant;
import com.eastflag.domain.AttachVO;
import com.eastflag.domain.BoardVO;
import com.eastflag.domain.ResultVO;
import com.eastflag.persistence.ApiMapper;
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
    private ApiMapper apiMapper;

    @RequestMapping(method = RequestMethod.POST, value="/api/addBoard")
    public ResultVO addBoard(@RequestBody BoardVO board) {
        int board_id = apiMapper.getMaxBoardId() + 1;
        board.setBoard_id(board_id);
        if (board.getLevel() == 0) {
            board.setParent_id(board_id);
        }

        int result = apiMapper.addBoard(board);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "internal error");
        }
    }

    @RequestMapping(method=RequestMethod.GET, value="/api/getBoardList")
    public List<BoardVO> getBoardList() {
        return apiMapper.getBoardList();
    }

    @RequestMapping(method=RequestMethod.GET, value="/api/getBoard")
    public BoardVO getBoard(@RequestParam("board_id") int board_id) {
        return apiMapper.getBoard(board_id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/api/modifyBoard")
    public ResultVO modifyBoard(@RequestBody BoardVO board) {
        int result = apiMapper.modifyBoard(board);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "internal error");
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/api/removeBoard")
    public ResultVO removeBoard(@RequestBody BoardVO board) {
        int result = apiMapper.removeBoard(board);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "internal error");
        }
    }

}
