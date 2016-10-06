/**
 * ViewSellingStatusResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ViewSellingStatusResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ItemSellingT itemSelling;

    public ViewSellingStatusResponseT() {
    }

    public ViewSellingStatusResponseT(
           auction.schema.Arche_Service_xsd.ItemSellingT itemSelling) {
           this.itemSelling = itemSelling;
    }


    /**
     * Gets the itemSelling value for this ViewSellingStatusResponseT.
     * 
     * @return itemSelling
     */
    public auction.schema.Arche_Service_xsd.ItemSellingT getItemSelling() {
        return itemSelling;
    }


    /**
     * Sets the itemSelling value for this ViewSellingStatusResponseT.
     * 
     * @param itemSelling
     */
    public void setItemSelling(auction.schema.Arche_Service_xsd.ItemSellingT itemSelling) {
        this.itemSelling = itemSelling;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ViewSellingStatusResponseT)) return false;
        ViewSellingStatusResponseT other = (ViewSellingStatusResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemSelling==null && other.getItemSelling()==null) || 
             (this.itemSelling!=null &&
              this.itemSelling.equals(other.getItemSelling())));
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
        if (getItemSelling() != null) {
            _hashCode += getItemSelling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewSellingStatusResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ViewSellingStatusResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSelling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemSelling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingT"));
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
