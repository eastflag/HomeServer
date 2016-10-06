/**
 * ArrayOfShippingPlaceT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfShippingPlaceT  implements java.io.Serializable {
    private auction.schema.Arche_Item3_xsd.ShippingPlaceT[] shippingPlaceT;

    public ArrayOfShippingPlaceT() {
    }

    public ArrayOfShippingPlaceT(
           auction.schema.Arche_Item3_xsd.ShippingPlaceT[] shippingPlaceT) {
           this.shippingPlaceT = shippingPlaceT;
    }


    /**
     * Gets the shippingPlaceT value for this ArrayOfShippingPlaceT.
     * 
     * @return shippingPlaceT
     */
    public auction.schema.Arche_Item3_xsd.ShippingPlaceT[] getShippingPlaceT() {
        return shippingPlaceT;
    }


    /**
     * Sets the shippingPlaceT value for this ArrayOfShippingPlaceT.
     * 
     * @param shippingPlaceT
     */
    public void setShippingPlaceT(auction.schema.Arche_Item3_xsd.ShippingPlaceT[] shippingPlaceT) {
        this.shippingPlaceT = shippingPlaceT;
    }

    public auction.schema.Arche_Item3_xsd.ShippingPlaceT getShippingPlaceT(int i) {
        return this.shippingPlaceT[i];
    }

    public void setShippingPlaceT(int i, auction.schema.Arche_Item3_xsd.ShippingPlaceT _value) {
        this.shippingPlaceT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfShippingPlaceT)) return false;
        ArrayOfShippingPlaceT other = (ArrayOfShippingPlaceT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingPlaceT==null && other.getShippingPlaceT()==null) || 
             (this.shippingPlaceT!=null &&
              java.util.Arrays.equals(this.shippingPlaceT, other.getShippingPlaceT())));
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
        if (getShippingPlaceT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingPlaceT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingPlaceT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfShippingPlaceT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfShippingPlaceT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPlaceT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ShippingPlaceT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPlaceT"));
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
