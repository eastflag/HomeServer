/**
 * CartShippingT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class CartShippingT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartItemShippingT cartItemShipping;

    private boolean isShippingFeePrePay;  // attribute

    public CartShippingT() {
    }

    public CartShippingT(
           auction.schema.Arche_Itempage3_Service_xsd.CartItemShippingT cartItemShipping,
           boolean isShippingFeePrePay) {
           this.cartItemShipping = cartItemShipping;
           this.isShippingFeePrePay = isShippingFeePrePay;
    }


    /**
     * Gets the cartItemShipping value for this CartShippingT.
     * 
     * @return cartItemShipping
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartItemShippingT getCartItemShipping() {
        return cartItemShipping;
    }


    /**
     * Sets the cartItemShipping value for this CartShippingT.
     * 
     * @param cartItemShipping
     */
    public void setCartItemShipping(auction.schema.Arche_Itempage3_Service_xsd.CartItemShippingT cartItemShipping) {
        this.cartItemShipping = cartItemShipping;
    }


    /**
     * Gets the isShippingFeePrePay value for this CartShippingT.
     * 
     * @return isShippingFeePrePay
     */
    public boolean isIsShippingFeePrePay() {
        return isShippingFeePrePay;
    }


    /**
     * Sets the isShippingFeePrePay value for this CartShippingT.
     * 
     * @param isShippingFeePrePay
     */
    public void setIsShippingFeePrePay(boolean isShippingFeePrePay) {
        this.isShippingFeePrePay = isShippingFeePrePay;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CartShippingT)) return false;
        CartShippingT other = (CartShippingT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartItemShipping==null && other.getCartItemShipping()==null) || 
             (this.cartItemShipping!=null &&
              this.cartItemShipping.equals(other.getCartItemShipping()))) &&
            this.isShippingFeePrePay == other.isIsShippingFeePrePay();
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
        if (getCartItemShipping() != null) {
            _hashCode += getCartItemShipping().hashCode();
        }
        _hashCode += (isIsShippingFeePrePay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartShippingT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartShippingT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isShippingFeePrePay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsShippingFeePrePay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartItemShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartItemShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartItemShippingT"));
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
