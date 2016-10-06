/**
 * GetOfficialNoticeInfoResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetOfficialNoticeInfoResponseT  implements java.io.Serializable {
    private String itemID;

    private auction.schema.Arche_Service_xsd.ItemOfficialNotiGroupT notiItemGroup;

    private auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT[] notiItemCode;

    public GetOfficialNoticeInfoResponseT() {
    }

    public GetOfficialNoticeInfoResponseT(
           String itemID,
           auction.schema.Arche_Service_xsd.ItemOfficialNotiGroupT notiItemGroup,
           auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT[] notiItemCode) {
           this.itemID = itemID;
           this.notiItemGroup = notiItemGroup;
           this.notiItemCode = notiItemCode;
    }


    /**
     * Gets the itemID value for this GetOfficialNoticeInfoResponseT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this GetOfficialNoticeInfoResponseT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the notiItemGroup value for this GetOfficialNoticeInfoResponseT.
     * 
     * @return notiItemGroup
     */
    public auction.schema.Arche_Service_xsd.ItemOfficialNotiGroupT getNotiItemGroup() {
        return notiItemGroup;
    }


    /**
     * Sets the notiItemGroup value for this GetOfficialNoticeInfoResponseT.
     * 
     * @param notiItemGroup
     */
    public void setNotiItemGroup(auction.schema.Arche_Service_xsd.ItemOfficialNotiGroupT notiItemGroup) {
        this.notiItemGroup = notiItemGroup;
    }


    /**
     * Gets the notiItemCode value for this GetOfficialNoticeInfoResponseT.
     * 
     * @return notiItemCode
     */
    public auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT[] getNotiItemCode() {
        return notiItemCode;
    }


    /**
     * Sets the notiItemCode value for this GetOfficialNoticeInfoResponseT.
     * 
     * @param notiItemCode
     */
    public void setNotiItemCode(auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT[] notiItemCode) {
        this.notiItemCode = notiItemCode;
    }

    public auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT getNotiItemCode(int i) {
        return this.notiItemCode[i];
    }

    public void setNotiItemCode(int i, auction.schema.Arche_Service_xsd.ItemOfficialNotiCodeT _value) {
        this.notiItemCode[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetOfficialNoticeInfoResponseT)) return false;
        GetOfficialNoticeInfoResponseT other = (GetOfficialNoticeInfoResponseT) obj;
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
            ((this.notiItemGroup==null && other.getNotiItemGroup()==null) || 
             (this.notiItemGroup!=null &&
              this.notiItemGroup.equals(other.getNotiItemGroup()))) &&
            ((this.notiItemCode==null && other.getNotiItemCode()==null) || 
             (this.notiItemCode!=null &&
              java.util.Arrays.equals(this.notiItemCode, other.getNotiItemCode())));
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
        if (getNotiItemGroup() != null) {
            _hashCode += getNotiItemGroup().hashCode();
        }
        if (getNotiItemCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotiItemCode());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotiItemCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOfficialNoticeInfoResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetOfficialNoticeInfoResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notiItemGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "NotiItemGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiGroupT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notiItemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "NotiItemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiCodeT"));
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
