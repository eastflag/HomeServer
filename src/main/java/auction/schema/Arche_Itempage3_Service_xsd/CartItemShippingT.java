/**
 * CartItemShippingT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class CartItemShippingT  implements java.io.Serializable {
    private java.math.BigDecimal shippingFee;  // attribute

    private int shippingType;  // attribute

    private auction.schema.Arche_Itempage3_Service_xsd.AdditionalShippingTypeCode additionalShippingType;  // attribute

    private java.util.Calendar wishDeliveryDate;  // attribute

    private java.math.BigDecimal giftPackingFee;  // attribute

    public CartItemShippingT() {
    }

    public CartItemShippingT(
           java.math.BigDecimal shippingFee,
           int shippingType,
           auction.schema.Arche_Itempage3_Service_xsd.AdditionalShippingTypeCode additionalShippingType,
           java.util.Calendar wishDeliveryDate,
           java.math.BigDecimal giftPackingFee) {
           this.shippingFee = shippingFee;
           this.shippingType = shippingType;
           this.additionalShippingType = additionalShippingType;
           this.wishDeliveryDate = wishDeliveryDate;
           this.giftPackingFee = giftPackingFee;
    }


    /**
     * Gets the shippingFee value for this CartItemShippingT.
     * 
     * @return shippingFee
     */
    public java.math.BigDecimal getShippingFee() {
        return shippingFee;
    }


    /**
     * Sets the shippingFee value for this CartItemShippingT.
     * 
     * @param shippingFee
     */
    public void setShippingFee(java.math.BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }


    /**
     * Gets the shippingType value for this CartItemShippingT.
     * 
     * @return shippingType
     */
    public int getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this CartItemShippingT.
     * 
     * @param shippingType
     */
    public void setShippingType(int shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the additionalShippingType value for this CartItemShippingT.
     * 
     * @return additionalShippingType
     */
    public auction.schema.Arche_Itempage3_Service_xsd.AdditionalShippingTypeCode getAdditionalShippingType() {
        return additionalShippingType;
    }


    /**
     * Sets the additionalShippingType value for this CartItemShippingT.
     * 
     * @param additionalShippingType
     */
    public void setAdditionalShippingType(auction.schema.Arche_Itempage3_Service_xsd.AdditionalShippingTypeCode additionalShippingType) {
        this.additionalShippingType = additionalShippingType;
    }


    /**
     * Gets the wishDeliveryDate value for this CartItemShippingT.
     * 
     * @return wishDeliveryDate
     */
    public java.util.Calendar getWishDeliveryDate() {
        return wishDeliveryDate;
    }


    /**
     * Sets the wishDeliveryDate value for this CartItemShippingT.
     * 
     * @param wishDeliveryDate
     */
    public void setWishDeliveryDate(java.util.Calendar wishDeliveryDate) {
        this.wishDeliveryDate = wishDeliveryDate;
    }


    /**
     * Gets the giftPackingFee value for this CartItemShippingT.
     * 
     * @return giftPackingFee
     */
    public java.math.BigDecimal getGiftPackingFee() {
        return giftPackingFee;
    }


    /**
     * Sets the giftPackingFee value for this CartItemShippingT.
     * 
     * @param giftPackingFee
     */
    public void setGiftPackingFee(java.math.BigDecimal giftPackingFee) {
        this.giftPackingFee = giftPackingFee;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CartItemShippingT)) return false;
        CartItemShippingT other = (CartItemShippingT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingFee==null && other.getShippingFee()==null) || 
             (this.shippingFee!=null &&
              this.shippingFee.equals(other.getShippingFee()))) &&
            this.shippingType == other.getShippingType() &&
            ((this.additionalShippingType==null && other.getAdditionalShippingType()==null) || 
             (this.additionalShippingType!=null &&
              this.additionalShippingType.equals(other.getAdditionalShippingType()))) &&
            ((this.wishDeliveryDate==null && other.getWishDeliveryDate()==null) || 
             (this.wishDeliveryDate!=null &&
              this.wishDeliveryDate.equals(other.getWishDeliveryDate()))) &&
            ((this.giftPackingFee==null && other.getGiftPackingFee()==null) || 
             (this.giftPackingFee!=null &&
              this.giftPackingFee.equals(other.getGiftPackingFee())));
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
        if (getShippingFee() != null) {
            _hashCode += getShippingFee().hashCode();
        }
        _hashCode += getShippingType();
        if (getAdditionalShippingType() != null) {
            _hashCode += getAdditionalShippingType().hashCode();
        }
        if (getWishDeliveryDate() != null) {
            _hashCode += getWishDeliveryDate().hashCode();
        }
        if (getGiftPackingFee() != null) {
            _hashCode += getGiftPackingFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartItemShippingT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartItemShippingT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("additionalShippingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdditionalShippingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "AdditionalShippingTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishDeliveryDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishDeliveryDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("giftPackingFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GiftPackingFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
