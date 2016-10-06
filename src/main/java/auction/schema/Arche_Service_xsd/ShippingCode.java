/**
 * ShippingCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ShippingCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NotAvailable = "NotAvailable";
    public static final String _Door2Door = "Door2Door";
    public static final String _Parcel = "Parcel";
    public static final String _QuickService = "QuickService";
    public static final String _Direct = "Direct";
    public static final String _PhoneCall = "PhoneCall";
    public static final String _NotSelect = "NotSelect";
    public static final ShippingCode NotAvailable = new ShippingCode(_NotAvailable);
    public static final ShippingCode Door2Door = new ShippingCode(_Door2Door);
    public static final ShippingCode Parcel = new ShippingCode(_Parcel);
    public static final ShippingCode QuickService = new ShippingCode(_QuickService);
    public static final ShippingCode Direct = new ShippingCode(_Direct);
    public static final ShippingCode PhoneCall = new ShippingCode(_PhoneCall);
    public static final ShippingCode NotSelect = new ShippingCode(_NotSelect);
    public String getValue() { return _value_;}
    public static ShippingCode fromValue(String value)
          throws IllegalArgumentException {
        ShippingCode enumeration = (ShippingCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShippingCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ShippingCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
