/**
 * ItemReturnT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemReturnT  implements java.io.Serializable {
    private AddressT address;

    private ExtraInfoT extraInfo;

    private auction.schema.Arche_Service_xsd.DeliveryAgencyCode deliveryAgency;  // attribute

    public ItemReturnT() {
    }

    public ItemReturnT(
           AddressT address,
           ExtraInfoT extraInfo,
           auction.schema.Arche_Service_xsd.DeliveryAgencyCode deliveryAgency) {
           this.address = address;
           this.extraInfo = extraInfo;
           this.deliveryAgency = deliveryAgency;
    }


    /**
     * Gets the address value for this ItemReturnT.
     * 
     * @return address
     */
    public AddressT getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ItemReturnT.
     * 
     * @param address
     */
    public void setAddress(AddressT address) {
        this.address = address;
    }


    /**
     * Gets the extraInfo value for this ItemReturnT.
     * 
     * @return extraInfo
     */
    public ExtraInfoT getExtraInfo() {
        return extraInfo;
    }


    /**
     * Sets the extraInfo value for this ItemReturnT.
     * 
     * @param extraInfo
     */
    public void setExtraInfo(ExtraInfoT extraInfo) {
        this.extraInfo = extraInfo;
    }


    /**
     * Gets the deliveryAgency value for this ItemReturnT.
     * 
     * @return deliveryAgency
     */
    public auction.schema.Arche_Service_xsd.DeliveryAgencyCode getDeliveryAgency() {
        return deliveryAgency;
    }


    /**
     * Sets the deliveryAgency value for this ItemReturnT.
     * 
     * @param deliveryAgency
     */
    public void setDeliveryAgency(auction.schema.Arche_Service_xsd.DeliveryAgencyCode deliveryAgency) {
        this.deliveryAgency = deliveryAgency;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemReturnT)) return false;
        ItemReturnT other = (ItemReturnT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.extraInfo==null && other.getExtraInfo()==null) || 
             (this.extraInfo!=null &&
              this.extraInfo.equals(other.getExtraInfo()))) &&
            ((this.deliveryAgency==null && other.getDeliveryAgency()==null) || 
             (this.deliveryAgency!=null &&
              this.deliveryAgency.equals(other.getDeliveryAgency())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getExtraInfo() != null) {
            _hashCode += getExtraInfo().hashCode();
        }
        if (getDeliveryAgency() != null) {
            _hashCode += getDeliveryAgency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemReturnT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemReturnT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deliveryAgency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeliveryAgency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliveryAgencyCode"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AddressT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ExtraInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ExtraInfoT"));
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
