/**
 * StockCalculationT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class StockCalculationT  implements java.io.Serializable {
    private long itemStockCalcNo;  // attribute

    private java.math.BigDecimal unitPrice;  // attribute

    private String claseName1;  // attribute

    private int sellRangeMinValue1;  // attribute

    private int sellRangeMaxValue1;  // attribute

    private String claseName2;  // attribute

    private int sellRangeMinValue2;  // attribute

    private int sellRangeMaxValue2;  // attribute

    private String sellUnitType;  // attribute

    private int sellUnitValue;  // attribute

    private int minSellQty;  // attribute

    private java.math.BigDecimal minSellAmnt;  // attribute

    public StockCalculationT() {
    }

    public StockCalculationT(
           long itemStockCalcNo,
           java.math.BigDecimal unitPrice,
           String claseName1,
           int sellRangeMinValue1,
           int sellRangeMaxValue1,
           String claseName2,
           int sellRangeMinValue2,
           int sellRangeMaxValue2,
           String sellUnitType,
           int sellUnitValue,
           int minSellQty,
           java.math.BigDecimal minSellAmnt) {
           this.itemStockCalcNo = itemStockCalcNo;
           this.unitPrice = unitPrice;
           this.claseName1 = claseName1;
           this.sellRangeMinValue1 = sellRangeMinValue1;
           this.sellRangeMaxValue1 = sellRangeMaxValue1;
           this.claseName2 = claseName2;
           this.sellRangeMinValue2 = sellRangeMinValue2;
           this.sellRangeMaxValue2 = sellRangeMaxValue2;
           this.sellUnitType = sellUnitType;
           this.sellUnitValue = sellUnitValue;
           this.minSellQty = minSellQty;
           this.minSellAmnt = minSellAmnt;
    }


    /**
     * Gets the itemStockCalcNo value for this StockCalculationT.
     * 
     * @return itemStockCalcNo
     */
    public long getItemStockCalcNo() {
        return itemStockCalcNo;
    }


    /**
     * Sets the itemStockCalcNo value for this StockCalculationT.
     * 
     * @param itemStockCalcNo
     */
    public void setItemStockCalcNo(long itemStockCalcNo) {
        this.itemStockCalcNo = itemStockCalcNo;
    }


    /**
     * Gets the unitPrice value for this StockCalculationT.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this StockCalculationT.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the claseName1 value for this StockCalculationT.
     * 
     * @return claseName1
     */
    public String getClaseName1() {
        return claseName1;
    }


    /**
     * Sets the claseName1 value for this StockCalculationT.
     * 
     * @param claseName1
     */
    public void setClaseName1(String claseName1) {
        this.claseName1 = claseName1;
    }


    /**
     * Gets the sellRangeMinValue1 value for this StockCalculationT.
     * 
     * @return sellRangeMinValue1
     */
    public int getSellRangeMinValue1() {
        return sellRangeMinValue1;
    }


    /**
     * Sets the sellRangeMinValue1 value for this StockCalculationT.
     * 
     * @param sellRangeMinValue1
     */
    public void setSellRangeMinValue1(int sellRangeMinValue1) {
        this.sellRangeMinValue1 = sellRangeMinValue1;
    }


    /**
     * Gets the sellRangeMaxValue1 value for this StockCalculationT.
     * 
     * @return sellRangeMaxValue1
     */
    public int getSellRangeMaxValue1() {
        return sellRangeMaxValue1;
    }


    /**
     * Sets the sellRangeMaxValue1 value for this StockCalculationT.
     * 
     * @param sellRangeMaxValue1
     */
    public void setSellRangeMaxValue1(int sellRangeMaxValue1) {
        this.sellRangeMaxValue1 = sellRangeMaxValue1;
    }


    /**
     * Gets the claseName2 value for this StockCalculationT.
     * 
     * @return claseName2
     */
    public String getClaseName2() {
        return claseName2;
    }


    /**
     * Sets the claseName2 value for this StockCalculationT.
     * 
     * @param claseName2
     */
    public void setClaseName2(String claseName2) {
        this.claseName2 = claseName2;
    }


    /**
     * Gets the sellRangeMinValue2 value for this StockCalculationT.
     * 
     * @return sellRangeMinValue2
     */
    public int getSellRangeMinValue2() {
        return sellRangeMinValue2;
    }


    /**
     * Sets the sellRangeMinValue2 value for this StockCalculationT.
     * 
     * @param sellRangeMinValue2
     */
    public void setSellRangeMinValue2(int sellRangeMinValue2) {
        this.sellRangeMinValue2 = sellRangeMinValue2;
    }


    /**
     * Gets the sellRangeMaxValue2 value for this StockCalculationT.
     * 
     * @return sellRangeMaxValue2
     */
    public int getSellRangeMaxValue2() {
        return sellRangeMaxValue2;
    }


    /**
     * Sets the sellRangeMaxValue2 value for this StockCalculationT.
     * 
     * @param sellRangeMaxValue2
     */
    public void setSellRangeMaxValue2(int sellRangeMaxValue2) {
        this.sellRangeMaxValue2 = sellRangeMaxValue2;
    }


    /**
     * Gets the sellUnitType value for this StockCalculationT.
     * 
     * @return sellUnitType
     */
    public String getSellUnitType() {
        return sellUnitType;
    }


    /**
     * Sets the sellUnitType value for this StockCalculationT.
     * 
     * @param sellUnitType
     */
    public void setSellUnitType(String sellUnitType) {
        this.sellUnitType = sellUnitType;
    }


    /**
     * Gets the sellUnitValue value for this StockCalculationT.
     * 
     * @return sellUnitValue
     */
    public int getSellUnitValue() {
        return sellUnitValue;
    }


    /**
     * Sets the sellUnitValue value for this StockCalculationT.
     * 
     * @param sellUnitValue
     */
    public void setSellUnitValue(int sellUnitValue) {
        this.sellUnitValue = sellUnitValue;
    }


    /**
     * Gets the minSellQty value for this StockCalculationT.
     * 
     * @return minSellQty
     */
    public int getMinSellQty() {
        return minSellQty;
    }


    /**
     * Sets the minSellQty value for this StockCalculationT.
     * 
     * @param minSellQty
     */
    public void setMinSellQty(int minSellQty) {
        this.minSellQty = minSellQty;
    }


    /**
     * Gets the minSellAmnt value for this StockCalculationT.
     * 
     * @return minSellAmnt
     */
    public java.math.BigDecimal getMinSellAmnt() {
        return minSellAmnt;
    }


    /**
     * Sets the minSellAmnt value for this StockCalculationT.
     * 
     * @param minSellAmnt
     */
    public void setMinSellAmnt(java.math.BigDecimal minSellAmnt) {
        this.minSellAmnt = minSellAmnt;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StockCalculationT)) return false;
        StockCalculationT other = (StockCalculationT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemStockCalcNo == other.getItemStockCalcNo() &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.claseName1==null && other.getClaseName1()==null) || 
             (this.claseName1!=null &&
              this.claseName1.equals(other.getClaseName1()))) &&
            this.sellRangeMinValue1 == other.getSellRangeMinValue1() &&
            this.sellRangeMaxValue1 == other.getSellRangeMaxValue1() &&
            ((this.claseName2==null && other.getClaseName2()==null) || 
             (this.claseName2!=null &&
              this.claseName2.equals(other.getClaseName2()))) &&
            this.sellRangeMinValue2 == other.getSellRangeMinValue2() &&
            this.sellRangeMaxValue2 == other.getSellRangeMaxValue2() &&
            ((this.sellUnitType==null && other.getSellUnitType()==null) || 
             (this.sellUnitType!=null &&
              this.sellUnitType.equals(other.getSellUnitType()))) &&
            this.sellUnitValue == other.getSellUnitValue() &&
            this.minSellQty == other.getMinSellQty() &&
            ((this.minSellAmnt==null && other.getMinSellAmnt()==null) || 
             (this.minSellAmnt!=null &&
              this.minSellAmnt.equals(other.getMinSellAmnt())));
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
        _hashCode += new Long(getItemStockCalcNo()).hashCode();
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getClaseName1() != null) {
            _hashCode += getClaseName1().hashCode();
        }
        _hashCode += getSellRangeMinValue1();
        _hashCode += getSellRangeMaxValue1();
        if (getClaseName2() != null) {
            _hashCode += getClaseName2().hashCode();
        }
        _hashCode += getSellRangeMinValue2();
        _hashCode += getSellRangeMaxValue2();
        if (getSellUnitType() != null) {
            _hashCode += getSellUnitType().hashCode();
        }
        _hashCode += getSellUnitValue();
        _hashCode += getMinSellQty();
        if (getMinSellAmnt() != null) {
            _hashCode += getMinSellAmnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockCalculationT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockCalculationT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemStockCalcNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemStockCalcNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unitPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UnitPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellRangeMinValue1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellRangeMinValue1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellRangeMaxValue1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellRangeMaxValue1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellRangeMinValue2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellRangeMinValue2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellRangeMaxValue2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellRangeMaxValue2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellUnitType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellUnitType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellUnitValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellUnitValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minSellQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinSellQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minSellAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinSellAmnt"));
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
