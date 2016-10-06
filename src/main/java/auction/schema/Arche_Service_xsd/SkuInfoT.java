/**
 * SkuInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SkuInfoT  implements java.io.Serializable {
    private long skuId;  // attribute

    private int owQty;  // attribute

    public SkuInfoT() {
    }

    public SkuInfoT(
           long skuId,
           int owQty) {
           this.skuId = skuId;
           this.owQty = owQty;
    }


    /**
     * Gets the skuId value for this SkuInfoT.
     * 
     * @return skuId
     */
    public long getSkuId() {
        return skuId;
    }


    /**
     * Sets the skuId value for this SkuInfoT.
     * 
     * @param skuId
     */
    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }


    /**
     * Gets the owQty value for this SkuInfoT.
     * 
     * @return owQty
     */
    public int getOwQty() {
        return owQty;
    }


    /**
     * Sets the owQty value for this SkuInfoT.
     * 
     * @param owQty
     */
    public void setOwQty(int owQty) {
        this.owQty = owQty;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SkuInfoT)) return false;
        SkuInfoT other = (SkuInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.skuId == other.getSkuId() &&
            this.owQty == other.getOwQty();
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
        _hashCode += new Long(getSkuId()).hashCode();
        _hashCode += getOwQty();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SkuInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SkuInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("skuId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "skuId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "owQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
