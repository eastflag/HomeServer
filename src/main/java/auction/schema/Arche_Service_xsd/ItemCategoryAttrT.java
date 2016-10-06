/**
 * ItemCategoryAttrT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemCategoryAttrT  implements java.io.Serializable {
    private String itemNo;  // attribute

    private long attrID;  // attribute

    private short elementID;  // attribute

    private String displayAttrName;  // attribute

    private String elementName;  // attribute

    private boolean multiMatchingEnableYn;  // attribute

    private boolean essenYn;  // attribute

    public ItemCategoryAttrT() {
    }

    public ItemCategoryAttrT(
           String itemNo,
           long attrID,
           short elementID,
           String displayAttrName,
           String elementName,
           boolean multiMatchingEnableYn,
           boolean essenYn) {
           this.itemNo = itemNo;
           this.attrID = attrID;
           this.elementID = elementID;
           this.displayAttrName = displayAttrName;
           this.elementName = elementName;
           this.multiMatchingEnableYn = multiMatchingEnableYn;
           this.essenYn = essenYn;
    }


    /**
     * Gets the itemNo value for this ItemCategoryAttrT.
     * 
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this ItemCategoryAttrT.
     * 
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the attrID value for this ItemCategoryAttrT.
     * 
     * @return attrID
     */
    public long getAttrID() {
        return attrID;
    }


    /**
     * Sets the attrID value for this ItemCategoryAttrT.
     * 
     * @param attrID
     */
    public void setAttrID(long attrID) {
        this.attrID = attrID;
    }


    /**
     * Gets the elementID value for this ItemCategoryAttrT.
     * 
     * @return elementID
     */
    public short getElementID() {
        return elementID;
    }


    /**
     * Sets the elementID value for this ItemCategoryAttrT.
     * 
     * @param elementID
     */
    public void setElementID(short elementID) {
        this.elementID = elementID;
    }


    /**
     * Gets the displayAttrName value for this ItemCategoryAttrT.
     * 
     * @return displayAttrName
     */
    public String getDisplayAttrName() {
        return displayAttrName;
    }


    /**
     * Sets the displayAttrName value for this ItemCategoryAttrT.
     * 
     * @param displayAttrName
     */
    public void setDisplayAttrName(String displayAttrName) {
        this.displayAttrName = displayAttrName;
    }


    /**
     * Gets the elementName value for this ItemCategoryAttrT.
     * 
     * @return elementName
     */
    public String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this ItemCategoryAttrT.
     * 
     * @param elementName
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the multiMatchingEnableYn value for this ItemCategoryAttrT.
     * 
     * @return multiMatchingEnableYn
     */
    public boolean isMultiMatchingEnableYn() {
        return multiMatchingEnableYn;
    }


    /**
     * Sets the multiMatchingEnableYn value for this ItemCategoryAttrT.
     * 
     * @param multiMatchingEnableYn
     */
    public void setMultiMatchingEnableYn(boolean multiMatchingEnableYn) {
        this.multiMatchingEnableYn = multiMatchingEnableYn;
    }


    /**
     * Gets the essenYn value for this ItemCategoryAttrT.
     * 
     * @return essenYn
     */
    public boolean isEssenYn() {
        return essenYn;
    }


    /**
     * Sets the essenYn value for this ItemCategoryAttrT.
     * 
     * @param essenYn
     */
    public void setEssenYn(boolean essenYn) {
        this.essenYn = essenYn;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemCategoryAttrT)) return false;
        ItemCategoryAttrT other = (ItemCategoryAttrT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNo==null && other.getItemNo()==null) || 
             (this.itemNo!=null &&
              this.itemNo.equals(other.getItemNo()))) &&
            this.attrID == other.getAttrID() &&
            this.elementID == other.getElementID() &&
            ((this.displayAttrName==null && other.getDisplayAttrName()==null) || 
             (this.displayAttrName!=null &&
              this.displayAttrName.equals(other.getDisplayAttrName()))) &&
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            this.multiMatchingEnableYn == other.isMultiMatchingEnableYn() &&
            this.essenYn == other.isEssenYn();
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
        if (getItemNo() != null) {
            _hashCode += getItemNo().hashCode();
        }
        _hashCode += new Long(getAttrID()).hashCode();
        _hashCode += getElementID();
        if (getDisplayAttrName() != null) {
            _hashCode += getDisplayAttrName().hashCode();
        }
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        _hashCode += (isMultiMatchingEnableYn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEssenYn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemCategoryAttrT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCategoryAttrT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attrID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttrID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elementID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElementID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("displayAttrName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DisplayAttrName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elementName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElementName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("multiMatchingEnableYn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MultiMatchingEnableYn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("essenYn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EssenYn"));
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
