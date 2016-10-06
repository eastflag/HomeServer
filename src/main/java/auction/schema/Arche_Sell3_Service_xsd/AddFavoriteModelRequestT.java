/**
 * AddFavoriteModelRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class AddFavoriteModelRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private int groupNo;  // attribute

    private int catalogID;  // attribute

    private int version;  // attribute

    public AddFavoriteModelRequestT() {
    }

    public AddFavoriteModelRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           int groupNo,
           int catalogID,
           int version) {
           this.memberTicket = memberTicket;
           this.groupNo = groupNo;
           this.catalogID = catalogID;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this AddFavoriteModelRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this AddFavoriteModelRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the groupNo value for this AddFavoriteModelRequestT.
     * 
     * @return groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }


    /**
     * Sets the groupNo value for this AddFavoriteModelRequestT.
     * 
     * @param groupNo
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }


    /**
     * Gets the catalogID value for this AddFavoriteModelRequestT.
     * 
     * @return catalogID
     */
    public int getCatalogID() {
        return catalogID;
    }


    /**
     * Sets the catalogID value for this AddFavoriteModelRequestT.
     * 
     * @param catalogID
     */
    public void setCatalogID(int catalogID) {
        this.catalogID = catalogID;
    }


    /**
     * Gets the version value for this AddFavoriteModelRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddFavoriteModelRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddFavoriteModelRequestT)) return false;
        AddFavoriteModelRequestT other = (AddFavoriteModelRequestT) obj;
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
            this.groupNo == other.getGroupNo() &&
            this.catalogID == other.getCatalogID() &&
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
        _hashCode += getGroupNo();
        _hashCode += getCatalogID();
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddFavoriteModelRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddFavoriteModelRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
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
