/**
 * ItemFreeExperienceSearchConditionT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemFreeExperienceSearchConditionT  implements java.io.Serializable {
    private String categoryCode;  // attribute

    private int pageSize;  // attribute

    private int currentPageNumber;  // attribute

    private ItemFreeExperienceListSortCode sortCondition;  // attribute

    public ItemFreeExperienceSearchConditionT() {
    }

    public ItemFreeExperienceSearchConditionT(
           String categoryCode,
           int pageSize,
           int currentPageNumber,
           ItemFreeExperienceListSortCode sortCondition) {
           this.categoryCode = categoryCode;
           this.pageSize = pageSize;
           this.currentPageNumber = currentPageNumber;
           this.sortCondition = sortCondition;
    }


    /**
     * Gets the categoryCode value for this ItemFreeExperienceSearchConditionT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this ItemFreeExperienceSearchConditionT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the pageSize value for this ItemFreeExperienceSearchConditionT.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this ItemFreeExperienceSearchConditionT.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the currentPageNumber value for this ItemFreeExperienceSearchConditionT.
     * 
     * @return currentPageNumber
     */
    public int getCurrentPageNumber() {
        return currentPageNumber;
    }


    /**
     * Sets the currentPageNumber value for this ItemFreeExperienceSearchConditionT.
     * 
     * @param currentPageNumber
     */
    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }


    /**
     * Gets the sortCondition value for this ItemFreeExperienceSearchConditionT.
     * 
     * @return sortCondition
     */
    public ItemFreeExperienceListSortCode getSortCondition() {
        return sortCondition;
    }


    /**
     * Sets the sortCondition value for this ItemFreeExperienceSearchConditionT.
     * 
     * @param sortCondition
     */
    public void setSortCondition(ItemFreeExperienceListSortCode sortCondition) {
        this.sortCondition = sortCondition;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFreeExperienceSearchConditionT)) return false;
        ItemFreeExperienceSearchConditionT other = (ItemFreeExperienceSearchConditionT) obj;
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
            this.pageSize == other.getPageSize() &&
            this.currentPageNumber == other.getCurrentPageNumber() &&
            ((this.sortCondition==null && other.getSortCondition()==null) || 
             (this.sortCondition!=null &&
              this.sortCondition.equals(other.getSortCondition())));
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
        _hashCode += getPageSize();
        _hashCode += getCurrentPageNumber();
        if (getSortCondition() != null) {
            _hashCode += getSortCondition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFreeExperienceSearchConditionT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceSearchConditionT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pageSize");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PageSize"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currentPageNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrentPageNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sortCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SortCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceListSortCode"));
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
