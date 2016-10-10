package auction;

import auction.Security.Service.SecurityServiceSoapProxy;
import auction.Security.Service.SecurityServiceSoapStub;
import auction.Shopping.Service.ShoppingServiceSoapProxy;
import auction.Shopping.Service.ShoppingServiceSoapStub;
import auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT;
import auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT;
import auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT;
import auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT;
import auction.schema.Arche_Service_xsd.ItemContentsHtmlT;
import auction.schema.Arche_Service_xsd.ItemT;
import auction.schema.Arche_Service_xsd.MemberTicketT;
import auction.schema.Arche_Service_xsd.VerTypeCode;
import auction.schema.Security.RequestApplicationTicketRequestT;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

/**
 * Created by eastflag on 2016-10-06.
 */
public class AuctionApiService {
    public String GetApplicationTicket(String appID, String devID, String appPW) {
        String appTicket = null;
        try {
            SecurityServiceSoapProxy securityProxy = new SecurityServiceSoapProxy();
            SecurityServiceSoapStub securityStub = (SecurityServiceSoapStub) securityProxy.getSecurityServiceSoap();

            RequestApplicationTicketRequestT req = new RequestApplicationTicketRequestT();
            req.setAppID(appID);
            req.setDevID(devID);
            req.setAppPassword(appPW);

            appTicket = securityStub.requestApplicationTicket(req);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return appTicket;
    }

    public ViewItemResponseT ViewItemV3(String Ticket, String ItemID) {
        ViewItemResponseT res = new ViewItemResponseT();
        try {
            // SOAP Header 저장
            //System.out.println("=== SOAP Header ===");
            SOAPHeaderElement soapMsgHeader = new SOAPHeaderElement(
                    new QName("http://www.auction.co.kr/Security", "EncryptedTicket", ""));
            soapMsgHeader.setPrefix("");
            soapMsgHeader.addChildElement("Value", "", "http://www.auction.co.kr/Security").setValue(Ticket);

            ShoppingServiceSoapProxy shoppingProxy = new ShoppingServiceSoapProxy();
            ShoppingServiceSoapStub shoppingStub = (ShoppingServiceSoapStub) shoppingProxy.getShoppingServiceSoap();

            shoppingStub.setHeader(soapMsgHeader);

            ViewItemRequestT req = new ViewItemRequestT();

            req.setItemID(ItemID);
            req.setVersion(1);

            res = shoppingStub.viewItem(req);

            System.out.print("=== ViewItem Call End ===");

        } catch (SOAPException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }

    public ReviseItemResponseT ReviseItem(String userTicket, String itemID, String itemHtml, String name) throws Exception {
        ReviseItemResponseT res = new ReviseItemResponseT();

        // SOAP Header 저장
        //System.out.println("=== SOAP Header ===");
        SOAPHeaderElement soapMsgHeader = new SOAPHeaderElement(
                new QName("http://www.auction.co.kr/Security", "EncryptedTicket", ""));
        soapMsgHeader.setPrefix("");
        soapMsgHeader.addChildElement("Value", "", "http://www.auction.co.kr/Security").setValue(userTicket);

        ShoppingServiceSoapProxy shoppingProxy = new ShoppingServiceSoapProxy();
        ShoppingServiceSoapStub shoppingStub = (ShoppingServiceSoapStub) shoppingProxy.getShoppingServiceSoap();

        shoppingStub.setHeader(soapMsgHeader);

        ReviseItemRequestT req = new ReviseItemRequestT();

        ItemT item = new ItemT();

        item.setItemID(itemID);
        if(name != null) {
            item.setName(name);
        }
        item.setDescriptionVerType(VerTypeCode.New);
        ItemContentsHtmlT contentHtml = new ItemContentsHtmlT();
        contentHtml.setItemHtml(itemHtml);
        item.setItemContentsHtml(contentHtml);

        req.setItem(item);
        req.setVersion(1);
        req.setMemberTicket(new MemberTicketT(userTicket));

        res = shoppingStub.reviseItem(req);

        return res;
    }
}
