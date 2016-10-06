/**
 * ArrayOfCartNoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfCartNoT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] cartNoT;

    public ArrayOfCartNoT() {
    }

    public ArrayOfCartNoT(
           auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] cartNoT) {
           this.cartNoT = cartNoT;
    }


    /**
     * Gets the cartNoT value for this ArrayOfCartNoT.
     * 
     * @return cartNoT
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] getCartNoT() {
        return cartNoT;
    }


    /**
     * Sets the cartNoT value for this ArrayOfCartNoT.
     * 
     * @param cartNoT
     */
    public void setCartNoT(auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] cartNoT) {
        this.cartNoT = cartNoT;
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartNoT getCartNoT(int i) {
        return this.cartNoT[i];
    }

    public void setCartNoT(int i, auction.schema.Arche_Itempage3_Service_xsd.CartNoT _value) {
        this.cartNoT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfCartNoT)) return false;
        ArrayOfCartNoT other = (ArrayOfCartNoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartNoT==null && other.getCartNoT()==null) || 
             (this.cartNoT!=null &&
              java.util.Arrays.equals(this.cartNoT, other.getCartNoT())));
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
        if (getCartNoT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartNoT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCartNoT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCartNoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfCartNoT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartNoT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "CartNoT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartNoT"));
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
