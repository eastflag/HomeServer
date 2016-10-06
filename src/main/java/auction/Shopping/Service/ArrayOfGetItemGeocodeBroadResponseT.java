/**
 * ArrayOfGetItemGeocodeBroadResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfGetItemGeocodeBroadResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getItemGeocodeBroadResponseT;

    public ArrayOfGetItemGeocodeBroadResponseT() {
    }

    public ArrayOfGetItemGeocodeBroadResponseT(
           auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getItemGeocodeBroadResponseT) {
           this.getItemGeocodeBroadResponseT = getItemGeocodeBroadResponseT;
    }


    /**
     * Gets the getItemGeocodeBroadResponseT value for this ArrayOfGetItemGeocodeBroadResponseT.
     * 
     * @return getItemGeocodeBroadResponseT
     */
    public auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getGetItemGeocodeBroadResponseT() {
        return getItemGeocodeBroadResponseT;
    }


    /**
     * Sets the getItemGeocodeBroadResponseT value for this ArrayOfGetItemGeocodeBroadResponseT.
     * 
     * @param getItemGeocodeBroadResponseT
     */
    public void setGetItemGeocodeBroadResponseT(auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getItemGeocodeBroadResponseT) {
        this.getItemGeocodeBroadResponseT = getItemGeocodeBroadResponseT;
    }

    public auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT getGetItemGeocodeBroadResponseT(int i) {
        return this.getItemGeocodeBroadResponseT[i];
    }

    public void setGetItemGeocodeBroadResponseT(int i, auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT _value) {
        this.getItemGeocodeBroadResponseT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfGetItemGeocodeBroadResponseT)) return false;
        ArrayOfGetItemGeocodeBroadResponseT other = (ArrayOfGetItemGeocodeBroadResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getItemGeocodeBroadResponseT==null && other.getGetItemGeocodeBroadResponseT()==null) || 
             (this.getItemGeocodeBroadResponseT!=null &&
              java.util.Arrays.equals(this.getItemGeocodeBroadResponseT, other.getGetItemGeocodeBroadResponseT())));
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
        if (getGetItemGeocodeBroadResponseT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetItemGeocodeBroadResponseT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetItemGeocodeBroadResponseT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGetItemGeocodeBroadResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfGetItemGeocodeBroadResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getItemGeocodeBroadResponseT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "GetItemGeocodeBroadResponseT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeBroadResponseT"));
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
