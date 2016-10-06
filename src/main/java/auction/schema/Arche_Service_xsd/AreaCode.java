/**
 * AreaCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class AreaCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AreaCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Nationwide = "Nationwide";
    public static final String _NationwidExceptIslands = "NationwidExceptIslands";
    public static final String _Seoul = "Seoul";
    public static final String _Busan = "Busan";
    public static final String _Inchon = "Inchon";
    public static final String _Gwangju = "Gwangju";
    public static final String _Daegu = "Daegu";
    public static final String _Daejeon = "Daejeon";
    public static final String _Ulsan = "Ulsan";
    public static final String _Gyeonggi = "Gyeonggi";
    public static final String _Gangwon = "Gangwon";
    public static final String _Chungnam = "Chungnam";
    public static final String _Chungbuk = "Chungbuk";
    public static final String _Gyeongnam = "Gyeongnam";
    public static final String _Gyeongbuk = "Gyeongbuk";
    public static final String _Jeonnam = "Jeonnam";
    public static final String _Jeonbuk = "Jeonbuk";
    public static final String _Jeju = "Jeju";
    public static final String _SeoulGyeonggi = "SeoulGyeonggi";
    public static final String _SeoulGyeonggiDaejeon = "SeoulGyeonggiDaejeon";
    public static final String _ChungCheong = "ChungCheong";
    public static final String _Gyeongsang = "Gyeongsang";
    public static final String _Jeolla = "Jeolla";
    public static final String _BusanUlsan = "BusanUlsan";
    public static final AreaCode Nationwide = new AreaCode(_Nationwide);
    public static final AreaCode NationwidExceptIslands = new AreaCode(_NationwidExceptIslands);
    public static final AreaCode Seoul = new AreaCode(_Seoul);
    public static final AreaCode Busan = new AreaCode(_Busan);
    public static final AreaCode Inchon = new AreaCode(_Inchon);
    public static final AreaCode Gwangju = new AreaCode(_Gwangju);
    public static final AreaCode Daegu = new AreaCode(_Daegu);
    public static final AreaCode Daejeon = new AreaCode(_Daejeon);
    public static final AreaCode Ulsan = new AreaCode(_Ulsan);
    public static final AreaCode Gyeonggi = new AreaCode(_Gyeonggi);
    public static final AreaCode Gangwon = new AreaCode(_Gangwon);
    public static final AreaCode Chungnam = new AreaCode(_Chungnam);
    public static final AreaCode Chungbuk = new AreaCode(_Chungbuk);
    public static final AreaCode Gyeongnam = new AreaCode(_Gyeongnam);
    public static final AreaCode Gyeongbuk = new AreaCode(_Gyeongbuk);
    public static final AreaCode Jeonnam = new AreaCode(_Jeonnam);
    public static final AreaCode Jeonbuk = new AreaCode(_Jeonbuk);
    public static final AreaCode Jeju = new AreaCode(_Jeju);
    public static final AreaCode SeoulGyeonggi = new AreaCode(_SeoulGyeonggi);
    public static final AreaCode SeoulGyeonggiDaejeon = new AreaCode(_SeoulGyeonggiDaejeon);
    public static final AreaCode ChungCheong = new AreaCode(_ChungCheong);
    public static final AreaCode Gyeongsang = new AreaCode(_Gyeongsang);
    public static final AreaCode Jeolla = new AreaCode(_Jeolla);
    public static final AreaCode BusanUlsan = new AreaCode(_BusanUlsan);
    public String getValue() { return _value_;}
    public static AreaCode fromValue(String value)
          throws IllegalArgumentException {
        AreaCode enumeration = (AreaCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AreaCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AreaCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AreaCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
