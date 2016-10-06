/**
 * ReviseitemLocationKoreaRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ReviseitemLocationKoreaRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private String locationNo;

    private String itemID;

    private String latitude;

    private String longitude;

    private String sido;

    private String sigugun;

    private String dongmyun;

    private String etc;

    private String shopName;

    private String shopTelNo;

    private String areaCode;

    private ItemLocationChangeType changeType;

    public ReviseitemLocationKoreaRequestT() {
    }

    public ReviseitemLocationKoreaRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           String locationNo,
           String itemID,
           String latitude,
           String longitude,
           String sido,
           String sigugun,
           String dongmyun,
           String etc,
           String shopName,
           String shopTelNo,
           String areaCode,
           ItemLocationChangeType changeType) {
           this.memberTicket = memberTicket;
           this.locationNo = locationNo;
           this.itemID = itemID;
           this.latitude = latitude;
           this.longitude = longitude;
           this.sido = sido;
           this.sigugun = sigugun;
           this.dongmyun = dongmyun;
           this.etc = etc;
           this.shopName = shopName;
           this.shopTelNo = shopTelNo;
           this.areaCode = areaCode;
           this.changeType = changeType;
    }


    /**
     * Gets the memberTicket value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the locationNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return locationNo
     */
    public String getLocationNo() {
        return locationNo;
    }


    /**
     * Sets the locationNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param locationNo
     */
    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }


    /**
     * Gets the itemID value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the latitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the sido value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return sido
     */
    public String getSido() {
        return sido;
    }


    /**
     * Sets the sido value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param sido
     */
    public void setSido(String sido) {
        this.sido = sido;
    }


    /**
     * Gets the sigugun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return sigugun
     */
    public String getSigugun() {
        return sigugun;
    }


    /**
     * Sets the sigugun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param sigugun
     */
    public void setSigugun(String sigugun) {
        this.sigugun = sigugun;
    }


    /**
     * Gets the dongmyun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return dongmyun
     */
    public String getDongmyun() {
        return dongmyun;
    }


    /**
     * Sets the dongmyun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param dongmyun
     */
    public void setDongmyun(String dongmyun) {
        this.dongmyun = dongmyun;
    }


    /**
     * Gets the etc value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return etc
     */
    public String getEtc() {
        return etc;
    }


    /**
     * Sets the etc value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param etc
     */
    public void setEtc(String etc) {
        this.etc = etc;
    }


    /**
     * Gets the shopName value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the shopTelNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return shopTelNo
     */
    public String getShopTelNo() {
        return shopTelNo;
    }


    /**
     * Sets the shopTelNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param shopTelNo
     */
    public void setShopTelNo(String shopTelNo) {
        this.shopTelNo = shopTelNo;
    }


    /**
     * Gets the areaCode value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the changeType value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return changeType
     */
    public ItemLocationChangeType getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param changeType
     */
    public void setChangeType(ItemLocationChangeType changeType) {
        this.changeType = changeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReviseitemLocationKoreaRequestT)) return false;
        ReviseitemLocationKoreaRequestT other = (ReviseitemLocationKoreaRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberTicket==null && other.getMemberTicket()==null) || 
             (this.memberTicket!=null &&
              this.memberTicket.equals(other.getMemberTicket()))) &&
            ((this.locationNo==null && other.getLocationNo()==null) || 
             (this.locationNo!=null &&
              this.locationNo.equals(other.getLocationNo()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.sido==null && other.getSido()==null) || 
             (this.sido!=null &&
              this.sido.equals(other.getSido()))) &&
            ((this.sigugun==null && other.getSigugun()==null) || 
             (this.sigugun!=null &&
              this.sigugun.equals(other.getSigugun()))) &&
            ((this.dongmyun==null && other.getDongmyun()==null) || 
             (this.dongmyun!=null &&
              this.dongmyun.equals(other.getDongmyun()))) &&
            ((this.etc==null && other.getEtc()==null) || 
             (this.etc!=null &&
              this.etc.equals(other.getEtc()))) &&
            ((this.shopName==null && other.getShopName()==null) || 
             (this.shopName!=null &&
              this.shopName.equals(other.getShopName()))) &&
            ((this.shopTelNo==null && other.getShopTelNo()==null) || 
             (this.shopTelNo!=null &&
              this.shopTelNo.equals(other.getShopTelNo()))) &&
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode()))) &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType())));
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
        if (getMemberTicket() != null) {
            _hashCode += getMemberTicket().hashCode();
        }
        if (getLocationNo() != null) {
            _hashCode += getLocationNo().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getSido() != null) {
            _hashCode += getSido().hashCode();
        }
        if (getSigugun() != null) {
            _hashCode += getSigugun().hashCode();
        }
        if (getDongmyun() != null) {
            _hashCode += getDongmyun().hashCode();
        }
        if (getEtc() != null) {
            _hashCode += getEtc().hashCode();
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
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviseitemLocationKoreaRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaRequestT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
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
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemID"));
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
        elemField.setFieldName("sido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Sido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigugun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Sigugun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dongmyun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Dongmyun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Etc"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ChangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemLocationChangeType"));
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
