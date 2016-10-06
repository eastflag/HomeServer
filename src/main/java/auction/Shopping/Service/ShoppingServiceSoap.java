/**
 * ShoppingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public interface ShoppingServiceSoap extends java.rmi.Remote {

    /**
     * [물품 정보 등록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 등록(모바일 전용)]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT addItemMobile(auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고물품 고정가등록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addUsedItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 변경]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItem(auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고장터 고정가 물품 정보 간편수정]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForUsedMarket(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 변경 (이미지 전용)]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT reviseItemPictures(auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT req) throws java.rmi.RemoteException;

    /**
     * [브랜드관 물품 정보 변경]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForBrandShop(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT req) throws java.rmi.RemoteException;

    /**
     * [Vertical 상품 정보 변경]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemVertical(auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 등록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT reviseItemStock(auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 등록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT reviseItemSelling(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT req) throws java.rmi.RemoteException;

    /**
     * [판매 상태 변경]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT reviseItemSellingStatus(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품목록조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellingItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [SellPlus목록조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellPlusItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [공짜체험단 물품 목록조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT getItemFreeExperienceList(auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT req) throws java.rmi.RemoteException;

    /**
     * [방문수령지 주소록 조회]
     */
    public String getStorePickUpAddress(auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT req) throws java.rmi.RemoteException;

    /**
     * [판매자 주소록 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT getSellerAddresses(auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT req) throws java.rmi.RemoteException;

    /**
     * [원산지코드조회]
     */
    public ArrayOfNationListT getNationCode() throws java.rmi.RemoteException;

    /**
     * [판매자묶음배송비출하지조회]
     */
    public auction.Shopping.Service.ArrayOfShippingPlaceT getShippingPlaceCode(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [ViewItemSelling 설명요]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT viewItemSelling(auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 조회]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [종료된 물품 정보 조회]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewClosedItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 종료 여부 조회]
     */
    public String viewItemStatus(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고장터 고정가 물품 정보 간편 조회]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT viewItemForUsedMarket(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 조회
     */
    public auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT viewItemStock(auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT req) throws java.rmi.RemoteException;

    /**
     * [장바구니 담기]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT cart(auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException;

    /**
     * [장바구니 일괄담기]
     */
    public auction.Shopping.Service.ArrayOfCartResponseT carts(ArrayOfCartRequestT requests) throws java.rmi.RemoteException;

    /**
     * [장바구니 보기]
     */
    public ArrayOfCartViewT viewCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket) throws java.rmi.RemoteException;

    /**
     * [장바구니 상세정보보기]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT viewCartDetail(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException;

    /**
     * [장바구니 변경]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT setCart(long cartNo, auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException;

    /**
     * [장바구니 삭제]
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT removeCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException;

    /**
     * [n개의 장바구니 삭제]
     */
    public auction.Shopping.Service.ArrayOfCartResponseT removeCarts(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfInt cartNos) throws java.rmi.RemoteException;

    /**
     * [n개의 장바구니 삭제]
     */
    public auction.Shopping.Service.ArrayOfCartResponseT removeCartsByNos(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfCartNoT cartNos) throws java.rmi.RemoteException;

    /**
     * [비회원 장바구니 담기 가능 확인]
     */
    public boolean enableNonMemberCartsByItemno(String itemno) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT favoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 추가(개별,일괄)]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT addGroupToFavoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 수정(개별,일괄]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT reviseFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 삭제(개별,일괄]
     */
    public auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT removeFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT favoriteItemList(auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록에 추가]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT addItemToFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록에서 삭제]
     */
    public auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT deleteItemFromFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델목록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT favoriteModelList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델에 등록]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT doFavoriteModelAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델에 삭제]
     */
    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT doFavoriteModelDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT favoriteStoreList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심판매자 추가]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT doFavoriteStoreAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심판매자 삭제]
     */
    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT doFavoriteStoreDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 추가]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT doFavoriteStoreGroupAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 삭제]
     */
    public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT doFavoriteStoreGroupDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT favoriteStoreGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT req) throws java.rmi.RemoteException;

    /**
     * [Vertical 상품 정보 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT viewItemVertical(auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 입력]
     */
    public auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT addOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT viewOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 항목 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT getOfficialNoticeInfo(auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 속성 추가]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT reviseAttribute(auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 속성 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT viewAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT req) throws java.rmi.RemoteException;

    /**
     * [카테고리 속성 조회]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT viewCategoryAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 GEOCODE로 변환]
     */
    public auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT getItemGeocodeKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 조회]
     */
    public auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT getItemLocationKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 변경]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT reviseitemLocationkorea(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 GEOCODE로 변환(해외)]
     */
    public auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT getItemGeocodeBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 조회(해외)]
     */
    public auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT getItemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 변경(해외)]
     */
    public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT reviseitemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC1(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC2(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC3(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;
}
