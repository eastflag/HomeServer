/**
 * UsedHistoryT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class UsedHistoryT  implements java.io.Serializable {
    private short usedMonth;  // attribute

    private java.math.BigDecimal buyPrice;  // attribute

    public UsedHistoryT() {
    }

    public UsedHistoryT(
           short usedMonth,
           java.math.BigDecimal buyPrice) {
           this.usedMonth = usedMonth;
           this.buyPrice = buyPrice;
    }


    /**
     * Gets the usedMonth value for this UsedHistoryT.
     * 
     * @return usedMonth
     */
    public short getUsedMonth() {
        return usedMonth;
    }


    /**
     * Sets the usedMonth value for this UsedHistoryT.
     * 
     * @param usedMonth
     */
    public void setUsedMonth(short usedMonth) {
        this.usedMonth = usedMonth;
    }


    /**
     * Gets the buyPrice value for this UsedHistoryT.
     * 
     * @return buyPrice
     */
    public java.math.BigDecimal getBuyPrice() {
        return buyPrice;
    }


    /**
     * Sets the buyPrice value for this UsedHistoryT.
     * 
     * @param buyPrice
     */
    public void setBuyPrice(java.math.BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UsedHistoryT)) return false;
        UsedHistoryT other = (UsedHistoryT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.usedMonth == other.getUsedMonth() &&
            ((this.buyPrice==null && other.getBuyPrice()==null) || 
             (this.buyPrice!=null &&
              this.buyPrice.equals(other.getBuyPrice())));
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
        _hashCode += getUsedMonth();
        if (getBuyPrice() != null) {
            _hashCode += getBuyPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsedHistoryT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "UsedHistoryT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("usedMonth");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UsedMonth"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
