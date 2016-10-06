/**
 * ArrayOfNationListT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ArrayOfNationListT  implements java.io.Serializable {
    private auction.schema.Arche_Code_xsd.NationListT[] nationListT;

    public ArrayOfNationListT() {
    }

    public ArrayOfNationListT(
           auction.schema.Arche_Code_xsd.NationListT[] nationListT) {
           this.nationListT = nationListT;
    }


    /**
     * Gets the nationListT value for this ArrayOfNationListT.
     * 
     * @return nationListT
     */
    public auction.schema.Arche_Code_xsd.NationListT[] getNationListT() {
        return nationListT;
    }


    /**
     * Sets the nationListT value for this ArrayOfNationListT.
     * 
     * @param nationListT
     */
    public void setNationListT(auction.schema.Arche_Code_xsd.NationListT[] nationListT) {
        this.nationListT = nationListT;
    }

    public auction.schema.Arche_Code_xsd.NationListT getNationListT(int i) {
        return this.nationListT[i];
    }

    public void setNationListT(int i, auction.schema.Arche_Code_xsd.NationListT _value) {
        this.nationListT[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfNationListT)) return false;
        ArrayOfNationListT other = (ArrayOfNationListT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationListT==null && other.getNationListT()==null) || 
             (this.nationListT!=null &&
              java.util.Arrays.equals(this.nationListT, other.getNationListT())));
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
        if (getNationListT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNationListT());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNationListT(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNationListT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ArrayOfNationListT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationListT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "NationListT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Code.xsd", "NationListT"));
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
