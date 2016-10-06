/**
 * ItemBusinessRegistrationT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemBusinessRegistrationT  implements java.io.Serializable {
    private String registrationOfficeName;  // attribute

    private String registrationNo;  // attribute

    public ItemBusinessRegistrationT() {
    }

    public ItemBusinessRegistrationT(
           String registrationOfficeName,
           String registrationNo) {
           this.registrationOfficeName = registrationOfficeName;
           this.registrationNo = registrationNo;
    }


    /**
     * Gets the registrationOfficeName value for this ItemBusinessRegistrationT.
     * 
     * @return registrationOfficeName
     */
    public String getRegistrationOfficeName() {
        return registrationOfficeName;
    }


    /**
     * Sets the registrationOfficeName value for this ItemBusinessRegistrationT.
     * 
     * @param registrationOfficeName
     */
    public void setRegistrationOfficeName(String registrationOfficeName) {
        this.registrationOfficeName = registrationOfficeName;
    }


    /**
     * Gets the registrationNo value for this ItemBusinessRegistrationT.
     * 
     * @return registrationNo
     */
    public String getRegistrationNo() {
        return registrationNo;
    }


    /**
     * Sets the registrationNo value for this ItemBusinessRegistrationT.
     * 
     * @param registrationNo
     */
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemBusinessRegistrationT)) return false;
        ItemBusinessRegistrationT other = (ItemBusinessRegistrationT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrationOfficeName==null && other.getRegistrationOfficeName()==null) || 
             (this.registrationOfficeName!=null &&
              this.registrationOfficeName.equals(other.getRegistrationOfficeName()))) &&
            ((this.registrationNo==null && other.getRegistrationNo()==null) || 
             (this.registrationNo!=null &&
              this.registrationNo.equals(other.getRegistrationNo())));
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
        if (getRegistrationOfficeName() != null) {
            _hashCode += getRegistrationOfficeName().hashCode();
        }
        if (getRegistrationNo() != null) {
            _hashCode += getRegistrationNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemBusinessRegistrationT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBusinessRegistrationT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registrationOfficeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RegistrationOfficeName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registrationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RegistrationNo"));
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
