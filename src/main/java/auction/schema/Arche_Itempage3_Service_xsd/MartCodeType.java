/**
 * MartCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class MartCodeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MartCodeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EMart = "EMart";
    public static final String _HomePlus = "HomePlus";
    public static final String _LotteMart = "LotteMart";
    public static final String _LotteSuper = "LotteSuper";
    public static final String _Etc = "Etc";
    public static final MartCodeType EMart = new MartCodeType(_EMart);
    public static final MartCodeType HomePlus = new MartCodeType(_HomePlus);
    public static final MartCodeType LotteMart = new MartCodeType(_LotteMart);
    public static final MartCodeType LotteSuper = new MartCodeType(_LotteSuper);
    public static final MartCodeType Etc = new MartCodeType(_Etc);
    public String getValue() { return _value_;}
    public static MartCodeType fromValue(String value)
          throws IllegalArgumentException {
        MartCodeType enumeration = (MartCodeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static MartCodeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(MartCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "MartCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
