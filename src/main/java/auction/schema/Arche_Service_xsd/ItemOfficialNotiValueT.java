/**
 * ItemOfficialNotiValueT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemOfficialNotiValueT  implements java.io.Serializable {
    private String notiItemCode;  // attribute

    private String notiItemValue;  // attribute

    private boolean extraMarkIs;  // attribute

    public ItemOfficialNotiValueT() {
    }

    public ItemOfficialNotiValueT(
           String notiItemCode,
           String notiItemValue,
           boolean extraMarkIs) {
           this.notiItemCode = notiItemCode;
           this.notiItemValue = notiItemValue;
           this.extraMarkIs = extraMarkIs;
    }


    /**
     * Gets the notiItemCode value for this ItemOfficialNotiValueT.
     * 
     * @return notiItemCode
     */
    public String getNotiItemCode() {
        return notiItemCode;
    }


    /**
     * Sets the notiItemCode value for this ItemOfficialNotiValueT.
     * 
     * @param notiItemCode
     */
    public void setNotiItemCode(String notiItemCode) {
        this.notiItemCode = notiItemCode;
    }


    /**
     * Gets the notiItemValue value for this ItemOfficialNotiValueT.
     * 
     * @return notiItemValue
     */
    public String getNotiItemValue() {
        return notiItemValue;
    }


    /**
     * Sets the notiItemValue value for this ItemOfficialNotiValueT.
     * 
     * @param notiItemValue
     */
    public void setNotiItemValue(String notiItemValue) {
        this.notiItemValue = notiItemValue;
    }


    /**
     * Gets the extraMarkIs value for this ItemOfficialNotiValueT.
     * 
     * @return extraMarkIs
     */
    public boolean isExtraMarkIs() {
        return extraMarkIs;
    }


    /**
     * Sets the extraMarkIs value for this ItemOfficialNotiValueT.
     * 
     * @param extraMarkIs
     */
    public void setExtraMarkIs(boolean extraMarkIs) {
        this.extraMarkIs = extraMarkIs;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemOfficialNotiValueT)) return false;
        ItemOfficialNotiValueT other = (ItemOfficialNotiValueT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notiItemCode==null && other.getNotiItemCode()==null) || 
             (this.notiItemCode!=null &&
              this.notiItemCode.equals(other.getNotiItemCode()))) &&
            ((this.notiItemValue==null && other.getNotiItemValue()==null) || 
             (this.notiItemValue!=null &&
              this.notiItemValue.equals(other.getNotiItemValue()))) &&
            this.extraMarkIs == other.isExtraMarkIs();
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
        if (getNotiItemCode() != null) {
            _hashCode += getNotiItemCode().hashCode();
        }
        if (getNotiItemValue() != null) {
            _hashCode += getNotiItemValue().hashCode();
        }
        _hashCode += (isExtraMarkIs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemOfficialNotiValueT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiValueT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extraMarkIs");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExtraMarkIs"));
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
