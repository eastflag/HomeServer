/**
 * GetSellerAddressesResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetSellerAddressesResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.SellerAddrT[] sellerAddr;

    public GetSellerAddressesResponseT() {
    }

    public GetSellerAddressesResponseT(
           auction.schema.Arche_Service_xsd.SellerAddrT[] sellerAddr) {
           this.sellerAddr = sellerAddr;
    }


    /**
     * Gets the sellerAddr value for this GetSellerAddressesResponseT.
     * 
     * @return sellerAddr
     */
    public auction.schema.Arche_Service_xsd.SellerAddrT[] getSellerAddr() {
        return sellerAddr;
    }


    /**
     * Sets the sellerAddr value for this GetSellerAddressesResponseT.
     * 
     * @param sellerAddr
     */
    public void setSellerAddr(auction.schema.Arche_Service_xsd.SellerAddrT[] sellerAddr) {
        this.sellerAddr = sellerAddr;
    }

    public auction.schema.Arche_Service_xsd.SellerAddrT getSellerAddr(int i) {
        return this.sellerAddr[i];
    }

    public void setSellerAddr(int i, auction.schema.Arche_Service_xsd.SellerAddrT _value) {
        this.sellerAddr[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetSellerAddressesResponseT)) return false;
        GetSellerAddressesResponseT other = (GetSellerAddressesResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellerAddr==null && other.getSellerAddr()==null) || 
             (this.sellerAddr!=null &&
              java.util.Arrays.equals(this.sellerAddr, other.getSellerAddr())));
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
        if (getSellerAddr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellerAddr());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSellerAddr(), i);
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
        new org.apache.axis.description.TypeDesc(GetSellerAddressesResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressesResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "SellerAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellerAddrT"));
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
