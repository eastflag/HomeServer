/**
 * FavoriteItemT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class FavoriteItemT  implements java.io.Serializable {
    private String itemID;  // attribute

    private String name;  // attribute

    private String fixImagePath;  // attribute

    private java.math.BigDecimal nowPrice;  // attribute

    private java.math.BigDecimal maxPrice;  // attribute

    private String sellerID;  // attribute

    private java.math.BigDecimal price;  // attribute

    private int groupNo;  // attribute

    private String shippingType;  // attribute

    private int onGoing;  // attribute

    public FavoriteItemT() {
    }

    public FavoriteItemT(
           String itemID,
           String name,
           String fixImagePath,
           java.math.BigDecimal nowPrice,
           java.math.BigDecimal maxPrice,
           String sellerID,
           java.math.BigDecimal price,
           int groupNo,
           String shippingType,
           int onGoing) {
           this.itemID = itemID;
           this.name = name;
           this.fixImagePath = fixImagePath;
           this.nowPrice = nowPrice;
           this.maxPrice = maxPrice;
           this.sellerID = sellerID;
           this.price = price;
           this.groupNo = groupNo;
           this.shippingType = shippingType;
           this.onGoing = onGoing;
    }


    /**
     * Gets the itemID value for this FavoriteItemT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this FavoriteItemT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the name value for this FavoriteItemT.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this FavoriteItemT.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the fixImagePath value for this FavoriteItemT.
     * 
     * @return fixImagePath
     */
    public String getFixImagePath() {
        return fixImagePath;
    }


    /**
     * Sets the fixImagePath value for this FavoriteItemT.
     * 
     * @param fixImagePath
     */
    public void setFixImagePath(String fixImagePath) {
        this.fixImagePath = fixImagePath;
    }


    /**
     * Gets the nowPrice value for this FavoriteItemT.
     * 
     * @return nowPrice
     */
    public java.math.BigDecimal getNowPrice() {
        return nowPrice;
    }


    /**
     * Sets the nowPrice value for this FavoriteItemT.
     * 
     * @param nowPrice
     */
    public void setNowPrice(java.math.BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
    }


    /**
     * Gets the maxPrice value for this FavoriteItemT.
     * 
     * @return maxPrice
     */
    public java.math.BigDecimal getMaxPrice() {
        return maxPrice;
    }


    /**
     * Sets the maxPrice value for this FavoriteItemT.
     * 
     * @param maxPrice
     */
    public void setMaxPrice(java.math.BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }


    /**
     * Gets the sellerID value for this FavoriteItemT.
     * 
     * @return sellerID
     */
    public String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this FavoriteItemT.
     * 
     * @param sellerID
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the price value for this FavoriteItemT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this FavoriteItemT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the groupNo value for this FavoriteItemT.
     * 
     * @return groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }


    /**
     * Sets the groupNo value for this FavoriteItemT.
     * 
     * @param groupNo
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }


    /**
     * Gets the shippingType value for this FavoriteItemT.
     * 
     * @return shippingType
     */
    public String getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this FavoriteItemT.
     * 
     * @param shippingType
     */
    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the onGoing value for this FavoriteItemT.
     * 
     * @return onGoing
     */
    public int getOnGoing() {
        return onGoing;
    }


    /**
     * Sets the onGoing value for this FavoriteItemT.
     * 
     * @param onGoing
     */
    public void setOnGoing(int onGoing) {
        this.onGoing = onGoing;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteItemT)) return false;
        FavoriteItemT other = (FavoriteItemT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.fixImagePath==null && other.getFixImagePath()==null) || 
             (this.fixImagePath!=null &&
              this.fixImagePath.equals(other.getFixImagePath()))) &&
            ((this.nowPrice==null && other.getNowPrice()==null) || 
             (this.nowPrice!=null &&
              this.nowPrice.equals(other.getNowPrice()))) &&
            ((this.maxPrice==null && other.getMaxPrice()==null) || 
             (this.maxPrice!=null &&
              this.maxPrice.equals(other.getMaxPrice()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            this.groupNo == other.getGroupNo() &&
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            this.onGoing == other.getOnGoing();
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFixImagePath() != null) {
            _hashCode += getFixImagePath().hashCode();
        }
        if (getNowPrice() != null) {
            _hashCode += getNowPrice().hashCode();
        }
        if (getMaxPrice() != null) {
            _hashCode += getMaxPrice().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        _hashCode += getGroupNo();
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        _hashCode += getOnGoing();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteItemT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FavoriteItemT"));
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
        attrField.setFieldName("fixImagePath");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FixImagePath"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nowPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NowPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("onGoing");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OnGoing"));
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
