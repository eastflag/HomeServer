/**
 * ViewCategoryAttributeResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ViewCategoryAttributeResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttr;

    public ViewCategoryAttributeResponseT() {
    }

    public ViewCategoryAttributeResponseT(
           auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttr) {
           this.categoryAttr = categoryAttr;
    }


    /**
     * Gets the categoryAttr value for this ViewCategoryAttributeResponseT.
     * 
     * @return categoryAttr
     */
    public auction.schema.Arche_Service_xsd.CategoryAttrT[] getCategoryAttr() {
        return categoryAttr;
    }


    /**
     * Sets the categoryAttr value for this ViewCategoryAttributeResponseT.
     * 
     * @param categoryAttr
     */
    public void setCategoryAttr(auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttr) {
        this.categoryAttr = categoryAttr;
    }

    public auction.schema.Arche_Service_xsd.CategoryAttrT getCategoryAttr(int i) {
        return this.categoryAttr[i];
    }

    public void setCategoryAttr(int i, auction.schema.Arche_Service_xsd.CategoryAttrT _value) {
        this.categoryAttr[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ViewCategoryAttributeResponseT)) return false;
        ViewCategoryAttributeResponseT other = (ViewCategoryAttributeResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryAttr==null && other.getCategoryAttr()==null) || 
             (this.categoryAttr!=null &&
              java.util.Arrays.equals(this.categoryAttr, other.getCategoryAttr())));
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
        if (getCategoryAttr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryAttr());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCategoryAttr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewCategoryAttributeResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewCategoryAttributeResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryAttr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "CategoryAttr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryAttrT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
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
