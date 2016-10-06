/**
 * ItemFreeExperienceRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemFreeExperienceRequestT  implements java.io.Serializable {
    private boolean isFreeExperience;  // attribute

    private java.util.Calendar entryStartDate;  // attribute

    private java.util.Calendar entryCloseDate;  // attribute

    private int entryItemCount;  // attribute

    public ItemFreeExperienceRequestT() {
    }

    public ItemFreeExperienceRequestT(
           boolean isFreeExperience,
           java.util.Calendar entryStartDate,
           java.util.Calendar entryCloseDate,
           int entryItemCount) {
           this.isFreeExperience = isFreeExperience;
           this.entryStartDate = entryStartDate;
           this.entryCloseDate = entryCloseDate;
           this.entryItemCount = entryItemCount;
    }


    /**
     * Gets the isFreeExperience value for this ItemFreeExperienceRequestT.
     * 
     * @return isFreeExperience
     */
    public boolean isIsFreeExperience() {
        return isFreeExperience;
    }


    /**
     * Sets the isFreeExperience value for this ItemFreeExperienceRequestT.
     * 
     * @param isFreeExperience
     */
    public void setIsFreeExperience(boolean isFreeExperience) {
        this.isFreeExperience = isFreeExperience;
    }


    /**
     * Gets the entryStartDate value for this ItemFreeExperienceRequestT.
     * 
     * @return entryStartDate
     */
    public java.util.Calendar getEntryStartDate() {
        return entryStartDate;
    }


    /**
     * Sets the entryStartDate value for this ItemFreeExperienceRequestT.
     * 
     * @param entryStartDate
     */
    public void setEntryStartDate(java.util.Calendar entryStartDate) {
        this.entryStartDate = entryStartDate;
    }


    /**
     * Gets the entryCloseDate value for this ItemFreeExperienceRequestT.
     * 
     * @return entryCloseDate
     */
    public java.util.Calendar getEntryCloseDate() {
        return entryCloseDate;
    }


    /**
     * Sets the entryCloseDate value for this ItemFreeExperienceRequestT.
     * 
     * @param entryCloseDate
     */
    public void setEntryCloseDate(java.util.Calendar entryCloseDate) {
        this.entryCloseDate = entryCloseDate;
    }


    /**
     * Gets the entryItemCount value for this ItemFreeExperienceRequestT.
     * 
     * @return entryItemCount
     */
    public int getEntryItemCount() {
        return entryItemCount;
    }


    /**
     * Sets the entryItemCount value for this ItemFreeExperienceRequestT.
     * 
     * @param entryItemCount
     */
    public void setEntryItemCount(int entryItemCount) {
        this.entryItemCount = entryItemCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFreeExperienceRequestT)) return false;
        ItemFreeExperienceRequestT other = (ItemFreeExperienceRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isFreeExperience == other.isIsFreeExperience() &&
            ((this.entryStartDate==null && other.getEntryStartDate()==null) || 
             (this.entryStartDate!=null &&
              this.entryStartDate.equals(other.getEntryStartDate()))) &&
            ((this.entryCloseDate==null && other.getEntryCloseDate()==null) || 
             (this.entryCloseDate!=null &&
              this.entryCloseDate.equals(other.getEntryCloseDate()))) &&
            this.entryItemCount == other.getEntryItemCount();
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
        _hashCode += (isIsFreeExperience() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEntryStartDate() != null) {
            _hashCode += getEntryStartDate().hashCode();
        }
        if (getEntryCloseDate() != null) {
            _hashCode += getEntryCloseDate().hashCode();
        }
        _hashCode += getEntryItemCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFreeExperienceRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isFreeExperience");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsFreeExperience"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("entryStartDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EntryStartDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("entryCloseDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EntryCloseDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("entryItemCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EntryItemCount"));
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
