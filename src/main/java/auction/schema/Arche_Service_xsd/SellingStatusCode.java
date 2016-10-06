/**
 * SellingStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SellingStatusCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellingStatusCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Waiting = "Waiting";
    public static final String _OnSale = "OnSale";
    public static final String _Stop = "Stop";
    public static final String _StopedByStaff = "StopedByStaff";
    public static final String _Closed = "Closed";
    public static final SellingStatusCode Waiting = new SellingStatusCode(_Waiting);
    public static final SellingStatusCode OnSale = new SellingStatusCode(_OnSale);
    public static final SellingStatusCode Stop = new SellingStatusCode(_Stop);
    public static final SellingStatusCode StopedByStaff = new SellingStatusCode(_StopedByStaff);
    public static final SellingStatusCode Closed = new SellingStatusCode(_Closed);
    public String getValue() { return _value_;}
    public static SellingStatusCode fromValue(String value)
          throws IllegalArgumentException {
        SellingStatusCode enumeration = (SellingStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SellingStatusCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(SellingStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
