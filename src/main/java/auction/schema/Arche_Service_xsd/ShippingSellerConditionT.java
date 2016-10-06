/**
 * ShippingSellerConditionT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingSellerConditionT  implements java.io.Serializable {
    private java.math.BigDecimal conditionFrom;  // attribute

    private java.math.BigDecimal conditionTo;  // attribute

    private java.math.BigDecimal fee;  // attribute

    public ShippingSellerConditionT() {
    }

    public ShippingSellerConditionT(
           java.math.BigDecimal conditionFrom,
           java.math.BigDecimal conditionTo,
           java.math.BigDecimal fee) {
           this.conditionFrom = conditionFrom;
           this.conditionTo = conditionTo;
           this.fee = fee;
    }


    /**
     * Gets the conditionFrom value for this ShippingSellerConditionT.
     * 
     * @return conditionFrom
     */
    public java.math.BigDecimal getConditionFrom() {
        return conditionFrom;
    }


    /**
     * Sets the conditionFrom value for this ShippingSellerConditionT.
     * 
     * @param conditionFrom
     */
    public void setConditionFrom(java.math.BigDecimal conditionFrom) {
        this.conditionFrom = conditionFrom;
    }


    /**
     * Gets the conditionTo value for this ShippingSellerConditionT.
     * 
     * @return conditionTo
     */
    public java.math.BigDecimal getConditionTo() {
        return conditionTo;
    }


    /**
     * Sets the conditionTo value for this ShippingSellerConditionT.
     * 
     * @param conditionTo
     */
    public void setConditionTo(java.math.BigDecimal conditionTo) {
        this.conditionTo = conditionTo;
    }


    /**
     * Gets the fee value for this ShippingSellerConditionT.
     * 
     * @return fee
     */
    public java.math.BigDecimal getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this ShippingSellerConditionT.
     * 
     * @param fee
     */
    public void setFee(java.math.BigDecimal fee) {
        this.fee = fee;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingSellerConditionT)) return false;
        ShippingSellerConditionT other = (ShippingSellerConditionT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conditionFrom==null && other.getConditionFrom()==null) || 
             (this.conditionFrom!=null &&
              this.conditionFrom.equals(other.getConditionFrom()))) &&
            ((this.conditionTo==null && other.getConditionTo()==null) || 
             (this.conditionTo!=null &&
              this.conditionTo.equals(other.getConditionTo()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee())));
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
        if (getConditionFrom() != null) {
            _hashCode += getConditionFrom().hashCode();
        }
        if (getConditionTo() != null) {
            _hashCode += getConditionTo().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingSellerConditionT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conditionFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConditionFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conditionTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConditionTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Fee"));
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
