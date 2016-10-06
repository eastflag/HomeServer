/**
 * TestDTCTRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.IAC_Buy_API_xsd;

public class TestDTCTRequestT  implements java.io.Serializable {
    private long seqNo;  // attribute

    private int value;  // attribute

    private long seqNo2;  // attribute

    private int value2;  // attribute

    public TestDTCTRequestT() {
    }

    public TestDTCTRequestT(
           long seqNo,
           int value,
           long seqNo2,
           int value2) {
           this.seqNo = seqNo;
           this.value = value;
           this.seqNo2 = seqNo2;
           this.value2 = value2;
    }


    /**
     * Gets the seqNo value for this TestDTCTRequestT.
     * 
     * @return seqNo
     */
    public long getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this TestDTCTRequestT.
     * 
     * @param seqNo
     */
    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the value value for this TestDTCTRequestT.
     * 
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this TestDTCTRequestT.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }


    /**
     * Gets the seqNo2 value for this TestDTCTRequestT.
     * 
     * @return seqNo2
     */
    public long getSeqNo2() {
        return seqNo2;
    }


    /**
     * Sets the seqNo2 value for this TestDTCTRequestT.
     * 
     * @param seqNo2
     */
    public void setSeqNo2(long seqNo2) {
        this.seqNo2 = seqNo2;
    }


    /**
     * Gets the value2 value for this TestDTCTRequestT.
     * 
     * @return value2
     */
    public int getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this TestDTCTRequestT.
     * 
     * @param value2
     */
    public void setValue2(int value2) {
        this.value2 = value2;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TestDTCTRequestT)) return false;
        TestDTCTRequestT other = (TestDTCTRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seqNo == other.getSeqNo() &&
            this.value == other.getValue() &&
            this.seqNo2 == other.getSeqNo2() &&
            this.value2 == other.getValue2();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getSeqNo()).hashCode();
        _hashCode += getValue();
        _hashCode += new Long(getSeqNo2()).hashCode();
        _hashCode += getValue2();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestDTCTRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/IAC.Buy.API.xsd", "TestDTCTRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqNo2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeqNo2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Value2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
