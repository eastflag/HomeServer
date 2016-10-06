/**
 * ItemStockTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemStockTypeCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemStockTypeCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NotAvailable = "NotAvailable";
    public static final String _BuyerSelective = "BuyerSelective";
    public static final String _BuyerDescriptive = "BuyerDescriptive";
    public static final String _Mixed = "Mixed";
    public static final String _StandAlone = "StandAlone";
    public static final String _StandAloneMixed = "StandAloneMixed";
    public static final String _Calculation = "Calculation";
    public static final String _StandAloneCalculation = "StandAloneCalculation";
    public static final String _ThreeCombination = "ThreeCombination";
    public static final String _ThreeCombinationMixed = "ThreeCombinationMixed";
    public static final String _Ignore = "Ignore";
    public static final ItemStockTypeCode NotAvailable = new ItemStockTypeCode(_NotAvailable);
    public static final ItemStockTypeCode BuyerSelective = new ItemStockTypeCode(_BuyerSelective);
    public static final ItemStockTypeCode BuyerDescriptive = new ItemStockTypeCode(_BuyerDescriptive);
    public static final ItemStockTypeCode Mixed = new ItemStockTypeCode(_Mixed);
    public static final ItemStockTypeCode StandAlone = new ItemStockTypeCode(_StandAlone);
    public static final ItemStockTypeCode StandAloneMixed = new ItemStockTypeCode(_StandAloneMixed);
    public static final ItemStockTypeCode Calculation = new ItemStockTypeCode(_Calculation);
    public static final ItemStockTypeCode StandAloneCalculation = new ItemStockTypeCode(_StandAloneCalculation);
    public static final ItemStockTypeCode ThreeCombination = new ItemStockTypeCode(_ThreeCombination);
    public static final ItemStockTypeCode ThreeCombinationMixed = new ItemStockTypeCode(_ThreeCombinationMixed);
    public static final ItemStockTypeCode Ignore = new ItemStockTypeCode(_Ignore);
    public String getValue() { return _value_;}
    public static ItemStockTypeCode fromValue(String value)
          throws IllegalArgumentException {
        ItemStockTypeCode enumeration = (ItemStockTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ItemStockTypeCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ItemStockTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
