package com.eastflag;

import com.eastflag.domain.ResultVO;
import org.junit.Test;

/**
 * Created by eastflag on 2016-11-04.
 */
public class LombokTest {

    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg("hong");
        System.out.println(result);
    }
}
