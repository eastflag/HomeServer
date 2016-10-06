/**
 * BroadcastEquipmentT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class BroadcastEquipmentT  implements java.io.Serializable {
    private boolean broadcastEquipmentYN;  // attribute

    private boolean addtionalConditionYN;  // attribute

    private String authenticationNO;  // attribute

    public BroadcastEquipmentT() {
    }

    public BroadcastEquipmentT(
           boolean broadcastEquipmentYN,
           boolean addtionalConditionYN,
           String authenticationNO) {
           this.broadcastEquipmentYN = broadcastEquipmentYN;
           this.addtionalConditionYN = addtionalConditionYN;
           this.authenticationNO = authenticationNO;
    }


    /**
     * Gets the broadcastEquipmentYN value for this BroadcastEquipmentT.
     * 
     * @return broadcastEquipmentYN
     */
    public boolean isBroadcastEquipmentYN() {
        return broadcastEquipmentYN;
    }


    /**
     * Sets the broadcastEquipmentYN value for this BroadcastEquipmentT.
     * 
     * @param broadcastEquipmentYN
     */
    public void setBroadcastEquipmentYN(boolean broadcastEquipmentYN) {
        this.broadcastEquipmentYN = broadcastEquipmentYN;
    }


    /**
     * Gets the addtionalConditionYN value for this BroadcastEquipmentT.
     * 
     * @return addtionalConditionYN
     */
    public boolean isAddtionalConditionYN() {
        return addtionalConditionYN;
    }


    /**
     * Sets the addtionalConditionYN value for this BroadcastEquipmentT.
     * 
     * @param addtionalConditionYN
     */
    public void setAddtionalConditionYN(boolean addtionalConditionYN) {
        this.addtionalConditionYN = addtionalConditionYN;
    }


    /**
     * Gets the authenticationNO value for this BroadcastEquipmentT.
     * 
     * @return authenticationNO
     */
    public String getAuthenticationNO() {
        return authenticationNO;
    }


    /**
     * Sets the authenticationNO value for this BroadcastEquipmentT.
     * 
     * @param authenticationNO
     */
    public void setAuthenticationNO(String authenticationNO) {
        this.authenticationNO = authenticationNO;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BroadcastEquipmentT)) return false;
        BroadcastEquipmentT other = (BroadcastEquipmentT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.broadcastEquipmentYN == other.isBroadcastEquipmentYN() &&
            this.addtionalConditionYN == other.isAddtionalConditionYN() &&
            ((this.authenticationNO==null && other.getAuthenticationNO()==null) || 
             (this.authenticationNO!=null &&
              this.authenticationNO.equals(other.getAuthenticationNO())));
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
        _hashCode += (isBroadcastEquipmentYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAddtionalConditionYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAuthenticationNO() != null) {
            _hashCode += getAuthenticationNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BroadcastEquipmentT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BroadcastEquipmentT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("broadcastEquipmentYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BroadcastEquipmentYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addtionalConditionYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddtionalConditionYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("authenticationNO");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AuthenticationNO"));
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
