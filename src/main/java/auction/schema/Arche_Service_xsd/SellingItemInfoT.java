/**
 * SellingItemInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SellingItemInfoT  implements java.io.Serializable {
    private String itemNo;  // attribute

    private String itemName;  // attribute

    private String categoryCode;  // attribute

    private String categoryName;  // attribute

    private java.math.BigDecimal sellingPrice;  // attribute

    private java.math.BigDecimal shippingCost;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType;  // attribute

    private java.util.Calendar itemRegistDate;  // attribute

    private int sumStockQty;  // attribute

    private int orderQty;  // attribute

    private int orderCompleteQty;  // attribute

    private java.util.Calendar listingBeginDate;  // attribute

    private java.util.Calendar listingEndDate;  // attribute

    private auction.schema.Arche_Service_xsd.SellingItemListStatusCode sellingStatusCode;  // attribute

    private auction.schema.Arche_Service_xsd.ItemStockTypeCode orderTypeCode;  // attribute

    private int premium;  // attribute

    private int recommend;  // attribute

    private String managementCode;  // attribute

    private String brandName;  // attribute

    private String modelName;  // attribute

    private boolean isShippingPrePayable;  // attribute

    private int premiumPlus;  // attribute

    private java.util.Calendar listingBeginDateReservation;  // attribute

    private java.util.Calendar listingEndDateReservation;  // attribute

    private java.util.Calendar presaleShippingDate;  // attribute

    private int shippingCondition;  // attribute

    private int minBuyQty;  // attribute

    private boolean isArrival;  // attribute

    private String freeGift;  // attribute

    private auction.schema.Arche_Service_xsd.OptionStockTypeCode optionTypeCode;  // attribute

    public SellingItemInfoT() {
    }

    public SellingItemInfoT(
           String itemNo,
           String itemName,
           String categoryCode,
           String categoryName,
           java.math.BigDecimal sellingPrice,
           java.math.BigDecimal shippingCost,
           auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType,
           auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType,
           java.util.Calendar itemRegistDate,
           int sumStockQty,
           int orderQty,
           int orderCompleteQty,
           java.util.Calendar listingBeginDate,
           java.util.Calendar listingEndDate,
           auction.schema.Arche_Service_xsd.SellingItemListStatusCode sellingStatusCode,
           auction.schema.Arche_Service_xsd.ItemStockTypeCode orderTypeCode,
           int premium,
           int recommend,
           String managementCode,
           String brandName,
           String modelName,
           boolean isShippingPrePayable,
           int premiumPlus,
           java.util.Calendar listingBeginDateReservation,
           java.util.Calendar listingEndDateReservation,
           java.util.Calendar presaleShippingDate,
           int shippingCondition,
           int minBuyQty,
           boolean isArrival,
           String freeGift,
           auction.schema.Arche_Service_xsd.OptionStockTypeCode optionTypeCode) {
           this.itemNo = itemNo;
           this.itemName = itemName;
           this.categoryCode = categoryCode;
           this.categoryName = categoryName;
           this.sellingPrice = sellingPrice;
           this.shippingCost = shippingCost;
           this.shippingFeeType = shippingFeeType;
           this.shippingFeeChargeType = shippingFeeChargeType;
           this.itemRegistDate = itemRegistDate;
           this.sumStockQty = sumStockQty;
           this.orderQty = orderQty;
           this.orderCompleteQty = orderCompleteQty;
           this.listingBeginDate = listingBeginDate;
           this.listingEndDate = listingEndDate;
           this.sellingStatusCode = sellingStatusCode;
           this.orderTypeCode = orderTypeCode;
           this.premium = premium;
           this.recommend = recommend;
           this.managementCode = managementCode;
           this.brandName = brandName;
           this.modelName = modelName;
           this.isShippingPrePayable = isShippingPrePayable;
           this.premiumPlus = premiumPlus;
           this.listingBeginDateReservation = listingBeginDateReservation;
           this.listingEndDateReservation = listingEndDateReservation;
           this.presaleShippingDate = presaleShippingDate;
           this.shippingCondition = shippingCondition;
           this.minBuyQty = minBuyQty;
           this.isArrival = isArrival;
           this.freeGift = freeGift;
           this.optionTypeCode = optionTypeCode;
    }


    /**
     * Gets the itemNo value for this SellingItemInfoT.
     * 
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this SellingItemInfoT.
     * 
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the itemName value for this SellingItemInfoT.
     * 
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this SellingItemInfoT.
     * 
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the categoryCode value for this SellingItemInfoT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this SellingItemInfoT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the categoryName value for this SellingItemInfoT.
     * 
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this SellingItemInfoT.
     * 
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the sellingPrice value for this SellingItemInfoT.
     * 
     * @return sellingPrice
     */
    public java.math.BigDecimal getSellingPrice() {
        return sellingPrice;
    }


    /**
     * Sets the sellingPrice value for this SellingItemInfoT.
     * 
     * @param sellingPrice
     */
    public void setSellingPrice(java.math.BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    /**
     * Gets the shippingCost value for this SellingItemInfoT.
     * 
     * @return shippingCost
     */
    public java.math.BigDecimal getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this SellingItemInfoT.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.math.BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingFeeType value for this SellingItemInfoT.
     * 
     * @return shippingFeeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeTypeCode getShippingFeeType() {
        return shippingFeeType;
    }


    /**
     * Sets the shippingFeeType value for this SellingItemInfoT.
     * 
     * @param shippingFeeType
     */
    public void setShippingFeeType(auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType) {
        this.shippingFeeType = shippingFeeType;
    }


    /**
     * Gets the shippingFeeChargeType value for this SellingItemInfoT.
     * 
     * @return shippingFeeChargeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeChargeCode getShippingFeeChargeType() {
        return shippingFeeChargeType;
    }


    /**
     * Sets the shippingFeeChargeType value for this SellingItemInfoT.
     * 
     * @param shippingFeeChargeType
     */
    public void setShippingFeeChargeType(auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType) {
        this.shippingFeeChargeType = shippingFeeChargeType;
    }


    /**
     * Gets the itemRegistDate value for this SellingItemInfoT.
     * 
     * @return itemRegistDate
     */
    public java.util.Calendar getItemRegistDate() {
        return itemRegistDate;
    }


    /**
     * Sets the itemRegistDate value for this SellingItemInfoT.
     * 
     * @param itemRegistDate
     */
    public void setItemRegistDate(java.util.Calendar itemRegistDate) {
        this.itemRegistDate = itemRegistDate;
    }


    /**
     * Gets the sumStockQty value for this SellingItemInfoT.
     * 
     * @return sumStockQty
     */
    public int getSumStockQty() {
        return sumStockQty;
    }


    /**
     * Sets the sumStockQty value for this SellingItemInfoT.
     * 
     * @param sumStockQty
     */
    public void setSumStockQty(int sumStockQty) {
        this.sumStockQty = sumStockQty;
    }


    /**
     * Gets the orderQty value for this SellingItemInfoT.
     * 
     * @return orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }


    /**
     * Sets the orderQty value for this SellingItemInfoT.
     * 
     * @param orderQty
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }


    /**
     * Gets the orderCompleteQty value for this SellingItemInfoT.
     * 
     * @return orderCompleteQty
     */
    public int getOrderCompleteQty() {
        return orderCompleteQty;
    }


    /**
     * Sets the orderCompleteQty value for this SellingItemInfoT.
     * 
     * @param orderCompleteQty
     */
    public void setOrderCompleteQty(int orderCompleteQty) {
        this.orderCompleteQty = orderCompleteQty;
    }


    /**
     * Gets the listingBeginDate value for this SellingItemInfoT.
     * 
     * @return listingBeginDate
     */
    public java.util.Calendar getListingBeginDate() {
        return listingBeginDate;
    }


    /**
     * Sets the listingBeginDate value for this SellingItemInfoT.
     * 
     * @param listingBeginDate
     */
    public void setListingBeginDate(java.util.Calendar listingBeginDate) {
        this.listingBeginDate = listingBeginDate;
    }


    /**
     * Gets the listingEndDate value for this SellingItemInfoT.
     * 
     * @return listingEndDate
     */
    public java.util.Calendar getListingEndDate() {
        return listingEndDate;
    }


    /**
     * Sets the listingEndDate value for this SellingItemInfoT.
     * 
     * @param listingEndDate
     */
    public void setListingEndDate(java.util.Calendar listingEndDate) {
        this.listingEndDate = listingEndDate;
    }


    /**
     * Gets the sellingStatusCode value for this SellingItemInfoT.
     * 
     * @return sellingStatusCode
     */
    public auction.schema.Arche_Service_xsd.SellingItemListStatusCode getSellingStatusCode() {
        return sellingStatusCode;
    }


    /**
     * Sets the sellingStatusCode value for this SellingItemInfoT.
     * 
     * @param sellingStatusCode
     */
    public void setSellingStatusCode(auction.schema.Arche_Service_xsd.SellingItemListStatusCode sellingStatusCode) {
        this.sellingStatusCode = sellingStatusCode;
    }


    /**
     * Gets the orderTypeCode value for this SellingItemInfoT.
     * 
     * @return orderTypeCode
     */
    public auction.schema.Arche_Service_xsd.ItemStockTypeCode getOrderTypeCode() {
        return orderTypeCode;
    }


    /**
     * Sets the orderTypeCode value for this SellingItemInfoT.
     * 
     * @param orderTypeCode
     */
    public void setOrderTypeCode(auction.schema.Arche_Service_xsd.ItemStockTypeCode orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }


    /**
     * Gets the premium value for this SellingItemInfoT.
     * 
     * @return premium
     */
    public int getPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this SellingItemInfoT.
     * 
     * @param premium
     */
    public void setPremium(int premium) {
        this.premium = premium;
    }


    /**
     * Gets the recommend value for this SellingItemInfoT.
     * 
     * @return recommend
     */
    public int getRecommend() {
        return recommend;
    }


    /**
     * Sets the recommend value for this SellingItemInfoT.
     * 
     * @param recommend
     */
    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }


    /**
     * Gets the managementCode value for this SellingItemInfoT.
     * 
     * @return managementCode
     */
    public String getManagementCode() {
        return managementCode;
    }


    /**
     * Sets the managementCode value for this SellingItemInfoT.
     * 
     * @param managementCode
     */
    public void setManagementCode(String managementCode) {
        this.managementCode = managementCode;
    }


    /**
     * Gets the brandName value for this SellingItemInfoT.
     * 
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this SellingItemInfoT.
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the modelName value for this SellingItemInfoT.
     * 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this SellingItemInfoT.
     * 
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the isShippingPrePayable value for this SellingItemInfoT.
     * 
     * @return isShippingPrePayable
     */
    public boolean isIsShippingPrePayable() {
        return isShippingPrePayable;
    }


    /**
     * Sets the isShippingPrePayable value for this SellingItemInfoT.
     * 
     * @param isShippingPrePayable
     */
    public void setIsShippingPrePayable(boolean isShippingPrePayable) {
        this.isShippingPrePayable = isShippingPrePayable;
    }


    /**
     * Gets the premiumPlus value for this SellingItemInfoT.
     * 
     * @return premiumPlus
     */
    public int getPremiumPlus() {
        return premiumPlus;
    }


    /**
     * Sets the premiumPlus value for this SellingItemInfoT.
     * 
     * @param premiumPlus
     */
    public void setPremiumPlus(int premiumPlus) {
        this.premiumPlus = premiumPlus;
    }


    /**
     * Gets the listingBeginDateReservation value for this SellingItemInfoT.
     * 
     * @return listingBeginDateReservation
     */
    public java.util.Calendar getListingBeginDateReservation() {
        return listingBeginDateReservation;
    }


    /**
     * Sets the listingBeginDateReservation value for this SellingItemInfoT.
     * 
     * @param listingBeginDateReservation
     */
    public void setListingBeginDateReservation(java.util.Calendar listingBeginDateReservation) {
        this.listingBeginDateReservation = listingBeginDateReservation;
    }


    /**
     * Gets the listingEndDateReservation value for this SellingItemInfoT.
     * 
     * @return listingEndDateReservation
     */
    public java.util.Calendar getListingEndDateReservation() {
        return listingEndDateReservation;
    }


    /**
     * Sets the listingEndDateReservation value for this SellingItemInfoT.
     * 
     * @param listingEndDateReservation
     */
    public void setListingEndDateReservation(java.util.Calendar listingEndDateReservation) {
        this.listingEndDateReservation = listingEndDateReservation;
    }


    /**
     * Gets the presaleShippingDate value for this SellingItemInfoT.
     * 
     * @return presaleShippingDate
     */
    public java.util.Calendar getPresaleShippingDate() {
        return presaleShippingDate;
    }


    /**
     * Sets the presaleShippingDate value for this SellingItemInfoT.
     * 
     * @param presaleShippingDate
     */
    public void setPresaleShippingDate(java.util.Calendar presaleShippingDate) {
        this.presaleShippingDate = presaleShippingDate;
    }


    /**
     * Gets the shippingCondition value for this SellingItemInfoT.
     * 
     * @return shippingCondition
     */
    public int getShippingCondition() {
        return shippingCondition;
    }


    /**
     * Sets the shippingCondition value for this SellingItemInfoT.
     * 
     * @param shippingCondition
     */
    public void setShippingCondition(int shippingCondition) {
        this.shippingCondition = shippingCondition;
    }


    /**
     * Gets the minBuyQty value for this SellingItemInfoT.
     * 
     * @return minBuyQty
     */
    public int getMinBuyQty() {
        return minBuyQty;
    }


    /**
     * Sets the minBuyQty value for this SellingItemInfoT.
     * 
     * @param minBuyQty
     */
    public void setMinBuyQty(int minBuyQty) {
        this.minBuyQty = minBuyQty;
    }


    /**
     * Gets the isArrival value for this SellingItemInfoT.
     * 
     * @return isArrival
     */
    public boolean isIsArrival() {
        return isArrival;
    }


    /**
     * Sets the isArrival value for this SellingItemInfoT.
     * 
     * @param isArrival
     */
    public void setIsArrival(boolean isArrival) {
        this.isArrival = isArrival;
    }


    /**
     * Gets the freeGift value for this SellingItemInfoT.
     * 
     * @return freeGift
     */
    public String getFreeGift() {
        return freeGift;
    }


    /**
     * Sets the freeGift value for this SellingItemInfoT.
     * 
     * @param freeGift
     */
    public void setFreeGift(String freeGift) {
        this.freeGift = freeGift;
    }


    /**
     * Gets the optionTypeCode value for this SellingItemInfoT.
     * 
     * @return optionTypeCode
     */
    public auction.schema.Arche_Service_xsd.OptionStockTypeCode getOptionTypeCode() {
        return optionTypeCode;
    }


    /**
     * Sets the optionTypeCode value for this SellingItemInfoT.
     * 
     * @param optionTypeCode
     */
    public void setOptionTypeCode(auction.schema.Arche_Service_xsd.OptionStockTypeCode optionTypeCode) {
        this.optionTypeCode = optionTypeCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SellingItemInfoT)) return false;
        SellingItemInfoT other = (SellingItemInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNo==null && other.getItemNo()==null) || 
             (this.itemNo!=null &&
              this.itemNo.equals(other.getItemNo()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            ((this.sellingPrice==null && other.getSellingPrice()==null) || 
             (this.sellingPrice!=null &&
              this.sellingPrice.equals(other.getSellingPrice()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingFeeType==null && other.getShippingFeeType()==null) || 
             (this.shippingFeeType!=null &&
              this.shippingFeeType.equals(other.getShippingFeeType()))) &&
            ((this.shippingFeeChargeType==null && other.getShippingFeeChargeType()==null) || 
             (this.shippingFeeChargeType!=null &&
              this.shippingFeeChargeType.equals(other.getShippingFeeChargeType()))) &&
            ((this.itemRegistDate==null && other.getItemRegistDate()==null) || 
             (this.itemRegistDate!=null &&
              this.itemRegistDate.equals(other.getItemRegistDate()))) &&
            this.sumStockQty == other.getSumStockQty() &&
            this.orderQty == other.getOrderQty() &&
            this.orderCompleteQty == other.getOrderCompleteQty() &&
            ((this.listingBeginDate==null && other.getListingBeginDate()==null) || 
             (this.listingBeginDate!=null &&
              this.listingBeginDate.equals(other.getListingBeginDate()))) &&
            ((this.listingEndDate==null && other.getListingEndDate()==null) || 
             (this.listingEndDate!=null &&
              this.listingEndDate.equals(other.getListingEndDate()))) &&
            ((this.sellingStatusCode==null && other.getSellingStatusCode()==null) || 
             (this.sellingStatusCode!=null &&
              this.sellingStatusCode.equals(other.getSellingStatusCode()))) &&
            ((this.orderTypeCode==null && other.getOrderTypeCode()==null) || 
             (this.orderTypeCode!=null &&
              this.orderTypeCode.equals(other.getOrderTypeCode()))) &&
            this.premium == other.getPremium() &&
            this.recommend == other.getRecommend() &&
            ((this.managementCode==null && other.getManagementCode()==null) || 
             (this.managementCode!=null &&
              this.managementCode.equals(other.getManagementCode()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            this.isShippingPrePayable == other.isIsShippingPrePayable() &&
            this.premiumPlus == other.getPremiumPlus() &&
            ((this.listingBeginDateReservation==null && other.getListingBeginDateReservation()==null) || 
             (this.listingBeginDateReservation!=null &&
              this.listingBeginDateReservation.equals(other.getListingBeginDateReservation()))) &&
            ((this.listingEndDateReservation==null && other.getListingEndDateReservation()==null) || 
             (this.listingEndDateReservation!=null &&
              this.listingEndDateReservation.equals(other.getListingEndDateReservation()))) &&
            ((this.presaleShippingDate==null && other.getPresaleShippingDate()==null) || 
             (this.presaleShippingDate!=null &&
              this.presaleShippingDate.equals(other.getPresaleShippingDate()))) &&
            this.shippingCondition == other.getShippingCondition() &&
            this.minBuyQty == other.getMinBuyQty() &&
            this.isArrival == other.isIsArrival() &&
            ((this.freeGift==null && other.getFreeGift()==null) || 
             (this.freeGift!=null &&
              this.freeGift.equals(other.getFreeGift()))) &&
            ((this.optionTypeCode==null && other.getOptionTypeCode()==null) || 
             (this.optionTypeCode!=null &&
              this.optionTypeCode.equals(other.getOptionTypeCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getItemNo() != null) {
            _hashCode += getItemNo().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        if (getSellingPrice() != null) {
            _hashCode += getSellingPrice().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingFeeType() != null) {
            _hashCode += getShippingFeeType().hashCode();
        }
        if (getShippingFeeChargeType() != null) {
            _hashCode += getShippingFeeChargeType().hashCode();
        }
        if (getItemRegistDate() != null) {
            _hashCode += getItemRegistDate().hashCode();
        }
        _hashCode += getSumStockQty();
        _hashCode += getOrderQty();
        _hashCode += getOrderCompleteQty();
        if (getListingBeginDate() != null) {
            _hashCode += getListingBeginDate().hashCode();
        }
        if (getListingEndDate() != null) {
            _hashCode += getListingEndDate().hashCode();
        }
        if (getSellingStatusCode() != null) {
            _hashCode += getSellingStatusCode().hashCode();
        }
        if (getOrderTypeCode() != null) {
            _hashCode += getOrderTypeCode().hashCode();
        }
        _hashCode += getPremium();
        _hashCode += getRecommend();
        if (getManagementCode() != null) {
            _hashCode += getManagementCode().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        _hashCode += (isIsShippingPrePayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPremiumPlus();
        if (getListingBeginDateReservation() != null) {
            _hashCode += getListingBeginDateReservation().hashCode();
        }
        if (getListingEndDateReservation() != null) {
            _hashCode += getListingEndDateReservation().hashCode();
        }
        if (getPresaleShippingDate() != null) {
            _hashCode += getPresaleShippingDate().hashCode();
        }
        _hashCode += getShippingCondition();
        _hashCode += getMinBuyQty();
        _hashCode += (isIsArrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFreeGift() != null) {
            _hashCode += getFreeGift().hashCode();
        }
        if (getOptionTypeCode() != null) {
            _hashCode += getOptionTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellingItemInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellingPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellingPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingCost");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingCost"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingFeeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingFeeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingFeeChargeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingFeeChargeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeChargeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemRegistDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemRegistDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sumStockQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SumStockQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("orderQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OrderQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("orderCompleteQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OrderCompleteQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listingBeginDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ListingBeginDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listingEndDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ListingEndDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellingStatusCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellingStatusCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListStatusCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("orderTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OrderTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("premium");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Premium"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recommend");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Recommend"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("managementCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ManagementCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("modelName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ModelName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isShippingPrePayable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsShippingPrePayable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("premiumPlus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PremiumPlus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listingBeginDateReservation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ListingBeginDateReservation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listingEndDateReservation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ListingEndDateReservation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("presaleShippingDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PresaleShippingDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minBuyQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinBuyQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isArrival");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsArrival"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freeGift");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FreeGift"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optionTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptionTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockTypeCode"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
