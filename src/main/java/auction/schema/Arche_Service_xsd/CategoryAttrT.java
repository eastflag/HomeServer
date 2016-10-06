/**
 * CategoryAttrT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class CategoryAttrT  implements java.io.Serializable {
    private String categoryCode;  // attribute

    private long attrID;  // attribute

    private String displayAttrName;  // attribute

    private boolean multiMatchingEnableYn;  // attribute

    private boolean essenYn;  // attribute

    private short elementID;  // attribute

    private String elementName;  // attribute

    private boolean catalogAttrYn;  // attribute

    public CategoryAttrT() {
    }

    public CategoryAttrT(
           String categoryCode,
           long attrID,
           String displayAttrName,
           boolean multiMatchingEnableYn,
           boolean essenYn,
           short elementID,
           String elementName,
           boolean catalogAttrYn) {
           this.categoryCode = categoryCode;
           this.attrID = attrID;
           this.displayAttrName = displayAttrName;
           this.multiMatchingEnableYn = multiMatchingEnableYn;
           this.essenYn = essenYn;
           this.elementID = elementID;
           this.elementName = elementName;
           this.catalogAttrYn = catalogAttrYn;
    }


    /**
     * Gets the categoryCode value for this CategoryAttrT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this CategoryAttrT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the attrID value for this CategoryAttrT.
     * 
     * @return attrID
     */
    public long getAttrID() {
        return attrID;
    }


    /**
     * Sets the attrID value for this CategoryAttrT.
     * 
     * @param attrID
     */
    public void setAttrID(long attrID) {
        this.attrID = attrID;
    }


    /**
     * Gets the displayAttrName value for this CategoryAttrT.
     * 
     * @return displayAttrName
     */
    public String getDisplayAttrName() {
        return displayAttrName;
    }


    /**
     * Sets the displayAttrName value for this CategoryAttrT.
     * 
     * @param displayAttrName
     */
    public void setDisplayAttrName(String displayAttrName) {
        this.displayAttrName = displayAttrName;
    }


    /**
     * Gets the multiMatchingEnableYn value for this CategoryAttrT.
     * 
     * @return multiMatchingEnableYn
     */
    public boolean isMultiMatchingEnableYn() {
        return multiMatchingEnableYn;
    }


    /**
     * Sets the multiMatchingEnableYn value for this CategoryAttrT.
     * 
     * @param multiMatchingEnableYn
     */
    public void setMultiMatchingEnableYn(boolean multiMatchingEnableYn) {
        this.multiMatchingEnableYn = multiMatchingEnableYn;
    }


    /**
     * Gets the essenYn value for this CategoryAttrT.
     * 
     * @return essenYn
     */
    public boolean isEssenYn() {
        return essenYn;
    }


    /**
     * Sets the essenYn value for this CategoryAttrT.
     * 
     * @param essenYn
     */
    public void setEssenYn(boolean essenYn) {
        this.essenYn = essenYn;
    }


    /**
     * Gets the elementID value for this CategoryAttrT.
     * 
     * @return elementID
     */
    public short getElementID() {
        return elementID;
    }


    /**
     * Sets the elementID value for this CategoryAttrT.
     * 
     * @param elementID
     */
    public void setElementID(short elementID) {
        this.elementID = elementID;
    }


    /**
     * Gets the elementName value for this CategoryAttrT.
     * 
     * @return elementName
     */
    public String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this CategoryAttrT.
     * 
     * @param elementName
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the catalogAttrYn value for this CategoryAttrT.
     * 
     * @return catalogAttrYn
     */
    public boolean isCatalogAttrYn() {
        return catalogAttrYn;
    }


    /**
     * Sets the catalogAttrYn value for this CategoryAttrT.
     * 
     * @param catalogAttrYn
     */
    public void setCatalogAttrYn(boolean catalogAttrYn) {
        this.catalogAttrYn = catalogAttrYn;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CategoryAttrT)) return false;
        CategoryAttrT other = (CategoryAttrT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            this.attrID == other.getAttrID() &&
            ((this.displayAttrName==null && other.getDisplayAttrName()==null) || 
             (this.displayAttrName!=null &&
              this.displayAttrName.equals(other.getDisplayAttrName()))) &&
            this.multiMatchingEnableYn == other.isMultiMatchingEnableYn() &&
            this.essenYn == other.isEssenYn() &&
            this.elementID == other.getElementID() &&
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            this.catalogAttrYn == other.isCatalogAttrYn();
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
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        _hashCode += new Long(getAttrID()).hashCode();
        if (getDisplayAttrName() != null) {
            _hashCode += getDisplayAttrName().hashCode();
        }
        _hashCode += (isMultiMatchingEnableYn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEssenYn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getElementID();
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        _hashCode += (isCatalogAttrYn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryAttrT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryAttrT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attrID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttrID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("displayAttrName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DisplayAttrName"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elementID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElementID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elementName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElementName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogAttrYn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogAttrYn"));
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
