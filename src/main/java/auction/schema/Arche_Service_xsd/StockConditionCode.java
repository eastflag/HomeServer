/**
 * StockConditionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class StockConditionCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StockConditionCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Empty = "Empty";
    public static final String _Exist = "Exist";
    public static final String _UnderTen = "UnderTen";
    public static final String _UnderFifty = "UnderFifty";
    public static final String _UnderOneHundred = "UnderOneHundred";
    public static final StockConditionCode Empty = new StockConditionCode(_Empty);
    public static final StockConditionCode Exist = new StockConditionCode(_Exist);
    public static final StockConditionCode UnderTen = new StockConditionCode(_UnderTen);
    public static final StockConditionCode UnderFifty = new StockConditionCode(_UnderFifty);
    public static final StockConditionCode UnderOneHundred = new StockConditionCode(_UnderOneHundred);
    public String getValue() { return _value_;}
    public static StockConditionCode fromValue(String value)
          throws IllegalArgumentException {
        StockConditionCode enumeration = (StockConditionCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static StockConditionCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(StockConditionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockConditionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
