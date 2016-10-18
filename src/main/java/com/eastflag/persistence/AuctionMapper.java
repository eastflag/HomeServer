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
            "WHERE url is not null and result=-1",
            "LIMIT 500",
            "</script>"})
    List<AuctionVO> getAuctionItemList();

    @Select({"<script>",
            "SELECT * FROM auction",
            "WHERE site='11번가' and url is not null",
            "</script>"})
    List<AuctionVO> get11StreetItemList();

    @Select({"<script>",
            "SELECT * FROM auction",
            "WHERE site='지마켓' and url is not null",
            "</script>"})
    List<AuctionVO> getGMarketItemList();

    @Select({"<script>",
            "SELECT * FROM auction",
            "WHERE site='인터파크' and url is not null",
            "</script>"})
    List<AuctionVO> getInterparkItemList();

    @Select({"<script>",
            "SELECT * FROM auction",
            "WHERE site='스토어팜' and url is not null",
            "</script>"})
    List<AuctionVO> getStorefarmItemList();

    @Update({"<script>",
            "UPDATE auction",
            "set result = #{result}, result_msg=#{result_msg}",
            "WHERE auction_id = #{auction_id}",
            "</script>"})
    void updateAction(AuctionVO auction);

    @Update({"<script>",
            "UPDATE auction",
            "set crop_name = #{crop_name}",
            "WHERE auction_id = #{auction_id}",
            "</script>"})
    void updateName(AuctionVO auction);

}
