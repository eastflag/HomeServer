/**
 * RegionalMarketT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class RegionalMarketT  implements java.io.Serializable {
    private short seqno;  // attribute

    private String regionalMarketAreaCode;  // attribute

    public RegionalMarketT() {
    }

    public RegionalMarketT(
           short seqno,
           String regionalMarketAreaCode) {
           this.seqno = seqno;
           this.regionalMarketAreaCode = regionalMarketAreaCode;
    }


    /**
     * Gets the seqno value for this RegionalMarketT.
     * 
     * @return seqno
     */
    public short getSeqno() {
        return seqno;
    }


    /**
     * Sets the seqno value for this RegionalMarketT.
     * 
     * @param seqno
     */
    public void setSeqno(short seqno) {
        this.seqno = seqno;
    }


    /**
     * Gets the regionalMarketAreaCode value for this RegionalMarketT.
     * 
     * @return regionalMarketAreaCode
     */
    public String getRegionalMarketAreaCode() {
        return regionalMarketAreaCode;
    }


    /**
     * Sets the regionalMarketAreaCode value for this RegionalMarketT.
     * 
     * @param regionalMarketAreaCode
     */
    public void setRegionalMarketAreaCode(String regionalMarketAreaCode) {
        this.regionalMarketAreaCode = regionalMarketAreaCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RegionalMarketT)) return false;
        RegionalMarketT other = (RegionalMarketT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seqno == other.getSeqno() &&
            ((this.regionalMarketAreaCode==null && other.getRegionalMarketAreaCode()==null) || 
             (this.regionalMarketAreaCode!=null &&
              this.regionalMarketAreaCode.equals(other.getRegionalMarketAreaCode())));
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
        _hashCode += getSeqno();
        if (getRegionalMarketAreaCode() != null) {
            _hashCode += getRegionalMarketAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionalMarketT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RegionalMarketT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("seqno");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Seqno"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("regionalMarketAreaCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RegionalMarketAreaCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
