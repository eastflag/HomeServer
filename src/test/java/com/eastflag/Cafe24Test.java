package com.eastflag;

import com.eastflag.domain.CafeVO;
import com.eastflag.persistence.AuctionMapper;
import com.eastflag.persistence.CafeMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by eastflag on 2016-10-31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestProjectApplication.class)
public class Cafe24Test {
    @Autowired
    private CafeMapper cafeMapper;

    //@Ignore
    @Test
    public void makeColumn() {
        List<CafeVO> cafeList = cafeMapper.getCafeList();

        for (CafeVO cafe : cafeList) {
            //상품분류코드
            String code = cafe.getCode1() + "|" + cafe.getCode2() + "|" + cafe.getCode3();
            //이미지등록상세, 목록,
            String image2 = String.format("http://fashionkang.cafe24.com/web/product/big/%s/%s.jpg",cafe.getBox(), cafe.getImage2());
            String image1 = String.format("http://fashionkang.cafe24.com/web/product/big/%s/%s.jpg",cafe.getBox(), cafe.getImage1());
            //상품상세설명
            String desc = String.format("<div style=\"text-align: center;\">\n" +
                    "    <img src=\"http://fashionkang.cafe24.com/web/upload/headline/%s\"><p style=\"height:50px;\"></p>\n" +
                    "    <img src=\"http://fashionkang.cafe24.com/web/upload/headline/%s\"><p style=\"height:50px;\"></p>\n" +
                    "    <img src=\"http://fashionkang.cafe24.com/web/upload/desc/%s/%s.jpg\"><p style=\"height:50px;\"></p>\n" +
                    "    <img src=\"http://fashionkang.cafe24.com/web/upload/desc/%s/%s.jpg\"><p style=\"height:84px;\"></p>\n" +
                    "    <p style=\"font-size: 12pt;font-weight: bold;margin-bottom: 12px;\">%s</p>\n" +
                    "    <p style=\"font-size: 12pt;font-weight: bold;margin-bottom: 12px;\">%s</p>\n" +
                    "    <p style=\"font-size: 12pt;margin-bottom: 12px;\">%s</p>\n" +
                    "    <p style=\"font-size: 12pt;\">%s</p>\n" +
                    "    <img src=\"http://fashionkang.cafe24.com/web/upload/headline/원단 상세설명.png\">\n" +
                    "</div>", cafe.getHeadline1(), cafe.getHeadline2(), cafe.getBox(), cafe.getHeadline3(), cafe.getBox(), cafe.getHeadline4(),
                    cafe.getText1(), cafe.getText2(), cafe.getText3(), cafe.getText4());

            cafe.set상품분류번호(code);
            cafe.set이미지등록상세(image2);
            cafe.set이미지등록목록(image1);
            cafe.set이미지등록작은목록(image2);
            cafe.set이미지등록축소(image2);
            cafe.set상품상세설명(desc);
            cafeMapper.updateCafe(cafe);
        }
    }
}
