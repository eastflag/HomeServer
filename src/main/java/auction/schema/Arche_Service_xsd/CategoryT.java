/**
 * CategoryT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class CategoryT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.CategoryBaseT LCategory;

    private auction.schema.Arche_Service_xsd.CategoryBaseT MCategory;

    private auction.schema.Arche_Service_xsd.CategoryBaseT SCategory;

    private auction.schema.Arche_Service_xsd.CategoryBaseT DCategory;

    private int categoryID;  // attribute

    private int categoryLevel;  // attribute

    private String categoryName;  // attribute

    public CategoryT() {
    }

    public CategoryT(
           auction.schema.Arche_Service_xsd.CategoryBaseT LCategory,
           auction.schema.Arche_Service_xsd.CategoryBaseT MCategory,
           auction.schema.Arche_Service_xsd.CategoryBaseT SCategory,
           auction.schema.Arche_Service_xsd.CategoryBaseT DCategory,
           int categoryID,
           int categoryLevel,
           String categoryName) {
           this.LCategory = LCategory;
           this.MCategory = MCategory;
           this.SCategory = SCategory;
           this.DCategory = DCategory;
           this.categoryID = categoryID;
           this.categoryLevel = categoryLevel;
           this.categoryName = categoryName;
    }


    /**
     * Gets the LCategory value for this CategoryT.
     * 
     * @return LCategory
     */
    public auction.schema.Arche_Service_xsd.CategoryBaseT getLCategory() {
        return LCategory;
    }


    /**
     * Sets the LCategory value for this CategoryT.
     * 
     * @param LCategory
     */
    public void setLCategory(auction.schema.Arche_Service_xsd.CategoryBaseT LCategory) {
        this.LCategory = LCategory;
    }


    /**
     * Gets the MCategory value for this CategoryT.
     * 
     * @return MCategory
     */
    public auction.schema.Arche_Service_xsd.CategoryBaseT getMCategory() {
        return MCategory;
    }


    /**
     * Sets the MCategory value for this CategoryT.
     * 
     * @param MCategory
     */
    public void setMCategory(auction.schema.Arche_Service_xsd.CategoryBaseT MCategory) {
        this.MCategory = MCategory;
    }


    /**
     * Gets the SCategory value for this CategoryT.
     * 
     * @return SCategory
     */
    public auction.schema.Arche_Service_xsd.CategoryBaseT getSCategory() {
        return SCategory;
    }


    /**
     * Sets the SCategory value for this CategoryT.
     * 
     * @param SCategory
     */
    public void setSCategory(auction.schema.Arche_Service_xsd.CategoryBaseT SCategory) {
        this.SCategory = SCategory;
    }


    /**
     * Gets the DCategory value for this CategoryT.
     * 
     * @return DCategory
     */
    public auction.schema.Arche_Service_xsd.CategoryBaseT getDCategory() {
        return DCategory;
    }


    /**
     * Sets the DCategory value for this CategoryT.
     * 
     * @param DCategory
     */
    public void setDCategory(auction.schema.Arche_Service_xsd.CategoryBaseT DCategory) {
        this.DCategory = DCategory;
    }


    /**
     * Gets the categoryID value for this CategoryT.
     * 
     * @return categoryID
     */
    public int getCategoryID() {
        return categoryID;
    }


    /**
     * Sets the categoryID value for this CategoryT.
     * 
     * @param categoryID
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }


    /**
     * Gets the categoryLevel value for this CategoryT.
     * 
     * @return categoryLevel
     */
    public int getCategoryLevel() {
        return categoryLevel;
    }


    /**
     * Sets the categoryLevel value for this CategoryT.
     * 
     * @param categoryLevel
     */
    public void setCategoryLevel(int categoryLevel) {
        this.categoryLevel = categoryLevel;
    }


    /**
     * Gets the categoryName value for this CategoryT.
     * 
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this CategoryT.
     * 
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CategoryT)) return false;
        CategoryT other = (CategoryT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LCategory==null && other.getLCategory()==null) || 
             (this.LCategory!=null &&
              this.LCategory.equals(other.getLCategory()))) &&
            ((this.MCategory==null && other.getMCategory()==null) || 
             (this.MCategory!=null &&
              this.MCategory.equals(other.getMCategory()))) &&
            ((this.SCategory==null && other.getSCategory()==null) || 
             (this.SCategory!=null &&
              this.SCategory.equals(other.getSCategory()))) &&
            ((this.DCategory==null && other.getDCategory()==null) || 
             (this.DCategory!=null &&
              this.DCategory.equals(other.getDCategory()))) &&
            this.categoryID == other.getCategoryID() &&
            this.categoryLevel == other.getCategoryLevel() &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName())));
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
        if (getLCategory() != null) {
            _hashCode += getLCategory().hashCode();
        }
        if (getMCategory() != null) {
            _hashCode += getMCategory().hashCode();
        }
        if (getSCategory() != null) {
            _hashCode += getSCategory().hashCode();
        }
        if (getDCategory() != null) {
            _hashCode += getDCategory().hashCode();
        }
        _hashCode += getCategoryID();
        _hashCode += getCategoryLevel();
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "LCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryBaseT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryBaseT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryBaseT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryBaseT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
