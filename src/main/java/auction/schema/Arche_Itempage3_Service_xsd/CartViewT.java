/**
 * CartViewT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Itempage3_Service_xsd;

public class CartViewT  implements java.io.Serializable {
    private auction.schema.Arche_Itempage3_Service_xsd.CartShippingT cartShipping;

    private auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT detailView;

    private long cartNo;  // attribute

    private String itemID;  // attribute

    private String itemName;  // attribute

    private String imagePath;  // attribute

    private int qty;  // attribute

    private java.math.BigDecimal price;  // attribute

    private java.math.BigDecimal requestPrice;  // attribute

    private java.math.BigDecimal optionPrice;  // attribute

    private java.math.BigDecimal discountPrice;  // attribute

    private java.math.BigDecimal discountedPrice;  // attribute

    private boolean isMartOn;  // attribute

    private auction.schema.Arche_Itempage3_Service_xsd.CartTabTypeEnum tabType;  // attribute

    private String categoryCode;  // attribute

    private String is3PL;  // attribute

    public CartViewT() {
    }

    public CartViewT(
           auction.schema.Arche_Itempage3_Service_xsd.CartShippingT cartShipping,
           auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT detailView,
           long cartNo,
           String itemID,
           String itemName,
           String imagePath,
           int qty,
           java.math.BigDecimal price,
           java.math.BigDecimal requestPrice,
           java.math.BigDecimal optionPrice,
           java.math.BigDecimal discountPrice,
           java.math.BigDecimal discountedPrice,
           boolean isMartOn,
           auction.schema.Arche_Itempage3_Service_xsd.CartTabTypeEnum tabType,
           String categoryCode,
           String is3PL) {
           this.cartShipping = cartShipping;
           this.detailView = detailView;
           this.cartNo = cartNo;
           this.itemID = itemID;
           this.itemName = itemName;
           this.imagePath = imagePath;
           this.qty = qty;
           this.price = price;
           this.requestPrice = requestPrice;
           this.optionPrice = optionPrice;
           this.discountPrice = discountPrice;
           this.discountedPrice = discountedPrice;
           this.isMartOn = isMartOn;
           this.tabType = tabType;
           this.categoryCode = categoryCode;
           this.is3PL = is3PL;
    }


    /**
     * Gets the cartShipping value for this CartViewT.
     * 
     * @return cartShipping
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartShippingT getCartShipping() {
        return cartShipping;
    }


    /**
     * Sets the cartShipping value for this CartViewT.
     * 
     * @param cartShipping
     */
    public void setCartShipping(auction.schema.Arche_Itempage3_Service_xsd.CartShippingT cartShipping) {
        this.cartShipping = cartShipping;
    }


    /**
     * Gets the detailView value for this CartViewT.
     * 
     * @return detailView
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT getDetailView() {
        return detailView;
    }


    /**
     * Sets the detailView value for this CartViewT.
     * 
     * @param detailView
     */
    public void setDetailView(auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT detailView) {
        this.detailView = detailView;
    }


    /**
     * Gets the cartNo value for this CartViewT.
     * 
     * @return cartNo
     */
    public long getCartNo() {
        return cartNo;
    }


    /**
     * Sets the cartNo value for this CartViewT.
     * 
     * @param cartNo
     */
    public void setCartNo(long cartNo) {
        this.cartNo = cartNo;
    }


    /**
     * Gets the itemID value for this CartViewT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this CartViewT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the itemName value for this CartViewT.
     * 
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this CartViewT.
     * 
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the imagePath value for this CartViewT.
     * 
     * @return imagePath
     */
    public String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this CartViewT.
     * 
     * @param imagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the qty value for this CartViewT.
     * 
     * @return qty
     */
    public int getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this CartViewT.
     * 
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }


    /**
     * Gets the price value for this CartViewT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CartViewT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the requestPrice value for this CartViewT.
     * 
     * @return requestPrice
     */
    public java.math.BigDecimal getRequestPrice() {
        return requestPrice;
    }


    /**
     * Sets the requestPrice value for this CartViewT.
     * 
     * @param requestPrice
     */
    public void setRequestPrice(java.math.BigDecimal requestPrice) {
        this.requestPrice = requestPrice;
    }


    /**
     * Gets the optionPrice value for this CartViewT.
     * 
     * @return optionPrice
     */
    public java.math.BigDecimal getOptionPrice() {
        return optionPrice;
    }


    /**
     * Sets the optionPrice value for this CartViewT.
     * 
     * @param optionPrice
     */
    public void setOptionPrice(java.math.BigDecimal optionPrice) {
        this.optionPrice = optionPrice;
    }


    /**
     * Gets the discountPrice value for this CartViewT.
     * 
     * @return discountPrice
     */
    public java.math.BigDecimal getDiscountPrice() {
        return discountPrice;
    }


    /**
     * Sets the discountPrice value for this CartViewT.
     * 
     * @param discountPrice
     */
    public void setDiscountPrice(java.math.BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }


    /**
     * Gets the discountedPrice value for this CartViewT.
     * 
     * @return discountedPrice
     */
    public java.math.BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }


    /**
     * Sets the discountedPrice value for this CartViewT.
     * 
     * @param discountedPrice
     */
    public void setDiscountedPrice(java.math.BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }


    /**
     * Gets the isMartOn value for this CartViewT.
     * 
     * @return isMartOn
     */
    public boolean isIsMartOn() {
        return isMartOn;
    }


    /**
     * Sets the isMartOn value for this CartViewT.
     * 
     * @param isMartOn
     */
    public void setIsMartOn(boolean isMartOn) {
        this.isMartOn = isMartOn;
    }


    /**
     * Gets the tabType value for this CartViewT.
     * 
     * @return tabType
     */
    public auction.schema.Arche_Itempage3_Service_xsd.CartTabTypeEnum getTabType() {
        return tabType;
    }


    /**
     * Sets the tabType value for this CartViewT.
     * 
     * @param tabType
     */
    public void setTabType(auction.schema.Arche_Itempage3_Service_xsd.CartTabTypeEnum tabType) {
        this.tabType = tabType;
    }


    /**
     * Gets the categoryCode value for this CartViewT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this CartViewT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the is3PL value for this CartViewT.
     * 
     * @return is3PL
     */
    public String getIs3PL() {
        return is3PL;
    }


    /**
     * Sets the is3PL value for this CartViewT.
     * 
     * @param is3PL
     */
    public void setIs3PL(String is3PL) {
        this.is3PL = is3PL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CartViewT)) return false;
        CartViewT other = (CartViewT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartShipping==null && other.getCartShipping()==null) || 
             (this.cartShipping!=null &&
              this.cartShipping.equals(other.getCartShipping()))) &&
            ((this.detailView==null && other.getDetailView()==null) || 
             (this.detailView!=null &&
              this.detailView.equals(other.getDetailView()))) &&
            this.cartNo == other.getCartNo() &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            this.qty == other.getQty() &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.requestPrice==null && other.getRequestPrice()==null) || 
             (this.requestPrice!=null &&
              this.requestPrice.equals(other.getRequestPrice()))) &&
            ((this.optionPrice==null && other.getOptionPrice()==null) || 
             (this.optionPrice!=null &&
              this.optionPrice.equals(other.getOptionPrice()))) &&
            ((this.discountPrice==null && other.getDiscountPrice()==null) || 
             (this.discountPrice!=null &&
              this.discountPrice.equals(other.getDiscountPrice()))) &&
            ((this.discountedPrice==null && other.getDiscountedPrice()==null) || 
             (this.discountedPrice!=null &&
              this.discountedPrice.equals(other.getDiscountedPrice()))) &&
            this.isMartOn == other.isIsMartOn() &&
            ((this.tabType==null && other.getTabType()==null) || 
             (this.tabType!=null &&
              this.tabType.equals(other.getTabType()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.is3PL==null && other.getIs3PL()==null) || 
             (this.is3PL!=null &&
              this.is3PL.equals(other.getIs3PL())));
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
        if (getCartShipping() != null) {
            _hashCode += getCartShipping().hashCode();
        }
        if (getDetailView() != null) {
            _hashCode += getDetailView().hashCode();
        }
        _hashCode += new Long(getCartNo()).hashCode();
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
        _hashCode += getQty();
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getRequestPrice() != null) {
            _hashCode += getRequestPrice().hashCode();
        }
        if (getOptionPrice() != null) {
            _hashCode += getOptionPrice().hashCode();
        }
        if (getDiscountPrice() != null) {
            _hashCode += getDiscountPrice().hashCode();
        }
        if (getDiscountedPrice() != null) {
            _hashCode += getDiscountedPrice().hashCode();
        }
        _hashCode += (isIsMartOn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTabType() != null) {
            _hashCode += getTabType().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getIs3PL() != null) {
            _hashCode += getIs3PL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartViewT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartViewT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cartNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CartNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imagePath");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImagePath"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RequestPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optionPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptionPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discountPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DiscountPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discountedPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DiscountedPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMartOn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMartOn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tabType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TabType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartTabTypeEnum"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("is3PL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Is3PL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartShippingT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailView");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "DetailView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailViewT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
