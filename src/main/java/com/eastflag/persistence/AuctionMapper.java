package com.eastflag.persistence;

import com.eastflag.domain.AuctionVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by eastflag on 2016-10-06.
 */
@Mapper
public interface AuctionMapper {
    @Select({"<script>",
            "SELECT * FROM auction",
            //"WHERE url is not null and result = 0",
            "WHERE url is not null and result_msg='fail'",
            "LIMIT 500",
            "</script>"})
    List<AuctionVO> getAuctionItemList();

    @Update({"<script>",
            "UPDATE auction",
            "set result = #{result}, result_msg=#{result_msg}",
            "WHERE auction_id = #{auction_id}",
            "</script>"})
    void updateAction(AuctionVO auction);

}
