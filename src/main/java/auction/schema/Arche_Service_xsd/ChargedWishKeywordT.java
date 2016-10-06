/**
 * ChargedWishKeywordT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ChargedWishKeywordT  implements java.io.Serializable {
    private PeriodT period;

    private int slotNo;  // attribute

    private String wishKeyword;  // attribute

    private int applyingCoupon;  // attribute

    public ChargedWishKeywordT() {
    }

    public ChargedWishKeywordT(
           PeriodT period,
           int slotNo,
           String wishKeyword,
           int applyingCoupon) {
           this.period = period;
           this.slotNo = slotNo;
           this.wishKeyword = wishKeyword;
           this.applyingCoupon = applyingCoupon;
    }


    /**
     * Gets the period value for this ChargedWishKeywordT.
     * 
     * @return period
     */
    public PeriodT getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this ChargedWishKeywordT.
     * 
     * @param period
     */
    public void setPeriod(PeriodT period) {
        this.period = period;
    }


    /**
     * Gets the slotNo value for this ChargedWishKeywordT.
     * 
     * @return slotNo
     */
    public int getSlotNo() {
        return slotNo;
    }


    /**
     * Sets the slotNo value for this ChargedWishKeywordT.
     * 
     * @param slotNo
     */
    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }


    /**
     * Gets the wishKeyword value for this ChargedWishKeywordT.
     * 
     * @return wishKeyword
     */
    public String getWishKeyword() {
        return wishKeyword;
    }


    /**
     * Sets the wishKeyword value for this ChargedWishKeywordT.
     * 
     * @param wishKeyword
     */
    public void setWishKeyword(String wishKeyword) {
        this.wishKeyword = wishKeyword;
    }


    /**
     * Gets the applyingCoupon value for this ChargedWishKeywordT.
     * 
     * @return applyingCoupon
     */
    public int getApplyingCoupon() {
        return applyingCoupon;
    }


    /**
     * Sets the applyingCoupon value for this ChargedWishKeywordT.
     * 
     * @param applyingCoupon
     */
    public void setApplyingCoupon(int applyingCoupon) {
        this.applyingCoupon = applyingCoupon;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChargedWishKeywordT)) return false;
        ChargedWishKeywordT other = (ChargedWishKeywordT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            this.slotNo == other.getSlotNo() &&
            ((this.wishKeyword==null && other.getWishKeyword()==null) || 
             (this.wishKeyword!=null &&
              this.wishKeyword.equals(other.getWishKeyword()))) &&
            this.applyingCoupon == other.getApplyingCoupon();
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        _hashCode += getSlotNo();
        if (getWishKeyword() != null) {
            _hashCode += getWishKeyword().hashCode();
        }
        _hashCode += getApplyingCoupon();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargedWishKeywordT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChargedWishKeywordT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("slotNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SlotNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishKeyword");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishKeyword"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyingCoupon");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyingCoupon"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodT"));
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
