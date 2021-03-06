package com.eastflag.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by eastflag on 2016-04-25.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class BoardVO {
    private Integer board_id;
    //private int member_id;
    private String title;
    private String content;
    private Integer parent_id;
    private Integer level;
    private String created;
    private String updated;

    //board와 user를 조인하여 사용자 이름을 받아와서 매핑할때 필요.
    //만일 이 값이 null이면 json 매핑때 빠지게 된다.
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    private MemberVO member;
    //private String name;
}
