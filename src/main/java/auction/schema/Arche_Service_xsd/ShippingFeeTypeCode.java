/**
 * ShippingFeeTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingFeeTypeCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingFeeTypeCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _None = "None";
    public static final String _SellerShipping = "SellerShipping";
    public static final String _ItemShipping = "ItemShipping";
    public static final ShippingFeeTypeCode None = new ShippingFeeTypeCode(_None);
    public static final ShippingFeeTypeCode SellerShipping = new ShippingFeeTypeCode(_SellerShipping);
    public static final ShippingFeeTypeCode ItemShipping = new ShippingFeeTypeCode(_ItemShipping);
    public String getValue() { return _value_;}
    public static ShippingFeeTypeCode fromValue(String value)
          throws IllegalArgumentException {
        ShippingFeeTypeCode enumeration = (ShippingFeeTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShippingFeeTypeCode fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingFeeTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
