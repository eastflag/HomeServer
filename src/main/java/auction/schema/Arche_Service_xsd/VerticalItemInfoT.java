/**
 * VerticalItemInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class VerticalItemInfoT  implements java.io.Serializable {
    private MemberT seller;

    private String itemID;  // attribute

    private boolean isVerticalItem;  // attribute

    private auction.schema.Arche_Service_xsd.VerTicalItemTypeCode verticalType;  // attribute

    private boolean cancelYN;  // attribute

    private boolean immediatelyYN;  // attribute

    private String vipUrl;  // attribute

    private String mobileVipUrl;  // attribute

    private auction.schema.Arche_Service_xsd.VerTicalDisplayTypeCode verticalDisplayType;  // attribute

    private boolean itemDisplayYN;  // attribute

    public VerticalItemInfoT() {
    }

    public VerticalItemInfoT(
           MemberT seller,
           String itemID,
           boolean isVerticalItem,
           auction.schema.Arche_Service_xsd.VerTicalItemTypeCode verticalType,
           boolean cancelYN,
           boolean immediatelyYN,
           String vipUrl,
           String mobileVipUrl,
           auction.schema.Arche_Service_xsd.VerTicalDisplayTypeCode verticalDisplayType,
           boolean itemDisplayYN) {
           this.seller = seller;
           this.itemID = itemID;
           this.isVerticalItem = isVerticalItem;
           this.verticalType = verticalType;
           this.cancelYN = cancelYN;
           this.immediatelyYN = immediatelyYN;
           this.vipUrl = vipUrl;
           this.mobileVipUrl = mobileVipUrl;
           this.verticalDisplayType = verticalDisplayType;
           this.itemDisplayYN = itemDisplayYN;
    }


    /**
     * Gets the seller value for this VerticalItemInfoT.
     * 
     * @return seller
     */
    public MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this VerticalItemInfoT.
     * 
     * @param seller
     */
    public void setSeller(MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the itemID value for this VerticalItemInfoT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this VerticalItemInfoT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the isVerticalItem value for this VerticalItemInfoT.
     * 
     * @return isVerticalItem
     */
    public boolean isIsVerticalItem() {
        return isVerticalItem;
    }


    /**
     * Sets the isVerticalItem value for this VerticalItemInfoT.
     * 
     * @param isVerticalItem
     */
    public void setIsVerticalItem(boolean isVerticalItem) {
        this.isVerticalItem = isVerticalItem;
    }


    /**
     * Gets the verticalType value for this VerticalItemInfoT.
     * 
     * @return verticalType
     */
    public auction.schema.Arche_Service_xsd.VerTicalItemTypeCode getVerticalType() {
        return verticalType;
    }


    /**
     * Sets the verticalType value for this VerticalItemInfoT.
     * 
     * @param verticalType
     */
    public void setVerticalType(auction.schema.Arche_Service_xsd.VerTicalItemTypeCode verticalType) {
        this.verticalType = verticalType;
    }


    /**
     * Gets the cancelYN value for this VerticalItemInfoT.
     * 
     * @return cancelYN
     */
    public boolean isCancelYN() {
        return cancelYN;
    }


    /**
     * Sets the cancelYN value for this VerticalItemInfoT.
     * 
     * @param cancelYN
     */
    public void setCancelYN(boolean cancelYN) {
        this.cancelYN = cancelYN;
    }


    /**
     * Gets the immediatelyYN value for this VerticalItemInfoT.
     * 
     * @return immediatelyYN
     */
    public boolean isImmediatelyYN() {
        return immediatelyYN;
    }


    /**
     * Sets the immediatelyYN value for this VerticalItemInfoT.
     * 
     * @param immediatelyYN
     */
    public void setImmediatelyYN(boolean immediatelyYN) {
        this.immediatelyYN = immediatelyYN;
    }


    /**
     * Gets the vipUrl value for this VerticalItemInfoT.
     * 
     * @return vipUrl
     */
    public String getVipUrl() {
        return vipUrl;
    }


    /**
     * Sets the vipUrl value for this VerticalItemInfoT.
     * 
     * @param vipUrl
     */
    public void setVipUrl(String vipUrl) {
        this.vipUrl = vipUrl;
    }


    /**
     * Gets the mobileVipUrl value for this VerticalItemInfoT.
     * 
     * @return mobileVipUrl
     */
    public String getMobileVipUrl() {
        return mobileVipUrl;
    }


    /**
     * Sets the mobileVipUrl value for this VerticalItemInfoT.
     * 
     * @param mobileVipUrl
     */
    public void setMobileVipUrl(String mobileVipUrl) {
        this.mobileVipUrl = mobileVipUrl;
    }


    /**
     * Gets the verticalDisplayType value for this VerticalItemInfoT.
     * 
     * @return verticalDisplayType
     */
    public auction.schema.Arche_Service_xsd.VerTicalDisplayTypeCode getVerticalDisplayType() {
        return verticalDisplayType;
    }


    /**
     * Sets the verticalDisplayType value for this VerticalItemInfoT.
     * 
     * @param verticalDisplayType
     */
    public void setVerticalDisplayType(auction.schema.Arche_Service_xsd.VerTicalDisplayTypeCode verticalDisplayType) {
        this.verticalDisplayType = verticalDisplayType;
    }


    /**
     * Gets the itemDisplayYN value for this VerticalItemInfoT.
     * 
     * @return itemDisplayYN
     */
    public boolean isItemDisplayYN() {
        return itemDisplayYN;
    }


    /**
     * Sets the itemDisplayYN value for this VerticalItemInfoT.
     * 
     * @param itemDisplayYN
     */
    public void setItemDisplayYN(boolean itemDisplayYN) {
        this.itemDisplayYN = itemDisplayYN;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VerticalItemInfoT)) return false;
        VerticalItemInfoT other = (VerticalItemInfoT) obj;
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
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            this.isVerticalItem == other.isIsVerticalItem() &&
            ((this.verticalType==null && other.getVerticalType()==null) || 
             (this.verticalType!=null &&
              this.verticalType.equals(other.getVerticalType()))) &&
            this.cancelYN == other.isCancelYN() &&
            this.immediatelyYN == other.isImmediatelyYN() &&
            ((this.vipUrl==null && other.getVipUrl()==null) || 
             (this.vipUrl!=null &&
              this.vipUrl.equals(other.getVipUrl()))) &&
            ((this.mobileVipUrl==null && other.getMobileVipUrl()==null) || 
             (this.mobileVipUrl!=null &&
              this.mobileVipUrl.equals(other.getMobileVipUrl()))) &&
            ((this.verticalDisplayType==null && other.getVerticalDisplayType()==null) || 
             (this.verticalDisplayType!=null &&
              this.verticalDisplayType.equals(other.getVerticalDisplayType()))) &&
            this.itemDisplayYN == other.isItemDisplayYN();
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        _hashCode += (isIsVerticalItem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVerticalType() != null) {
            _hashCode += getVerticalType().hashCode();
        }
        _hashCode += (isCancelYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImmediatelyYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVipUrl() != null) {
            _hashCode += getVipUrl().hashCode();
        }
        if (getMobileVipUrl() != null) {
            _hashCode += getMobileVipUrl().hashCode();
        }
        if (getVerticalDisplayType() != null) {
            _hashCode += getVerticalDisplayType().hashCode();
        }
        _hashCode += (isItemDisplayYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerticalItemInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerticalItemInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isVerticalItem");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsVerticalItem"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("verticalType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VerticalType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTicalItemTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cancelYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CancelYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("immediatelyYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImmediatelyYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vipUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VipUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mobileVipUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MobileVipUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("verticalDisplayType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VerticalDisplayType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTicalDisplayTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemDisplayYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemDisplayYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
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
