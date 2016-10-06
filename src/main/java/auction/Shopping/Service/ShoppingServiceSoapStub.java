/**
 * ShoppingServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ShoppingServiceSoapStub extends org.apache.axis.client.Stub implements ShoppingServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[65];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddItemMobile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItemMobileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUsedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddUsedItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemForUsedMarket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemForUsedMarketRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemForUsedMarketResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemPictures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemPicturesRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemPicturesResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemPicturesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemForBrandShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemForBrandShopRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemForBrandShopResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemVertical");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemVerticalRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemVerticalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemStock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseStockRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseStockResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemStockResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemSelling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemSellingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseItemSellingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingStatusRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingStatusResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemSellingStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSellingItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellingItemListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSellPlusItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellPlusItemRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellPlusItemListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemFreeExperienceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemFreeExperienceRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemFreeExperienceListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemFreeExperienceListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStorePickUpAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetStorePickupAddressNosRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetStorePickUpAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSellerAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressesResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellerAddressesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNationCode");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfNationListT"));
        oper.setReturnClass(ArrayOfNationListT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetNationCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShippingPlaceCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfShippingPlaceT"));
        oper.setReturnClass(ArrayOfShippingPlaceT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetShippingPlaceCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItemSelling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewSellingStatusRequestT"), auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewSellingStatusResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemSellingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT"), auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewClosedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT"), auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewClosedItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItemStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT"), auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItemForUsedMarket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT"), auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemFroUsedMarketResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemForUsedMarketResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItemStock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemStockRequestT"), auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemStockResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemStockResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Cart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestT"), auction.schema.Arche_Itempage3_Service_xsd.CartRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Carts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "requests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartRequestT"), ArrayOfCartRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartResponseT"));
        oper.setReturnClass(ArrayOfCartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "memberTicket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT"), auction.schema.Arche_APISvc_xsd.MemberTicketT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartViewT"));
        oper.setReturnClass(ArrayOfCartViewT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewCartDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "memberTicket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT"), auction.schema.Arche_APISvc_xsd.MemberTicketT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "cartNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailViewT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCartDetailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "cartNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestT"), auction.schema.Arche_Itempage3_Service_xsd.CartRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "SetCartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "memberTicket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT"), auction.schema.Arche_APISvc_xsd.MemberTicketT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "cartNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartResponseT"));
        oper.setReturnClass(auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveCarts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "memberTicket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT"), auction.schema.Arche_APISvc_xsd.MemberTicketT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "cartNos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfInt"), ArrayOfInt.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartResponseT"));
        oper.setReturnClass(ArrayOfCartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCartsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveCartsByNos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "memberTicket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT"), auction.schema.Arche_APISvc_xsd.MemberTicketT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "cartNos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartNoT"), ArrayOfCartNoT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartResponseT"));
        oper.setReturnClass(ArrayOfCartResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCartsByNosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnableNonMemberCartsByItemno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "itemno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "EnableNonMemberCartsByItemnoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FavoriteGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteGroupListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddGroupToFavoriteGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddGroupToFavoriteGroupListRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddGroupToFavoriteGroupListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddGroupToFavoriteGroupListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseFavoriteGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseFavoriteGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseFavoriteGroupResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseFavoriteGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveFavoriteGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "RemoveFavoriteGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "RemoveFavoriteGroupResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveFavoriteGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FavoriteItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteItemListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddItemToFavoriteItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemToFavoriteItemListRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemToFavoriteItemListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItemToFavoriteItemListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteItemFromFavoriteItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListRequestT"), auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DeleteItemFromFavoriteItemListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FavoriteModelList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelListRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteModelListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteModelAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteModelRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteModelResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteModelAddResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteModelDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteModelRequestT"), auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteModelResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteModelDeleteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FavoriteStoreList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreListRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteStoreListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteStoreAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreAddResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteStoreDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreRequestT"), auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreDeleteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteStoreGroupAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreGroupResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreGroupAddResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoFavoriteStoreGroupDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreGroupRequestT"), auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreGroupResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreGroupDeleteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FavoriteStoreGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupListRequestT"), auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupListResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteStoreGroupListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewItemVertical");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemVerticalRequestT"), auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemVerticalResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemVerticalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddOfficialNotice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddOfficialNoticeRequestT"), auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddOfficialNoticeResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddOfficialNoticeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewOfficialNotice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewOfficialNoticeRequestT"), auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewOfficialNoticeResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewOfficialNoticeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOfficialNoticeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetOfficialNoticeInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseAttributeRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseAttributeResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseAttributeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemAttributeRequestT"), auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemAttributeResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewAttributeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewCategoryAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewCategoryAttributeRequestT"), auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewCategoryAttributeResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCategoryAttributeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemGeocodeKorea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeKoreaResponseT"));
        oper.setReturnClass(auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeKoreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemLocationKorea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationKoreaRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationKoreaResponseT"));
        oper.setReturnClass(auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationKoreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseitemLocationkorea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseitemLocationkoreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemGeocodeBroad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeBroadResponseT"));
        oper.setReturnClass(auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeBroadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemLocationBroad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationBroadRequestT"), auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationBroadResponseT"));
        oper.setReturnClass(auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationBroadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReviseitemLocationBroad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationBroadRequestT"), auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationBroadResponseT"));
        oper.setReturnClass(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseitemLocationBroadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestDTC1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTRequestT"), auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTResponseT"));
        oper.setReturnClass(auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestDTC2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTRequestT"), auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTResponseT"));
        oper.setReturnClass(auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestDTC3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTRequestT"), auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTResponseT"));
        oper.setReturnClass(auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC3Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

    }

    public ShoppingServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShoppingServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShoppingServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "MemberTicketT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_APISvc_xsd.MemberTicketT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Code.xsd", "NationListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Code_xsd.NationListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "SellerAddrT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Item3_xsd.SellerAddrT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPlaceT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Item3_xsd.ShippingPlaceT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPolicyT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Item3_xsd.ShippingPolicyT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetailT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Item3_xsd.ShippingSellerDetailT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "AdditionalShippingTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.AdditionalShippingTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartDetailT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailTextT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailViewT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartItemShippingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartItemShippingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartNoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartNoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestStockTextT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartRequestStockTextT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartShippingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartShippingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartStockTextT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartTabTypeEnum");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartTabTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartViewT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.CartViewT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "MartCodeType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.MartCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestShippingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.RequestShippingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemFroUsedMarketResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemStockRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemStockResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "WishDeliveryAMPMCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Itempage3_Service_xsd.WishDeliveryAMPMCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteModelRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteModelResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreGroupRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreGroupResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteStoreResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddGroupToFavoriteGroupListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddGroupToFavoriteGroupListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemToFavoriteItemListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemToFavoriteItemListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddOfficialNoticeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddOfficialNoticeResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteItemResultT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteItemResultT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteModelRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteModelResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreGroupRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreGroupResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupBaseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupBaseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupResultT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemResultT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.FavoriteItemResultT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemFreeExperienceListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemFreeExperienceRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeBroadResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeKoreaResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationBroadRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationBroadResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationKoreaRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationKoreaResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressesResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellPlusItemRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetStorePickupAddressNosRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemLocationChangeType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ItemLocationChangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreBestItemListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreBestItemListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreItemListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "RemoveFavoriteGroupRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "RemoveFavoriteGroupResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseAttributeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseAttributeResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseFavoriteGroupRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseFavoriteGroupResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemForBrandShopRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemForUsedMarketRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationBroadRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationBroadResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemPicturesRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemPicturesResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingStatusRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemSellingStatusResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseItemVerticalRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseStockRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseStockResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "subFavoriteModelT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.SubFavoriteModelT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewCategoryAttributeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewCategoryAttributeResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemAttributeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemAttributeResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemVerticalRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemVerticalResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewOfficialNoticeRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewOfficialNoticeResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewSellingStatusRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewSellingStatusResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalServiceConditionCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalShippingTypeT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AdditionalShippingTypeT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AddressT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AddressT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AreaCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AreaCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AuthItemTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AuthItemTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AutoExtendT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.AutoExtendT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BookCashUnitCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.BookCashUnitCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BookInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.BookInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BrandShopInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.BrandShopInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BroadcastEquipmentT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.BroadcastEquipmentT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BuyLimitTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.BuyLimitTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CardDiscountT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.CardDiscountT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryAttrT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.CategoryAttrT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryBaseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.CategoryBaseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.CategoryT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChangeTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChargedWishKeywordT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChargedWishKeywordT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertDetailInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertInputType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChildProductSafeCertInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChildProductSafeCertT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertTargetCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChildProductSafeCertTargetCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ChildProductSafeCertType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliberationT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.DeliberationT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliveryAgencyCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.DeliveryAgencyCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DonorShoppingSearchType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.DonorShoppingSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "EnvironmentFriendlyLicenseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.EnvironmentFriendlyLicenseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ExtraInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ExtraInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FavoriteGroupT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.FavoriteGroupT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FavoriteItemT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.FavoriteItemT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FeatureTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.FeatureTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FoodLicenseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.FoodLicenseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "HealthFoodLicenseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.HealthFoodLicenseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ImportedItemT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ImportedItemT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemAuctionDiscountT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemAuctionDiscountT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBookCashT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemBookCashT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBrandShopPictureT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemBrandShopPictureT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBusinessRegistrationT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemBusinessRegistrationT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCallPlanT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemCallPlanT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCategoryAttrT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemCategoryAttrT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemContentsHtmlT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemContentsHtmlT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemDiscountT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemDiscountT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemExtraT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemExtraT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceListSortCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemFreeExperienceListSortCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemFreeExperienceListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemFreeExperienceRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceSearchConditionT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemFreeExperienceSearchConditionT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemFreeExperienceT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemImageT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemImageT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotice");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemOfficialNotice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiCodeT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiGroupT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemOfficialNotiGroupT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiValueT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPictureT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemPictureT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPictureUsedMarketT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemPictureUsedMarketT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemReturnT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemReturnT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemRevisePictureT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemRevisePictureT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingStatusCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemSellingStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingStatusT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemSellingStatusT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemSellingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStatusTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemStatusTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemStockT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemStockTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ItemT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "JoinFeeTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.JoinFeeTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MedicalInstrumentLicenseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.MedicalInstrumentLicenseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.MemberT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.MemberTicketT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MobilePhoneInstallmentT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.MobilePhoneInstallmentT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MobilePhoneRealPriceInstallmentT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.MobilePhoneRealPriceInstallmentT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionObjectNameT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.OptionObjectNameT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.OptionStockT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.OptionStockTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OriginTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.OriginTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.PeriodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.PeriodT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PickupFavorType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.PickupFavorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.PictureT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ProdCornerT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ProdCornerT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceAreaCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.QuickServiceAreaCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceAreaT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.QuickServiceAreaT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RawMaterialsType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.RawMaterialsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RegionalMarketT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.RegionalMarketT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RequestCalculationT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.RequestCalculationT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SafeAuthT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SafeAuthT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SafeAuthTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SafeAuthTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellerAddrT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellerAddrT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingFeatureT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingFeatureT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListSearchCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchConditionT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListSearchConditionT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchTermCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListSearchTermCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSortCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListSortCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListStatusCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingItemListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellingStatusT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellPlusItemSearchCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchConditionT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellPlusItemSearchConditionT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchTermCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellPlusItemSearchTermCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemStatusCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SellPlusItemStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingAdditionalT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingAdditionalT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingConditionT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeChargeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingFeeChargeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeConditionCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingFeeConditionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingFeeTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPaymentCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingPaymentCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPlaceT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingPlaceT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPolicyT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingPolicyT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingSellerConditionT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShippingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShopCatgProdT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.ShopCatgProdT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SkuInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.SkuInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockCalculationT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StockCalculationT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockConditionCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StockConditionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockStandAloneT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StockStandAloneT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StockT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockTextT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StockTextT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StorePickupAddressT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.StorePickupAddressT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "TraditionalCornerT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.TraditionalCornerT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedHistoryT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedHistoryT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketCatalogInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedMarketCatalogInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketItemSellingType");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedMarketItemSellingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketItemT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedMarketItemT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketRegisterChannelCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedMarketRegisterChannelCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketShippingT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.UsedMarketShippingT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTicalDisplayTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.VerTicalDisplayTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerticalItemInfoT");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.VerticalItemInfoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTicalItemTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.VerTicalItemTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTypeCode");
            cachedSerQNames.add(qName);
            cls = auction.schema.Arche_Service_xsd.VerTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTRequestT");
            cachedSerQNames.add(qName);
            cls = auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTResponseT");
            cachedSerQNames.add(qName);
            cls = auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartNoT");
            cachedSerQNames.add(qName);
            cls = ArrayOfCartNoT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartRequestT");
            cachedSerQNames.add(qName);
            cls = ArrayOfCartRequestT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartResponseT");
            cachedSerQNames.add(qName);
            cls = ArrayOfCartResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartViewT");
            cachedSerQNames.add(qName);
            cls = ArrayOfCartViewT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeBroadResponseT");
            cachedSerQNames.add(qName);
            cls = auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeKoreaResponseT");
            cachedSerQNames.add(qName);
            cls = auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationBroadResponseT");
            cachedSerQNames.add(qName);
            cls = auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationKoreaResponseT");
            cachedSerQNames.add(qName);
            cls = auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = ArrayOfInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfNationListT");
            cachedSerQNames.add(qName);
            cls = ArrayOfNationListT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfShippingPlaceT");
            cachedSerQNames.add(qName);
            cls = ArrayOfShippingPlaceT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT addItemMobile(auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddItemMobile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItemMobile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addUsedItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddUsedItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddUsedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItem(auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForUsedMarket(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemForUsedMarket");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemForUsedMarket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT reviseItemPictures(auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemPictures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemPictures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForBrandShop(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemForBrandShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemForBrandShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemVertical(auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemVertical");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemVertical"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT reviseItemStock(auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemStock");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemStock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT reviseItemSelling(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemSelling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemSelling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT reviseItemSellingStatus(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseItemSellingStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseItemSellingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellingItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetSellingItemList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellingItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellPlusItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetSellPlusItemList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellPlusItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT getItemFreeExperienceList(auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetItemFreeExperienceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemFreeExperienceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String getStorePickUpAddress(auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetStorePickUpAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetStorePickUpAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT getSellerAddresses(auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetSellerAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetSellerAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfNationListT getNationCode() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetNationCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetNationCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfNationListT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfNationListT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfNationListT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfShippingPlaceT getShippingPlaceCode(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetShippingPlaceCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetShippingPlaceCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfShippingPlaceT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfShippingPlaceT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfShippingPlaceT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT viewItemSelling(auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItemSelling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemSelling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewClosedItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewClosedItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewClosedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String viewItemStatus(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItemStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT viewItemForUsedMarket(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItemForUsedMarket");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemForUsedMarket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT viewItemStock(auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItemStock");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemStock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT cart(auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/Cart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "Cart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfCartResponseT carts(ArrayOfCartRequestT requests) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/Carts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "Carts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {requests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfCartResponseT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfCartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfCartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfCartViewT viewCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {memberTicket});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfCartViewT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfCartViewT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfCartViewT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT viewCartDetail(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewCartDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCartDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {memberTicket, new Long(cartNo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT setCart(long cartNo, auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/SetCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "SetCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Long(cartNo), request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT removeCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/RemoveCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {memberTicket, new Long(cartNo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Itempage3_Service_xsd.CartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Itempage3_Service_xsd.CartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfCartResponseT removeCarts(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfInt cartNos) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/RemoveCarts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCarts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {memberTicket, cartNos});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfCartResponseT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfCartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfCartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArrayOfCartResponseT removeCartsByNos(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfCartNoT cartNos) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/RemoveCartsByNos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveCartsByNos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {memberTicket, cartNos});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArrayOfCartResponseT) _resp;
            } catch (Exception _exception) {
                return (ArrayOfCartResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, ArrayOfCartResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean enableNonMemberCartsByItemno(String itemno) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/EnableNonMemberCartsByItemno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "EnableNonMemberCartsByItemno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {itemno});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Boolean) _resp).booleanValue();
            } catch (Exception _exception) {
                return ((Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT favoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/FavoriteGroupList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteGroupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT addGroupToFavoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddGroupToFavoriteGroupList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddGroupToFavoriteGroupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT reviseFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseFavoriteGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseFavoriteGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT removeFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/RemoveFavoriteGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "RemoveFavoriteGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT favoriteItemList(auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/FavoriteItemList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT addItemToFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddItemToFavoriteItemList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddItemToFavoriteItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT deleteItemFromFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DeleteItemFromFavoriteItemList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DeleteItemFromFavoriteItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT favoriteModelList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/FavoriteModelList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteModelList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT doFavoriteModelAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteModelAdd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteModelAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT doFavoriteModelDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteModelDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteModelDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT favoriteStoreList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/FavoriteStoreList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteStoreList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT doFavoriteStoreAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteStoreAdd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT doFavoriteStoreDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteStoreDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT doFavoriteStoreGroupAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteStoreGroupAdd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreGroupAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT doFavoriteStoreGroupDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/DoFavoriteStoreGroupDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "DoFavoriteStoreGroupDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT favoriteStoreGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/FavoriteStoreGroupList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "FavoriteStoreGroupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT viewItemVertical(auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewItemVertical");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewItemVertical"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT addOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/AddOfficialNotice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "AddOfficialNotice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT viewOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewOfficialNotice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewOfficialNotice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT getOfficialNoticeInfo(auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetOfficialNoticeInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetOfficialNoticeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT reviseAttribute(auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseAttribute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT viewAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewAttribute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT viewCategoryAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ViewCategoryAttribute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ViewCategoryAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT getItemGeocodeKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetItemGeocodeKorea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeKorea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT getItemLocationKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetItemLocationKorea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationKorea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT reviseitemLocationkorea(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseitemLocationkorea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseitemLocationkorea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT getItemGeocodeBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetItemGeocodeBroad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeBroad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT getItemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/GetItemLocationBroad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationBroad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT reviseitemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/ReviseitemLocationBroad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ReviseitemLocationBroad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC1(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/TestDTC1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC2(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/TestDTC2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC3(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.auction.co.kr/APIv1/ShoppingService/TestDTC3");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "TestDTC3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) _resp;
            } catch (Exception _exception) {
                return (auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT) org.apache.axis.utils.JavaUtils.convert(_resp, auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
