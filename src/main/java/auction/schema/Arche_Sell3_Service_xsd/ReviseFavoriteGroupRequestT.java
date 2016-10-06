/**
 * ReviseFavoriteGroupRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ReviseFavoriteGroupRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private FavoriteGroupBaseT[] favoriteGroupList;

    private int version;  // attribute

    public ReviseFavoriteGroupRequestT() {
    }

    public ReviseFavoriteGroupRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           FavoriteGroupBaseT[] favoriteGroupList,
           int version) {
           this.memberTicket = memberTicket;
           this.favoriteGroupList = favoriteGroupList;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this ReviseFavoriteGroupRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this ReviseFavoriteGroupRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the favoriteGroupList value for this ReviseFavoriteGroupRequestT.
     * 
     * @return favoriteGroupList
     */
    public FavoriteGroupBaseT[] getFavoriteGroupList() {
        return favoriteGroupList;
    }


    /**
     * Sets the favoriteGroupList value for this ReviseFavoriteGroupRequestT.
     * 
     * @param favoriteGroupList
     */
    public void setFavoriteGroupList(FavoriteGroupBaseT[] favoriteGroupList) {
        this.favoriteGroupList = favoriteGroupList;
    }

    public FavoriteGroupBaseT getFavoriteGroupList(int i) {
        return this.favoriteGroupList[i];
    }

    public void setFavoriteGroupList(int i, FavoriteGroupBaseT _value) {
        this.favoriteGroupList[i] = _value;
    }


    /**
     * Gets the version value for this ReviseFavoriteGroupRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ReviseFavoriteGroupRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReviseFavoriteGroupRequestT)) return false;
        ReviseFavoriteGroupRequestT other = (ReviseFavoriteGroupRequestT) obj;
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
            ((this.favoriteGroupList==null && other.getFavoriteGroupList()==null) || 
             (this.favoriteGroupList!=null &&
              java.util.Arrays.equals(this.favoriteGroupList, other.getFavoriteGroupList()))) &&
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
        if (getFavoriteGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteGroupList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFavoriteGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviseFavoriteGroupRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseFavoriteGroupRequestT"));
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
        elemField.setFieldName("favoriteGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupBaseT"));
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
