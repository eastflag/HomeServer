/**
 * CartDetailT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class CartDetailT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] cartDetailText;

    private long cartDetailNo;  // attribute

    private long stockNo;  // attribute

    private int stockQty;  // attribute

    private int requestQty;  // attribute

    private java.math.BigDecimal requestPrice;  // attribute

    private String requestName;  // attribute

    public CartDetailT() {
    }

    public CartDetailT(
           auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] cartDetailText,
           long cartDetailNo,
           long stockNo,
           int stockQty,
           int requestQty,
           java.math.BigDecimal requestPrice,
           String requestName) {
           this.cartDetailText = cartDetailText;
           this.cartDetailNo = cartDetailNo;
           this.stockNo = stockNo;
           this.stockQty = stockQty;
           this.requestQty = requestQty;
           this.requestPrice = requestPrice;
           this.requestName = requestName;
    }


    /**
     * Gets the cartDetailText value for this CartDetailT.
     * 
     * @return cartDetailText
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] getCartDetailText() {
        return cartDetailText;
    }


    /**
     * Sets the cartDetailText value for this CartDetailT.
     * 
     * @param cartDetailText
     */
    public void setCartDetailText(auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] cartDetailText) {
        this.cartDetailText = cartDetailText;
    }

    public auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT getCartDetailText(int i) {
        return this.cartDetailText[i];
    }

    public void setCartDetailText(int i, auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT _value) {
        this.cartDetailText[i] = _value;
    }


    /**
     * Gets the cartDetailNo value for this CartDetailT.
     * 
     * @return cartDetailNo
     */
    public long getCartDetailNo() {
        return cartDetailNo;
    }


    /**
     * Sets the cartDetailNo value for this CartDetailT.
     * 
     * @param cartDetailNo
     */
    public void setCartDetailNo(long cartDetailNo) {
        this.cartDetailNo = cartDetailNo;
    }


    /**
     * Gets the stockNo value for this CartDetailT.
     * 
     * @return stockNo
     */
    public long getStockNo() {
        return stockNo;
    }


    /**
     * Sets the stockNo value for this CartDetailT.
     * 
     * @param stockNo
     */
    public void setStockNo(long stockNo) {
        this.stockNo = stockNo;
    }


    /**
     * Gets the stockQty value for this CartDetailT.
     * 
     * @return stockQty
     */
    public int getStockQty() {
        return stockQty;
    }


    /**
     * Sets the stockQty value for this CartDetailT.
     * 
     * @param stockQty
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }


    /**
     * Gets the requestQty value for this CartDetailT.
     * 
     * @return requestQty
     */
    public int getRequestQty() {
        return requestQty;
    }


    /**
     * Sets the requestQty value for this CartDetailT.
     * 
     * @param requestQty
     */
    public void setRequestQty(int requestQty) {
        this.requestQty = requestQty;
    }


    /**
     * Gets the requestPrice value for this CartDetailT.
     * 
     * @return requestPrice
     */
    public java.math.BigDecimal getRequestPrice() {
        return requestPrice;
    }


    /**
     * Sets the requestPrice value for this CartDetailT.
     * 
     * @param requestPrice
     */
    public void setRequestPrice(java.math.BigDecimal requestPrice) {
        this.requestPrice = requestPrice;
    }


    /**
     * Gets the requestName value for this CartDetailT.
     * 
     * @return requestName
     */
    public String getRequestName() {
        return requestName;
    }


    /**
     * Sets the requestName value for this CartDetailT.
     * 
     * @param requestName
     */
    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CartDetailT)) return false;
        CartDetailT other = (CartDetailT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartDetailText==null && other.getCartDetailText()==null) || 
             (this.cartDetailText!=null &&
              java.util.Arrays.equals(this.cartDetailText, other.getCartDetailText()))) &&
            this.cartDetailNo == other.getCartDetailNo() &&
            this.stockNo == other.getStockNo() &&
            this.stockQty == other.getStockQty() &&
            this.requestQty == other.getRequestQty() &&
            ((this.requestPrice==null && other.getRequestPrice()==null) || 
             (this.requestPrice!=null &&
              this.requestPrice.equals(other.getRequestPrice()))) &&
            ((this.requestName==null && other.getRequestName()==null) || 
             (this.requestName!=null &&
              this.requestName.equals(other.getRequestName())));
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
        if (getCartDetailText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartDetailText());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCartDetailText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCartDetailNo()).hashCode();
        _hashCode += new Long(getStockNo()).hashCode();
        _hashCode += getStockQty();
        _hashCode += getRequestQty();
        if (getRequestPrice() != null) {
            _hashCode += getRequestPrice().hashCode();
        }
        if (getRequestName() != null) {
            _hashCode += getRequestName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartDetailT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cartDetailNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CartDetailNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RequestQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RequestPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RequestName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartDetailText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailTextT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
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
