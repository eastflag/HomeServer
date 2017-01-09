package com.eastflag.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by eastflag on 2017-01-09.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberVO {
    private Integer member_id;
    private String id;
    private String password;
    private String name;
    private String created;
    private String updated;
}
