/**
 * GetItemGeocodeBroadResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetItemGeocodeBroadResponseT  implements java.io.Serializable {
    private String latitude;

    private String longitude;

    private String add_line1;

    private String add_line2;

    private String state;

    private String country;

    private String shopName;

    private String shopTelNo;

    private boolean status;  // attribute

    private String resultMsg;  // attribute

    public GetItemGeocodeBroadResponseT() {
    }

    public GetItemGeocodeBroadResponseT(
           String latitude,
           String longitude,
           String add_line1,
           String add_line2,
           String state,
           String country,
           String shopName,
           String shopTelNo,
           boolean status,
           String resultMsg) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.add_line1 = add_line1;
           this.add_line2 = add_line2;
           this.state = state;
           this.country = country;
           this.shopName = shopName;
           this.shopTelNo = shopTelNo;
           this.status = status;
           this.resultMsg = resultMsg;
    }


    /**
     * Gets the latitude value for this GetItemGeocodeBroadResponseT.
     * 
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GetItemGeocodeBroadResponseT.
     * 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GetItemGeocodeBroadResponseT.
     * 
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GetItemGeocodeBroadResponseT.
     * 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the add_line1 value for this GetItemGeocodeBroadResponseT.
     * 
     * @return add_line1
     */
    public String getAdd_line1() {
        return add_line1;
    }


    /**
     * Sets the add_line1 value for this GetItemGeocodeBroadResponseT.
     * 
     * @param add_line1
     */
    public void setAdd_line1(String add_line1) {
        this.add_line1 = add_line1;
    }


    /**
     * Gets the add_line2 value for this GetItemGeocodeBroadResponseT.
     * 
     * @return add_line2
     */
    public String getAdd_line2() {
        return add_line2;
    }


    /**
     * Sets the add_line2 value for this GetItemGeocodeBroadResponseT.
     * 
     * @param add_line2
     */
    public void setAdd_line2(String add_line2) {
        this.add_line2 = add_line2;
    }


    /**
     * Gets the state value for this GetItemGeocodeBroadResponseT.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this GetItemGeocodeBroadResponseT.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this GetItemGeocodeBroadResponseT.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GetItemGeocodeBroadResponseT.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the shopName value for this GetItemGeocodeBroadResponseT.
     * 
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this GetItemGeocodeBroadResponseT.
     * 
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the shopTelNo value for this GetItemGeocodeBroadResponseT.
     * 
     * @return shopTelNo
     */
    public String getShopTelNo() {
        return shopTelNo;
    }


    /**
     * Sets the shopTelNo value for this GetItemGeocodeBroadResponseT.
     * 
     * @param shopTelNo
     */
    public void setShopTelNo(String shopTelNo) {
        this.shopTelNo = shopTelNo;
    }


    /**
     * Gets the status value for this GetItemGeocodeBroadResponseT.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetItemGeocodeBroadResponseT.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the resultMsg value for this GetItemGeocodeBroadResponseT.
     * 
     * @return resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this GetItemGeocodeBroadResponseT.
     * 
     * @param resultMsg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetItemGeocodeBroadResponseT)) return false;
        GetItemGeocodeBroadResponseT other = (GetItemGeocodeBroadResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.add_line1==null && other.getAdd_line1()==null) || 
             (this.add_line1!=null &&
              this.add_line1.equals(other.getAdd_line1()))) &&
            ((this.add_line2==null && other.getAdd_line2()==null) || 
             (this.add_line2!=null &&
              this.add_line2.equals(other.getAdd_line2()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.shopName==null && other.getShopName()==null) || 
             (this.shopName!=null &&
              this.shopName.equals(other.getShopName()))) &&
            ((this.shopTelNo==null && other.getShopTelNo()==null) || 
             (this.shopTelNo!=null &&
              this.shopTelNo.equals(other.getShopTelNo()))) &&
            this.status == other.isStatus() &&
            ((this.resultMsg==null && other.getResultMsg()==null) || 
             (this.resultMsg!=null &&
              this.resultMsg.equals(other.getResultMsg())));
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
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getAdd_line1() != null) {
            _hashCode += getAdd_line1().hashCode();
        }
        if (getAdd_line2() != null) {
            _hashCode += getAdd_line2().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getShopName() != null) {
            _hashCode += getShopName().hashCode();
        }
        if (getShopTelNo() != null) {
            _hashCode += getShopTelNo().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemGeocodeBroadResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeBroadResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultMsg");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResultMsg"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Add_line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_line2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Add_line2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ShopName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ShopTelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
