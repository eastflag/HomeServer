/**
 * SellPlusItemSearchConditionT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SellPlusItemSearchConditionT  implements java.io.Serializable {
    private SellPlusItemSearchCode searchType;  // attribute

    private String searchValue;  // attribute

    private SellPlusItemSearchTermCode searchTermType;  // attribute

    private String searchTermFrom;  // attribute

    private String searchTermTo;  // attribute

    private String categoryCode;  // attribute

    private SellPlusItemStatusCode statusCode;  // attribute

    private StockConditionCode stockStatus;  // attribute

    private int lessThanCloseDays;  // attribute

    private java.math.BigDecimal fromSellingPrice;  // attribute

    private java.math.BigDecimal toSellingPrice;  // attribute

    private ShippingFeeTypeCode shipingFeeType;  // attribute

    private auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode premiumCondition;  // attribute

    private auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode recommendCondition;  // attribute

    private SellingItemListSortCode sortCondition;  // attribute

    private DonorShoppingSearchType donorShoppingSearchCode;  // attribute

    private int currentPageNumber;  // attribute

    public SellPlusItemSearchConditionT() {
    }

    public SellPlusItemSearchConditionT(
           SellPlusItemSearchCode searchType,
           String searchValue,
           SellPlusItemSearchTermCode searchTermType,
           String searchTermFrom,
           String searchTermTo,
           String categoryCode,
           SellPlusItemStatusCode statusCode,
           StockConditionCode stockStatus,
           int lessThanCloseDays,
           java.math.BigDecimal fromSellingPrice,
           java.math.BigDecimal toSellingPrice,
           ShippingFeeTypeCode shipingFeeType,
           auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode premiumCondition,
           auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode recommendCondition,
           SellingItemListSortCode sortCondition,
           DonorShoppingSearchType donorShoppingSearchCode,
           int currentPageNumber) {
           this.searchType = searchType;
           this.searchValue = searchValue;
           this.searchTermType = searchTermType;
           this.searchTermFrom = searchTermFrom;
           this.searchTermTo = searchTermTo;
           this.categoryCode = categoryCode;
           this.statusCode = statusCode;
           this.stockStatus = stockStatus;
           this.lessThanCloseDays = lessThanCloseDays;
           this.fromSellingPrice = fromSellingPrice;
           this.toSellingPrice = toSellingPrice;
           this.shipingFeeType = shipingFeeType;
           this.premiumCondition = premiumCondition;
           this.recommendCondition = recommendCondition;
           this.sortCondition = sortCondition;
           this.donorShoppingSearchCode = donorShoppingSearchCode;
           this.currentPageNumber = currentPageNumber;
    }


    /**
     * Gets the searchType value for this SellPlusItemSearchConditionT.
     * 
     * @return searchType
     */
    public SellPlusItemSearchCode getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this SellPlusItemSearchConditionT.
     * 
     * @param searchType
     */
    public void setSearchType(SellPlusItemSearchCode searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the searchValue value for this SellPlusItemSearchConditionT.
     * 
     * @return searchValue
     */
    public String getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SellPlusItemSearchConditionT.
     * 
     * @param searchValue
     */
    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchTermType value for this SellPlusItemSearchConditionT.
     * 
     * @return searchTermType
     */
    public SellPlusItemSearchTermCode getSearchTermType() {
        return searchTermType;
    }


    /**
     * Sets the searchTermType value for this SellPlusItemSearchConditionT.
     * 
     * @param searchTermType
     */
    public void setSearchTermType(SellPlusItemSearchTermCode searchTermType) {
        this.searchTermType = searchTermType;
    }


    /**
     * Gets the searchTermFrom value for this SellPlusItemSearchConditionT.
     * 
     * @return searchTermFrom
     */
    public String getSearchTermFrom() {
        return searchTermFrom;
    }


    /**
     * Sets the searchTermFrom value for this SellPlusItemSearchConditionT.
     * 
     * @param searchTermFrom
     */
    public void setSearchTermFrom(String searchTermFrom) {
        this.searchTermFrom = searchTermFrom;
    }


    /**
     * Gets the searchTermTo value for this SellPlusItemSearchConditionT.
     * 
     * @return searchTermTo
     */
    public String getSearchTermTo() {
        return searchTermTo;
    }


    /**
     * Sets the searchTermTo value for this SellPlusItemSearchConditionT.
     * 
     * @param searchTermTo
     */
    public void setSearchTermTo(String searchTermTo) {
        this.searchTermTo = searchTermTo;
    }


    /**
     * Gets the categoryCode value for this SellPlusItemSearchConditionT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this SellPlusItemSearchConditionT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the statusCode value for this SellPlusItemSearchConditionT.
     * 
     * @return statusCode
     */
    public SellPlusItemStatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SellPlusItemSearchConditionT.
     * 
     * @param statusCode
     */
    public void setStatusCode(SellPlusItemStatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the stockStatus value for this SellPlusItemSearchConditionT.
     * 
     * @return stockStatus
     */
    public StockConditionCode getStockStatus() {
        return stockStatus;
    }


    /**
     * Sets the stockStatus value for this SellPlusItemSearchConditionT.
     * 
     * @param stockStatus
     */
    public void setStockStatus(StockConditionCode stockStatus) {
        this.stockStatus = stockStatus;
    }


    /**
     * Gets the lessThanCloseDays value for this SellPlusItemSearchConditionT.
     * 
     * @return lessThanCloseDays
     */
    public int getLessThanCloseDays() {
        return lessThanCloseDays;
    }


    /**
     * Sets the lessThanCloseDays value for this SellPlusItemSearchConditionT.
     * 
     * @param lessThanCloseDays
     */
    public void setLessThanCloseDays(int lessThanCloseDays) {
        this.lessThanCloseDays = lessThanCloseDays;
    }


    /**
     * Gets the fromSellingPrice value for this SellPlusItemSearchConditionT.
     * 
     * @return fromSellingPrice
     */
    public java.math.BigDecimal getFromSellingPrice() {
        return fromSellingPrice;
    }


    /**
     * Sets the fromSellingPrice value for this SellPlusItemSearchConditionT.
     * 
     * @param fromSellingPrice
     */
    public void setFromSellingPrice(java.math.BigDecimal fromSellingPrice) {
        this.fromSellingPrice = fromSellingPrice;
    }


    /**
     * Gets the toSellingPrice value for this SellPlusItemSearchConditionT.
     * 
     * @return toSellingPrice
     */
    public java.math.BigDecimal getToSellingPrice() {
        return toSellingPrice;
    }


    /**
     * Sets the toSellingPrice value for this SellPlusItemSearchConditionT.
     * 
     * @param toSellingPrice
     */
    public void setToSellingPrice(java.math.BigDecimal toSellingPrice) {
        this.toSellingPrice = toSellingPrice;
    }


    /**
     * Gets the shipingFeeType value for this SellPlusItemSearchConditionT.
     * 
     * @return shipingFeeType
     */
    public ShippingFeeTypeCode getShipingFeeType() {
        return shipingFeeType;
    }


    /**
     * Sets the shipingFeeType value for this SellPlusItemSearchConditionT.
     * 
     * @param shipingFeeType
     */
    public void setShipingFeeType(ShippingFeeTypeCode shipingFeeType) {
        this.shipingFeeType = shipingFeeType;
    }


    /**
     * Gets the premiumCondition value for this SellPlusItemSearchConditionT.
     * 
     * @return premiumCondition
     */
    public auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode getPremiumCondition() {
        return premiumCondition;
    }


    /**
     * Sets the premiumCondition value for this SellPlusItemSearchConditionT.
     * 
     * @param premiumCondition
     */
    public void setPremiumCondition(auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode premiumCondition) {
        this.premiumCondition = premiumCondition;
    }


    /**
     * Gets the recommendCondition value for this SellPlusItemSearchConditionT.
     * 
     * @return recommendCondition
     */
    public auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode getRecommendCondition() {
        return recommendCondition;
    }


    /**
     * Sets the recommendCondition value for this SellPlusItemSearchConditionT.
     * 
     * @param recommendCondition
     */
    public void setRecommendCondition(auction.schema.Arche_Service_xsd.AdditionalServiceConditionCode recommendCondition) {
        this.recommendCondition = recommendCondition;
    }


    /**
     * Gets the sortCondition value for this SellPlusItemSearchConditionT.
     * 
     * @return sortCondition
     */
    public SellingItemListSortCode getSortCondition() {
        return sortCondition;
    }


    /**
     * Sets the sortCondition value for this SellPlusItemSearchConditionT.
     * 
     * @param sortCondition
     */
    public void setSortCondition(SellingItemListSortCode sortCondition) {
        this.sortCondition = sortCondition;
    }


    /**
     * Gets the donorShoppingSearchCode value for this SellPlusItemSearchConditionT.
     * 
     * @return donorShoppingSearchCode
     */
    public DonorShoppingSearchType getDonorShoppingSearchCode() {
        return donorShoppingSearchCode;
    }


    /**
     * Sets the donorShoppingSearchCode value for this SellPlusItemSearchConditionT.
     * 
     * @param donorShoppingSearchCode
     */
    public void setDonorShoppingSearchCode(DonorShoppingSearchType donorShoppingSearchCode) {
        this.donorShoppingSearchCode = donorShoppingSearchCode;
    }


    /**
     * Gets the currentPageNumber value for this SellPlusItemSearchConditionT.
     * 
     * @return currentPageNumber
     */
    public int getCurrentPageNumber() {
        return currentPageNumber;
    }


    /**
     * Sets the currentPageNumber value for this SellPlusItemSearchConditionT.
     * 
     * @param currentPageNumber
     */
    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SellPlusItemSearchConditionT)) return false;
        SellPlusItemSearchConditionT other = (SellPlusItemSearchConditionT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue()))) &&
            ((this.searchTermType==null && other.getSearchTermType()==null) || 
             (this.searchTermType!=null &&
              this.searchTermType.equals(other.getSearchTermType()))) &&
            ((this.searchTermFrom==null && other.getSearchTermFrom()==null) || 
             (this.searchTermFrom!=null &&
              this.searchTermFrom.equals(other.getSearchTermFrom()))) &&
            ((this.searchTermTo==null && other.getSearchTermTo()==null) || 
             (this.searchTermTo!=null &&
              this.searchTermTo.equals(other.getSearchTermTo()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.stockStatus==null && other.getStockStatus()==null) || 
             (this.stockStatus!=null &&
              this.stockStatus.equals(other.getStockStatus()))) &&
            this.lessThanCloseDays == other.getLessThanCloseDays() &&
            ((this.fromSellingPrice==null && other.getFromSellingPrice()==null) || 
             (this.fromSellingPrice!=null &&
              this.fromSellingPrice.equals(other.getFromSellingPrice()))) &&
            ((this.toSellingPrice==null && other.getToSellingPrice()==null) || 
             (this.toSellingPrice!=null &&
              this.toSellingPrice.equals(other.getToSellingPrice()))) &&
            ((this.shipingFeeType==null && other.getShipingFeeType()==null) || 
             (this.shipingFeeType!=null &&
              this.shipingFeeType.equals(other.getShipingFeeType()))) &&
            ((this.premiumCondition==null && other.getPremiumCondition()==null) || 
             (this.premiumCondition!=null &&
              this.premiumCondition.equals(other.getPremiumCondition()))) &&
            ((this.recommendCondition==null && other.getRecommendCondition()==null) || 
             (this.recommendCondition!=null &&
              this.recommendCondition.equals(other.getRecommendCondition()))) &&
            ((this.sortCondition==null && other.getSortCondition()==null) || 
             (this.sortCondition!=null &&
              this.sortCondition.equals(other.getSortCondition()))) &&
            ((this.donorShoppingSearchCode==null && other.getDonorShoppingSearchCode()==null) || 
             (this.donorShoppingSearchCode!=null &&
              this.donorShoppingSearchCode.equals(other.getDonorShoppingSearchCode()))) &&
            this.currentPageNumber == other.getCurrentPageNumber();
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        if (getSearchTermType() != null) {
            _hashCode += getSearchTermType().hashCode();
        }
        if (getSearchTermFrom() != null) {
            _hashCode += getSearchTermFrom().hashCode();
        }
        if (getSearchTermTo() != null) {
            _hashCode += getSearchTermTo().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStockStatus() != null) {
            _hashCode += getStockStatus().hashCode();
        }
        _hashCode += getLessThanCloseDays();
        if (getFromSellingPrice() != null) {
            _hashCode += getFromSellingPrice().hashCode();
        }
        if (getToSellingPrice() != null) {
            _hashCode += getToSellingPrice().hashCode();
        }
        if (getShipingFeeType() != null) {
            _hashCode += getShipingFeeType().hashCode();
        }
        if (getPremiumCondition() != null) {
            _hashCode += getPremiumCondition().hashCode();
        }
        if (getRecommendCondition() != null) {
            _hashCode += getRecommendCondition().hashCode();
        }
        if (getSortCondition() != null) {
            _hashCode += getSortCondition().hashCode();
        }
        if (getDonorShoppingSearchCode() != null) {
            _hashCode += getDonorShoppingSearchCode().hashCode();
        }
        _hashCode += getCurrentPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellPlusItemSearchConditionT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchConditionT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemSearchTermCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("statusCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellPlusItemStatusCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockConditionCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lessThanCloseDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LessThanCloseDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromSellingPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromSellingPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("toSellingPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ToSellingPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shipingFeeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShipingFeeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("premiumCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PremiumCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalServiceConditionCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recommendCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RecommendCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalServiceConditionCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sortCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SortCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSortCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("donorShoppingSearchCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DonorShoppingSearchCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DonorShoppingSearchType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currentPageNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrentPageNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
