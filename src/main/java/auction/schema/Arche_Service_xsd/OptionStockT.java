/**
 * OptionStockT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class OptionStockT  implements java.io.Serializable {
    private long stockNo;  // attribute

    private String section;  // attribute

    private String text;  // attribute

    private String code;  // attribute

    private java.math.BigDecimal price;  // attribute

    private boolean isDisplayable;  // attribute

    private auction.schema.Arche_Service_xsd.ChangeTypeCode changeType;  // attribute

    private int quantity;  // attribute

    private int stockQty;  // attribute

    public OptionStockT() {
    }

    public OptionStockT(
           long stockNo,
           String section,
           String text,
           String code,
           java.math.BigDecimal price,
           boolean isDisplayable,
           auction.schema.Arche_Service_xsd.ChangeTypeCode changeType,
           int quantity,
           int stockQty) {
           this.stockNo = stockNo;
           this.section = section;
           this.text = text;
           this.code = code;
           this.price = price;
           this.isDisplayable = isDisplayable;
           this.changeType = changeType;
           this.quantity = quantity;
           this.stockQty = stockQty;
    }


    /**
     * Gets the stockNo value for this OptionStockT.
     * 
     * @return stockNo
     */
    public long getStockNo() {
        return stockNo;
    }


    /**
     * Sets the stockNo value for this OptionStockT.
     * 
     * @param stockNo
     */
    public void setStockNo(long stockNo) {
        this.stockNo = stockNo;
    }


    /**
     * Gets the section value for this OptionStockT.
     * 
     * @return section
     */
    public String getSection() {
        return section;
    }


    /**
     * Sets the section value for this OptionStockT.
     * 
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }


    /**
     * Gets the text value for this OptionStockT.
     * 
     * @return text
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the text value for this OptionStockT.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets the code value for this OptionStockT.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OptionStockT.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the price value for this OptionStockT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OptionStockT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the isDisplayable value for this OptionStockT.
     * 
     * @return isDisplayable
     */
    public boolean isIsDisplayable() {
        return isDisplayable;
    }


    /**
     * Sets the isDisplayable value for this OptionStockT.
     * 
     * @param isDisplayable
     */
    public void setIsDisplayable(boolean isDisplayable) {
        this.isDisplayable = isDisplayable;
    }


    /**
     * Gets the changeType value for this OptionStockT.
     * 
     * @return changeType
     */
    public auction.schema.Arche_Service_xsd.ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this OptionStockT.
     * 
     * @param changeType
     */
    public void setChangeType(auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the quantity value for this OptionStockT.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OptionStockT.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the stockQty value for this OptionStockT.
     * 
     * @return stockQty
     */
    public int getStockQty() {
        return stockQty;
    }


    /**
     * Sets the stockQty value for this OptionStockT.
     * 
     * @param stockQty
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OptionStockT)) return false;
        OptionStockT other = (OptionStockT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.stockNo == other.getStockNo() &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            this.isDisplayable == other.isIsDisplayable() &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            this.quantity == other.getQuantity() &&
            this.stockQty == other.getStockQty();
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
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        _hashCode += (isIsDisplayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        _hashCode += getQuantity();
        _hashCode += getStockQty();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OptionStockT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("section");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Section"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("text");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDisplayable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDisplayable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockQty"));
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
