package com.eastflag.persistence;

import com.eastflag.domain.BoardVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ApiMapper {

    @Insert({"<script>",
            "INSERT INTO board(board_id, member_id, title, content, parent_id, level, created)",
            "VALUES(#{board_id}, #{member.member_id}, #{title}, #{content}, #{parent_id}, #{level}, now())",
            "</script>"})
    int addBoard(BoardVO board);

    @Select("SELECT IFNULL(max(board_id), 0)  FROM board")
    int getMaxBoardId();

    @Select("select board.*, member.name from board inner join member " +
            "on board.member_id=member.member_id " +
            "where board.board_id = #{board_id}")
    BoardVO getBoard(int board_id);

    @ResultMap("resultBoard")
    @Select("select board.*, member.name, member.id from board inner join member " +
            "on board.member_id=member.member_id " +
            "order by parent_id desc, board_id asc")
    List<BoardVO> getBoardList();

    //Todo: getBoardList 입력시 페이징 처리할수 있게 시작인덱스와 페이지 사이즈 추가

    @Update({"<script>",
            "UPDATE board",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='title!=null'>title = #{title},</if>",
                "<if test='content!=null'>content=#{content},</if>",
            "</trim>",
            "WHERE board_id = #{board_id}",
            "</script>"})
    int modifyBoard(BoardVO board);

    @Delete("DELETE from board where board_id = #{board_id}")
    int removeBoard(BoardVO board);
}
