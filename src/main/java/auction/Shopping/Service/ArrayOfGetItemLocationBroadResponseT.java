/**
 * ArrayOfGetItemLocationBroadResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfGetItemLocationBroadResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getItemLocationBroadResponseT;

    public ArrayOfGetItemLocationBroadResponseT() {
    }

    public ArrayOfGetItemLocationBroadResponseT(
           auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getItemLocationBroadResponseT) {
           this.getItemLocationBroadResponseT = getItemLocationBroadResponseT;
    }


    /**
     * Gets the getItemLocationBroadResponseT value for this ArrayOfGetItemLocationBroadResponseT.
     * 
     * @return getItemLocationBroadResponseT
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getGetItemLocationBroadResponseT() {
        return getItemLocationBroadResponseT;
    }


    /**
     * Sets the getItemLocationBroadResponseT value for this ArrayOfGetItemLocationBroadResponseT.
     * 
     * @param getItemLocationBroadResponseT
     */
    public void setGetItemLocationBroadResponseT(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getItemLocationBroadResponseT) {
        this.getItemLocationBroadResponseT = getItemLocationBroadResponseT;
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT getGetItemLocationBroadResponseT(int i) {
        return this.getItemLocationBroadResponseT[i];
    }

    public void setGetItemLocationBroadResponseT(int i, auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT _value) {
        this.getItemLocationBroadResponseT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfGetItemLocationBroadResponseT)) return false;
        ArrayOfGetItemLocationBroadResponseT other = (ArrayOfGetItemLocationBroadResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getItemLocationBroadResponseT==null && other.getGetItemLocationBroadResponseT()==null) || 
             (this.getItemLocationBroadResponseT!=null &&
              java.util.Arrays.equals(this.getItemLocationBroadResponseT, other.getGetItemLocationBroadResponseT())));
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
        if (getGetItemLocationBroadResponseT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetItemLocationBroadResponseT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetItemLocationBroadResponseT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGetItemLocationBroadResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationBroadResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getItemLocationBroadResponseT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationBroadResponseT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationBroadResponseT"));
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
