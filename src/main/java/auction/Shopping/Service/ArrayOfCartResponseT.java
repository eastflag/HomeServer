/**
 * ArrayOfCartResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfCartResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] cartResponseT;

    public ArrayOfCartResponseT() {
    }

    public ArrayOfCartResponseT(
           auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] cartResponseT) {
           this.cartResponseT = cartResponseT;
    }


    /**
     * Gets the cartResponseT value for this ArrayOfCartResponseT.
     * 
     * @return cartResponseT
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] getCartResponseT() {
        return cartResponseT;
    }


    /**
     * Sets the cartResponseT value for this ArrayOfCartResponseT.
     * 
     * @param cartResponseT
     */
    public void setCartResponseT(auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] cartResponseT) {
        this.cartResponseT = cartResponseT;
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartResponseT getCartResponseT(int i) {
        return this.cartResponseT[i];
    }

    public void setCartResponseT(int i, auction.schema.Arche_Itempage3_Service_xsd.CartResponseT _value) {
        this.cartResponseT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfCartResponseT)) return false;
        ArrayOfCartResponseT other = (ArrayOfCartResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartResponseT==null && other.getCartResponseT()==null) || 
             (this.cartResponseT!=null &&
              java.util.Arrays.equals(this.cartResponseT, other.getCartResponseT())));
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
        if (getCartResponseT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartResponseT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCartResponseT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCartResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartResponseT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartResponseT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartResponseT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
