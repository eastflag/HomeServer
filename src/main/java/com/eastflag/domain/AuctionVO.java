package com.eastflag.domain;

import lombok.Data;

/**
 * Created by eastflag on 2016-10-06.
 */
@Data
public class AuctionVO {
    private int auction_id;
    private String site;
    private String status;
    private String seller_code;
    private String item_id;
    private String name;
    private String crop_name;
    private String url;
    private String is_modify;
    private int sell_price;
    private int sell_count;
    private int stock_count;
    private String option_status;
    private String order_status;
    private String extra_option;
    private int result;
    private String result_msg;
    private String created;
    private String updated;
}
