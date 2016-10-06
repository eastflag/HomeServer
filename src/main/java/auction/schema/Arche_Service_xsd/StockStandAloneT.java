/**
 * StockStandAloneT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class StockStandAloneT  implements java.io.Serializable {
    private SkuInfoT[] skuInfo;

    private long itemStockStandAloneNo;  // attribute

    private String section;  // attribute

    private String text;  // attribute

    private long objOptClaseNo;  // attribute

    private java.math.BigDecimal price;  // attribute

    private String sellerStockCode;  // attribute

    private boolean isSoldOut;  // attribute

    private int stockQty;  // attribute

    private boolean useYN;  // attribute

    private ChangeTypeCode changeType;  // attribute

    private String imageUrl;  // attribute

    private long stockMasterSeqNo;  // attribute

    private int imageWidth;  // attribute

    private int imageHeight;  // attribute

    private long skuMatchingVerNo;  // attribute

    public StockStandAloneT() {
    }

    public StockStandAloneT(
           SkuInfoT[] skuInfo,
           long itemStockStandAloneNo,
           String section,
           String text,
           long objOptClaseNo,
           java.math.BigDecimal price,
           String sellerStockCode,
           boolean isSoldOut,
           int stockQty,
           boolean useYN,
           ChangeTypeCode changeType,
           String imageUrl,
           long stockMasterSeqNo,
           int imageWidth,
           int imageHeight,
           long skuMatchingVerNo) {
           this.skuInfo = skuInfo;
           this.itemStockStandAloneNo = itemStockStandAloneNo;
           this.section = section;
           this.text = text;
           this.objOptClaseNo = objOptClaseNo;
           this.price = price;
           this.sellerStockCode = sellerStockCode;
           this.isSoldOut = isSoldOut;
           this.stockQty = stockQty;
           this.useYN = useYN;
           this.changeType = changeType;
           this.imageUrl = imageUrl;
           this.stockMasterSeqNo = stockMasterSeqNo;
           this.imageWidth = imageWidth;
           this.imageHeight = imageHeight;
           this.skuMatchingVerNo = skuMatchingVerNo;
    }


    /**
     * Gets the skuInfo value for this StockStandAloneT.
     * 
     * @return skuInfo
     */
    public SkuInfoT[] getSkuInfo() {
        return skuInfo;
    }


    /**
     * Sets the skuInfo value for this StockStandAloneT.
     * 
     * @param skuInfo
     */
    public void setSkuInfo(SkuInfoT[] skuInfo) {
        this.skuInfo = skuInfo;
    }

    public SkuInfoT getSkuInfo(int i) {
        return this.skuInfo[i];
    }

    public void setSkuInfo(int i, SkuInfoT _value) {
        this.skuInfo[i] = _value;
    }


    /**
     * Gets the itemStockStandAloneNo value for this StockStandAloneT.
     * 
     * @return itemStockStandAloneNo
     */
    public long getItemStockStandAloneNo() {
        return itemStockStandAloneNo;
    }


    /**
     * Sets the itemStockStandAloneNo value for this StockStandAloneT.
     * 
     * @param itemStockStandAloneNo
     */
    public void setItemStockStandAloneNo(long itemStockStandAloneNo) {
        this.itemStockStandAloneNo = itemStockStandAloneNo;
    }


    /**
     * Gets the section value for this StockStandAloneT.
     * 
     * @return section
     */
    public String getSection() {
        return section;
    }


    /**
     * Sets the section value for this StockStandAloneT.
     * 
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }


    /**
     * Gets the text value for this StockStandAloneT.
     * 
     * @return text
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the text value for this StockStandAloneT.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets the objOptClaseNo value for this StockStandAloneT.
     * 
     * @return objOptClaseNo
     */
    public long getObjOptClaseNo() {
        return objOptClaseNo;
    }


    /**
     * Sets the objOptClaseNo value for this StockStandAloneT.
     * 
     * @param objOptClaseNo
     */
    public void setObjOptClaseNo(long objOptClaseNo) {
        this.objOptClaseNo = objOptClaseNo;
    }


    /**
     * Gets the price value for this StockStandAloneT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this StockStandAloneT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the sellerStockCode value for this StockStandAloneT.
     * 
     * @return sellerStockCode
     */
    public String getSellerStockCode() {
        return sellerStockCode;
    }


    /**
     * Sets the sellerStockCode value for this StockStandAloneT.
     * 
     * @param sellerStockCode
     */
    public void setSellerStockCode(String sellerStockCode) {
        this.sellerStockCode = sellerStockCode;
    }


    /**
     * Gets the isSoldOut value for this StockStandAloneT.
     * 
     * @return isSoldOut
     */
    public boolean isIsSoldOut() {
        return isSoldOut;
    }


    /**
     * Sets the isSoldOut value for this StockStandAloneT.
     * 
     * @param isSoldOut
     */
    public void setIsSoldOut(boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }


    /**
     * Gets the stockQty value for this StockStandAloneT.
     * 
     * @return stockQty
     */
    public int getStockQty() {
        return stockQty;
    }


    /**
     * Sets the stockQty value for this StockStandAloneT.
     * 
     * @param stockQty
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }


    /**
     * Gets the useYN value for this StockStandAloneT.
     * 
     * @return useYN
     */
    public boolean isUseYN() {
        return useYN;
    }


    /**
     * Sets the useYN value for this StockStandAloneT.
     * 
     * @param useYN
     */
    public void setUseYN(boolean useYN) {
        this.useYN = useYN;
    }


    /**
     * Gets the changeType value for this StockStandAloneT.
     * 
     * @return changeType
     */
    public ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this StockStandAloneT.
     * 
     * @param changeType
     */
    public void setChangeType(ChangeTypeCode changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the imageUrl value for this StockStandAloneT.
     * 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this StockStandAloneT.
     * 
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the stockMasterSeqNo value for this StockStandAloneT.
     * 
     * @return stockMasterSeqNo
     */
    public long getStockMasterSeqNo() {
        return stockMasterSeqNo;
    }


    /**
     * Sets the stockMasterSeqNo value for this StockStandAloneT.
     * 
     * @param stockMasterSeqNo
     */
    public void setStockMasterSeqNo(long stockMasterSeqNo) {
        this.stockMasterSeqNo = stockMasterSeqNo;
    }


    /**
     * Gets the imageWidth value for this StockStandAloneT.
     * 
     * @return imageWidth
     */
    public int getImageWidth() {
        return imageWidth;
    }


    /**
     * Sets the imageWidth value for this StockStandAloneT.
     * 
     * @param imageWidth
     */
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }


    /**
     * Gets the imageHeight value for this StockStandAloneT.
     * 
     * @return imageHeight
     */
    public int getImageHeight() {
        return imageHeight;
    }


    /**
     * Sets the imageHeight value for this StockStandAloneT.
     * 
     * @param imageHeight
     */
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }


    /**
     * Gets the skuMatchingVerNo value for this StockStandAloneT.
     * 
     * @return skuMatchingVerNo
     */
    public long getSkuMatchingVerNo() {
        return skuMatchingVerNo;
    }


    /**
     * Sets the skuMatchingVerNo value for this StockStandAloneT.
     * 
     * @param skuMatchingVerNo
     */
    public void setSkuMatchingVerNo(long skuMatchingVerNo) {
        this.skuMatchingVerNo = skuMatchingVerNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StockStandAloneT)) return false;
        StockStandAloneT other = (StockStandAloneT) obj;
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
            this.itemStockStandAloneNo == other.getItemStockStandAloneNo() &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            this.objOptClaseNo == other.getObjOptClaseNo() &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.sellerStockCode==null && other.getSellerStockCode()==null) || 
             (this.sellerStockCode!=null &&
              this.sellerStockCode.equals(other.getSellerStockCode()))) &&
            this.isSoldOut == other.isIsSoldOut() &&
            this.stockQty == other.getStockQty() &&
            this.useYN == other.isUseYN() &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            this.stockMasterSeqNo == other.getStockMasterSeqNo() &&
            this.imageWidth == other.getImageWidth() &&
            this.imageHeight == other.getImageHeight() &&
            this.skuMatchingVerNo == other.getSkuMatchingVerNo();
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
        _hashCode += new Long(getItemStockStandAloneNo()).hashCode();
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += new Long(getObjOptClaseNo()).hashCode();
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSellerStockCode() != null) {
            _hashCode += getSellerStockCode().hashCode();
        }
        _hashCode += (isIsSoldOut() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStockQty();
        _hashCode += (isUseYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        _hashCode += new Long(getStockMasterSeqNo()).hashCode();
        _hashCode += getImageWidth();
        _hashCode += getImageHeight();
        _hashCode += new Long(getSkuMatchingVerNo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockStandAloneT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockStandAloneT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemStockStandAloneNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemStockStandAloneNo"));
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
        attrField.setFieldName("objOptClaseNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptClaseNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerStockCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerStockCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isSoldOut");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsSoldOut"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stockQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StockQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UseYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode"));
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
