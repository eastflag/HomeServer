/**
 * DeliberationT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class DeliberationT  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedByte ageLimit;  // attribute

    private String deliberationNo;  // attribute

    public DeliberationT() {
    }

    public DeliberationT(
           org.apache.axis.types.UnsignedByte ageLimit,
           String deliberationNo) {
           this.ageLimit = ageLimit;
           this.deliberationNo = deliberationNo;
    }


    /**
     * Gets the ageLimit value for this DeliberationT.
     * 
     * @return ageLimit
     */
    public org.apache.axis.types.UnsignedByte getAgeLimit() {
        return ageLimit;
    }


    /**
     * Sets the ageLimit value for this DeliberationT.
     * 
     * @param ageLimit
     */
    public void setAgeLimit(org.apache.axis.types.UnsignedByte ageLimit) {
        this.ageLimit = ageLimit;
    }


    /**
     * Gets the deliberationNo value for this DeliberationT.
     * 
     * @return deliberationNo
     */
    public String getDeliberationNo() {
        return deliberationNo;
    }


    /**
     * Sets the deliberationNo value for this DeliberationT.
     * 
     * @param deliberationNo
     */
    public void setDeliberationNo(String deliberationNo) {
        this.deliberationNo = deliberationNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliberationT)) return false;
        DeliberationT other = (DeliberationT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ageLimit==null && other.getAgeLimit()==null) || 
             (this.ageLimit!=null &&
              this.ageLimit.equals(other.getAgeLimit()))) &&
            ((this.deliberationNo==null && other.getDeliberationNo()==null) || 
             (this.deliberationNo!=null &&
              this.deliberationNo.equals(other.getDeliberationNo())));
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
        if (getAgeLimit() != null) {
            _hashCode += getAgeLimit().hashCode();
        }
        if (getDeliberationNo() != null) {
            _hashCode += getDeliberationNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliberationT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliberationT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ageLimit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgeLimit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deliberationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeliberationNo"));
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
