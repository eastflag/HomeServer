package com.eastflag.domain;

import lombok.Data;

/**
 * Created by eastflag on 2016-05-10.
 */
@Data
public class AttachVO {
    private int attach_id;
    private int board_id;
    private String path;
    private String org_name;
    private String upd_name;
    private String created;
}
