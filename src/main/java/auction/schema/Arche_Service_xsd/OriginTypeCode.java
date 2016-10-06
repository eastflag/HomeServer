/**
 * OriginTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class OriginTypeCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OriginTypeCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Domestic = "Domestic";
    public static final String _Imported = "Imported";
    public static final String _Unknown = "Unknown";
    public static final String _CoastalWaters = "CoastalWaters";
    public static final String _Ocean = "Ocean";
    public static final OriginTypeCode Domestic = new OriginTypeCode(_Domestic);
    public static final OriginTypeCode Imported = new OriginTypeCode(_Imported);
    public static final OriginTypeCode Unknown = new OriginTypeCode(_Unknown);
    public static final OriginTypeCode CoastalWaters = new OriginTypeCode(_CoastalWaters);
    public static final OriginTypeCode Ocean = new OriginTypeCode(_Ocean);
    public String getValue() { return _value_;}
    public static OriginTypeCode fromValue(String value)
          throws IllegalArgumentException {
        OriginTypeCode enumeration = (OriginTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static OriginTypeCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(OriginTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OriginTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
