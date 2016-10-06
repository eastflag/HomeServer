/**
 * ShippingPolicyT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Item3_xsd;

public class ShippingPolicyT  implements java.io.Serializable {
    private auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail;

    private int seqNo;  // attribute

    private int shippingPlaceSeq;  // attribute

    private String name;  // attribute

    private int chargeTypeCode;  // attribute

    private boolean isPrepayable;  // attribute

    private boolean isArrival;  // attribute

    private boolean isDefaultPolicy;  // attribute

    private java.util.Calendar insDate;  // attribute

    private java.util.Calendar updDate;  // attribute

    private int addFeeJeju;  // attribute

    private int addFeeExcludeJeju;  // attribute

    public ShippingPolicyT() {
    }

    public ShippingPolicyT(
           auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail,
           int seqNo,
           int shippingPlaceSeq,
           String name,
           int chargeTypeCode,
           boolean isPrepayable,
           boolean isArrival,
           boolean isDefaultPolicy,
           java.util.Calendar insDate,
           java.util.Calendar updDate,
           int addFeeJeju,
           int addFeeExcludeJeju) {
           this.shippingSellerDetail = shippingSellerDetail;
           this.seqNo = seqNo;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.name = name;
           this.chargeTypeCode = chargeTypeCode;
           this.isPrepayable = isPrepayable;
           this.isArrival = isArrival;
           this.isDefaultPolicy = isDefaultPolicy;
           this.insDate = insDate;
           this.updDate = updDate;
           this.addFeeJeju = addFeeJeju;
           this.addFeeExcludeJeju = addFeeExcludeJeju;
    }


    /**
     * Gets the shippingSellerDetail value for this ShippingPolicyT.
     * 
     * @return shippingSellerDetail
     */
    public auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] getShippingSellerDetail() {
        return shippingSellerDetail;
    }


    /**
     * Sets the shippingSellerDetail value for this ShippingPolicyT.
     * 
     * @param shippingSellerDetail
     */
    public void setShippingSellerDetail(auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail) {
        this.shippingSellerDetail = shippingSellerDetail;
    }

    public auction.schema.Arche_Item3_xsd.ShippingSellerDetailT getShippingSellerDetail(int i) {
        return this.shippingSellerDetail[i];
    }

    public void setShippingSellerDetail(int i, auction.schema.Arche_Item3_xsd.ShippingSellerDetailT _value) {
        this.shippingSellerDetail[i] = _value;
    }


    /**
     * Gets the seqNo value for this ShippingPolicyT.
     * 
     * @return seqNo
     */
    public int getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this ShippingPolicyT.
     * 
     * @param seqNo
     */
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the shippingPlaceSeq value for this ShippingPolicyT.
     * 
     * @return shippingPlaceSeq
     */
    public int getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this ShippingPolicyT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(int shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the name value for this ShippingPolicyT.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this ShippingPolicyT.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the chargeTypeCode value for this ShippingPolicyT.
     * 
     * @return chargeTypeCode
     */
    public int getChargeTypeCode() {
        return chargeTypeCode;
    }


    /**
     * Sets the chargeTypeCode value for this ShippingPolicyT.
     * 
     * @param chargeTypeCode
     */
    public void setChargeTypeCode(int chargeTypeCode) {
        this.chargeTypeCode = chargeTypeCode;
    }


    /**
     * Gets the isPrepayable value for this ShippingPolicyT.
     * 
     * @return isPrepayable
     */
    public boolean isIsPrepayable() {
        return isPrepayable;
    }


    /**
     * Sets the isPrepayable value for this ShippingPolicyT.
     * 
     * @param isPrepayable
     */
    public void setIsPrepayable(boolean isPrepayable) {
        this.isPrepayable = isPrepayable;
    }


    /**
     * Gets the isArrival value for this ShippingPolicyT.
     * 
     * @return isArrival
     */
    public boolean isIsArrival() {
        return isArrival;
    }


    /**
     * Sets the isArrival value for this ShippingPolicyT.
     * 
     * @param isArrival
     */
    public void setIsArrival(boolean isArrival) {
        this.isArrival = isArrival;
    }


    /**
     * Gets the isDefaultPolicy value for this ShippingPolicyT.
     * 
     * @return isDefaultPolicy
     */
    public boolean isIsDefaultPolicy() {
        return isDefaultPolicy;
    }


    /**
     * Sets the isDefaultPolicy value for this ShippingPolicyT.
     * 
     * @param isDefaultPolicy
     */
    public void setIsDefaultPolicy(boolean isDefaultPolicy) {
        this.isDefaultPolicy = isDefaultPolicy;
    }


    /**
     * Gets the insDate value for this ShippingPolicyT.
     * 
     * @return insDate
     */
    public java.util.Calendar getInsDate() {
        return insDate;
    }


    /**
     * Sets the insDate value for this ShippingPolicyT.
     * 
     * @param insDate
     */
    public void setInsDate(java.util.Calendar insDate) {
        this.insDate = insDate;
    }


    /**
     * Gets the updDate value for this ShippingPolicyT.
     * 
     * @return updDate
     */
    public java.util.Calendar getUpdDate() {
        return updDate;
    }


    /**
     * Sets the updDate value for this ShippingPolicyT.
     * 
     * @param updDate
     */
    public void setUpdDate(java.util.Calendar updDate) {
        this.updDate = updDate;
    }


    /**
     * Gets the addFeeJeju value for this ShippingPolicyT.
     * 
     * @return addFeeJeju
     */
    public int getAddFeeJeju() {
        return addFeeJeju;
    }


    /**
     * Sets the addFeeJeju value for this ShippingPolicyT.
     * 
     * @param addFeeJeju
     */
    public void setAddFeeJeju(int addFeeJeju) {
        this.addFeeJeju = addFeeJeju;
    }


    /**
     * Gets the addFeeExcludeJeju value for this ShippingPolicyT.
     * 
     * @return addFeeExcludeJeju
     */
    public int getAddFeeExcludeJeju() {
        return addFeeExcludeJeju;
    }


    /**
     * Sets the addFeeExcludeJeju value for this ShippingPolicyT.
     * 
     * @param addFeeExcludeJeju
     */
    public void setAddFeeExcludeJeju(int addFeeExcludeJeju) {
        this.addFeeExcludeJeju = addFeeExcludeJeju;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingPolicyT)) return false;
        ShippingPolicyT other = (ShippingPolicyT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingSellerDetail==null && other.getShippingSellerDetail()==null) || 
             (this.shippingSellerDetail!=null &&
              java.util.Arrays.equals(this.shippingSellerDetail, other.getShippingSellerDetail()))) &&
            this.seqNo == other.getSeqNo() &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.chargeTypeCode == other.getChargeTypeCode() &&
            this.isPrepayable == other.isIsPrepayable() &&
            this.isArrival == other.isIsArrival() &&
            this.isDefaultPolicy == other.isIsDefaultPolicy() &&
            ((this.insDate==null && other.getInsDate()==null) || 
             (this.insDate!=null &&
              this.insDate.equals(other.getInsDate()))) &&
            ((this.updDate==null && other.getUpdDate()==null) || 
             (this.updDate!=null &&
              this.updDate.equals(other.getUpdDate()))) &&
            this.addFeeJeju == other.getAddFeeJeju() &&
            this.addFeeExcludeJeju == other.getAddFeeExcludeJeju();
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
        if (getShippingSellerDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingSellerDetail());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingSellerDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSeqNo();
        _hashCode += getShippingPlaceSeq();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getChargeTypeCode();
        _hashCode += (isIsPrepayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsArrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDefaultPolicy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInsDate() != null) {
            _hashCode += getInsDate().hashCode();
        }
        if (getUpdDate() != null) {
            _hashCode += getUpdDate().hashCode();
        }
        _hashCode += getAddFeeJeju();
        _hashCode += getAddFeeExcludeJeju();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingPolicyT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPolicyT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPlaceSeq");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPlaceSeq"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("chargeTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChargeTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isPrepayable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsPrepayable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isArrival");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsArrival"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDefaultPolicy");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDefaultPolicy"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        attrField.setFieldName("addFeeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addFeeExcludeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeExcludeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingSellerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetailT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
