/**
 * QuickServiceAreaCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class QuickServiceAreaCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuickServiceAreaCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Seoul = "Seoul";
    public static final String _Gyeonggi = "Gyeonggi";
    public static final String _GoYang = "GoYang";
    public static final String _GoChon = "GoChon";
    public static final String _GonJiAM = "GonJiAM";
    public static final String _GwaCheon = "GwaCheon";
    public static final String _GwangMyung = "GwangMyung";
    public static final String _GwangJu = "GwangJu";
    public static final String _GyoMunRi = "GyoMunRi";
    public static final String _GuRi = "GuRi";
    public static final String _GuSeong = "GuSeong";
    public static final String _GunPo = "GunPo";
    public static final String _GimPo = "GimPo";
    public static final String _BuCheon = "BuCheon";
    public static final String _BunDang = "BunDang";
    public static final String _SeongNam = "SeongNam";
    public static final String _SuWon = "SuWon";
    public static final String _SuJi = "SuJi";
    public static final String _SiHeung = "SiHeung";
    public static final String _AnSan = "AnSan";
    public static final String _AnYang = "AnYang";
    public static final String _YongIn = "YongIn";
    public static final String _UiWang = "UiWang";
    public static final String _UiJeongBu = "UiJeongBu";
    public static final String _ICheon = "ICheon";
    public static final String _IlSan = "IlSan";
    public static final String _JiChuk = "JiChuk";
    public static final String _PaJu = "PaJu";
    public static final String _HaNam = "HaNam";
    public static final String _Inchon = "Inchon";
    public static final String _Daejeon = "Daejeon";
    public static final String _Gwangju = "Gwangju";
    public static final String _Ulsan = "Ulsan";
    public static final String _Busan = "Busan";
    public static final String _Daegu = "Daegu";
    public static final QuickServiceAreaCode Seoul = new QuickServiceAreaCode(_Seoul);
    public static final QuickServiceAreaCode Gyeonggi = new QuickServiceAreaCode(_Gyeonggi);
    public static final QuickServiceAreaCode GoYang = new QuickServiceAreaCode(_GoYang);
    public static final QuickServiceAreaCode GoChon = new QuickServiceAreaCode(_GoChon);
    public static final QuickServiceAreaCode GonJiAM = new QuickServiceAreaCode(_GonJiAM);
    public static final QuickServiceAreaCode GwaCheon = new QuickServiceAreaCode(_GwaCheon);
    public static final QuickServiceAreaCode GwangMyung = new QuickServiceAreaCode(_GwangMyung);
    public static final QuickServiceAreaCode GwangJu = new QuickServiceAreaCode(_GwangJu);
    public static final QuickServiceAreaCode GyoMunRi = new QuickServiceAreaCode(_GyoMunRi);
    public static final QuickServiceAreaCode GuRi = new QuickServiceAreaCode(_GuRi);
    public static final QuickServiceAreaCode GuSeong = new QuickServiceAreaCode(_GuSeong);
    public static final QuickServiceAreaCode GunPo = new QuickServiceAreaCode(_GunPo);
    public static final QuickServiceAreaCode GimPo = new QuickServiceAreaCode(_GimPo);
    public static final QuickServiceAreaCode BuCheon = new QuickServiceAreaCode(_BuCheon);
    public static final QuickServiceAreaCode BunDang = new QuickServiceAreaCode(_BunDang);
    public static final QuickServiceAreaCode SeongNam = new QuickServiceAreaCode(_SeongNam);
    public static final QuickServiceAreaCode SuWon = new QuickServiceAreaCode(_SuWon);
    public static final QuickServiceAreaCode SuJi = new QuickServiceAreaCode(_SuJi);
    public static final QuickServiceAreaCode SiHeung = new QuickServiceAreaCode(_SiHeung);
    public static final QuickServiceAreaCode AnSan = new QuickServiceAreaCode(_AnSan);
    public static final QuickServiceAreaCode AnYang = new QuickServiceAreaCode(_AnYang);
    public static final QuickServiceAreaCode YongIn = new QuickServiceAreaCode(_YongIn);
    public static final QuickServiceAreaCode UiWang = new QuickServiceAreaCode(_UiWang);
    public static final QuickServiceAreaCode UiJeongBu = new QuickServiceAreaCode(_UiJeongBu);
    public static final QuickServiceAreaCode ICheon = new QuickServiceAreaCode(_ICheon);
    public static final QuickServiceAreaCode IlSan = new QuickServiceAreaCode(_IlSan);
    public static final QuickServiceAreaCode JiChuk = new QuickServiceAreaCode(_JiChuk);
    public static final QuickServiceAreaCode PaJu = new QuickServiceAreaCode(_PaJu);
    public static final QuickServiceAreaCode HaNam = new QuickServiceAreaCode(_HaNam);
    public static final QuickServiceAreaCode Inchon = new QuickServiceAreaCode(_Inchon);
    public static final QuickServiceAreaCode Daejeon = new QuickServiceAreaCode(_Daejeon);
    public static final QuickServiceAreaCode Gwangju = new QuickServiceAreaCode(_Gwangju);
    public static final QuickServiceAreaCode Ulsan = new QuickServiceAreaCode(_Ulsan);
    public static final QuickServiceAreaCode Busan = new QuickServiceAreaCode(_Busan);
    public static final QuickServiceAreaCode Daegu = new QuickServiceAreaCode(_Daegu);
    public String getValue() { return _value_;}
    public static QuickServiceAreaCode fromValue(String value)
          throws IllegalArgumentException {
        QuickServiceAreaCode enumeration = (QuickServiceAreaCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static QuickServiceAreaCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(QuickServiceAreaCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "QuickServiceAreaCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
