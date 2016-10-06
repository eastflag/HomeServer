/**
 * ArrayOfCartViewT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfCartViewT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] cartViewT;

    public ArrayOfCartViewT() {
    }

    public ArrayOfCartViewT(
           auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] cartViewT) {
           this.cartViewT = cartViewT;
    }


    /**
     * Gets the cartViewT value for this ArrayOfCartViewT.
     * 
     * @return cartViewT
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] getCartViewT() {
        return cartViewT;
    }


    /**
     * Sets the cartViewT value for this ArrayOfCartViewT.
     * 
     * @param cartViewT
     */
    public void setCartViewT(auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] cartViewT) {
        this.cartViewT = cartViewT;
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartViewT getCartViewT(int i) {
        return this.cartViewT[i];
    }

    public void setCartViewT(int i, auction.schema.Arche_Itempage3_Service_xsd.CartViewT _value) {
        this.cartViewT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfCartViewT)) return false;
        ArrayOfCartViewT other = (ArrayOfCartViewT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartViewT==null && other.getCartViewT()==null) || 
             (this.cartViewT!=null &&
              java.util.Arrays.equals(this.cartViewT, other.getCartViewT())));
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
        if (getCartViewT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartViewT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCartViewT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCartViewT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartViewT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartViewT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartViewT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartViewT"));
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
