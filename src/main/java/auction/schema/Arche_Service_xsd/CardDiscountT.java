/**
 * CardDiscountT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class CardDiscountT  implements java.io.Serializable {
    private boolean interestFree3Months;  // attribute

    private boolean interestFree6Months;  // attribute

    private boolean applyLumpSumDiscount;  // attribute

    public CardDiscountT() {
    }

    public CardDiscountT(
           boolean interestFree3Months,
           boolean interestFree6Months,
           boolean applyLumpSumDiscount) {
           this.interestFree3Months = interestFree3Months;
           this.interestFree6Months = interestFree6Months;
           this.applyLumpSumDiscount = applyLumpSumDiscount;
    }


    /**
     * Gets the interestFree3Months value for this CardDiscountT.
     * 
     * @return interestFree3Months
     */
    public boolean isInterestFree3Months() {
        return interestFree3Months;
    }


    /**
     * Sets the interestFree3Months value for this CardDiscountT.
     * 
     * @param interestFree3Months
     */
    public void setInterestFree3Months(boolean interestFree3Months) {
        this.interestFree3Months = interestFree3Months;
    }


    /**
     * Gets the interestFree6Months value for this CardDiscountT.
     * 
     * @return interestFree6Months
     */
    public boolean isInterestFree6Months() {
        return interestFree6Months;
    }


    /**
     * Sets the interestFree6Months value for this CardDiscountT.
     * 
     * @param interestFree6Months
     */
    public void setInterestFree6Months(boolean interestFree6Months) {
        this.interestFree6Months = interestFree6Months;
    }


    /**
     * Gets the applyLumpSumDiscount value for this CardDiscountT.
     * 
     * @return applyLumpSumDiscount
     */
    public boolean isApplyLumpSumDiscount() {
        return applyLumpSumDiscount;
    }


    /**
     * Sets the applyLumpSumDiscount value for this CardDiscountT.
     * 
     * @param applyLumpSumDiscount
     */
    public void setApplyLumpSumDiscount(boolean applyLumpSumDiscount) {
        this.applyLumpSumDiscount = applyLumpSumDiscount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CardDiscountT)) return false;
        CardDiscountT other = (CardDiscountT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.interestFree3Months == other.isInterestFree3Months() &&
            this.interestFree6Months == other.isInterestFree6Months() &&
            this.applyLumpSumDiscount == other.isApplyLumpSumDiscount();
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
        _hashCode += (isInterestFree3Months() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInterestFree6Months() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApplyLumpSumDiscount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardDiscountT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CardDiscountT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("interestFree3Months");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InterestFree3Months"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("interestFree6Months");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InterestFree6Months"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyLumpSumDiscount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyLumpSumDiscount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
