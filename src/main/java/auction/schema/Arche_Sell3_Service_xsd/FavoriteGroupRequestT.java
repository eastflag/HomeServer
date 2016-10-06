/**
 * FavoriteGroupRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteGroupRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private int version;  // attribute

    private int shippingPlaceSeq;  // attribute

    private String shipmentPlace;  // attribute

    public FavoriteGroupRequestT() {
    }

    public FavoriteGroupRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           int version,
           int shippingPlaceSeq,
           String shipmentPlace) {
           this.memberTicket = memberTicket;
           this.version = version;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.shipmentPlace = shipmentPlace;
    }


    /**
     * Gets the memberTicket value for this FavoriteGroupRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this FavoriteGroupRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the version value for this FavoriteGroupRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FavoriteGroupRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the shippingPlaceSeq value for this FavoriteGroupRequestT.
     * 
     * @return shippingPlaceSeq
     */
    public int getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this FavoriteGroupRequestT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(int shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the shipmentPlace value for this FavoriteGroupRequestT.
     * 
     * @return shipmentPlace
     */
    public String getShipmentPlace() {
        return shipmentPlace;
    }


    /**
     * Sets the shipmentPlace value for this FavoriteGroupRequestT.
     * 
     * @param shipmentPlace
     */
    public void setShipmentPlace(String shipmentPlace) {
        this.shipmentPlace = shipmentPlace;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteGroupRequestT)) return false;
        FavoriteGroupRequestT other = (FavoriteGroupRequestT) obj;
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
            this.version == other.getVersion() &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            ((this.shipmentPlace==null && other.getShipmentPlace()==null) || 
             (this.shipmentPlace!=null &&
              this.shipmentPlace.equals(other.getShipmentPlace())));
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
        _hashCode += getVersion();
        _hashCode += getShippingPlaceSeq();
        if (getShipmentPlace() != null) {
            _hashCode += getShipmentPlace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteGroupRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
