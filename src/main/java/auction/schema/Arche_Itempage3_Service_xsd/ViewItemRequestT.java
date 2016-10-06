/**
 * ViewItemRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class ViewItemRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private String itemID;  // attribute

    private int version;  // attribute

    private boolean excludeMartOnItem;  // attribute

    public ViewItemRequestT() {
    }

    public ViewItemRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           String itemID,
           int version,
           boolean excludeMartOnItem) {
           this.memberTicket = memberTicket;
           this.itemID = itemID;
           this.version = version;
           this.excludeMartOnItem = excludeMartOnItem;
    }


    /**
     * Gets the memberTicket value for this ViewItemRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this ViewItemRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the itemID value for this ViewItemRequestT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ViewItemRequestT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the version value for this ViewItemRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ViewItemRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the excludeMartOnItem value for this ViewItemRequestT.
     * 
     * @return excludeMartOnItem
     */
    public boolean isExcludeMartOnItem() {
        return excludeMartOnItem;
    }


    /**
     * Sets the excludeMartOnItem value for this ViewItemRequestT.
     * 
     * @param excludeMartOnItem
     */
    public void setExcludeMartOnItem(boolean excludeMartOnItem) {
        this.excludeMartOnItem = excludeMartOnItem;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ViewItemRequestT)) return false;
        ViewItemRequestT other = (ViewItemRequestT) obj;
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
            this.version == other.getVersion() &&
            this.excludeMartOnItem == other.isExcludeMartOnItem();
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
        _hashCode += getVersion();
        _hashCode += (isExcludeMartOnItem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewItemRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "ViewItemRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("excludeMartOnItem");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExcludeMartOnItem"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "MemberTicket"));
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
