/**
 * ShippingT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shipingFeeType;

    private Integer shippingPlaceSeq;

    private Integer shippingPolicyNo;

    private auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel1;

    private auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel2;

    private auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel3;

    private auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel4;

    private auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel5;

    private auction.schema.Arche_Service_xsd.ShippingCode shippingType;  // attribute

    private boolean isPrepayable;  // attribute

    private boolean isArrival;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType;  // attribute

    private boolean isExclude35Policy;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType;  // attribute

    public ShippingT() {
    }

    public ShippingT(
           auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shipingFeeType,
           Integer shippingPlaceSeq,
           Integer shippingPolicyNo,
           auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel1,
           auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel2,
           auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel3,
           auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel4,
           auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel5,
           auction.schema.Arche_Service_xsd.ShippingCode shippingType,
           boolean isPrepayable,
           boolean isArrival,
           auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType,
           boolean isExclude35Policy,
           auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType) {
           this.shipingFeeType = shipingFeeType;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.shippingPolicyNo = shippingPolicyNo;
           this.conditionLevel1 = conditionLevel1;
           this.conditionLevel2 = conditionLevel2;
           this.conditionLevel3 = conditionLevel3;
           this.conditionLevel4 = conditionLevel4;
           this.conditionLevel5 = conditionLevel5;
           this.shippingType = shippingType;
           this.isPrepayable = isPrepayable;
           this.isArrival = isArrival;
           this.feeFreeConditionType = feeFreeConditionType;
           this.isExclude35Policy = isExclude35Policy;
           this.shippingFeeChargeType = shippingFeeChargeType;
    }


    /**
     * Gets the shipingFeeType value for this ShippingT.
     * 
     * @return shipingFeeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeTypeCode getShipingFeeType() {
        return shipingFeeType;
    }


    /**
     * Sets the shipingFeeType value for this ShippingT.
     * 
     * @param shipingFeeType
     */
    public void setShipingFeeType(auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shipingFeeType) {
        this.shipingFeeType = shipingFeeType;
    }


    /**
     * Gets the shippingPlaceSeq value for this ShippingT.
     * 
     * @return shippingPlaceSeq
     */
    public Integer getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this ShippingT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(Integer shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the shippingPolicyNo value for this ShippingT.
     * 
     * @return shippingPolicyNo
     */
    public Integer getShippingPolicyNo() {
        return shippingPolicyNo;
    }


    /**
     * Sets the shippingPolicyNo value for this ShippingT.
     * 
     * @param shippingPolicyNo
     */
    public void setShippingPolicyNo(Integer shippingPolicyNo) {
        this.shippingPolicyNo = shippingPolicyNo;
    }


    /**
     * Gets the conditionLevel1 value for this ShippingT.
     * 
     * @return conditionLevel1
     */
    public auction.schema.Arche_Service_xsd.ShippingConditionT getConditionLevel1() {
        return conditionLevel1;
    }


    /**
     * Sets the conditionLevel1 value for this ShippingT.
     * 
     * @param conditionLevel1
     */
    public void setConditionLevel1(auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel1) {
        this.conditionLevel1 = conditionLevel1;
    }


    /**
     * Gets the conditionLevel2 value for this ShippingT.
     * 
     * @return conditionLevel2
     */
    public auction.schema.Arche_Service_xsd.ShippingConditionT getConditionLevel2() {
        return conditionLevel2;
    }


    /**
     * Sets the conditionLevel2 value for this ShippingT.
     * 
     * @param conditionLevel2
     */
    public void setConditionLevel2(auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel2) {
        this.conditionLevel2 = conditionLevel2;
    }


    /**
     * Gets the conditionLevel3 value for this ShippingT.
     * 
     * @return conditionLevel3
     */
    public auction.schema.Arche_Service_xsd.ShippingConditionT getConditionLevel3() {
        return conditionLevel3;
    }


    /**
     * Sets the conditionLevel3 value for this ShippingT.
     * 
     * @param conditionLevel3
     */
    public void setConditionLevel3(auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel3) {
        this.conditionLevel3 = conditionLevel3;
    }


    /**
     * Gets the conditionLevel4 value for this ShippingT.
     * 
     * @return conditionLevel4
     */
    public auction.schema.Arche_Service_xsd.ShippingConditionT getConditionLevel4() {
        return conditionLevel4;
    }


    /**
     * Sets the conditionLevel4 value for this ShippingT.
     * 
     * @param conditionLevel4
     */
    public void setConditionLevel4(auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel4) {
        this.conditionLevel4 = conditionLevel4;
    }


    /**
     * Gets the conditionLevel5 value for this ShippingT.
     * 
     * @return conditionLevel5
     */
    public auction.schema.Arche_Service_xsd.ShippingConditionT getConditionLevel5() {
        return conditionLevel5;
    }


    /**
     * Sets the conditionLevel5 value for this ShippingT.
     * 
     * @param conditionLevel5
     */
    public void setConditionLevel5(auction.schema.Arche_Service_xsd.ShippingConditionT conditionLevel5) {
        this.conditionLevel5 = conditionLevel5;
    }


    /**
     * Gets the shippingType value for this ShippingT.
     * 
     * @return shippingType
     */
    public auction.schema.Arche_Service_xsd.ShippingCode getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this ShippingT.
     * 
     * @param shippingType
     */
    public void setShippingType(auction.schema.Arche_Service_xsd.ShippingCode shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the isPrepayable value for this ShippingT.
     * 
     * @return isPrepayable
     */
    public boolean isIsPrepayable() {
        return isPrepayable;
    }


    /**
     * Sets the isPrepayable value for this ShippingT.
     * 
     * @param isPrepayable
     */
    public void setIsPrepayable(boolean isPrepayable) {
        this.isPrepayable = isPrepayable;
    }


    /**
     * Gets the isArrival value for this ShippingT.
     * 
     * @return isArrival
     */
    public boolean isIsArrival() {
        return isArrival;
    }


    /**
     * Sets the isArrival value for this ShippingT.
     * 
     * @param isArrival
     */
    public void setIsArrival(boolean isArrival) {
        this.isArrival = isArrival;
    }


    /**
     * Gets the feeFreeConditionType value for this ShippingT.
     * 
     * @return feeFreeConditionType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeConditionCode getFeeFreeConditionType() {
        return feeFreeConditionType;
    }


    /**
     * Sets the feeFreeConditionType value for this ShippingT.
     * 
     * @param feeFreeConditionType
     */
    public void setFeeFreeConditionType(auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType) {
        this.feeFreeConditionType = feeFreeConditionType;
    }


    /**
     * Gets the isExclude35Policy value for this ShippingT.
     * 
     * @return isExclude35Policy
     */
    public boolean isIsExclude35Policy() {
        return isExclude35Policy;
    }


    /**
     * Sets the isExclude35Policy value for this ShippingT.
     * 
     * @param isExclude35Policy
     */
    public void setIsExclude35Policy(boolean isExclude35Policy) {
        this.isExclude35Policy = isExclude35Policy;
    }


    /**
     * Gets the shippingFeeChargeType value for this ShippingT.
     * 
     * @return shippingFeeChargeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeChargeCode getShippingFeeChargeType() {
        return shippingFeeChargeType;
    }


    /**
     * Sets the shippingFeeChargeType value for this ShippingT.
     * 
     * @param shippingFeeChargeType
     */
    public void setShippingFeeChargeType(auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType) {
        this.shippingFeeChargeType = shippingFeeChargeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingT)) return false;
        ShippingT other = (ShippingT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipingFeeType==null && other.getShipingFeeType()==null) || 
             (this.shipingFeeType!=null &&
              this.shipingFeeType.equals(other.getShipingFeeType()))) &&
            ((this.shippingPlaceSeq==null && other.getShippingPlaceSeq()==null) || 
             (this.shippingPlaceSeq!=null &&
              this.shippingPlaceSeq.equals(other.getShippingPlaceSeq()))) &&
            ((this.shippingPolicyNo==null && other.getShippingPolicyNo()==null) || 
             (this.shippingPolicyNo!=null &&
              this.shippingPolicyNo.equals(other.getShippingPolicyNo()))) &&
            ((this.conditionLevel1==null && other.getConditionLevel1()==null) || 
             (this.conditionLevel1!=null &&
              this.conditionLevel1.equals(other.getConditionLevel1()))) &&
            ((this.conditionLevel2==null && other.getConditionLevel2()==null) || 
             (this.conditionLevel2!=null &&
              this.conditionLevel2.equals(other.getConditionLevel2()))) &&
            ((this.conditionLevel3==null && other.getConditionLevel3()==null) || 
             (this.conditionLevel3!=null &&
              this.conditionLevel3.equals(other.getConditionLevel3()))) &&
            ((this.conditionLevel4==null && other.getConditionLevel4()==null) || 
             (this.conditionLevel4!=null &&
              this.conditionLevel4.equals(other.getConditionLevel4()))) &&
            ((this.conditionLevel5==null && other.getConditionLevel5()==null) || 
             (this.conditionLevel5!=null &&
              this.conditionLevel5.equals(other.getConditionLevel5()))) &&
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            this.isPrepayable == other.isIsPrepayable() &&
            this.isArrival == other.isIsArrival() &&
            ((this.feeFreeConditionType==null && other.getFeeFreeConditionType()==null) || 
             (this.feeFreeConditionType!=null &&
              this.feeFreeConditionType.equals(other.getFeeFreeConditionType()))) &&
            this.isExclude35Policy == other.isIsExclude35Policy() &&
            ((this.shippingFeeChargeType==null && other.getShippingFeeChargeType()==null) || 
             (this.shippingFeeChargeType!=null &&
              this.shippingFeeChargeType.equals(other.getShippingFeeChargeType())));
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
        if (getShipingFeeType() != null) {
            _hashCode += getShipingFeeType().hashCode();
        }
        if (getShippingPlaceSeq() != null) {
            _hashCode += getShippingPlaceSeq().hashCode();
        }
        if (getShippingPolicyNo() != null) {
            _hashCode += getShippingPolicyNo().hashCode();
        }
        if (getConditionLevel1() != null) {
            _hashCode += getConditionLevel1().hashCode();
        }
        if (getConditionLevel2() != null) {
            _hashCode += getConditionLevel2().hashCode();
        }
        if (getConditionLevel3() != null) {
            _hashCode += getConditionLevel3().hashCode();
        }
        if (getConditionLevel4() != null) {
            _hashCode += getConditionLevel4().hashCode();
        }
        if (getConditionLevel5() != null) {
            _hashCode += getConditionLevel5().hashCode();
        }
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        _hashCode += (isIsPrepayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsArrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFeeFreeConditionType() != null) {
            _hashCode += getFeeFreeConditionType().hashCode();
        }
        _hashCode += (isIsExclude35Policy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShippingFeeChargeType() != null) {
            _hashCode += getShippingFeeChargeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingCode"));
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
        attrField.setFieldName("feeFreeConditionType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FeeFreeConditionType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeConditionCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isExclude35Policy");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsExclude35Policy"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingFeeChargeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingFeeChargeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeChargeCode"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipingFeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShipingFeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPlaceSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPlaceSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPolicyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPolicyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingConditionT"));
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
