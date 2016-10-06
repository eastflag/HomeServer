/**
 * SafeAuthT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SafeAuthT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.SafeAuthTypeCode safeAuthType;  // attribute

    private auction.schema.Arche_Service_xsd.AuthItemTypeCode authItemType;  // attribute

    private String authItemNum;  // attribute

    public SafeAuthT() {
    }

    public SafeAuthT(
           auction.schema.Arche_Service_xsd.SafeAuthTypeCode safeAuthType,
           auction.schema.Arche_Service_xsd.AuthItemTypeCode authItemType,
           String authItemNum) {
           this.safeAuthType = safeAuthType;
           this.authItemType = authItemType;
           this.authItemNum = authItemNum;
    }


    /**
     * Gets the safeAuthType value for this SafeAuthT.
     * 
     * @return safeAuthType
     */
    public auction.schema.Arche_Service_xsd.SafeAuthTypeCode getSafeAuthType() {
        return safeAuthType;
    }


    /**
     * Sets the safeAuthType value for this SafeAuthT.
     * 
     * @param safeAuthType
     */
    public void setSafeAuthType(auction.schema.Arche_Service_xsd.SafeAuthTypeCode safeAuthType) {
        this.safeAuthType = safeAuthType;
    }


    /**
     * Gets the authItemType value for this SafeAuthT.
     * 
     * @return authItemType
     */
    public auction.schema.Arche_Service_xsd.AuthItemTypeCode getAuthItemType() {
        return authItemType;
    }


    /**
     * Sets the authItemType value for this SafeAuthT.
     * 
     * @param authItemType
     */
    public void setAuthItemType(auction.schema.Arche_Service_xsd.AuthItemTypeCode authItemType) {
        this.authItemType = authItemType;
    }


    /**
     * Gets the authItemNum value for this SafeAuthT.
     * 
     * @return authItemNum
     */
    public String getAuthItemNum() {
        return authItemNum;
    }


    /**
     * Sets the authItemNum value for this SafeAuthT.
     * 
     * @param authItemNum
     */
    public void setAuthItemNum(String authItemNum) {
        this.authItemNum = authItemNum;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SafeAuthT)) return false;
        SafeAuthT other = (SafeAuthT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.safeAuthType==null && other.getSafeAuthType()==null) || 
             (this.safeAuthType!=null &&
              this.safeAuthType.equals(other.getSafeAuthType()))) &&
            ((this.authItemType==null && other.getAuthItemType()==null) || 
             (this.authItemType!=null &&
              this.authItemType.equals(other.getAuthItemType()))) &&
            ((this.authItemNum==null && other.getAuthItemNum()==null) || 
             (this.authItemNum!=null &&
              this.authItemNum.equals(other.getAuthItemNum())));
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
        if (getSafeAuthType() != null) {
            _hashCode += getSafeAuthType().hashCode();
        }
        if (getAuthItemType() != null) {
            _hashCode += getAuthItemType().hashCode();
        }
        if (getAuthItemNum() != null) {
            _hashCode += getAuthItemNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SafeAuthT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SafeAuthT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("safeAuthType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SafeAuthType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SafeAuthTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("authItemType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AuthItemType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AuthItemTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("authItemNum");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AuthItemNum"));
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
