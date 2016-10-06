/**
 * ArrayOfGetItemLocationKoreaResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfGetItemLocationKoreaResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getItemLocationKoreaResponseT;

    public ArrayOfGetItemLocationKoreaResponseT() {
    }

    public ArrayOfGetItemLocationKoreaResponseT(
           auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getItemLocationKoreaResponseT) {
           this.getItemLocationKoreaResponseT = getItemLocationKoreaResponseT;
    }


    /**
     * Gets the getItemLocationKoreaResponseT value for this ArrayOfGetItemLocationKoreaResponseT.
     * 
     * @return getItemLocationKoreaResponseT
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getGetItemLocationKoreaResponseT() {
        return getItemLocationKoreaResponseT;
    }


    /**
     * Sets the getItemLocationKoreaResponseT value for this ArrayOfGetItemLocationKoreaResponseT.
     * 
     * @param getItemLocationKoreaResponseT
     */
    public void setGetItemLocationKoreaResponseT(auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getItemLocationKoreaResponseT) {
        this.getItemLocationKoreaResponseT = getItemLocationKoreaResponseT;
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT getGetItemLocationKoreaResponseT(int i) {
        return this.getItemLocationKoreaResponseT[i];
    }

    public void setGetItemLocationKoreaResponseT(int i, auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT _value) {
        this.getItemLocationKoreaResponseT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfGetItemLocationKoreaResponseT)) return false;
        ArrayOfGetItemLocationKoreaResponseT other = (ArrayOfGetItemLocationKoreaResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getItemLocationKoreaResponseT==null && other.getGetItemLocationKoreaResponseT()==null) || 
             (this.getItemLocationKoreaResponseT!=null &&
              java.util.Arrays.equals(this.getItemLocationKoreaResponseT, other.getGetItemLocationKoreaResponseT())));
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
        if (getGetItemLocationKoreaResponseT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetItemLocationKoreaResponseT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetItemLocationKoreaResponseT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGetItemLocationKoreaResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemLocationKoreaResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getItemLocationKoreaResponseT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemLocationKoreaResponseT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemLocationKoreaResponseT"));
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
