/**
 * UsedMarketCatalogInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class UsedMarketCatalogInfoT  implements java.io.Serializable {
    private long catalogCode;  // attribute

    private String catalogName;  // attribute

    public UsedMarketCatalogInfoT() {
    }

    public UsedMarketCatalogInfoT(
           long catalogCode,
           String catalogName) {
           this.catalogCode = catalogCode;
           this.catalogName = catalogName;
    }


    /**
     * Gets the catalogCode value for this UsedMarketCatalogInfoT.
     * 
     * @return catalogCode
     */
    public long getCatalogCode() {
        return catalogCode;
    }


    /**
     * Sets the catalogCode value for this UsedMarketCatalogInfoT.
     * 
     * @param catalogCode
     */
    public void setCatalogCode(long catalogCode) {
        this.catalogCode = catalogCode;
    }


    /**
     * Gets the catalogName value for this UsedMarketCatalogInfoT.
     * 
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }


    /**
     * Sets the catalogName value for this UsedMarketCatalogInfoT.
     * 
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UsedMarketCatalogInfoT)) return false;
        UsedMarketCatalogInfoT other = (UsedMarketCatalogInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.catalogCode == other.getCatalogCode() &&
            ((this.catalogName==null && other.getCatalogName()==null) || 
             (this.catalogName!=null &&
              this.catalogName.equals(other.getCatalogName())));
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
        _hashCode += new Long(getCatalogCode()).hashCode();
        if (getCatalogName() != null) {
            _hashCode += getCatalogName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsedMarketCatalogInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketCatalogInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogName"));
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
