package com.eastflag.persistence;

import com.eastflag.domain.AttachVO;
import com.eastflag.domain.BoardVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ApiMapper {

    void insertBoard(BoardVO board);

    @Select("select board.*, member.name from board inner join member " +
            "on board.member_id=member.member_id " +
            "where board.board_id = #{board_id}")
    BoardVO getBoard(@Param("board_id") int board_id);

    @Select("select board.*, user.name from board inner join user on board.user_id=user.user_id")
    List<BoardVO> findAll();

    @Insert("INSERT INTO attach(board_id, path, org_name, upd_name) VALUES(#{board_id}, #{path}, #{org_name}, #{upd_name})")
    void insertAttach(AttachVO attach);
}
