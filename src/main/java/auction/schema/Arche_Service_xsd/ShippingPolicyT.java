/**
 * ShippingPolicyT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingPolicyT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel1;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel2;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel3;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel4;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel5;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel6;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel7;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel8;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel9;

    private auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel10;

    private String sellerId;  // attribute

    private int shippingPlaceSeq;  // attribute

    private int shippingPolicyNo;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType;  // attribute

    private auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType;  // attribute

    private boolean isPrepayable;  // attribute

    private boolean isArrival;  // attribute

    private boolean isDefault;  // attribute

    public ShippingPolicyT() {
    }

    public ShippingPolicyT(
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel1,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel2,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel3,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel4,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel5,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel6,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel7,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel8,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel9,
           auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel10,
           String sellerId,
           int shippingPlaceSeq,
           int shippingPolicyNo,
           auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType,
           auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType,
           boolean isPrepayable,
           boolean isArrival,
           boolean isDefault) {
           this.conditionLevel1 = conditionLevel1;
           this.conditionLevel2 = conditionLevel2;
           this.conditionLevel3 = conditionLevel3;
           this.conditionLevel4 = conditionLevel4;
           this.conditionLevel5 = conditionLevel5;
           this.conditionLevel6 = conditionLevel6;
           this.conditionLevel7 = conditionLevel7;
           this.conditionLevel8 = conditionLevel8;
           this.conditionLevel9 = conditionLevel9;
           this.conditionLevel10 = conditionLevel10;
           this.sellerId = sellerId;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.shippingPolicyNo = shippingPolicyNo;
           this.shippingFeeChargeType = shippingFeeChargeType;
           this.feeFreeConditionType = feeFreeConditionType;
           this.isPrepayable = isPrepayable;
           this.isArrival = isArrival;
           this.isDefault = isDefault;
    }


    /**
     * Gets the conditionLevel1 value for this ShippingPolicyT.
     * 
     * @return conditionLevel1
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel1() {
        return conditionLevel1;
    }


    /**
     * Sets the conditionLevel1 value for this ShippingPolicyT.
     * 
     * @param conditionLevel1
     */
    public void setConditionLevel1(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel1) {
        this.conditionLevel1 = conditionLevel1;
    }


    /**
     * Gets the conditionLevel2 value for this ShippingPolicyT.
     * 
     * @return conditionLevel2
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel2() {
        return conditionLevel2;
    }


    /**
     * Sets the conditionLevel2 value for this ShippingPolicyT.
     * 
     * @param conditionLevel2
     */
    public void setConditionLevel2(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel2) {
        this.conditionLevel2 = conditionLevel2;
    }


    /**
     * Gets the conditionLevel3 value for this ShippingPolicyT.
     * 
     * @return conditionLevel3
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel3() {
        return conditionLevel3;
    }


    /**
     * Sets the conditionLevel3 value for this ShippingPolicyT.
     * 
     * @param conditionLevel3
     */
    public void setConditionLevel3(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel3) {
        this.conditionLevel3 = conditionLevel3;
    }


    /**
     * Gets the conditionLevel4 value for this ShippingPolicyT.
     * 
     * @return conditionLevel4
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel4() {
        return conditionLevel4;
    }


    /**
     * Sets the conditionLevel4 value for this ShippingPolicyT.
     * 
     * @param conditionLevel4
     */
    public void setConditionLevel4(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel4) {
        this.conditionLevel4 = conditionLevel4;
    }


    /**
     * Gets the conditionLevel5 value for this ShippingPolicyT.
     * 
     * @return conditionLevel5
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel5() {
        return conditionLevel5;
    }


    /**
     * Sets the conditionLevel5 value for this ShippingPolicyT.
     * 
     * @param conditionLevel5
     */
    public void setConditionLevel5(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel5) {
        this.conditionLevel5 = conditionLevel5;
    }


    /**
     * Gets the conditionLevel6 value for this ShippingPolicyT.
     * 
     * @return conditionLevel6
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel6() {
        return conditionLevel6;
    }


    /**
     * Sets the conditionLevel6 value for this ShippingPolicyT.
     * 
     * @param conditionLevel6
     */
    public void setConditionLevel6(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel6) {
        this.conditionLevel6 = conditionLevel6;
    }


    /**
     * Gets the conditionLevel7 value for this ShippingPolicyT.
     * 
     * @return conditionLevel7
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel7() {
        return conditionLevel7;
    }


    /**
     * Sets the conditionLevel7 value for this ShippingPolicyT.
     * 
     * @param conditionLevel7
     */
    public void setConditionLevel7(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel7) {
        this.conditionLevel7 = conditionLevel7;
    }


    /**
     * Gets the conditionLevel8 value for this ShippingPolicyT.
     * 
     * @return conditionLevel8
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel8() {
        return conditionLevel8;
    }


    /**
     * Sets the conditionLevel8 value for this ShippingPolicyT.
     * 
     * @param conditionLevel8
     */
    public void setConditionLevel8(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel8) {
        this.conditionLevel8 = conditionLevel8;
    }


    /**
     * Gets the conditionLevel9 value for this ShippingPolicyT.
     * 
     * @return conditionLevel9
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel9() {
        return conditionLevel9;
    }


    /**
     * Sets the conditionLevel9 value for this ShippingPolicyT.
     * 
     * @param conditionLevel9
     */
    public void setConditionLevel9(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel9) {
        this.conditionLevel9 = conditionLevel9;
    }


    /**
     * Gets the conditionLevel10 value for this ShippingPolicyT.
     * 
     * @return conditionLevel10
     */
    public auction.schema.Arche_Service_xsd.ShippingSellerConditionT getConditionLevel10() {
        return conditionLevel10;
    }


    /**
     * Sets the conditionLevel10 value for this ShippingPolicyT.
     * 
     * @param conditionLevel10
     */
    public void setConditionLevel10(auction.schema.Arche_Service_xsd.ShippingSellerConditionT conditionLevel10) {
        this.conditionLevel10 = conditionLevel10;
    }


    /**
     * Gets the sellerId value for this ShippingPolicyT.
     * 
     * @return sellerId
     */
    public String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this ShippingPolicyT.
     * 
     * @param sellerId
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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
     * Gets the shippingPolicyNo value for this ShippingPolicyT.
     * 
     * @return shippingPolicyNo
     */
    public int getShippingPolicyNo() {
        return shippingPolicyNo;
    }


    /**
     * Sets the shippingPolicyNo value for this ShippingPolicyT.
     * 
     * @param shippingPolicyNo
     */
    public void setShippingPolicyNo(int shippingPolicyNo) {
        this.shippingPolicyNo = shippingPolicyNo;
    }


    /**
     * Gets the shippingFeeChargeType value for this ShippingPolicyT.
     * 
     * @return shippingFeeChargeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeChargeCode getShippingFeeChargeType() {
        return shippingFeeChargeType;
    }


    /**
     * Sets the shippingFeeChargeType value for this ShippingPolicyT.
     * 
     * @param shippingFeeChargeType
     */
    public void setShippingFeeChargeType(auction.schema.Arche_Service_xsd.ShippingFeeChargeCode shippingFeeChargeType) {
        this.shippingFeeChargeType = shippingFeeChargeType;
    }


    /**
     * Gets the feeFreeConditionType value for this ShippingPolicyT.
     * 
     * @return feeFreeConditionType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeConditionCode getFeeFreeConditionType() {
        return feeFreeConditionType;
    }


    /**
     * Sets the feeFreeConditionType value for this ShippingPolicyT.
     * 
     * @param feeFreeConditionType
     */
    public void setFeeFreeConditionType(auction.schema.Arche_Service_xsd.ShippingFeeConditionCode feeFreeConditionType) {
        this.feeFreeConditionType = feeFreeConditionType;
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
     * Gets the isDefault value for this ShippingPolicyT.
     * 
     * @return isDefault
     */
    public boolean isIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ShippingPolicyT.
     * 
     * @param isDefault
     */
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
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
            ((this.conditionLevel6==null && other.getConditionLevel6()==null) || 
             (this.conditionLevel6!=null &&
              this.conditionLevel6.equals(other.getConditionLevel6()))) &&
            ((this.conditionLevel7==null && other.getConditionLevel7()==null) || 
             (this.conditionLevel7!=null &&
              this.conditionLevel7.equals(other.getConditionLevel7()))) &&
            ((this.conditionLevel8==null && other.getConditionLevel8()==null) || 
             (this.conditionLevel8!=null &&
              this.conditionLevel8.equals(other.getConditionLevel8()))) &&
            ((this.conditionLevel9==null && other.getConditionLevel9()==null) || 
             (this.conditionLevel9!=null &&
              this.conditionLevel9.equals(other.getConditionLevel9()))) &&
            ((this.conditionLevel10==null && other.getConditionLevel10()==null) || 
             (this.conditionLevel10!=null &&
              this.conditionLevel10.equals(other.getConditionLevel10()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            this.shippingPolicyNo == other.getShippingPolicyNo() &&
            ((this.shippingFeeChargeType==null && other.getShippingFeeChargeType()==null) || 
             (this.shippingFeeChargeType!=null &&
              this.shippingFeeChargeType.equals(other.getShippingFeeChargeType()))) &&
            ((this.feeFreeConditionType==null && other.getFeeFreeConditionType()==null) || 
             (this.feeFreeConditionType!=null &&
              this.feeFreeConditionType.equals(other.getFeeFreeConditionType()))) &&
            this.isPrepayable == other.isIsPrepayable() &&
            this.isArrival == other.isIsArrival() &&
            this.isDefault == other.isIsDefault();
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
        if (getConditionLevel6() != null) {
            _hashCode += getConditionLevel6().hashCode();
        }
        if (getConditionLevel7() != null) {
            _hashCode += getConditionLevel7().hashCode();
        }
        if (getConditionLevel8() != null) {
            _hashCode += getConditionLevel8().hashCode();
        }
        if (getConditionLevel9() != null) {
            _hashCode += getConditionLevel9().hashCode();
        }
        if (getConditionLevel10() != null) {
            _hashCode += getConditionLevel10().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        _hashCode += getShippingPlaceSeq();
        _hashCode += getShippingPolicyNo();
        if (getShippingFeeChargeType() != null) {
            _hashCode += getShippingFeeChargeType().hashCode();
        }
        if (getFeeFreeConditionType() != null) {
            _hashCode += getFeeFreeConditionType().hashCode();
        }
        _hashCode += (isIsPrepayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsArrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingPolicyT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPolicyT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPlaceSeq");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPlaceSeq"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPolicyNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPolicyNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingFeeChargeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingFeeChargeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeChargeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("feeFreeConditionType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FeeFreeConditionType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeConditionCode"));
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
        attrField.setFieldName("isDefault");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDefault"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionLevel10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ConditionLevel10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingSellerConditionT"));
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
