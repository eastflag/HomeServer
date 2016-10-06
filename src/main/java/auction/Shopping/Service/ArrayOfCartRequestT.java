/**
 * ArrayOfCartRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfCartRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] cartRequestT;

    public ArrayOfCartRequestT() {
    }

    public ArrayOfCartRequestT(
           auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] cartRequestT) {
           this.cartRequestT = cartRequestT;
    }


    /**
     * Gets the cartRequestT value for this ArrayOfCartRequestT.
     * 
     * @return cartRequestT
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] getCartRequestT() {
        return cartRequestT;
    }


    /**
     * Sets the cartRequestT value for this ArrayOfCartRequestT.
     * 
     * @param cartRequestT
     */
    public void setCartRequestT(auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] cartRequestT) {
        this.cartRequestT = cartRequestT;
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartRequestT getCartRequestT(int i) {
        return this.cartRequestT[i];
    }

    public void setCartRequestT(int i, auction.schema.Arche_Itempage3_Service_xsd.CartRequestT _value) {
        this.cartRequestT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfCartRequestT)) return false;
        ArrayOfCartRequestT other = (ArrayOfCartRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartRequestT==null && other.getCartRequestT()==null) || 
             (this.cartRequestT!=null &&
              java.util.Arrays.equals(this.cartRequestT, other.getCartRequestT())));
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
        if (getCartRequestT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartRequestT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCartRequestT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCartRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartRequestT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartRequestT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartRequestT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestT"));
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
