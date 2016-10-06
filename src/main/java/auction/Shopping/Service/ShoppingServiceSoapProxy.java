package auction.Shopping.Service;

public class ShoppingServiceSoapProxy implements ShoppingServiceSoap {
  private String _endpoint = null;
  private ShoppingServiceSoap shoppingServiceSoap = null;
  
  public ShoppingServiceSoapProxy() {
    _initShoppingServiceSoapProxy();
  }
  
  public ShoppingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initShoppingServiceSoapProxy();
  }
  
  private void _initShoppingServiceSoapProxy() {
    try {
      shoppingServiceSoap = (new ShoppingServiceLocator()).getShoppingServiceSoap();
      if (shoppingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shoppingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shoppingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shoppingServiceSoap != null)
      ((javax.xml.rpc.Stub)shoppingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ShoppingServiceSoap getShoppingServiceSoap() {
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap;
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItem(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT addItemMobile(auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItemMobile(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addUsedItem(auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addUsedItem(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItem(auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItem(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForUsedMarket(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemForUsedMarket(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT reviseItemPictures(auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemPictures(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForBrandShop(auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemForBrandShop(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemVertical(auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemVertical(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT reviseItemStock(auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemStock(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT reviseItemSelling(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemSelling(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT reviseItemSellingStatus(auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemSellingStatus(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellingItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellingItemList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellPlusItemList(auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellPlusItemList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT getItemFreeExperienceList(auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemFreeExperienceList(req);
  }
  
  public String getStorePickUpAddress(auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getStorePickUpAddress(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressesResponseT getSellerAddresses(auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellerAddresses(req);
  }
  
  public ArrayOfNationListT getNationCode() throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getNationCode();
  }
  
  public ArrayOfShippingPlaceT getShippingPlaceCode(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getShippingPlaceCode(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT viewItemSelling(auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemSelling(req);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItem(req);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewClosedItem(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewClosedItem(req);
  }
  
  public String viewItemStatus(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemStatus(req);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT viewItemForUsedMarket(auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemForUsedMarket(req);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT viewItemStock(auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemStock(req);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT cart(auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.cart(request);
  }
  
  public ArrayOfCartResponseT carts(ArrayOfCartRequestT requests) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.carts(requests);
  }
  
  public ArrayOfCartViewT viewCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCart(memberTicket);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT viewCartDetail(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCartDetail(memberTicket, cartNo);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT setCart(long cartNo, auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.setCart(cartNo, request);
  }
  
  public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT removeCart(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCart(memberTicket, cartNo);
  }
  
  public ArrayOfCartResponseT removeCarts(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfInt cartNos) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCarts(memberTicket, cartNos);
  }
  
  public ArrayOfCartResponseT removeCartsByNos(auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, ArrayOfCartNoT cartNos) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCartsByNos(memberTicket, cartNos);
  }
  
  public boolean enableNonMemberCartsByItemno(String itemno) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.enableNonMemberCartsByItemno(itemno);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResponseT favoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteGroupList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListResponseT addGroupToFavoriteGroupList(auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addGroupToFavoriteGroupList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupResponseT reviseFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseFavoriteGroup(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupResponseT removeFavoriteGroup(auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeFavoriteGroup(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListResponseT favoriteItemList(auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteItemList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListResponseT addItemToFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItemToFavoriteItemList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListResponseT deleteItemFromFavoriteItemList(auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.deleteItemFromFavoriteItemList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListResponseT favoriteModelList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteModelList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT doFavoriteModelAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteModelAdd(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT doFavoriteModelDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteModelDelete(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListResponseT favoriteStoreList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteStoreList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT doFavoriteStoreAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreAdd(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT doFavoriteStoreDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreDelete(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT doFavoriteStoreGroupAdd(auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreGroupAdd(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT doFavoriteStoreGroupDelete(auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreGroupDelete(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListResponseT favoriteStoreGroupList(auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteStoreGroupList(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT viewItemVertical(auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemVertical(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT addOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addOfficialNotice(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT viewOfficialNotice(auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewOfficialNotice(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT getOfficialNoticeInfo(auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getOfficialNoticeInfo(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT reviseAttribute(auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseAttribute(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeResponseT viewAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewAttribute(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeResponseT viewCategoryAttribute(auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCategoryAttribute(req);
  }
  
  public auction.Shopping.Service.ArrayOfGetItemGeocodeKoreaResponseT getItemGeocodeKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemGeocodeKorea(req);
  }
  
  public auction.Shopping.Service.ArrayOfGetItemLocationKoreaResponseT getItemLocationKorea(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemLocationKorea(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT reviseitemLocationkorea(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseitemLocationkorea(req);
  }
  
  public auction.Shopping.Service.ArrayOfGetItemGeocodeBroadResponseT getItemGeocodeBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemGeocodeBroad(req);
  }
  
  public auction.Shopping.Service.ArrayOfGetItemLocationBroadResponseT getItemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemLocationBroad(req);
  }
  
  public auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT reviseitemLocationBroad(auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseitemLocationBroad(req);
  }
  
  public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC1(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC1(req);
  }
  
  public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC2(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC2(req);
  }
  
  public auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC3(auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC3(req);
  }
  
  
}