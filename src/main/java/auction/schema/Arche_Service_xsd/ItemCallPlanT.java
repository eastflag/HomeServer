/**
 * ItemCallPlanT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemCallPlanT  implements java.io.Serializable {
    private int seqNo;  // attribute

    private int feePlanSeqNo;  // attribute

    private java.math.BigDecimal buyerChargeCellPhoneAmnt;  // attribute

    private int stipulationPeriod;  // attribute

    private auction.schema.Arche_Service_xsd.JoinFeeTypeCode joinFeeType;  // attribute

    private boolean isDefaultFeePlan;  // attribute

    public ItemCallPlanT() {
    }

    public ItemCallPlanT(
           int seqNo,
           int feePlanSeqNo,
           java.math.BigDecimal buyerChargeCellPhoneAmnt,
           int stipulationPeriod,
           auction.schema.Arche_Service_xsd.JoinFeeTypeCode joinFeeType,
           boolean isDefaultFeePlan) {
           this.seqNo = seqNo;
           this.feePlanSeqNo = feePlanSeqNo;
           this.buyerChargeCellPhoneAmnt = buyerChargeCellPhoneAmnt;
           this.stipulationPeriod = stipulationPeriod;
           this.joinFeeType = joinFeeType;
           this.isDefaultFeePlan = isDefaultFeePlan;
    }


    /**
     * Gets the seqNo value for this ItemCallPlanT.
     * 
     * @return seqNo
     */
    public int getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this ItemCallPlanT.
     * 
     * @param seqNo
     */
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the feePlanSeqNo value for this ItemCallPlanT.
     * 
     * @return feePlanSeqNo
     */
    public int getFeePlanSeqNo() {
        return feePlanSeqNo;
    }


    /**
     * Sets the feePlanSeqNo value for this ItemCallPlanT.
     * 
     * @param feePlanSeqNo
     */
    public void setFeePlanSeqNo(int feePlanSeqNo) {
        this.feePlanSeqNo = feePlanSeqNo;
    }


    /**
     * Gets the buyerChargeCellPhoneAmnt value for this ItemCallPlanT.
     * 
     * @return buyerChargeCellPhoneAmnt
     */
    public java.math.BigDecimal getBuyerChargeCellPhoneAmnt() {
        return buyerChargeCellPhoneAmnt;
    }


    /**
     * Sets the buyerChargeCellPhoneAmnt value for this ItemCallPlanT.
     * 
     * @param buyerChargeCellPhoneAmnt
     */
    public void setBuyerChargeCellPhoneAmnt(java.math.BigDecimal buyerChargeCellPhoneAmnt) {
        this.buyerChargeCellPhoneAmnt = buyerChargeCellPhoneAmnt;
    }


    /**
     * Gets the stipulationPeriod value for this ItemCallPlanT.
     * 
     * @return stipulationPeriod
     */
    public int getStipulationPeriod() {
        return stipulationPeriod;
    }


    /**
     * Sets the stipulationPeriod value for this ItemCallPlanT.
     * 
     * @param stipulationPeriod
     */
    public void setStipulationPeriod(int stipulationPeriod) {
        this.stipulationPeriod = stipulationPeriod;
    }


    /**
     * Gets the joinFeeType value for this ItemCallPlanT.
     * 
     * @return joinFeeType
     */
    public auction.schema.Arche_Service_xsd.JoinFeeTypeCode getJoinFeeType() {
        return joinFeeType;
    }


    /**
     * Sets the joinFeeType value for this ItemCallPlanT.
     * 
     * @param joinFeeType
     */
    public void setJoinFeeType(auction.schema.Arche_Service_xsd.JoinFeeTypeCode joinFeeType) {
        this.joinFeeType = joinFeeType;
    }


    /**
     * Gets the isDefaultFeePlan value for this ItemCallPlanT.
     * 
     * @return isDefaultFeePlan
     */
    public boolean isIsDefaultFeePlan() {
        return isDefaultFeePlan;
    }


    /**
     * Sets the isDefaultFeePlan value for this ItemCallPlanT.
     * 
     * @param isDefaultFeePlan
     */
    public void setIsDefaultFeePlan(boolean isDefaultFeePlan) {
        this.isDefaultFeePlan = isDefaultFeePlan;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemCallPlanT)) return false;
        ItemCallPlanT other = (ItemCallPlanT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seqNo == other.getSeqNo() &&
            this.feePlanSeqNo == other.getFeePlanSeqNo() &&
            ((this.buyerChargeCellPhoneAmnt==null && other.getBuyerChargeCellPhoneAmnt()==null) || 
             (this.buyerChargeCellPhoneAmnt!=null &&
              this.buyerChargeCellPhoneAmnt.equals(other.getBuyerChargeCellPhoneAmnt()))) &&
            this.stipulationPeriod == other.getStipulationPeriod() &&
            ((this.joinFeeType==null && other.getJoinFeeType()==null) || 
             (this.joinFeeType!=null &&
              this.joinFeeType.equals(other.getJoinFeeType()))) &&
            this.isDefaultFeePlan == other.isIsDefaultFeePlan();
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
        _hashCode += getSeqNo();
        _hashCode += getFeePlanSeqNo();
        if (getBuyerChargeCellPhoneAmnt() != null) {
            _hashCode += getBuyerChargeCellPhoneAmnt().hashCode();
        }
        _hashCode += getStipulationPeriod();
        if (getJoinFeeType() != null) {
            _hashCode += getJoinFeeType().hashCode();
        }
        _hashCode += (isIsDefaultFeePlan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemCallPlanT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCallPlanT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("feePlanSeqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FeePlanSeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerChargeCellPhoneAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerChargeCellPhoneAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stipulationPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StipulationPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("joinFeeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "JoinFeeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "JoinFeeTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDefaultFeePlan");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDefaultFeePlan"));
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
