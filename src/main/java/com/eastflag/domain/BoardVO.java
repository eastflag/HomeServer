package com.eastflag.domain;

import lombok.Data;

/**
 * Created by eastflag on 2016-04-25.
 */
@Data
public class BoardVO {
    private int board_id;
    private int user_id;
    private String title;
    private String content;
    private String created;
    private String updated;
}
