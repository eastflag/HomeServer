/**
 * ShopCatgProdT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShopCatgProdT  implements java.io.Serializable {
    private String shopCategoryCode;  // attribute

    private int categoryLevel;  // attribute

    public ShopCatgProdT() {
    }

    public ShopCatgProdT(
           String shopCategoryCode,
           int categoryLevel) {
           this.shopCategoryCode = shopCategoryCode;
           this.categoryLevel = categoryLevel;
    }


    /**
     * Gets the shopCategoryCode value for this ShopCatgProdT.
     * 
     * @return shopCategoryCode
     */
    public String getShopCategoryCode() {
        return shopCategoryCode;
    }


    /**
     * Sets the shopCategoryCode value for this ShopCatgProdT.
     * 
     * @param shopCategoryCode
     */
    public void setShopCategoryCode(String shopCategoryCode) {
        this.shopCategoryCode = shopCategoryCode;
    }


    /**
     * Gets the categoryLevel value for this ShopCatgProdT.
     * 
     * @return categoryLevel
     */
    public int getCategoryLevel() {
        return categoryLevel;
    }


    /**
     * Sets the categoryLevel value for this ShopCatgProdT.
     * 
     * @param categoryLevel
     */
    public void setCategoryLevel(int categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShopCatgProdT)) return false;
        ShopCatgProdT other = (ShopCatgProdT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shopCategoryCode==null && other.getShopCategoryCode()==null) || 
             (this.shopCategoryCode!=null &&
              this.shopCategoryCode.equals(other.getShopCategoryCode()))) &&
            this.categoryLevel == other.getCategoryLevel();
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
        if (getShopCategoryCode() != null) {
            _hashCode += getShopCategoryCode().hashCode();
        }
        _hashCode += getCategoryLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShopCatgProdT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShopCatgProdT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shopCategoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShopCategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryLevel"));
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
