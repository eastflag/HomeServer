/**
 * ShippingAdditionalT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingAdditionalT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.StorePickupAddressT storePickupAddress;

    private SellerAddrT sellerAddress;

    private QuickServiceAreaT[] quickServiceArea;

    private auction.schema.Arche_Service_xsd.AdditionalShippingTypeT[] additionalShippingType;

    private int postFee;  // attribute

    private int pickupAddressNo;  // attribute

    private PickupFavorType pickupFavorType;  // attribute

    private int pickupFavorCash;  // attribute

    private String pickupFavorGift;  // attribute

    private auction.schema.Arche_Service_xsd.QuickServiceAreaCode quickAvailableArea;  // attribute

    private String quickAvailableAreaStr;  // attribute

    private String quickCompanyName;  // attribute

    private String quickCompanyPhone;  // attribute

    private int sendByMobileFee;  // attribute

    public ShippingAdditionalT() {
    }

    public ShippingAdditionalT(
           auction.schema.Arche_Service_xsd.StorePickupAddressT storePickupAddress,
           SellerAddrT sellerAddress,
           QuickServiceAreaT[] quickServiceArea,
           auction.schema.Arche_Service_xsd.AdditionalShippingTypeT[] additionalShippingType,
           int postFee,
           int pickupAddressNo,
           PickupFavorType pickupFavorType,
           int pickupFavorCash,
           String pickupFavorGift,
           auction.schema.Arche_Service_xsd.QuickServiceAreaCode quickAvailableArea,
           String quickAvailableAreaStr,
           String quickCompanyName,
           String quickCompanyPhone,
           int sendByMobileFee) {
           this.storePickupAddress = storePickupAddress;
           this.sellerAddress = sellerAddress;
           this.quickServiceArea = quickServiceArea;
           this.additionalShippingType = additionalShippingType;
           this.postFee = postFee;
           this.pickupAddressNo = pickupAddressNo;
           this.pickupFavorType = pickupFavorType;
           this.pickupFavorCash = pickupFavorCash;
           this.pickupFavorGift = pickupFavorGift;
           this.quickAvailableArea = quickAvailableArea;
           this.quickAvailableAreaStr = quickAvailableAreaStr;
           this.quickCompanyName = quickCompanyName;
           this.quickCompanyPhone = quickCompanyPhone;
           this.sendByMobileFee = sendByMobileFee;
    }


    /**
     * Gets the storePickupAddress value for this ShippingAdditionalT.
     * 
     * @return storePickupAddress
     */
    public auction.schema.Arche_Service_xsd.StorePickupAddressT getStorePickupAddress() {
        return storePickupAddress;
    }


    /**
     * Sets the storePickupAddress value for this ShippingAdditionalT.
     * 
     * @param storePickupAddress
     */
    public void setStorePickupAddress(auction.schema.Arche_Service_xsd.StorePickupAddressT storePickupAddress) {
        this.storePickupAddress = storePickupAddress;
    }


    /**
     * Gets the sellerAddress value for this ShippingAdditionalT.
     * 
     * @return sellerAddress
     */
    public SellerAddrT getSellerAddress() {
        return sellerAddress;
    }


    /**
     * Sets the sellerAddress value for this ShippingAdditionalT.
     * 
     * @param sellerAddress
     */
    public void setSellerAddress(SellerAddrT sellerAddress) {
        this.sellerAddress = sellerAddress;
    }


    /**
     * Gets the quickServiceArea value for this ShippingAdditionalT.
     * 
     * @return quickServiceArea
     */
    public QuickServiceAreaT[] getQuickServiceArea() {
        return quickServiceArea;
    }


    /**
     * Sets the quickServiceArea value for this ShippingAdditionalT.
     * 
     * @param quickServiceArea
     */
    public void setQuickServiceArea(QuickServiceAreaT[] quickServiceArea) {
        this.quickServiceArea = quickServiceArea;
    }

    public QuickServiceAreaT getQuickServiceArea(int i) {
        return this.quickServiceArea[i];
    }

    public void setQuickServiceArea(int i, QuickServiceAreaT _value) {
        this.quickServiceArea[i] = _value;
    }


    /**
     * Gets the additionalShippingType value for this ShippingAdditionalT.
     * 
     * @return additionalShippingType
     */
    public auction.schema.Arche_Service_xsd.AdditionalShippingTypeT[] getAdditionalShippingType() {
        return additionalShippingType;
    }


    /**
     * Sets the additionalShippingType value for this ShippingAdditionalT.
     * 
     * @param additionalShippingType
     */
    public void setAdditionalShippingType(auction.schema.Arche_Service_xsd.AdditionalShippingTypeT[] additionalShippingType) {
        this.additionalShippingType = additionalShippingType;
    }

    public auction.schema.Arche_Service_xsd.AdditionalShippingTypeT getAdditionalShippingType(int i) {
        return this.additionalShippingType[i];
    }

    public void setAdditionalShippingType(int i, auction.schema.Arche_Service_xsd.AdditionalShippingTypeT _value) {
        this.additionalShippingType[i] = _value;
    }


    /**
     * Gets the postFee value for this ShippingAdditionalT.
     * 
     * @return postFee
     */
    public int getPostFee() {
        return postFee;
    }


    /**
     * Sets the postFee value for this ShippingAdditionalT.
     * 
     * @param postFee
     */
    public void setPostFee(int postFee) {
        this.postFee = postFee;
    }


    /**
     * Gets the pickupAddressNo value for this ShippingAdditionalT.
     * 
     * @return pickupAddressNo
     */
    public int getPickupAddressNo() {
        return pickupAddressNo;
    }


    /**
     * Sets the pickupAddressNo value for this ShippingAdditionalT.
     * 
     * @param pickupAddressNo
     */
    public void setPickupAddressNo(int pickupAddressNo) {
        this.pickupAddressNo = pickupAddressNo;
    }


    /**
     * Gets the pickupFavorType value for this ShippingAdditionalT.
     * 
     * @return pickupFavorType
     */
    public PickupFavorType getPickupFavorType() {
        return pickupFavorType;
    }


    /**
     * Sets the pickupFavorType value for this ShippingAdditionalT.
     * 
     * @param pickupFavorType
     */
    public void setPickupFavorType(PickupFavorType pickupFavorType) {
        this.pickupFavorType = pickupFavorType;
    }


    /**
     * Gets the pickupFavorCash value for this ShippingAdditionalT.
     * 
     * @return pickupFavorCash
     */
    public int getPickupFavorCash() {
        return pickupFavorCash;
    }


    /**
     * Sets the pickupFavorCash value for this ShippingAdditionalT.
     * 
     * @param pickupFavorCash
     */
    public void setPickupFavorCash(int pickupFavorCash) {
        this.pickupFavorCash = pickupFavorCash;
    }


    /**
     * Gets the pickupFavorGift value for this ShippingAdditionalT.
     * 
     * @return pickupFavorGift
     */
    public String getPickupFavorGift() {
        return pickupFavorGift;
    }


    /**
     * Sets the pickupFavorGift value for this ShippingAdditionalT.
     * 
     * @param pickupFavorGift
     */
    public void setPickupFavorGift(String pickupFavorGift) {
        this.pickupFavorGift = pickupFavorGift;
    }


    /**
     * Gets the quickAvailableArea value for this ShippingAdditionalT.
     * 
     * @return quickAvailableArea
     */
    public auction.schema.Arche_Service_xsd.QuickServiceAreaCode getQuickAvailableArea() {
        return quickAvailableArea;
    }


    /**
     * Sets the quickAvailableArea value for this ShippingAdditionalT.
     * 
     * @param quickAvailableArea
     */
    public void setQuickAvailableArea(auction.schema.Arche_Service_xsd.QuickServiceAreaCode quickAvailableArea) {
        this.quickAvailableArea = quickAvailableArea;
    }


    /**
     * Gets the quickAvailableAreaStr value for this ShippingAdditionalT.
     * 
     * @return quickAvailableAreaStr
     */
    public String getQuickAvailableAreaStr() {
        return quickAvailableAreaStr;
    }


    /**
     * Sets the quickAvailableAreaStr value for this ShippingAdditionalT.
     * 
     * @param quickAvailableAreaStr
     */
    public void setQuickAvailableAreaStr(String quickAvailableAreaStr) {
        this.quickAvailableAreaStr = quickAvailableAreaStr;
    }


    /**
     * Gets the quickCompanyName value for this ShippingAdditionalT.
     * 
     * @return quickCompanyName
     */
    public String getQuickCompanyName() {
        return quickCompanyName;
    }


    /**
     * Sets the quickCompanyName value for this ShippingAdditionalT.
     * 
     * @param quickCompanyName
     */
    public void setQuickCompanyName(String quickCompanyName) {
        this.quickCompanyName = quickCompanyName;
    }


    /**
     * Gets the quickCompanyPhone value for this ShippingAdditionalT.
     * 
     * @return quickCompanyPhone
     */
    public String getQuickCompanyPhone() {
        return quickCompanyPhone;
    }


    /**
     * Sets the quickCompanyPhone value for this ShippingAdditionalT.
     * 
     * @param quickCompanyPhone
     */
    public void setQuickCompanyPhone(String quickCompanyPhone) {
        this.quickCompanyPhone = quickCompanyPhone;
    }


    /**
     * Gets the sendByMobileFee value for this ShippingAdditionalT.
     * 
     * @return sendByMobileFee
     */
    public int getSendByMobileFee() {
        return sendByMobileFee;
    }


    /**
     * Sets the sendByMobileFee value for this ShippingAdditionalT.
     * 
     * @param sendByMobileFee
     */
    public void setSendByMobileFee(int sendByMobileFee) {
        this.sendByMobileFee = sendByMobileFee;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingAdditionalT)) return false;
        ShippingAdditionalT other = (ShippingAdditionalT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storePickupAddress==null && other.getStorePickupAddress()==null) || 
             (this.storePickupAddress!=null &&
              this.storePickupAddress.equals(other.getStorePickupAddress()))) &&
            ((this.sellerAddress==null && other.getSellerAddress()==null) || 
             (this.sellerAddress!=null &&
              this.sellerAddress.equals(other.getSellerAddress()))) &&
            ((this.quickServiceArea==null && other.getQuickServiceArea()==null) || 
             (this.quickServiceArea!=null &&
              java.util.Arrays.equals(this.quickServiceArea, other.getQuickServiceArea()))) &&
            ((this.additionalShippingType==null && other.getAdditionalShippingType()==null) || 
             (this.additionalShippingType!=null &&
              java.util.Arrays.equals(this.additionalShippingType, other.getAdditionalShippingType()))) &&
            this.postFee == other.getPostFee() &&
            this.pickupAddressNo == other.getPickupAddressNo() &&
            ((this.pickupFavorType==null && other.getPickupFavorType()==null) || 
             (this.pickupFavorType!=null &&
              this.pickupFavorType.equals(other.getPickupFavorType()))) &&
            this.pickupFavorCash == other.getPickupFavorCash() &&
            ((this.pickupFavorGift==null && other.getPickupFavorGift()==null) || 
             (this.pickupFavorGift!=null &&
              this.pickupFavorGift.equals(other.getPickupFavorGift()))) &&
            ((this.quickAvailableArea==null && other.getQuickAvailableArea()==null) || 
             (this.quickAvailableArea!=null &&
              this.quickAvailableArea.equals(other.getQuickAvailableArea()))) &&
            ((this.quickAvailableAreaStr==null && other.getQuickAvailableAreaStr()==null) || 
             (this.quickAvailableAreaStr!=null &&
              this.quickAvailableAreaStr.equals(other.getQuickAvailableAreaStr()))) &&
            ((this.quickCompanyName==null && other.getQuickCompanyName()==null) || 
             (this.quickCompanyName!=null &&
              this.quickCompanyName.equals(other.getQuickCompanyName()))) &&
            ((this.quickCompanyPhone==null && other.getQuickCompanyPhone()==null) || 
             (this.quickCompanyPhone!=null &&
              this.quickCompanyPhone.equals(other.getQuickCompanyPhone()))) &&
            this.sendByMobileFee == other.getSendByMobileFee();
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
        if (getStorePickupAddress() != null) {
            _hashCode += getStorePickupAddress().hashCode();
        }
        if (getSellerAddress() != null) {
            _hashCode += getSellerAddress().hashCode();
        }
        if (getQuickServiceArea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickServiceArea());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getQuickServiceArea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalShippingType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalShippingType());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalShippingType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPostFee();
        _hashCode += getPickupAddressNo();
        if (getPickupFavorType() != null) {
            _hashCode += getPickupFavorType().hashCode();
        }
        _hashCode += getPickupFavorCash();
        if (getPickupFavorGift() != null) {
            _hashCode += getPickupFavorGift().hashCode();
        }
        if (getQuickAvailableArea() != null) {
            _hashCode += getQuickAvailableArea().hashCode();
        }
        if (getQuickAvailableAreaStr() != null) {
            _hashCode += getQuickAvailableAreaStr().hashCode();
        }
        if (getQuickCompanyName() != null) {
            _hashCode += getQuickCompanyName().hashCode();
        }
        if (getQuickCompanyPhone() != null) {
            _hashCode += getQuickCompanyPhone().hashCode();
        }
        _hashCode += getSendByMobileFee();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingAdditionalT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingAdditionalT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("postFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PostFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pickupAddressNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PickupAddressNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pickupFavorType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PickupFavorType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PickupFavorType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pickupFavorCash");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PickupFavorCash"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pickupFavorGift");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PickupFavorGift"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quickAvailableArea");
        attrField.setXmlName(new javax.xml.namespace.QName("", "QuickAvailableArea"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceAreaCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quickAvailableAreaStr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "QuickAvailableAreaStr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quickCompanyName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "QuickCompanyName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quickCompanyPhone");
        attrField.setXmlName(new javax.xml.namespace.QName("", "QuickCompanyPhone"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sendByMobileFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SendByMobileFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storePickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StorePickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StorePickupAddressT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellerAddrT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceAreaT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalShippingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalShippingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalShippingTypeT"));
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
