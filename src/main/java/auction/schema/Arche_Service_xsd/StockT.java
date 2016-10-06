/**
 * StockT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class StockT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.SkuInfoT[] skuInfo;

    private long stockNo;  // attribute

    private String section;  // attribute

    private long objOptClaseNo1;  // attribute

    private String text;  // attribute

    private long objOptClaseNo2;  // attribute

    private String text2;  // attribute

    private long objOptClaseNo3;  // attribute

    private String code;  // attribute

    private int quantity;  // attribute

    private java.math.BigDecimal price;  // attribute

    private boolean isDisplayable;  // attribute

    private auction.schema.Arche_Service_xsd.ChangeTypeCode changeType;  // attribute

    private int stockQty;  // attribute

    private String imageUrl;  // attribute

    private long stockMasterSeqNo;  // attribute

    private String standAloneStockSeqNo;  // attribute

    private int imageWidth;  // attribute

    private int imageHeight;  // attribute

    private long skuMatchingVerNo;  // attribute

    private long singleOptSeqNo;  // attribute

    public StockT() {
    }

    public StockT(
           auction.schema.Arche_Service_xsd.SkuInfoT[] skuInfo,
           long stockNo,
           String section,
           long objOptClaseNo1,
           String text,
           long objOptClaseNo2,
           String text2,
           long objOptClaseNo3,
           String code,
           int quantity,
           java.math.BigDecimal price,
           boolean isDisplayable,
           auction.schema.Arche_Service_xsd.ChangeTypeCode changeType,
           int stockQty,
           String imageUrl,
           long stockMasterSeqNo,
           String standAloneStockSeqNo,
           int imageWidth,
           int imageHeight,
           long skuMatchingVerNo,
           long singleOptSeqNo) {
           this.skuInfo = skuInfo;
           this.stockNo = stockNo;
           this.section = section;
           this.objOptClaseNo1 = objOptClaseNo1;
           this.text = text;
           this.objOptClaseNo2 = objOptClaseNo2;
           this.text2 = text2;
           this.objOptClaseNo3 = objOptClaseNo3;
           this.code = code;
           this.quantity = quantity;
           this.price = price;
           this.isDisplayable = isDisplayable;
           this.changeType = changeType;
           this.stockQty = stockQty;
           this.imageUrl = imageUrl;
           this.stockMasterSeqNo = stockMasterSeqNo;
           this.standAloneStockSeqNo = standAloneStockSeqNo;
           this.imageWidth = imageWidth;
           this.imageHeight = imageHeight;
           this.skuMatchingVerNo = skuMatchingVerNo;
           this.singleOptSeqNo = singleOptSeqNo;
    }


    /**
     * Gets the skuInfo value for this StockT.
     * 
     * @return skuInfo
     */
    public auction.schema.Arche_Service_xsd.SkuInfoT[] getSkuInfo() {
        return skuInfo;
    }


    /**
     * Sets the skuInfo value for this StockT.
     * 
     * @param skuInfo
     */
    public void setSkuInfo(auction.schema.Arche_Service_xsd.SkuInfoT[] skuInfo) {
        this.skuInfo = skuInfo;
    }

    public auction.schema.Arche_Service_xsd.SkuInfoT getSkuInfo(int i) {
        return this.skuInfo[i];
    }

    public void setSkuInfo(int i, auction.schema.Arche_Service_xsd.SkuInfoT _value) {
        this.skuInfo[i] = _value;
    }


    /**
     * Gets the stockNo value for this StockT.
     * 
     * @return stockNo
     */
    public long getStockNo() {
        return stockNo;
    }


    /**
     * Sets the stockNo value for this StockT.
     * 
     * @param stockNo
     */
    public void setStockNo(long stockNo) {
        this.stockNo = stockNo;
    }


    /**
     * Gets the section value for this StockT.
     * 
     * @return section
     */
    public String getSection() {
        return section;
    }


    /**
     * Sets the section value for this StockT.
     * 
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }


    /**
     * Gets the objOptClaseNo1 value for this StockT.
     * 
     * @return objOptClaseNo1
     */
    public long getObjOptClaseNo1() {
        return objOptClaseNo1;
    }


    /**
     * Sets the objOptClaseNo1 value for this StockT.
     * 
     * @param objOptClaseNo1
     */
    public void setObjOptClaseNo1(long objOptClaseNo1) {
        this.objOptClaseNo1 = objOptClaseNo1;
    }


    /**
     * Gets the text value for this StockT.
     * 
     * @return text
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the text value for this StockT.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets the objOptClaseNo2 value for this StockT.
     * 
     * @return objOptClaseNo2
     */
    public long getObjOptClaseNo2() {
        return objOptClaseNo2;
    }


    /**
     * Sets the objOptClaseNo2 value for this StockT.
     * 
     * @param objOptClaseNo2
     */
    public void setObjOptClaseNo2(long objOptClaseNo2) {
        this.objOptClaseNo2 = objOptClaseNo2;
    }


    /**
     * Gets the text2 value for this StockT.
     * 
     * @return text2
     */
    public String getText2() {
        return text2;
    }


    /**
     * Sets the text2 value for this StockT.
     * 
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }


    /**
     * Gets the objOptClaseNo3 value for this StockT.
     * 
     * @return objOptClaseNo3
     */
    public long getObjOptClaseNo3() {
        return objOptClaseNo3;
    }


    /**
     * Sets the objOptClaseNo3 value for this StockT.
     * 
     * @param objOptClaseNo3
     */
    public void setObjOptClaseNo3(long objOptClaseNo3) {
        this.objOptClaseNo3 = objOptClaseNo3;
    }


    /**
     * Gets the code value for this StockT.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this StockT.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the quantity value for this StockT.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this StockT.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the price value for this StockT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this StockT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the isDisplayable value for this StockT.
     * 
     * @return isDisplayable
     */
    public boolean isIsDisplayable() {
        return isDisplayable;
    }


    /**
     * Sets the isDisplayable value for this StockT.
     * 
     * @param isDisplayable
     */
    public void setIsDisplayable(boolean isDisplayable) {
        this.isDisplayable = isDisplayable;
    }


    /**
     * Gets the changeType value for this StockT.
     * 
     * @return changeType
     */
    public auction.schema.Arche_Service_xsd.ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this StockT.
     * 
     * @param changeType
     */
    public void setChangeType(auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the stockQty value for this StockT.
     * 
     * @return stockQty
     */
    public int getStockQty() {
        return stockQty;
    }


    /**
     * Sets the stockQty value for this StockT.
     * 
     * @param stockQty
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }


    /**
     * Gets the imageUrl value for this StockT.
     * 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this StockT.
     * 
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the stockMasterSeqNo value for this StockT.
     * 
     * @return stockMasterSeqNo
     */
    public long getStockMasterSeqNo() {
        return stockMasterSeqNo;
    }


    /**
     * Sets the stockMasterSeqNo value for this StockT.
     * 
     * @param stockMasterSeqNo
     */
    public void setStockMasterSeqNo(long stockMasterSeqNo) {
        this.stockMasterSeqNo = stockMasterSeqNo;
    }


    /**
     * Gets the standAloneStockSeqNo value for this StockT.
     * 
     * @return standAloneStockSeqNo
     */
    public String getStandAloneStockSeqNo() {
        return standAloneStockSeqNo;
    }


    /**
     * Sets the standAloneStockSeqNo value for this StockT.
     * 
     * @param standAloneStockSeqNo
     */
    public void setStandAloneStockSeqNo(String standAloneStockSeqNo) {
        this.standAloneStockSeqNo = standAloneStockSeqNo;
    }


    /**
     * Gets the imageWidth value for this StockT.
     * 
     * @return imageWidth
     */
    public int getImageWidth() {
        return imageWidth;
    }


    /**
     * Sets the imageWidth value for this StockT.
     * 
     * @param imageWidth
     */
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }


    /**
     * Gets the imageHeight value for this StockT.
     * 
     * @return imageHeight
     */
    public int getImageHeight() {
        return imageHeight;
    }


    /**
     * Sets the imageHeight value for this StockT.
     * 
     * @param imageHeight
     */
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }


    /**
     * Gets the skuMatchingVerNo value for this StockT.
     * 
     * @return skuMatchingVerNo
     */
    public long getSkuMatchingVerNo() {
        return skuMatchingVerNo;
    }


    /**
     * Sets the skuMatchingVerNo value for this StockT.
     * 
     * @param skuMatchingVerNo
     */
    public void setSkuMatchingVerNo(long skuMatchingVerNo) {
        this.skuMatchingVerNo = skuMatchingVerNo;
    }


    /**
     * Gets the singleOptSeqNo value for this StockT.
     * 
     * @return singleOptSeqNo
     */
    public long getSingleOptSeqNo() {
        return singleOptSeqNo;
    }


    /**
     * Sets the singleOptSeqNo value for this StockT.
     * 
     * @param singleOptSeqNo
     */
    public void setSingleOptSeqNo(long singleOptSeqNo) {
        this.singleOptSeqNo = singleOptSeqNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StockT)) return false;
        StockT other = (StockT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.skuInfo==null && other.getSkuInfo()==null) || 
             (this.skuInfo!=null &&
              java.util.Arrays.equals(this.skuInfo, other.getSkuInfo()))) &&
            this.stockNo == other.getStockNo() &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            this.objOptClaseNo1 == other.getObjOptClaseNo1() &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            this.objOptClaseNo2 == other.getObjOptClaseNo2() &&
            ((this.text2==null && other.getText2()==null) || 
             (this.text2!=null &&
              this.text2.equals(other.getText2()))) &&
            this.objOptClaseNo3 == other.getObjOptClaseNo3() &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            this.quantity == other.getQuantity() &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            this.isDisplayable == other.isIsDisplayable() &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            this.stockQty == other.getStockQty() &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            this.stockMasterSeqNo == other.getStockMasterSeqNo() &&
            ((this.standAloneStockSeqNo==null && other.getStandAloneStockSeqNo()==null) || 
             (this.standAloneStockSeqNo!=null &&
              this.standAloneStockSeqNo.equals(other.getStandAloneStockSeqNo()))) &&
            this.imageWidth == other.getImageWidth() &&
            this.imageHeight == other.getImageHeight() &&
            this.skuMatchingVerNo == other.getSkuMatchingVerNo() &&
            this.singleOptSeqNo == other.getSingleOptSeqNo();
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
        if (getSkuInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSkuInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSkuInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getStockNo()).hashCode();
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        _hashCode += new Long(getObjOptClaseNo1()).hashCode();
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += new Long(getObjOptClaseNo2()).hashCode();
        if (getText2() != null) {
            _hashCode += getText2().hashCode();
        }
        _hashCode += new Long(getObjOptClaseNo3()).hashCode();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        _hashCode += getQuantity();
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        _hashCode += (isIsDisplayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        _hashCode += getStockQty();
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        _hashCode += new Long(getStockMasterSeqNo()).hashCode();
        if (getStandAloneStockSeqNo() != null) {
            _hashCode += getStandAloneStockSeqNo().hashCode();
        }
        _hashCode += getImageWidth();
        _hashCode += getImageHeight();
        _hashCode += new Long(getSkuMatchingVerNo()).hashCode();
        _hashCode += new Long(getSingleOptSeqNo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockT"));
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
        attrField.setFieldName("objOptClaseNo1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptClaseNo1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("text");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptClaseNo2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptClaseNo2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("text2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Text2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptClaseNo3");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptClaseNo3"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        attrField.setFieldName("stockQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imageUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImageUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockMasterSeqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockMasterSeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("standAloneStockSeqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StandAloneStockSeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imageWidth");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImageWidth"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imageHeight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImageHeight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("skuMatchingVerNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SkuMatchingVerNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("singleOptSeqNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SingleOptSeqNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skuInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SkuInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SkuInfoT"));
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
