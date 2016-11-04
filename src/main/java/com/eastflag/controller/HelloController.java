package com.eastflag.controller;

import com.eastflag.domain.ResultVO;
import org.springframework.web.bind.annotation.*;

/**
 * Created by eastflag on 2016-11-04.
 */
@RestController
public class HelloController {

    @RequestMapping(method= RequestMethod.GET, value="/hello")
    public String Hello() {
        return "Hello test";
    }

    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value="/hello2")
    public String Hello2(@RequestParam("name") String name) {
        return "Hello" + name;
    }

    @RequestMapping(method= {RequestMethod.POST}, value="/hello3")
    public ResultVO Hello3(@RequestParam("name") String name) {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg(name);
        return result;
    }

    @RequestMapping(method= {RequestMethod.POST}, value="/hello4")
    public String Hello4(@RequestBody ResultVO result) {
        return result.getMsg();
    }
}
