/**
 * ItemContentsHtmlT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemContentsHtmlT  implements java.io.Serializable {
    private String itemHtml;  // attribute

    private String itemPromotionHtml;  // attribute

    private String itemAddHtml;  // attribute

    public ItemContentsHtmlT() {
    }

    public ItemContentsHtmlT(
           String itemHtml,
           String itemPromotionHtml,
           String itemAddHtml) {
           this.itemHtml = itemHtml;
           this.itemPromotionHtml = itemPromotionHtml;
           this.itemAddHtml = itemAddHtml;
    }


    /**
     * Gets the itemHtml value for this ItemContentsHtmlT.
     * 
     * @return itemHtml
     */
    public String getItemHtml() {
        return itemHtml;
    }


    /**
     * Sets the itemHtml value for this ItemContentsHtmlT.
     * 
     * @param itemHtml
     */
    public void setItemHtml(String itemHtml) {
        this.itemHtml = itemHtml;
    }


    /**
     * Gets the itemPromotionHtml value for this ItemContentsHtmlT.
     * 
     * @return itemPromotionHtml
     */
    public String getItemPromotionHtml() {
        return itemPromotionHtml;
    }


    /**
     * Sets the itemPromotionHtml value for this ItemContentsHtmlT.
     * 
     * @param itemPromotionHtml
     */
    public void setItemPromotionHtml(String itemPromotionHtml) {
        this.itemPromotionHtml = itemPromotionHtml;
    }


    /**
     * Gets the itemAddHtml value for this ItemContentsHtmlT.
     * 
     * @return itemAddHtml
     */
    public String getItemAddHtml() {
        return itemAddHtml;
    }


    /**
     * Sets the itemAddHtml value for this ItemContentsHtmlT.
     * 
     * @param itemAddHtml
     */
    public void setItemAddHtml(String itemAddHtml) {
        this.itemAddHtml = itemAddHtml;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemContentsHtmlT)) return false;
        ItemContentsHtmlT other = (ItemContentsHtmlT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemHtml==null && other.getItemHtml()==null) || 
             (this.itemHtml!=null &&
              this.itemHtml.equals(other.getItemHtml()))) &&
            ((this.itemPromotionHtml==null && other.getItemPromotionHtml()==null) || 
             (this.itemPromotionHtml!=null &&
              this.itemPromotionHtml.equals(other.getItemPromotionHtml()))) &&
            ((this.itemAddHtml==null && other.getItemAddHtml()==null) || 
             (this.itemAddHtml!=null &&
              this.itemAddHtml.equals(other.getItemAddHtml())));
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
        if (getItemHtml() != null) {
            _hashCode += getItemHtml().hashCode();
        }
        if (getItemPromotionHtml() != null) {
            _hashCode += getItemPromotionHtml().hashCode();
        }
        if (getItemAddHtml() != null) {
            _hashCode += getItemAddHtml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemContentsHtmlT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemContentsHtmlT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemHtml");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemHtml"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemPromotionHtml");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemPromotionHtml"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemAddHtml");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemAddHtml"));
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
