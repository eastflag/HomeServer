/**
 * DeleteItemFromFavoriteItemListRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class DeleteItemFromFavoriteItemListRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private FavoriteItemListT[] deleteItemFromFavoriteItemList;

    private int version;  // attribute

    public DeleteItemFromFavoriteItemListRequestT() {
    }

    public DeleteItemFromFavoriteItemListRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           FavoriteItemListT[] deleteItemFromFavoriteItemList,
           int version) {
           this.memberTicket = memberTicket;
           this.deleteItemFromFavoriteItemList = deleteItemFromFavoriteItemList;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the deleteItemFromFavoriteItemList value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @return deleteItemFromFavoriteItemList
     */
    public FavoriteItemListT[] getDeleteItemFromFavoriteItemList() {
        return deleteItemFromFavoriteItemList;
    }


    /**
     * Sets the deleteItemFromFavoriteItemList value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @param deleteItemFromFavoriteItemList
     */
    public void setDeleteItemFromFavoriteItemList(FavoriteItemListT[] deleteItemFromFavoriteItemList) {
        this.deleteItemFromFavoriteItemList = deleteItemFromFavoriteItemList;
    }

    public FavoriteItemListT getDeleteItemFromFavoriteItemList(int i) {
        return this.deleteItemFromFavoriteItemList[i];
    }

    public void setDeleteItemFromFavoriteItemList(int i, FavoriteItemListT _value) {
        this.deleteItemFromFavoriteItemList[i] = _value;
    }


    /**
     * Gets the version value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DeleteItemFromFavoriteItemListRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteItemFromFavoriteItemListRequestT)) return false;
        DeleteItemFromFavoriteItemListRequestT other = (DeleteItemFromFavoriteItemListRequestT) obj;
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
            ((this.deleteItemFromFavoriteItemList==null && other.getDeleteItemFromFavoriteItemList()==null) || 
             (this.deleteItemFromFavoriteItemList!=null &&
              java.util.Arrays.equals(this.deleteItemFromFavoriteItemList, other.getDeleteItemFromFavoriteItemList()))) &&
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
        if (getDeleteItemFromFavoriteItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteItemFromFavoriteItemList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeleteItemFromFavoriteItemList(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteItemFromFavoriteItemListRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListRequestT"));
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
        elemField.setFieldName("deleteItemFromFavoriteItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListT"));
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
