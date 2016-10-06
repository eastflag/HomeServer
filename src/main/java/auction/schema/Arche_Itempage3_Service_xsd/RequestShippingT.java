/**
 * RequestShippingT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class RequestShippingT  implements java.io.Serializable {
    private int additionalShippingType;  // attribute

    private java.util.Calendar wishDeliveryDate;  // attribute

    private auction.schema.Arche_Itempage3_Service_xsd.WishDeliveryAMPMCode wishDeliveryAMPM;  // attribute

    private boolean applyGiftPacking;  // attribute

    private MartCodeType martCode;  // attribute

    private String buyerPostNo;  // attribute

    public RequestShippingT() {
    }

    public RequestShippingT(
           int additionalShippingType,
           java.util.Calendar wishDeliveryDate,
           auction.schema.Arche_Itempage3_Service_xsd.WishDeliveryAMPMCode wishDeliveryAMPM,
           boolean applyGiftPacking,
           MartCodeType martCode,
           String buyerPostNo) {
           this.additionalShippingType = additionalShippingType;
           this.wishDeliveryDate = wishDeliveryDate;
           this.wishDeliveryAMPM = wishDeliveryAMPM;
           this.applyGiftPacking = applyGiftPacking;
           this.martCode = martCode;
           this.buyerPostNo = buyerPostNo;
    }


    /**
     * Gets the additionalShippingType value for this RequestShippingT.
     * 
     * @return additionalShippingType
     */
    public int getAdditionalShippingType() {
        return additionalShippingType;
    }


    /**
     * Sets the additionalShippingType value for this RequestShippingT.
     * 
     * @param additionalShippingType
     */
    public void setAdditionalShippingType(int additionalShippingType) {
        this.additionalShippingType = additionalShippingType;
    }


    /**
     * Gets the wishDeliveryDate value for this RequestShippingT.
     * 
     * @return wishDeliveryDate
     */
    public java.util.Calendar getWishDeliveryDate() {
        return wishDeliveryDate;
    }


    /**
     * Sets the wishDeliveryDate value for this RequestShippingT.
     * 
     * @param wishDeliveryDate
     */
    public void setWishDeliveryDate(java.util.Calendar wishDeliveryDate) {
        this.wishDeliveryDate = wishDeliveryDate;
    }


    /**
     * Gets the wishDeliveryAMPM value for this RequestShippingT.
     * 
     * @return wishDeliveryAMPM
     */
    public auction.schema.Arche_Itempage3_Service_xsd.WishDeliveryAMPMCode getWishDeliveryAMPM() {
        return wishDeliveryAMPM;
    }


    /**
     * Sets the wishDeliveryAMPM value for this RequestShippingT.
     * 
     * @param wishDeliveryAMPM
     */
    public void setWishDeliveryAMPM(auction.schema.Arche_Itempage3_Service_xsd.WishDeliveryAMPMCode wishDeliveryAMPM) {
        this.wishDeliveryAMPM = wishDeliveryAMPM;
    }


    /**
     * Gets the applyGiftPacking value for this RequestShippingT.
     * 
     * @return applyGiftPacking
     */
    public boolean isApplyGiftPacking() {
        return applyGiftPacking;
    }


    /**
     * Sets the applyGiftPacking value for this RequestShippingT.
     * 
     * @param applyGiftPacking
     */
    public void setApplyGiftPacking(boolean applyGiftPacking) {
        this.applyGiftPacking = applyGiftPacking;
    }


    /**
     * Gets the martCode value for this RequestShippingT.
     * 
     * @return martCode
     */
    public MartCodeType getMartCode() {
        return martCode;
    }


    /**
     * Sets the martCode value for this RequestShippingT.
     * 
     * @param martCode
     */
    public void setMartCode(MartCodeType martCode) {
        this.martCode = martCode;
    }


    /**
     * Gets the buyerPostNo value for this RequestShippingT.
     * 
     * @return buyerPostNo
     */
    public String getBuyerPostNo() {
        return buyerPostNo;
    }


    /**
     * Sets the buyerPostNo value for this RequestShippingT.
     * 
     * @param buyerPostNo
     */
    public void setBuyerPostNo(String buyerPostNo) {
        this.buyerPostNo = buyerPostNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestShippingT)) return false;
        RequestShippingT other = (RequestShippingT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.additionalShippingType == other.getAdditionalShippingType() &&
            ((this.wishDeliveryDate==null && other.getWishDeliveryDate()==null) || 
             (this.wishDeliveryDate!=null &&
              this.wishDeliveryDate.equals(other.getWishDeliveryDate()))) &&
            ((this.wishDeliveryAMPM==null && other.getWishDeliveryAMPM()==null) || 
             (this.wishDeliveryAMPM!=null &&
              this.wishDeliveryAMPM.equals(other.getWishDeliveryAMPM()))) &&
            this.applyGiftPacking == other.isApplyGiftPacking() &&
            ((this.martCode==null && other.getMartCode()==null) || 
             (this.martCode!=null &&
              this.martCode.equals(other.getMartCode()))) &&
            ((this.buyerPostNo==null && other.getBuyerPostNo()==null) || 
             (this.buyerPostNo!=null &&
              this.buyerPostNo.equals(other.getBuyerPostNo())));
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
        _hashCode += getAdditionalShippingType();
        if (getWishDeliveryDate() != null) {
            _hashCode += getWishDeliveryDate().hashCode();
        }
        if (getWishDeliveryAMPM() != null) {
            _hashCode += getWishDeliveryAMPM().hashCode();
        }
        _hashCode += (isApplyGiftPacking() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMartCode() != null) {
            _hashCode += getMartCode().hashCode();
        }
        if (getBuyerPostNo() != null) {
            _hashCode += getBuyerPostNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestShippingT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestShippingT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("additionalShippingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdditionalShippingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishDeliveryDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishDeliveryDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishDeliveryAMPM");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishDeliveryAMPM"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "WishDeliveryAMPMCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyGiftPacking");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyGiftPacking"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("martCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MartCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "MartCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerPostNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerPostNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
