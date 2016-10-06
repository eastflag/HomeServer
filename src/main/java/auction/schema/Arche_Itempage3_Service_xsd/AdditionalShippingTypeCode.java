/**
 * AdditionalShippingTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class AdditionalShippingTypeCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdditionalShippingTypeCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Post = "Post";
    public static final String _StorePickup = "StorePickup";
    public static final String _QuickService = "QuickService";
    public static final AdditionalShippingTypeCode Post = new AdditionalShippingTypeCode(_Post);
    public static final AdditionalShippingTypeCode StorePickup = new AdditionalShippingTypeCode(_StorePickup);
    public static final AdditionalShippingTypeCode QuickService = new AdditionalShippingTypeCode(_QuickService);
    public String getValue() { return _value_;}
    public static AdditionalShippingTypeCode fromValue(String value)
          throws IllegalArgumentException {
        AdditionalShippingTypeCode enumeration = (AdditionalShippingTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AdditionalShippingTypeCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AdditionalShippingTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "AdditionalShippingTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
