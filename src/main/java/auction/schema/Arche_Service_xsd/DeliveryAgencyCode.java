/**
 * DeliveryAgencyCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class DeliveryAgencyCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeliveryAgencyCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _korex = "korex";
    public static final String _hyundai = "hyundai";
    public static final String _epost = "epost";
    public static final String _dongbu = "dongbu";
    public static final String _hth = "hth";
    public static final String _ajutb = "ajutb";
    public static final String _cjgls = "cjgls";
    public static final String _kgb = "kgb";
    public static final String _yellow = "yellow";
    public static final String _hanjin = "hanjin";
    public static final String _kgbsl = "kgbsl";
    public static final String _kgbls = "kgbls";
    public static final String _bellexpress = "bellexpress";
    public static final String _hanaro = "hanaro";
    public static final String _sagawa = "sagawa";
    public static final String _ktlogistics = "ktlogistics";
    public static final String _sedex = "sedex";
    public static final String _gmgls = "gmgls";
    public static final String _nedex = "nedex";
    public static final String _etc = "etc";
    public static final String _chonil = "chonil";
    public static final String _daesin = "daesin";
    public static final String _gtx = "gtx";
    public static final String _ilyang = "ilyang";
    public static final String _innogis = "innogis";
    public static final String _kyungdong = "kyungdong";
    public static final String _hapdong = "hapdong";
    public static final String _winia = "winia";
    public static final String _slx = "slx";
    public static final DeliveryAgencyCode korex = new DeliveryAgencyCode(_korex);
    public static final DeliveryAgencyCode hyundai = new DeliveryAgencyCode(_hyundai);
    public static final DeliveryAgencyCode epost = new DeliveryAgencyCode(_epost);
    public static final DeliveryAgencyCode dongbu = new DeliveryAgencyCode(_dongbu);
    public static final DeliveryAgencyCode hth = new DeliveryAgencyCode(_hth);
    public static final DeliveryAgencyCode ajutb = new DeliveryAgencyCode(_ajutb);
    public static final DeliveryAgencyCode cjgls = new DeliveryAgencyCode(_cjgls);
    public static final DeliveryAgencyCode kgb = new DeliveryAgencyCode(_kgb);
    public static final DeliveryAgencyCode yellow = new DeliveryAgencyCode(_yellow);
    public static final DeliveryAgencyCode hanjin = new DeliveryAgencyCode(_hanjin);
    public static final DeliveryAgencyCode kgbsl = new DeliveryAgencyCode(_kgbsl);
    public static final DeliveryAgencyCode kgbls = new DeliveryAgencyCode(_kgbls);
    public static final DeliveryAgencyCode bellexpress = new DeliveryAgencyCode(_bellexpress);
    public static final DeliveryAgencyCode hanaro = new DeliveryAgencyCode(_hanaro);
    public static final DeliveryAgencyCode sagawa = new DeliveryAgencyCode(_sagawa);
    public static final DeliveryAgencyCode ktlogistics = new DeliveryAgencyCode(_ktlogistics);
    public static final DeliveryAgencyCode sedex = new DeliveryAgencyCode(_sedex);
    public static final DeliveryAgencyCode gmgls = new DeliveryAgencyCode(_gmgls);
    public static final DeliveryAgencyCode nedex = new DeliveryAgencyCode(_nedex);
    public static final DeliveryAgencyCode etc = new DeliveryAgencyCode(_etc);
    public static final DeliveryAgencyCode chonil = new DeliveryAgencyCode(_chonil);
    public static final DeliveryAgencyCode daesin = new DeliveryAgencyCode(_daesin);
    public static final DeliveryAgencyCode gtx = new DeliveryAgencyCode(_gtx);
    public static final DeliveryAgencyCode ilyang = new DeliveryAgencyCode(_ilyang);
    public static final DeliveryAgencyCode innogis = new DeliveryAgencyCode(_innogis);
    public static final DeliveryAgencyCode kyungdong = new DeliveryAgencyCode(_kyungdong);
    public static final DeliveryAgencyCode hapdong = new DeliveryAgencyCode(_hapdong);
    public static final DeliveryAgencyCode winia = new DeliveryAgencyCode(_winia);
    public static final DeliveryAgencyCode slx = new DeliveryAgencyCode(_slx);
    public String getValue() { return _value_;}
    public static DeliveryAgencyCode fromValue(String value)
          throws IllegalArgumentException {
        DeliveryAgencyCode enumeration = (DeliveryAgencyCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DeliveryAgencyCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DeliveryAgencyCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliveryAgencyCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
