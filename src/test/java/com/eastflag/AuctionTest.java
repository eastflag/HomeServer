package com.eastflag;

import auction.AuctionApiService;
import auction.Security.Service.SecurityService;
import auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT;
import auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT;
import auction.schema.Arche_Service_xsd.ItemT;
import com.eastflag.domain.AuctionVO;
import com.eastflag.persistence.AuctionMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eastflag on 2016-10-06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestProjectApplication.class)
public class AuctionTest {
    private String userTicket = "d/KqNodn4VZcLVfFxwS8Y8/528fEoDjt49H5HQJCc3TkHoY1U79Afm4eBzQ2BBWWEN/kggBNPwBbTTFL76pMWk/ShWkEhyRDQ3FA1PufTtGTWWSQczgs+4mTYcBWrivAli/uybKCeRFtuKfoVAJKYw69i1APpiByB7x275ItoxOIHFi+apjV4Zp5eX5tPYOxFX6qPeryxDqRBL4bNLjL/b0=";

    private String devID = "eastflag "; // API 커뮤니티 회원 아디이
    private String appID = "javabrain"; // API 어플리케이션 아이디
    private String appPW = "ttoggangdklee"; // API 어플리케이션 패스워드

    @Autowired
    private AuctionMapper auctionMapper;

    @Ignore
    @Test
    public void viewItem() {
        try {
            System.out.print("Test Start !!!");

            AuctionApiService svc = new AuctionApiService();
            String ticket = svc.GetApplicationTicket(appID, devID, appPW);

            System.out.println(ticket);

            System.out.println("=== ViewItem ===");

			String ItemID ="A511952025";
			//String ItemID ="B334803423 ";
			ViewItemResponseT viewitemres = svc.ViewItemV3(ticket, ItemID);

			System.out.println("\n=== ViewItem Print ===");
			ItemT itemT = viewitemres.getItem();
			System.out.println("물품명 : "+ itemT.getName());
			System.out.println("물품번호 : "+ itemT.getItemID());
			System.out.println("부가설명 : "+ itemT.getAdvertiseMessage());
			System.out.println("이미지 url : "+ itemT.getItemPicture().getPicture1().getUri());
			System.out.println("판매가 : "+ itemT.getPrice());
			System.out.println("판매자 id : "+ itemT.getSeller().getMemberID());
			//Old: A로 시작, New: B로 시작
			System.out.println("getDescriptionVerType: " + itemT.getDescriptionVerType());
			//신규타입상품(B로시작)의 상품 상세 설명
			System.out.println("itemT.getItemContentsHtml().getItemHtml() : "+ itemT.getItemContentsHtml().getItemHtml());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void reviseItem() {
        try {
            System.out.print("Test Start !!!");

            AuctionApiService svc = new AuctionApiService();

            String itemID = "A512050255";
            String itemHtml ="<img src=\"http://link.webhard.co.kr/img/HDC_IDDNS79COKR_FD201608021016429658EDE2E\" /><img src=\"http://link.webhard.co.kr/img/HDC_IDDNS79COKR_FD2016080210164324920656F\" />\n" +
                    "<img src=\"http://link.webhard.co.kr/img/HDC_IDDNS79COKR_FD2016080210164324627EFC2\" />\n" +
                    "<img src=\"http://link.webhard.co.kr/img/HDC_IDDNS79COKR_FD20160802101643246990410\" /><img src=\"http://link.webhard.co.kr/img/HDC_IDDNS79COKR_FD201608021016429657F9EF0\" />";

            ReviseItemResponseT res = svc.ReviseItem(userTicket, itemID, itemHtml, null);
            System.out.println(res.toString());
            System.out.println(res.getItemID()); //실패시 null
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void executeAuction() {
        List<AuctionVO> itemList = auctionMapper.getAuctionItemList();

        AuctionApiService svc = new AuctionApiService();
        String itemID = null;
        String itemHtml = null;
        ReviseItemResponseT res = null;


        for (AuctionVO item : itemList) {
            try {
                itemID = item.getItem_id();
                itemHtml = item.getUrl();
                String name = item.getName();
                String crop_name = cropString(name, 50);

                if(name.equals(crop_name)) {
                    res = svc.ReviseItem(userTicket, itemID, itemHtml, null);
                } else {
                    res = svc.ReviseItem(userTicket, itemID, itemHtml, crop_name);
                }

                if (res.getItemID() != null) {
                    System.out.println("success: " + res.getItemID());

                    item.setResult(1);
                    item.setResult_msg(res.getItemID());
                    auctionMapper.updateAction(item);
                }

                Thread.sleep(100);
            } catch (Exception e) {
                item.setResult(-1);
                item.setResult_msg(e.getMessage());
                auctionMapper.updateAction(item);
                System.out.println("fail " + item.getItem_id() + ":" + e.getMessage());
            }

        }

    }

    @Ignore
    @Test
    public void crop11Street() {
        List<AuctionVO> itemList = auctionMapper.get11StreetItemList();

        for(AuctionVO item : itemList) {
            String name = item.getName();
            String crop_name = cropString(name, 50);
            item.setCrop_name(crop_name);

            auctionMapper.updateName(item);
            System.out.println(crop_name);
        }
    }

    @Test
    public void coprGmarketStreet() {
        List<AuctionVO> itemList = auctionMapper.getGMarketItemList();

        for(AuctionVO item : itemList) {
            String name = item.getName();
            String crop_name = cropString(name, 50);
            item.setCrop_name(crop_name);

            auctionMapper.updateName(item);
            System.out.println(crop_name);
        }
    }

    private String cropString(String name, int crop_length) {
        int count = 0;
        for(int i=0; i<name.length(); ++i) {
            int calulated_count = 0;
            if (name.substring(i, i+1).getBytes().length > 1) {
                calulated_count = 2;
            } else {
                calulated_count = 1;
            }

            count += calulated_count;

            if(count>crop_length) {
                return name.substring(0, i);
            }
        }

        return name;
    }
}
