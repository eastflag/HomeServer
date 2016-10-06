/**
 * ShippingPlaceT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingPlaceT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType;

    private auction.schema.Arche_Service_xsd.ShippingPolicyT[] shippingPolicy;

    private boolean isDefaultPlace;  // attribute

    private String sellerId;  // attribute

    private int shippingPlaceSeq;  // attribute

    private String shipmentPlace;  // attribute

    private java.math.BigDecimal addFeeJeju;  // attribute

    private java.math.BigDecimal addFeeExcludeJeju;  // attribute

    private int sellerAddrNo;  // attribute

    public ShippingPlaceT() {
    }

    public ShippingPlaceT(
           auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType,
           auction.schema.Arche_Service_xsd.ShippingPolicyT[] shippingPolicy,
           boolean isDefaultPlace,
           String sellerId,
           int shippingPlaceSeq,
           String shipmentPlace,
           java.math.BigDecimal addFeeJeju,
           java.math.BigDecimal addFeeExcludeJeju,
           int sellerAddrNo) {
           this.shippingFeeType = shippingFeeType;
           this.shippingPolicy = shippingPolicy;
           this.isDefaultPlace = isDefaultPlace;
           this.sellerId = sellerId;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.shipmentPlace = shipmentPlace;
           this.addFeeJeju = addFeeJeju;
           this.addFeeExcludeJeju = addFeeExcludeJeju;
           this.sellerAddrNo = sellerAddrNo;
    }


    /**
     * Gets the shippingFeeType value for this ShippingPlaceT.
     * 
     * @return shippingFeeType
     */
    public auction.schema.Arche_Service_xsd.ShippingFeeTypeCode getShippingFeeType() {
        return shippingFeeType;
    }


    /**
     * Sets the shippingFeeType value for this ShippingPlaceT.
     * 
     * @param shippingFeeType
     */
    public void setShippingFeeType(auction.schema.Arche_Service_xsd.ShippingFeeTypeCode shippingFeeType) {
        this.shippingFeeType = shippingFeeType;
    }


    /**
     * Gets the shippingPolicy value for this ShippingPlaceT.
     * 
     * @return shippingPolicy
     */
    public auction.schema.Arche_Service_xsd.ShippingPolicyT[] getShippingPolicy() {
        return shippingPolicy;
    }


    /**
     * Sets the shippingPolicy value for this ShippingPlaceT.
     * 
     * @param shippingPolicy
     */
    public void setShippingPolicy(auction.schema.Arche_Service_xsd.ShippingPolicyT[] shippingPolicy) {
        this.shippingPolicy = shippingPolicy;
    }

    public auction.schema.Arche_Service_xsd.ShippingPolicyT getShippingPolicy(int i) {
        return this.shippingPolicy[i];
    }

    public void setShippingPolicy(int i, auction.schema.Arche_Service_xsd.ShippingPolicyT _value) {
        this.shippingPolicy[i] = _value;
    }


    /**
     * Gets the isDefaultPlace value for this ShippingPlaceT.
     * 
     * @return isDefaultPlace
     */
    public boolean isIsDefaultPlace() {
        return isDefaultPlace;
    }


    /**
     * Sets the isDefaultPlace value for this ShippingPlaceT.
     * 
     * @param isDefaultPlace
     */
    public void setIsDefaultPlace(boolean isDefaultPlace) {
        this.isDefaultPlace = isDefaultPlace;
    }


    /**
     * Gets the sellerId value for this ShippingPlaceT.
     * 
     * @return sellerId
     */
    public String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this ShippingPlaceT.
     * 
     * @param sellerId
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the shippingPlaceSeq value for this ShippingPlaceT.
     * 
     * @return shippingPlaceSeq
     */
    public int getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this ShippingPlaceT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(int shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the shipmentPlace value for this ShippingPlaceT.
     * 
     * @return shipmentPlace
     */
    public String getShipmentPlace() {
        return shipmentPlace;
    }


    /**
     * Sets the shipmentPlace value for this ShippingPlaceT.
     * 
     * @param shipmentPlace
     */
    public void setShipmentPlace(String shipmentPlace) {
        this.shipmentPlace = shipmentPlace;
    }


    /**
     * Gets the addFeeJeju value for this ShippingPlaceT.
     * 
     * @return addFeeJeju
     */
    public java.math.BigDecimal getAddFeeJeju() {
        return addFeeJeju;
    }


    /**
     * Sets the addFeeJeju value for this ShippingPlaceT.
     * 
     * @param addFeeJeju
     */
    public void setAddFeeJeju(java.math.BigDecimal addFeeJeju) {
        this.addFeeJeju = addFeeJeju;
    }


    /**
     * Gets the addFeeExcludeJeju value for this ShippingPlaceT.
     * 
     * @return addFeeExcludeJeju
     */
    public java.math.BigDecimal getAddFeeExcludeJeju() {
        return addFeeExcludeJeju;
    }


    /**
     * Sets the addFeeExcludeJeju value for this ShippingPlaceT.
     * 
     * @param addFeeExcludeJeju
     */
    public void setAddFeeExcludeJeju(java.math.BigDecimal addFeeExcludeJeju) {
        this.addFeeExcludeJeju = addFeeExcludeJeju;
    }


    /**
     * Gets the sellerAddrNo value for this ShippingPlaceT.
     * 
     * @return sellerAddrNo
     */
    public int getSellerAddrNo() {
        return sellerAddrNo;
    }


    /**
     * Sets the sellerAddrNo value for this ShippingPlaceT.
     * 
     * @param sellerAddrNo
     */
    public void setSellerAddrNo(int sellerAddrNo) {
        this.sellerAddrNo = sellerAddrNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingPlaceT)) return false;
        ShippingPlaceT other = (ShippingPlaceT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingFeeType==null && other.getShippingFeeType()==null) || 
             (this.shippingFeeType!=null &&
              this.shippingFeeType.equals(other.getShippingFeeType()))) &&
            ((this.shippingPolicy==null && other.getShippingPolicy()==null) || 
             (this.shippingPolicy!=null &&
              java.util.Arrays.equals(this.shippingPolicy, other.getShippingPolicy()))) &&
            this.isDefaultPlace == other.isIsDefaultPlace() &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            ((this.shipmentPlace==null && other.getShipmentPlace()==null) || 
             (this.shipmentPlace!=null &&
              this.shipmentPlace.equals(other.getShipmentPlace()))) &&
            ((this.addFeeJeju==null && other.getAddFeeJeju()==null) || 
             (this.addFeeJeju!=null &&
              this.addFeeJeju.equals(other.getAddFeeJeju()))) &&
            ((this.addFeeExcludeJeju==null && other.getAddFeeExcludeJeju()==null) || 
             (this.addFeeExcludeJeju!=null &&
              this.addFeeExcludeJeju.equals(other.getAddFeeExcludeJeju()))) &&
            this.sellerAddrNo == other.getSellerAddrNo();
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
        if (getShippingFeeType() != null) {
            _hashCode += getShippingFeeType().hashCode();
        }
        if (getShippingPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingPolicy());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsDefaultPlace() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        _hashCode += getShippingPlaceSeq();
        if (getShipmentPlace() != null) {
            _hashCode += getShipmentPlace().hashCode();
        }
        if (getAddFeeJeju() != null) {
            _hashCode += getAddFeeJeju().hashCode();
        }
        if (getAddFeeExcludeJeju() != null) {
            _hashCode += getAddFeeExcludeJeju().hashCode();
        }
        _hashCode += getSellerAddrNo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingPlaceT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPlaceT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDefaultPlace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDefaultPlace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
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
        attrField.setFieldName("shipmentPlace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShipmentPlace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addFeeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addFeeExcludeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeExcludeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingFeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPolicyT"));
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
