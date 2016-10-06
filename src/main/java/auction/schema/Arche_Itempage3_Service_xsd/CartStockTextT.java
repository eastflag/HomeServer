/**
 * CartStockTextT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class CartStockTextT  implements java.io.Serializable {
    private int stockTextNo;  // attribute

    private String buyerWriting;  // attribute

    public CartStockTextT() {
    }

    public CartStockTextT(
           int stockTextNo,
           String buyerWriting) {
           this.stockTextNo = stockTextNo;
           this.buyerWriting = buyerWriting;
    }


    /**
     * Gets the stockTextNo value for this CartStockTextT.
     * 
     * @return stockTextNo
     */
    public int getStockTextNo() {
        return stockTextNo;
    }


    /**
     * Sets the stockTextNo value for this CartStockTextT.
     * 
     * @param stockTextNo
     */
    public void setStockTextNo(int stockTextNo) {
        this.stockTextNo = stockTextNo;
    }


    /**
     * Gets the buyerWriting value for this CartStockTextT.
     * 
     * @return buyerWriting
     */
    public String getBuyerWriting() {
        return buyerWriting;
    }


    /**
     * Sets the buyerWriting value for this CartStockTextT.
     * 
     * @param buyerWriting
     */
    public void setBuyerWriting(String buyerWriting) {
        this.buyerWriting = buyerWriting;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CartStockTextT)) return false;
        CartStockTextT other = (CartStockTextT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.stockTextNo == other.getStockTextNo() &&
            ((this.buyerWriting==null && other.getBuyerWriting()==null) || 
             (this.buyerWriting!=null &&
              this.buyerWriting.equals(other.getBuyerWriting())));
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
        _hashCode += getStockTextNo();
        if (getBuyerWriting() != null) {
            _hashCode += getBuyerWriting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartStockTextT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartStockTextT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockTextNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockTextNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerWriting");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerWriting"));
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
