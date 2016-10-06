/**
 * ItemFreeExperienceT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemFreeExperienceT  implements java.io.Serializable {
    private String itemNo;  // attribute

    private String itemName;  // attribute

    private String categoryCode;  // attribute

    private String image1Path;  // attribute

    private String image2Path;  // attribute

    private int entryCount;  // attribute

    private java.util.Calendar entryCloseDate;  // attribute

    private int entryItemCount;  // attribute

    private String entryCloseYN;  // attribute

    public ItemFreeExperienceT() {
    }

    public ItemFreeExperienceT(
           String itemNo,
           String itemName,
           String categoryCode,
           String image1Path,
           String image2Path,
           int entryCount,
           java.util.Calendar entryCloseDate,
           int entryItemCount,
           String entryCloseYN) {
           this.itemNo = itemNo;
           this.itemName = itemName;
           this.categoryCode = categoryCode;
           this.image1Path = image1Path;
           this.image2Path = image2Path;
           this.entryCount = entryCount;
           this.entryCloseDate = entryCloseDate;
           this.entryItemCount = entryItemCount;
           this.entryCloseYN = entryCloseYN;
    }


    /**
     * Gets the itemNo value for this ItemFreeExperienceT.
     * 
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this ItemFreeExperienceT.
     * 
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the itemName value for this ItemFreeExperienceT.
     * 
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this ItemFreeExperienceT.
     * 
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the categoryCode value for this ItemFreeExperienceT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this ItemFreeExperienceT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the image1Path value for this ItemFreeExperienceT.
     * 
     * @return image1Path
     */
    public String getImage1Path() {
        return image1Path;
    }


    /**
     * Sets the image1Path value for this ItemFreeExperienceT.
     * 
     * @param image1Path
     */
    public void setImage1Path(String image1Path) {
        this.image1Path = image1Path;
    }


    /**
     * Gets the image2Path value for this ItemFreeExperienceT.
     * 
     * @return image2Path
     */
    public String getImage2Path() {
        return image2Path;
    }


    /**
     * Sets the image2Path value for this ItemFreeExperienceT.
     * 
     * @param image2Path
     */
    public void setImage2Path(String image2Path) {
        this.image2Path = image2Path;
    }


    /**
     * Gets the entryCount value for this ItemFreeExperienceT.
     * 
     * @return entryCount
     */
    public int getEntryCount() {
        return entryCount;
    }


    /**
     * Sets the entryCount value for this ItemFreeExperienceT.
     * 
     * @param entryCount
     */
    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }


    /**
     * Gets the entryCloseDate value for this ItemFreeExperienceT.
     * 
     * @return entryCloseDate
     */
    public java.util.Calendar getEntryCloseDate() {
        return entryCloseDate;
    }


    /**
     * Sets the entryCloseDate value for this ItemFreeExperienceT.
     * 
     * @param entryCloseDate
     */
    public void setEntryCloseDate(java.util.Calendar entryCloseDate) {
        this.entryCloseDate = entryCloseDate;
    }


    /**
     * Gets the entryItemCount value for this ItemFreeExperienceT.
     * 
     * @return entryItemCount
     */
    public int getEntryItemCount() {
        return entryItemCount;
    }


    /**
     * Sets the entryItemCount value for this ItemFreeExperienceT.
     * 
     * @param entryItemCount
     */
    public void setEntryItemCount(int entryItemCount) {
        this.entryItemCount = entryItemCount;
    }


    /**
     * Gets the entryCloseYN value for this ItemFreeExperienceT.
     * 
     * @return entryCloseYN
     */
    public String getEntryCloseYN() {
        return entryCloseYN;
    }


    /**
     * Sets the entryCloseYN value for this ItemFreeExperienceT.
     * 
     * @param entryCloseYN
     */
    public void setEntryCloseYN(String entryCloseYN) {
        this.entryCloseYN = entryCloseYN;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFreeExperienceT)) return false;
        ItemFreeExperienceT other = (ItemFreeExperienceT) obj;
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
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.image1Path==null && other.getImage1Path()==null) || 
             (this.image1Path!=null &&
              this.image1Path.equals(other.getImage1Path()))) &&
            ((this.image2Path==null && other.getImage2Path()==null) || 
             (this.image2Path!=null &&
              this.image2Path.equals(other.getImage2Path()))) &&
            this.entryCount == other.getEntryCount() &&
            ((this.entryCloseDate==null && other.getEntryCloseDate()==null) || 
             (this.entryCloseDate!=null &&
              this.entryCloseDate.equals(other.getEntryCloseDate()))) &&
            this.entryItemCount == other.getEntryItemCount() &&
            ((this.entryCloseYN==null && other.getEntryCloseYN()==null) || 
             (this.entryCloseYN!=null &&
              this.entryCloseYN.equals(other.getEntryCloseYN())));
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
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getImage1Path() != null) {
            _hashCode += getImage1Path().hashCode();
        }
        if (getImage2Path() != null) {
            _hashCode += getImage2Path().hashCode();
        }
        _hashCode += getEntryCount();
        if (getEntryCloseDate() != null) {
            _hashCode += getEntryCloseDate().hashCode();
        }
        _hashCode += getEntryItemCount();
        if (getEntryCloseYN() != null) {
            _hashCode += getEntryCloseYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFreeExperienceT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("image1Path");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Image1Path"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("image2Path");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Image2Path"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("entryCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EntryCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("entryCloseYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EntryCloseYN"));
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
