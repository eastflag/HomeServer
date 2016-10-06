/**
 * ViewOfficialNoticeResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ViewOfficialNoticeResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ItemOfficialNotice itemOfficialNotice;

    public ViewOfficialNoticeResponseT() {
    }

    public ViewOfficialNoticeResponseT(
           auction.schema.Arche_Service_xsd.ItemOfficialNotice itemOfficialNotice) {
           this.itemOfficialNotice = itemOfficialNotice;
    }


    /**
     * Gets the itemOfficialNotice value for this ViewOfficialNoticeResponseT.
     * 
     * @return itemOfficialNotice
     */
    public auction.schema.Arche_Service_xsd.ItemOfficialNotice getItemOfficialNotice() {
        return itemOfficialNotice;
    }


    /**
     * Sets the itemOfficialNotice value for this ViewOfficialNoticeResponseT.
     * 
     * @param itemOfficialNotice
     */
    public void setItemOfficialNotice(auction.schema.Arche_Service_xsd.ItemOfficialNotice itemOfficialNotice) {
        this.itemOfficialNotice = itemOfficialNotice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ViewOfficialNoticeResponseT)) return false;
        ViewOfficialNoticeResponseT other = (ViewOfficialNoticeResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemOfficialNotice==null && other.getItemOfficialNotice()==null) || 
             (this.itemOfficialNotice!=null &&
              this.itemOfficialNotice.equals(other.getItemOfficialNotice())));
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
        if (getItemOfficialNotice() != null) {
            _hashCode += getItemOfficialNotice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewOfficialNoticeResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewOfficialNoticeResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOfficialNotice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemOfficialNotice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotice"));
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
