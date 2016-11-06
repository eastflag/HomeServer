package com.eastflag;

import com.eastflag.domain.BoardVO;
import com.eastflag.persistence.ApiMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestProjectApplication.class)
public class TestProjectApplicationTests {

	@Autowired
	private ApiMapper apiMapper;

	@Ignore
	@Test
	public void addBoard() {
		int maxId = apiMapper.getMaxBoardId() + 1;
		System.out.println(maxId);
		BoardVO board = new BoardVO();
		board.setTitle("test");
		board.setContent("test content");
		board.setMember_id(1);
		board.setBoard_id(maxId);
		board.setParent_id(maxId);
		board.setLevel(0);
		int result =  apiMapper.addBoard(board);
		System.out.println("insert result:" + result);
		Assert.assertTrue(result>0);
	}

	//@Ignore
	@Test
	public void getBoard() {
		int board_id = apiMapper.getMaxBoardId();
		BoardVO board = apiMapper.getBoard(board_id);
		System.out.println(board);
		Assert.assertNotNull(board);
	}

	@Ignore
	@Test
	public void getBoardList() {
		List<BoardVO> boardList = apiMapper.getBoardList();
		System.out.println(boardList);
		Assert.assertNotNull(boardList);
	}

	@Ignore
	@Test
	public void modifyBoard() {
		int board_id = apiMapper.getMaxBoardId();
		BoardVO board = new BoardVO();
		board.setBoard_id(board_id);
		board.setTitle("수정");
		board.setContent("수정입니다.");
		int result = apiMapper.modifyBoard(board);
		System.out.println(board);
		Assert.assertTrue(result>0);
	}

	@Ignore
	@Test
	public void removeBoard() {
		int board_id = apiMapper.getMaxBoardId();
		BoardVO board = new BoardVO();
		board.setBoard_id(board_id);
		int result = apiMapper.removeBoard(board);
		Assert.assertTrue(result > 0);
	}
}
