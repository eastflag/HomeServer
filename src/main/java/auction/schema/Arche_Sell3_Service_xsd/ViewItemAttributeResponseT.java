/**
 * ViewItemAttributeResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ViewItemAttributeResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttr;

    public ViewItemAttributeResponseT() {
    }

    public ViewItemAttributeResponseT(
           auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttr) {
           this.itemCategoryAttr = itemCategoryAttr;
    }


    /**
     * Gets the itemCategoryAttr value for this ViewItemAttributeResponseT.
     * 
     * @return itemCategoryAttr
     */
    public auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] getItemCategoryAttr() {
        return itemCategoryAttr;
    }


    /**
     * Sets the itemCategoryAttr value for this ViewItemAttributeResponseT.
     * 
     * @param itemCategoryAttr
     */
    public void setItemCategoryAttr(auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttr) {
        this.itemCategoryAttr = itemCategoryAttr;
    }

    public auction.schema.Arche_Service_xsd.ItemCategoryAttrT getItemCategoryAttr(int i) {
        return this.itemCategoryAttr[i];
    }

    public void setItemCategoryAttr(int i, auction.schema.Arche_Service_xsd.ItemCategoryAttrT _value) {
        this.itemCategoryAttr[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ViewItemAttributeResponseT)) return false;
        ViewItemAttributeResponseT other = (ViewItemAttributeResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemCategoryAttr==null && other.getItemCategoryAttr()==null) || 
             (this.itemCategoryAttr!=null &&
              java.util.Arrays.equals(this.itemCategoryAttr, other.getItemCategoryAttr())));
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
        if (getItemCategoryAttr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCategoryAttr());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemCategoryAttr(), i);
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
        new org.apache.axis.description.TypeDesc(ViewItemAttributeResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewItemAttributeResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryAttr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemCategoryAttr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCategoryAttrT"));
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
