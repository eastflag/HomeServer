package com.eastflag.persistence;

import com.eastflag.domain.AuctionVO;
import com.eastflag.domain.CafeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by eastflag on 2016-10-31.
 */
@Mapper
public interface CafeMapper {
    @Select({"<script>",
            "SELECT * FROM cafe24",
            "</script>"})
    List<CafeVO> getCafeList();

    @Update({"<script>",
            "UPDATE cafe24 SET",
            "상품분류번호 = #{상품분류번호},",
            "이미지등록상세 = #{이미지등록상세},",
            "이미지등록목록 = #{이미지등록목록},",
            "이미지등록작은목록 = #{이미지등록작은목록},",
            "이미지등록축소 = #{이미지등록축소},",
            "상품상세설명 = #{상품상세설명}",
            "WHERE cafe24_id = #{cafe24_id}",
            "</script>"})
    int updateCafe(CafeVO cafe);
}
