/**
 * GetOfficialNoticeInfoRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetOfficialNoticeInfoRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private String itemID;

    private String notiItemGroupName;

    private String notiItemGroupNo;

    private int version;  // attribute

    public GetOfficialNoticeInfoRequestT() {
    }

    public GetOfficialNoticeInfoRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           String itemID,
           String notiItemGroupName,
           String notiItemGroupNo,
           int version) {
           this.memberTicket = memberTicket;
           this.itemID = itemID;
           this.notiItemGroupName = notiItemGroupName;
           this.notiItemGroupNo = notiItemGroupNo;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this GetOfficialNoticeInfoRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this GetOfficialNoticeInfoRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the itemID value for this GetOfficialNoticeInfoRequestT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this GetOfficialNoticeInfoRequestT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the notiItemGroupName value for this GetOfficialNoticeInfoRequestT.
     * 
     * @return notiItemGroupName
     */
    public String getNotiItemGroupName() {
        return notiItemGroupName;
    }


    /**
     * Sets the notiItemGroupName value for this GetOfficialNoticeInfoRequestT.
     * 
     * @param notiItemGroupName
     */
    public void setNotiItemGroupName(String notiItemGroupName) {
        this.notiItemGroupName = notiItemGroupName;
    }


    /**
     * Gets the notiItemGroupNo value for this GetOfficialNoticeInfoRequestT.
     * 
     * @return notiItemGroupNo
     */
    public String getNotiItemGroupNo() {
        return notiItemGroupNo;
    }


    /**
     * Sets the notiItemGroupNo value for this GetOfficialNoticeInfoRequestT.
     * 
     * @param notiItemGroupNo
     */
    public void setNotiItemGroupNo(String notiItemGroupNo) {
        this.notiItemGroupNo = notiItemGroupNo;
    }


    /**
     * Gets the version value for this GetOfficialNoticeInfoRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetOfficialNoticeInfoRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetOfficialNoticeInfoRequestT)) return false;
        GetOfficialNoticeInfoRequestT other = (GetOfficialNoticeInfoRequestT) obj;
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
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.notiItemGroupName==null && other.getNotiItemGroupName()==null) || 
             (this.notiItemGroupName!=null &&
              this.notiItemGroupName.equals(other.getNotiItemGroupName()))) &&
            ((this.notiItemGroupNo==null && other.getNotiItemGroupNo()==null) || 
             (this.notiItemGroupNo!=null &&
              this.notiItemGroupNo.equals(other.getNotiItemGroupNo()))) &&
            this.version == other.getVersion();
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getNotiItemGroupName() != null) {
            _hashCode += getNotiItemGroupName().hashCode();
        }
        if (getNotiItemGroupNo() != null) {
            _hashCode += getNotiItemGroupNo().hashCode();
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOfficialNoticeInfoRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
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
        elemField.setFieldName("notiItemGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "NotiItemGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notiItemGroupNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "NotiItemGroupNo"));
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
