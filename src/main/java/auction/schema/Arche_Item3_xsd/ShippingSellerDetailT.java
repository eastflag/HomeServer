/**
 * ShippingSellerDetailT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Item3_xsd;

public class ShippingSellerDetailT  implements java.io.Serializable {
    private String sellerID;  // attribute

    private int seqNo;  // attribute

    private int conditionFrom;  // attribute

    private int conditionTo;  // attribute

    private java.math.BigDecimal fee;  // attribute

    private java.util.Calendar insDate;  // attribute

    private java.util.Calendar updDate;  // attribute

    private int shippingPlaceSeq;  // attribute

    private int shippingPolicySeqNo;  // attribute

    public ShippingSellerDetailT() {
    }

    public ShippingSellerDetailT(
           String sellerID,
           int seqNo,
           int conditionFrom,
           int conditionTo,
           java.math.BigDecimal fee,
           java.util.Calendar insDate,
           java.util.Calendar updDate,
           int shippingPlaceSeq,
           int shippingPolicySeqNo) {
           this.sellerID = sellerID;
           this.seqNo = seqNo;
           this.conditionFrom = conditionFrom;
           this.conditionTo = conditionTo;
           this.fee = fee;
           this.insDate = insDate;
           this.updDate = updDate;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.shippingPolicySeqNo = shippingPolicySeqNo;
    }


    /**
     * Gets the sellerID value for this ShippingSellerDetailT.
     * 
     * @return sellerID
     */
    public String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this ShippingSellerDetailT.
     * 
     * @param sellerID
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the seqNo value for this ShippingSellerDetailT.
     * 
     * @return seqNo
     */
    public int getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this ShippingSellerDetailT.
     * 
     * @param seqNo
     */
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the conditionFrom value for this ShippingSellerDetailT.
     * 
     * @return conditionFrom
     */
    public int getConditionFrom() {
        return conditionFrom;
    }


    /**
     * Sets the conditionFrom value for this ShippingSellerDetailT.
     * 
     * @param conditionFrom
     */
    public void setConditionFrom(int conditionFrom) {
        this.conditionFrom = conditionFrom;
    }


    /**
     * Gets the conditionTo value for this ShippingSellerDetailT.
     * 
     * @return conditionTo
     */
    public int getConditionTo() {
        return conditionTo;
    }


    /**
     * Sets the conditionTo value for this ShippingSellerDetailT.
     * 
     * @param conditionTo
     */
    public void setConditionTo(int conditionTo) {
        this.conditionTo = conditionTo;
    }


    /**
     * Gets the fee value for this ShippingSellerDetailT.
     * 
     * @return fee
     */
    public java.math.BigDecimal getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this ShippingSellerDetailT.
     * 
     * @param fee
     */
    public void setFee(java.math.BigDecimal fee) {
        this.fee = fee;
    }


    /**
     * Gets the insDate value for this ShippingSellerDetailT.
     * 
     * @return insDate
     */
    public java.util.Calendar getInsDate() {
        return insDate;
    }


    /**
     * Sets the insDate value for this ShippingSellerDetailT.
     * 
     * @param insDate
     */
    public void setInsDate(java.util.Calendar insDate) {
        this.insDate = insDate;
    }


    /**
     * Gets the updDate value for this ShippingSellerDetailT.
     * 
     * @return updDate
     */
    public java.util.Calendar getUpdDate() {
        return updDate;
    }


    /**
     * Sets the updDate value for this ShippingSellerDetailT.
     * 
     * @param updDate
     */
    public void setUpdDate(java.util.Calendar updDate) {
        this.updDate = updDate;
    }


    /**
     * Gets the shippingPlaceSeq value for this ShippingSellerDetailT.
     * 
     * @return shippingPlaceSeq
     */
    public int getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this ShippingSellerDetailT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(int shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the shippingPolicySeqNo value for this ShippingSellerDetailT.
     * 
     * @return shippingPolicySeqNo
     */
    public int getShippingPolicySeqNo() {
        return shippingPolicySeqNo;
    }


    /**
     * Sets the shippingPolicySeqNo value for this ShippingSellerDetailT.
     * 
     * @param shippingPolicySeqNo
     */
    public void setShippingPolicySeqNo(int shippingPolicySeqNo) {
        this.shippingPolicySeqNo = shippingPolicySeqNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingSellerDetailT)) return false;
        ShippingSellerDetailT other = (ShippingSellerDetailT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            this.seqNo == other.getSeqNo() &&
            this.conditionFrom == other.getConditionFrom() &&
            this.conditionTo == other.getConditionTo() &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.insDate==null && other.getInsDate()==null) || 
             (this.insDate!=null &&
              this.insDate.equals(other.getInsDate()))) &&
            ((this.updDate==null && other.getUpdDate()==null) || 
             (this.updDate!=null &&
              this.updDate.equals(other.getUpdDate()))) &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            this.shippingPolicySeqNo == other.getShippingPolicySeqNo();
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
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        _hashCode += getSeqNo();
        _hashCode += getConditionFrom();
        _hashCode += getConditionTo();
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getInsDate() != null) {
            _hashCode += getInsDate().hashCode();
        }
        if (getUpdDate() != null) {
            _hashCode += getUpdDate().hashCode();
        }
        _hashCode += getShippingPlaceSeq();
        _hashCode += getShippingPolicySeqNo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingSellerDetailT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetailT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conditionFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConditionFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conditionTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConditionTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Fee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("insDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InsDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UpdDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPlaceSeq");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPlaceSeq"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPolicySeqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPolicySeqNo"));
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
