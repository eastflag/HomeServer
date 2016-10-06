/**
 * ItemFreeExperienceListSortCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemFreeExperienceListSortCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFreeExperienceListSortCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _R = "R";
    public static final String _C = "C";
    public static final String _E = "E";
    public static final ItemFreeExperienceListSortCode R = new ItemFreeExperienceListSortCode(_R);
    public static final ItemFreeExperienceListSortCode C = new ItemFreeExperienceListSortCode(_C);
    public static final ItemFreeExperienceListSortCode E = new ItemFreeExperienceListSortCode(_E);
    public String getValue() { return _value_;}
    public static ItemFreeExperienceListSortCode fromValue(String value)
          throws IllegalArgumentException {
        ItemFreeExperienceListSortCode enumeration = (ItemFreeExperienceListSortCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ItemFreeExperienceListSortCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ItemFreeExperienceListSortCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceListSortCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
