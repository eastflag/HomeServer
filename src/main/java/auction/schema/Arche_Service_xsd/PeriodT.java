/**
 * PeriodT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class PeriodT  implements java.io.Serializable {
    private int applyPeriod;  // attribute

    private java.util.Calendar applyDate;  // attribute

    private java.util.Calendar applyEndDate;  // attribute

    private java.util.Calendar preSaleShippingDate;  // attribute

    private java.util.Calendar buyingDate;  // attribute

    private String insType;  // attribute

    private String buyAdminStaffId;  // attribute

    public PeriodT() {
    }

    public PeriodT(
           int applyPeriod,
           java.util.Calendar applyDate,
           java.util.Calendar applyEndDate,
           java.util.Calendar preSaleShippingDate,
           java.util.Calendar buyingDate,
           String insType,
           String buyAdminStaffId) {
           this.applyPeriod = applyPeriod;
           this.applyDate = applyDate;
           this.applyEndDate = applyEndDate;
           this.preSaleShippingDate = preSaleShippingDate;
           this.buyingDate = buyingDate;
           this.insType = insType;
           this.buyAdminStaffId = buyAdminStaffId;
    }


    /**
     * Gets the applyPeriod value for this PeriodT.
     * 
     * @return applyPeriod
     */
    public int getApplyPeriod() {
        return applyPeriod;
    }


    /**
     * Sets the applyPeriod value for this PeriodT.
     * 
     * @param applyPeriod
     */
    public void setApplyPeriod(int applyPeriod) {
        this.applyPeriod = applyPeriod;
    }


    /**
     * Gets the applyDate value for this PeriodT.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this PeriodT.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyEndDate value for this PeriodT.
     * 
     * @return applyEndDate
     */
    public java.util.Calendar getApplyEndDate() {
        return applyEndDate;
    }


    /**
     * Sets the applyEndDate value for this PeriodT.
     * 
     * @param applyEndDate
     */
    public void setApplyEndDate(java.util.Calendar applyEndDate) {
        this.applyEndDate = applyEndDate;
    }


    /**
     * Gets the preSaleShippingDate value for this PeriodT.
     * 
     * @return preSaleShippingDate
     */
    public java.util.Calendar getPreSaleShippingDate() {
        return preSaleShippingDate;
    }


    /**
     * Sets the preSaleShippingDate value for this PeriodT.
     * 
     * @param preSaleShippingDate
     */
    public void setPreSaleShippingDate(java.util.Calendar preSaleShippingDate) {
        this.preSaleShippingDate = preSaleShippingDate;
    }


    /**
     * Gets the buyingDate value for this PeriodT.
     * 
     * @return buyingDate
     */
    public java.util.Calendar getBuyingDate() {
        return buyingDate;
    }


    /**
     * Sets the buyingDate value for this PeriodT.
     * 
     * @param buyingDate
     */
    public void setBuyingDate(java.util.Calendar buyingDate) {
        this.buyingDate = buyingDate;
    }


    /**
     * Gets the insType value for this PeriodT.
     * 
     * @return insType
     */
    public String getInsType() {
        return insType;
    }


    /**
     * Sets the insType value for this PeriodT.
     * 
     * @param insType
     */
    public void setInsType(String insType) {
        this.insType = insType;
    }


    /**
     * Gets the buyAdminStaffId value for this PeriodT.
     * 
     * @return buyAdminStaffId
     */
    public String getBuyAdminStaffId() {
        return buyAdminStaffId;
    }


    /**
     * Sets the buyAdminStaffId value for this PeriodT.
     * 
     * @param buyAdminStaffId
     */
    public void setBuyAdminStaffId(String buyAdminStaffId) {
        this.buyAdminStaffId = buyAdminStaffId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PeriodT)) return false;
        PeriodT other = (PeriodT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.applyPeriod == other.getApplyPeriod() &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.applyEndDate==null && other.getApplyEndDate()==null) || 
             (this.applyEndDate!=null &&
              this.applyEndDate.equals(other.getApplyEndDate()))) &&
            ((this.preSaleShippingDate==null && other.getPreSaleShippingDate()==null) || 
             (this.preSaleShippingDate!=null &&
              this.preSaleShippingDate.equals(other.getPreSaleShippingDate()))) &&
            ((this.buyingDate==null && other.getBuyingDate()==null) || 
             (this.buyingDate!=null &&
              this.buyingDate.equals(other.getBuyingDate()))) &&
            ((this.insType==null && other.getInsType()==null) || 
             (this.insType!=null &&
              this.insType.equals(other.getInsType()))) &&
            ((this.buyAdminStaffId==null && other.getBuyAdminStaffId()==null) || 
             (this.buyAdminStaffId!=null &&
              this.buyAdminStaffId.equals(other.getBuyAdminStaffId())));
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
        _hashCode += getApplyPeriod();
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getApplyEndDate() != null) {
            _hashCode += getApplyEndDate().hashCode();
        }
        if (getPreSaleShippingDate() != null) {
            _hashCode += getPreSaleShippingDate().hashCode();
        }
        if (getBuyingDate() != null) {
            _hashCode += getBuyingDate().hashCode();
        }
        if (getInsType() != null) {
            _hashCode += getInsType().hashCode();
        }
        if (getBuyAdminStaffId() != null) {
            _hashCode += getBuyAdminStaffId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeriodT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyEndDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyEndDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preSaleShippingDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreSaleShippingDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyingDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyingDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("insType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InsType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyAdminStaffId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyAdminStaffId"));
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
