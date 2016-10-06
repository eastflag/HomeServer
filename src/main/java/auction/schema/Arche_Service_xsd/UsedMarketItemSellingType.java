/**
 * UsedMarketItemSellingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class UsedMarketItemSellingType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UsedMarketItemSellingType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _AuctionItemsOnly = "AuctionItemsOnly";
    public static final String _FixedPrice = "FixedPrice";
    public static final String _BuyItNow = "BuyItNow";
    public static final UsedMarketItemSellingType AuctionItemsOnly = new UsedMarketItemSellingType(_AuctionItemsOnly);
    public static final UsedMarketItemSellingType FixedPrice = new UsedMarketItemSellingType(_FixedPrice);
    public static final UsedMarketItemSellingType BuyItNow = new UsedMarketItemSellingType(_BuyItNow);
    public String getValue() { return _value_;}
    public static UsedMarketItemSellingType fromValue(String value)
          throws IllegalArgumentException {
        UsedMarketItemSellingType enumeration = (UsedMarketItemSellingType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static UsedMarketItemSellingType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(UsedMarketItemSellingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedMarketItemSellingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
