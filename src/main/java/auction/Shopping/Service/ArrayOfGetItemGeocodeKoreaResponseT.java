/**
 * ArrayOfGetItemGeocodeKoreaResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfGetItemGeocodeKoreaResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getItemGeocodeKoreaResponseT;

    public ArrayOfGetItemGeocodeKoreaResponseT() {
    }

    public ArrayOfGetItemGeocodeKoreaResponseT(
           auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getItemGeocodeKoreaResponseT) {
           this.getItemGeocodeKoreaResponseT = getItemGeocodeKoreaResponseT;
    }


    /**
     * Gets the getItemGeocodeKoreaResponseT value for this ArrayOfGetItemGeocodeKoreaResponseT.
     * 
     * @return getItemGeocodeKoreaResponseT
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getGetItemGeocodeKoreaResponseT() {
        return getItemGeocodeKoreaResponseT;
    }


    /**
     * Sets the getItemGeocodeKoreaResponseT value for this ArrayOfGetItemGeocodeKoreaResponseT.
     * 
     * @param getItemGeocodeKoreaResponseT
     */
    public void setGetItemGeocodeKoreaResponseT(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getItemGeocodeKoreaResponseT) {
        this.getItemGeocodeKoreaResponseT = getItemGeocodeKoreaResponseT;
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT getGetItemGeocodeKoreaResponseT(int i) {
        return this.getItemGeocodeKoreaResponseT[i];
    }

    public void setGetItemGeocodeKoreaResponseT(int i, auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT _value) {
        this.getItemGeocodeKoreaResponseT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfGetItemGeocodeKoreaResponseT)) return false;
        ArrayOfGetItemGeocodeKoreaResponseT other = (ArrayOfGetItemGeocodeKoreaResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getItemGeocodeKoreaResponseT==null && other.getGetItemGeocodeKoreaResponseT()==null) || 
             (this.getItemGeocodeKoreaResponseT!=null &&
              java.util.Arrays.equals(this.getItemGeocodeKoreaResponseT, other.getGetItemGeocodeKoreaResponseT())));
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
        if (getGetItemGeocodeKoreaResponseT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetItemGeocodeKoreaResponseT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetItemGeocodeKoreaResponseT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGetItemGeocodeKoreaResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeKoreaResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getItemGeocodeKoreaResponseT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeKoreaResponseT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeKoreaResponseT"));
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
