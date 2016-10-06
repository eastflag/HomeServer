/**
 * ItemDiscountT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemDiscountT  implements java.io.Serializable {
    private boolean isDiscounted;  // attribute

    private java.util.Calendar discountBeginDate;  // attribute

    private java.util.Calendar discountEndDate;  // attribute

    private boolean isMemberDiscount;  // attribute

    private java.math.BigDecimal memberDiscountPrice;  // attribute

    private boolean isBulkDiscount;  // attribute

    private int bulkDiscountQty;  // attribute

    private java.math.BigDecimal bulkDiscountPrice;  // attribute

    public ItemDiscountT() {
    }

    public ItemDiscountT(
           boolean isDiscounted,
           java.util.Calendar discountBeginDate,
           java.util.Calendar discountEndDate,
           boolean isMemberDiscount,
           java.math.BigDecimal memberDiscountPrice,
           boolean isBulkDiscount,
           int bulkDiscountQty,
           java.math.BigDecimal bulkDiscountPrice) {
           this.isDiscounted = isDiscounted;
           this.discountBeginDate = discountBeginDate;
           this.discountEndDate = discountEndDate;
           this.isMemberDiscount = isMemberDiscount;
           this.memberDiscountPrice = memberDiscountPrice;
           this.isBulkDiscount = isBulkDiscount;
           this.bulkDiscountQty = bulkDiscountQty;
           this.bulkDiscountPrice = bulkDiscountPrice;
    }


    /**
     * Gets the isDiscounted value for this ItemDiscountT.
     * 
     * @return isDiscounted
     */
    public boolean isIsDiscounted() {
        return isDiscounted;
    }


    /**
     * Sets the isDiscounted value for this ItemDiscountT.
     * 
     * @param isDiscounted
     */
    public void setIsDiscounted(boolean isDiscounted) {
        this.isDiscounted = isDiscounted;
    }


    /**
     * Gets the discountBeginDate value for this ItemDiscountT.
     * 
     * @return discountBeginDate
     */
    public java.util.Calendar getDiscountBeginDate() {
        return discountBeginDate;
    }


    /**
     * Sets the discountBeginDate value for this ItemDiscountT.
     * 
     * @param discountBeginDate
     */
    public void setDiscountBeginDate(java.util.Calendar discountBeginDate) {
        this.discountBeginDate = discountBeginDate;
    }


    /**
     * Gets the discountEndDate value for this ItemDiscountT.
     * 
     * @return discountEndDate
     */
    public java.util.Calendar getDiscountEndDate() {
        return discountEndDate;
    }


    /**
     * Sets the discountEndDate value for this ItemDiscountT.
     * 
     * @param discountEndDate
     */
    public void setDiscountEndDate(java.util.Calendar discountEndDate) {
        this.discountEndDate = discountEndDate;
    }


    /**
     * Gets the isMemberDiscount value for this ItemDiscountT.
     * 
     * @return isMemberDiscount
     */
    public boolean isIsMemberDiscount() {
        return isMemberDiscount;
    }


    /**
     * Sets the isMemberDiscount value for this ItemDiscountT.
     * 
     * @param isMemberDiscount
     */
    public void setIsMemberDiscount(boolean isMemberDiscount) {
        this.isMemberDiscount = isMemberDiscount;
    }


    /**
     * Gets the memberDiscountPrice value for this ItemDiscountT.
     * 
     * @return memberDiscountPrice
     */
    public java.math.BigDecimal getMemberDiscountPrice() {
        return memberDiscountPrice;
    }


    /**
     * Sets the memberDiscountPrice value for this ItemDiscountT.
     * 
     * @param memberDiscountPrice
     */
    public void setMemberDiscountPrice(java.math.BigDecimal memberDiscountPrice) {
        this.memberDiscountPrice = memberDiscountPrice;
    }


    /**
     * Gets the isBulkDiscount value for this ItemDiscountT.
     * 
     * @return isBulkDiscount
     */
    public boolean isIsBulkDiscount() {
        return isBulkDiscount;
    }


    /**
     * Sets the isBulkDiscount value for this ItemDiscountT.
     * 
     * @param isBulkDiscount
     */
    public void setIsBulkDiscount(boolean isBulkDiscount) {
        this.isBulkDiscount = isBulkDiscount;
    }


    /**
     * Gets the bulkDiscountQty value for this ItemDiscountT.
     * 
     * @return bulkDiscountQty
     */
    public int getBulkDiscountQty() {
        return bulkDiscountQty;
    }


    /**
     * Sets the bulkDiscountQty value for this ItemDiscountT.
     * 
     * @param bulkDiscountQty
     */
    public void setBulkDiscountQty(int bulkDiscountQty) {
        this.bulkDiscountQty = bulkDiscountQty;
    }


    /**
     * Gets the bulkDiscountPrice value for this ItemDiscountT.
     * 
     * @return bulkDiscountPrice
     */
    public java.math.BigDecimal getBulkDiscountPrice() {
        return bulkDiscountPrice;
    }


    /**
     * Sets the bulkDiscountPrice value for this ItemDiscountT.
     * 
     * @param bulkDiscountPrice
     */
    public void setBulkDiscountPrice(java.math.BigDecimal bulkDiscountPrice) {
        this.bulkDiscountPrice = bulkDiscountPrice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemDiscountT)) return false;
        ItemDiscountT other = (ItemDiscountT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isDiscounted == other.isIsDiscounted() &&
            ((this.discountBeginDate==null && other.getDiscountBeginDate()==null) || 
             (this.discountBeginDate!=null &&
              this.discountBeginDate.equals(other.getDiscountBeginDate()))) &&
            ((this.discountEndDate==null && other.getDiscountEndDate()==null) || 
             (this.discountEndDate!=null &&
              this.discountEndDate.equals(other.getDiscountEndDate()))) &&
            this.isMemberDiscount == other.isIsMemberDiscount() &&
            ((this.memberDiscountPrice==null && other.getMemberDiscountPrice()==null) || 
             (this.memberDiscountPrice!=null &&
              this.memberDiscountPrice.equals(other.getMemberDiscountPrice()))) &&
            this.isBulkDiscount == other.isIsBulkDiscount() &&
            this.bulkDiscountQty == other.getBulkDiscountQty() &&
            ((this.bulkDiscountPrice==null && other.getBulkDiscountPrice()==null) || 
             (this.bulkDiscountPrice!=null &&
              this.bulkDiscountPrice.equals(other.getBulkDiscountPrice())));
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
        _hashCode += (isIsDiscounted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDiscountBeginDate() != null) {
            _hashCode += getDiscountBeginDate().hashCode();
        }
        if (getDiscountEndDate() != null) {
            _hashCode += getDiscountEndDate().hashCode();
        }
        _hashCode += (isIsMemberDiscount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMemberDiscountPrice() != null) {
            _hashCode += getMemberDiscountPrice().hashCode();
        }
        _hashCode += (isIsBulkDiscount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getBulkDiscountQty();
        if (getBulkDiscountPrice() != null) {
            _hashCode += getBulkDiscountPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemDiscountT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemDiscountT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDiscounted");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDiscounted"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discountBeginDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DiscountBeginDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discountEndDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DiscountEndDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMemberDiscount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMemberDiscount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("memberDiscountPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MemberDiscountPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isBulkDiscount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsBulkDiscount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bulkDiscountQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BulkDiscountQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bulkDiscountPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BulkDiscountPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
