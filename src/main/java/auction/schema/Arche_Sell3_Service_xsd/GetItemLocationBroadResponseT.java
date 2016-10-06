/**
 * GetItemLocationBroadResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetItemLocationBroadResponseT  implements java.io.Serializable {
    private String itemID;

    private String locationNo;

    private String latitude;

    private String longitude;

    private String add_line1;

    private String add_line2;

    private String state;

    private String country;

    private String shopName;

    private String shopTelNo;

    private String areaCode;

    private boolean status;  // attribute

    private String resultMsg;  // attribute

    public GetItemLocationBroadResponseT() {
    }

    public GetItemLocationBroadResponseT(
           String itemID,
           String locationNo,
           String latitude,
           String longitude,
           String add_line1,
           String add_line2,
           String state,
           String country,
           String shopName,
           String shopTelNo,
           String areaCode,
           boolean status,
           String resultMsg) {
           this.itemID = itemID;
           this.locationNo = locationNo;
           this.latitude = latitude;
           this.longitude = longitude;
           this.add_line1 = add_line1;
           this.add_line2 = add_line2;
           this.state = state;
           this.country = country;
           this.shopName = shopName;
           this.shopTelNo = shopTelNo;
           this.areaCode = areaCode;
           this.status = status;
           this.resultMsg = resultMsg;
    }


    /**
     * Gets the itemID value for this GetItemLocationBroadResponseT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this GetItemLocationBroadResponseT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the locationNo value for this GetItemLocationBroadResponseT.
     * 
     * @return locationNo
     */
    public String getLocationNo() {
        return locationNo;
    }


    /**
     * Sets the locationNo value for this GetItemLocationBroadResponseT.
     * 
     * @param locationNo
     */
    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }


    /**
     * Gets the latitude value for this GetItemLocationBroadResponseT.
     * 
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GetItemLocationBroadResponseT.
     * 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GetItemLocationBroadResponseT.
     * 
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GetItemLocationBroadResponseT.
     * 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the add_line1 value for this GetItemLocationBroadResponseT.
     * 
     * @return add_line1
     */
    public String getAdd_line1() {
        return add_line1;
    }


    /**
     * Sets the add_line1 value for this GetItemLocationBroadResponseT.
     * 
     * @param add_line1
     */
    public void setAdd_line1(String add_line1) {
        this.add_line1 = add_line1;
    }


    /**
     * Gets the add_line2 value for this GetItemLocationBroadResponseT.
     * 
     * @return add_line2
     */
    public String getAdd_line2() {
        return add_line2;
    }


    /**
     * Sets the add_line2 value for this GetItemLocationBroadResponseT.
     * 
     * @param add_line2
     */
    public void setAdd_line2(String add_line2) {
        this.add_line2 = add_line2;
    }


    /**
     * Gets the state value for this GetItemLocationBroadResponseT.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this GetItemLocationBroadResponseT.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this GetItemLocationBroadResponseT.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GetItemLocationBroadResponseT.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the shopName value for this GetItemLocationBroadResponseT.
     * 
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this GetItemLocationBroadResponseT.
     * 
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the shopTelNo value for this GetItemLocationBroadResponseT.
     * 
     * @return shopTelNo
     */
    public String getShopTelNo() {
        return shopTelNo;
    }


    /**
     * Sets the shopTelNo value for this GetItemLocationBroadResponseT.
     * 
     * @param shopTelNo
     */
    public void setShopTelNo(String shopTelNo) {
        this.shopTelNo = shopTelNo;
    }


    /**
     * Gets the areaCode value for this GetItemLocationBroadResponseT.
     * 
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this GetItemLocationBroadResponseT.
     * 
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the status value for this GetItemLocationBroadResponseT.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetItemLocationBroadResponseT.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the resultMsg value for this GetItemLocationBroadResponseT.
     * 
     * @return resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this GetItemLocationBroadResponseT.
     * 
     * @param resultMsg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetItemLocationBroadResponseT)) return false;
        GetItemLocationBroadResponseT other = (GetItemLocationBroadResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.locationNo==null && other.getLocationNo()==null) || 
             (this.locationNo!=null &&
              this.locationNo.equals(other.getLocationNo()))) &&
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
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode()))) &&
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getLocationNo() != null) {
            _hashCode += getLocationNo().hashCode();
        }
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
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetItemLocationBroadResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationBroadResponseT"));
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
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "LocationNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AreaCode"));
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
