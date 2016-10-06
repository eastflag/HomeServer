/**
 * FeatureTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class FeatureTypeCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeatureTypeCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _PhotoFocus = "PhotoFocus";
    public static final String _Premium = "Premium";
    public static final String _PremiumPlus = "PremiumPlus";
    public static final String _Spotlight = "Spotlight";
    public static final String _BoldTitle = "BoldTitle";
    public static final String _Recommendation = "Recommendation";
    public static final String _SpecialPricePlus = "SpecialPricePlus";
    public static final String _AllKill = "AllKill";
    public static final FeatureTypeCode PhotoFocus = new FeatureTypeCode(_PhotoFocus);
    public static final FeatureTypeCode Premium = new FeatureTypeCode(_Premium);
    public static final FeatureTypeCode PremiumPlus = new FeatureTypeCode(_PremiumPlus);
    public static final FeatureTypeCode Spotlight = new FeatureTypeCode(_Spotlight);
    public static final FeatureTypeCode BoldTitle = new FeatureTypeCode(_BoldTitle);
    public static final FeatureTypeCode Recommendation = new FeatureTypeCode(_Recommendation);
    public static final FeatureTypeCode SpecialPricePlus = new FeatureTypeCode(_SpecialPricePlus);
    public static final FeatureTypeCode AllKill = new FeatureTypeCode(_AllKill);
    public String getValue() { return _value_;}
    public static FeatureTypeCode fromValue(String value)
          throws IllegalArgumentException {
        FeatureTypeCode enumeration = (FeatureTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static FeatureTypeCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(FeatureTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FeatureTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
