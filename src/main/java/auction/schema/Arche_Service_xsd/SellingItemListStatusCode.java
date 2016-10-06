/**
 * SellingItemListStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SellingItemListStatusCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellingItemListStatusCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _All = "All";
    public static final String _OnSale = "OnSale";
    public static final String _Pause = "Pause";
    public static final String _Stop = "Stop";
    public static final String _Block = "Block";
    public static final SellingItemListStatusCode All = new SellingItemListStatusCode(_All);
    public static final SellingItemListStatusCode OnSale = new SellingItemListStatusCode(_OnSale);
    public static final SellingItemListStatusCode Pause = new SellingItemListStatusCode(_Pause);
    public static final SellingItemListStatusCode Stop = new SellingItemListStatusCode(_Stop);
    public static final SellingItemListStatusCode Block = new SellingItemListStatusCode(_Block);
    public String getValue() { return _value_;}
    public static SellingItemListStatusCode fromValue(String value)
          throws IllegalArgumentException {
        SellingItemListStatusCode enumeration = (SellingItemListStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SellingItemListStatusCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(SellingItemListStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
