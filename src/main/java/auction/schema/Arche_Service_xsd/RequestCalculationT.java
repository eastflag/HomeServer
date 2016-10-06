/**
 * RequestCalculationT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class RequestCalculationT  implements java.io.Serializable {
    private long stockNo;  // attribute

    private long itemStockCalcNo;  // attribute

    private int buyerInsValue1;  // attribute

    private int buyerInsValue2;  // attribute

    private int qty;  // attribute

    public RequestCalculationT() {
    }

    public RequestCalculationT(
           long stockNo,
           long itemStockCalcNo,
           int buyerInsValue1,
           int buyerInsValue2,
           int qty) {
           this.stockNo = stockNo;
           this.itemStockCalcNo = itemStockCalcNo;
           this.buyerInsValue1 = buyerInsValue1;
           this.buyerInsValue2 = buyerInsValue2;
           this.qty = qty;
    }


    /**
     * Gets the stockNo value for this RequestCalculationT.
     * 
     * @return stockNo
     */
    public long getStockNo() {
        return stockNo;
    }


    /**
     * Sets the stockNo value for this RequestCalculationT.
     * 
     * @param stockNo
     */
    public void setStockNo(long stockNo) {
        this.stockNo = stockNo;
    }


    /**
     * Gets the itemStockCalcNo value for this RequestCalculationT.
     * 
     * @return itemStockCalcNo
     */
    public long getItemStockCalcNo() {
        return itemStockCalcNo;
    }


    /**
     * Sets the itemStockCalcNo value for this RequestCalculationT.
     * 
     * @param itemStockCalcNo
     */
    public void setItemStockCalcNo(long itemStockCalcNo) {
        this.itemStockCalcNo = itemStockCalcNo;
    }


    /**
     * Gets the buyerInsValue1 value for this RequestCalculationT.
     * 
     * @return buyerInsValue1
     */
    public int getBuyerInsValue1() {
        return buyerInsValue1;
    }


    /**
     * Sets the buyerInsValue1 value for this RequestCalculationT.
     * 
     * @param buyerInsValue1
     */
    public void setBuyerInsValue1(int buyerInsValue1) {
        this.buyerInsValue1 = buyerInsValue1;
    }


    /**
     * Gets the buyerInsValue2 value for this RequestCalculationT.
     * 
     * @return buyerInsValue2
     */
    public int getBuyerInsValue2() {
        return buyerInsValue2;
    }


    /**
     * Sets the buyerInsValue2 value for this RequestCalculationT.
     * 
     * @param buyerInsValue2
     */
    public void setBuyerInsValue2(int buyerInsValue2) {
        this.buyerInsValue2 = buyerInsValue2;
    }


    /**
     * Gets the qty value for this RequestCalculationT.
     * 
     * @return qty
     */
    public int getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this RequestCalculationT.
     * 
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestCalculationT)) return false;
        RequestCalculationT other = (RequestCalculationT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.stockNo == other.getStockNo() &&
            this.itemStockCalcNo == other.getItemStockCalcNo() &&
            this.buyerInsValue1 == other.getBuyerInsValue1() &&
            this.buyerInsValue2 == other.getBuyerInsValue2() &&
            this.qty == other.getQty();
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
        _hashCode += new Long(getStockNo()).hashCode();
        _hashCode += new Long(getItemStockCalcNo()).hashCode();
        _hashCode += getBuyerInsValue1();
        _hashCode += getBuyerInsValue2();
        _hashCode += getQty();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestCalculationT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RequestCalculationT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemStockCalcNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemStockCalcNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerInsValue1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerInsValue1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerInsValue2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerInsValue2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Qty"));
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
