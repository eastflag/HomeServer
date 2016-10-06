/**
 * UsedMarketItemT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class UsedMarketItemT  implements java.io.Serializable {
    private MemberT seller;

    private auction.schema.Arche_Service_xsd.UsedMarketShippingT shippingFee;

    private auction.schema.Arche_Service_xsd.ItemPictureUsedMarketT itemPicture;

    private auction.schema.Arche_Service_xsd.UsedMarketRegisterChannelCode registerChannel;

    private auction.schema.Arche_Service_xsd.UsedMarketCatalogInfoT catalog;

    private CategoryT category;

    private String itemID;  // attribute

    private String name;  // attribute

    private String description;  // attribute

    private java.math.BigDecimal price;  // attribute

    private java.math.BigDecimal startPrice;  // attribute

    private java.math.BigDecimal buyItNowPrice;  // attribute

    private String startTime;  // attribute

    private PeriodCode endTime;  // attribute

    private auction.schema.Arche_Service_xsd.UsedMarketItemSellingType sellingType;  // attribute

    private int bidderCount;  // attribute

    public UsedMarketItemT() {
    }

    public UsedMarketItemT(
           MemberT seller,
           auction.schema.Arche_Service_xsd.UsedMarketShippingT shippingFee,
           auction.schema.Arche_Service_xsd.ItemPictureUsedMarketT itemPicture,
           auction.schema.Arche_Service_xsd.UsedMarketRegisterChannelCode registerChannel,
           auction.schema.Arche_Service_xsd.UsedMarketCatalogInfoT catalog,
           CategoryT category,
           String itemID,
           String name,
           String description,
           java.math.BigDecimal price,
           java.math.BigDecimal startPrice,
           java.math.BigDecimal buyItNowPrice,
           String startTime,
           PeriodCode endTime,
           auction.schema.Arche_Service_xsd.UsedMarketItemSellingType sellingType,
           int bidderCount) {
           this.seller = seller;
           this.shippingFee = shippingFee;
           this.itemPicture = itemPicture;
           this.registerChannel = registerChannel;
           this.catalog = catalog;
           this.category = category;
           this.itemID = itemID;
           this.name = name;
           this.description = description;
           this.price = price;
           this.startPrice = startPrice;
           this.buyItNowPrice = buyItNowPrice;
           this.startTime = startTime;
           this.endTime = endTime;
           this.sellingType = sellingType;
           this.bidderCount = bidderCount;
    }


    /**
     * Gets the seller value for this UsedMarketItemT.
     * 
     * @return seller
     */
    public MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this UsedMarketItemT.
     * 
     * @param seller
     */
    public void setSeller(MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the shippingFee value for this UsedMarketItemT.
     * 
     * @return shippingFee
     */
    public auction.schema.Arche_Service_xsd.UsedMarketShippingT getShippingFee() {
        return shippingFee;
    }


    /**
     * Sets the shippingFee value for this UsedMarketItemT.
     * 
     * @param shippingFee
     */
    public void setShippingFee(auction.schema.Arche_Service_xsd.UsedMarketShippingT shippingFee) {
        this.shippingFee = shippingFee;
    }


    /**
     * Gets the itemPicture value for this UsedMarketItemT.
     * 
     * @return itemPicture
     */
    public auction.schema.Arche_Service_xsd.ItemPictureUsedMarketT getItemPicture() {
        return itemPicture;
    }


    /**
     * Sets the itemPicture value for this UsedMarketItemT.
     * 
     * @param itemPicture
     */
    public void setItemPicture(auction.schema.Arche_Service_xsd.ItemPictureUsedMarketT itemPicture) {
        this.itemPicture = itemPicture;
    }


    /**
     * Gets the registerChannel value for this UsedMarketItemT.
     * 
     * @return registerChannel
     */
    public auction.schema.Arche_Service_xsd.UsedMarketRegisterChannelCode getRegisterChannel() {
        return registerChannel;
    }


    /**
     * Sets the registerChannel value for this UsedMarketItemT.
     * 
     * @param registerChannel
     */
    public void setRegisterChannel(auction.schema.Arche_Service_xsd.UsedMarketRegisterChannelCode registerChannel) {
        this.registerChannel = registerChannel;
    }


    /**
     * Gets the catalog value for this UsedMarketItemT.
     * 
     * @return catalog
     */
    public auction.schema.Arche_Service_xsd.UsedMarketCatalogInfoT getCatalog() {
        return catalog;
    }


    /**
     * Sets the catalog value for this UsedMarketItemT.
     * 
     * @param catalog
     */
    public void setCatalog(auction.schema.Arche_Service_xsd.UsedMarketCatalogInfoT catalog) {
        this.catalog = catalog;
    }


    /**
     * Gets the category value for this UsedMarketItemT.
     * 
     * @return category
     */
    public CategoryT getCategory() {
        return category;
    }


    /**
     * Sets the category value for this UsedMarketItemT.
     * 
     * @param category
     */
    public void setCategory(CategoryT category) {
        this.category = category;
    }


    /**
     * Gets the itemID value for this UsedMarketItemT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this UsedMarketItemT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the name value for this UsedMarketItemT.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this UsedMarketItemT.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this UsedMarketItemT.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UsedMarketItemT.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this UsedMarketItemT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this UsedMarketItemT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the startPrice value for this UsedMarketItemT.
     * 
     * @return startPrice
     */
    public java.math.BigDecimal getStartPrice() {
        return startPrice;
    }


    /**
     * Sets the startPrice value for this UsedMarketItemT.
     * 
     * @param startPrice
     */
    public void setStartPrice(java.math.BigDecimal startPrice) {
        this.startPrice = startPrice;
    }


    /**
     * Gets the buyItNowPrice value for this UsedMarketItemT.
     * 
     * @return buyItNowPrice
     */
    public java.math.BigDecimal getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this UsedMarketItemT.
     * 
     * @param buyItNowPrice
     */
    public void setBuyItNowPrice(java.math.BigDecimal buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }


    /**
     * Gets the startTime value for this UsedMarketItemT.
     * 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this UsedMarketItemT.
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this UsedMarketItemT.
     * 
     * @return endTime
     */
    public PeriodCode getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this UsedMarketItemT.
     * 
     * @param endTime
     */
    public void setEndTime(PeriodCode endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the sellingType value for this UsedMarketItemT.
     * 
     * @return sellingType
     */
    public auction.schema.Arche_Service_xsd.UsedMarketItemSellingType getSellingType() {
        return sellingType;
    }


    /**
     * Sets the sellingType value for this UsedMarketItemT.
     * 
     * @param sellingType
     */
    public void setSellingType(auction.schema.Arche_Service_xsd.UsedMarketItemSellingType sellingType) {
        this.sellingType = sellingType;
    }


    /**
     * Gets the bidderCount value for this UsedMarketItemT.
     * 
     * @return bidderCount
     */
    public int getBidderCount() {
        return bidderCount;
    }


    /**
     * Sets the bidderCount value for this UsedMarketItemT.
     * 
     * @param bidderCount
     */
    public void setBidderCount(int bidderCount) {
        this.bidderCount = bidderCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UsedMarketItemT)) return false;
        UsedMarketItemT other = (UsedMarketItemT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.shippingFee==null && other.getShippingFee()==null) || 
             (this.shippingFee!=null &&
              this.shippingFee.equals(other.getShippingFee()))) &&
            ((this.itemPicture==null && other.getItemPicture()==null) || 
             (this.itemPicture!=null &&
              this.itemPicture.equals(other.getItemPicture()))) &&
            ((this.registerChannel==null && other.getRegisterChannel()==null) || 
             (this.registerChannel!=null &&
              this.registerChannel.equals(other.getRegisterChannel()))) &&
            ((this.catalog==null && other.getCatalog()==null) || 
             (this.catalog!=null &&
              this.catalog.equals(other.getCatalog()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.startPrice==null && other.getStartPrice()==null) || 
             (this.startPrice!=null &&
              this.startPrice.equals(other.getStartPrice()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              this.buyItNowPrice.equals(other.getBuyItNowPrice()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.sellingType==null && other.getSellingType()==null) || 
             (this.sellingType!=null &&
              this.sellingType.equals(other.getSellingType()))) &&
            this.bidderCount == other.getBidderCount();
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
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getShippingFee() != null) {
            _hashCode += getShippingFee().hashCode();
        }
        if (getItemPicture() != null) {
            _hashCode += getItemPicture().hashCode();
        }
        if (getRegisterChannel() != null) {
            _hashCode += getRegisterChannel().hashCode();
        }
        if (getCatalog() != null) {
            _hashCode += getCatalog().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getStartPrice() != null) {
            _hashCode += getStartPrice().hashCode();
        }
        if (getBuyItNowPrice() != null) {
            _hashCode += getBuyItNowPrice().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getSellingType() != null) {
            _hashCode += getSellingType().hashCode();
        }
        _hashCode += getBidderCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsedMarketItemT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketItemT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StartPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyItNowPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyItNowPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("endTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketItemSellingType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bidderCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BidderCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketShippingT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPictureUsedMarketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RegisterChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketRegisterChannelCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Catalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketCatalogInfoT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
