/**
 * ItemStockT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemStockT  implements java.io.Serializable {
    private MemberT seller;

    private auction.schema.Arche_Service_xsd.OptionObjectNameT optionObjectName;

    private StockT[] orderStock;

    private auction.schema.Arche_Service_xsd.OptionStockT[] optionStock;

    private auction.schema.Arche_Service_xsd.StockTextT[] stockText;

    private auction.schema.Arche_Service_xsd.StockStandAloneT[] stockStandAlone;

    private auction.schema.Arche_Service_xsd.StockCalculationT stockCalculation;

    private String itemID;  // attribute

    private auction.schema.Arche_Service_xsd.ItemStockTypeCode type;  // attribute

    private String buyerDescriptiveText;  // attribute

    private auction.schema.Arche_Service_xsd.OptionStockTypeCode optionStockType;  // attribute

    private boolean useOptionBuyQty;  // attribute

    private auction.schema.Arche_Service_xsd.VerTypeCode optVerType;  // attribute

    private boolean imageMatchingFinishYN;  // attribute

    private short optRepImageLevel;  // attribute

    private short optDetailImageLevel;  // attribute

    private boolean isStockQtyMng;  // attribute

    public ItemStockT() {
    }

    public ItemStockT(
           MemberT seller,
           auction.schema.Arche_Service_xsd.OptionObjectNameT optionObjectName,
           StockT[] orderStock,
           auction.schema.Arche_Service_xsd.OptionStockT[] optionStock,
           auction.schema.Arche_Service_xsd.StockTextT[] stockText,
           auction.schema.Arche_Service_xsd.StockStandAloneT[] stockStandAlone,
           auction.schema.Arche_Service_xsd.StockCalculationT stockCalculation,
           String itemID,
           auction.schema.Arche_Service_xsd.ItemStockTypeCode type,
           String buyerDescriptiveText,
           auction.schema.Arche_Service_xsd.OptionStockTypeCode optionStockType,
           boolean useOptionBuyQty,
           auction.schema.Arche_Service_xsd.VerTypeCode optVerType,
           boolean imageMatchingFinishYN,
           short optRepImageLevel,
           short optDetailImageLevel,
           boolean isStockQtyMng) {
           this.seller = seller;
           this.optionObjectName = optionObjectName;
           this.orderStock = orderStock;
           this.optionStock = optionStock;
           this.stockText = stockText;
           this.stockStandAlone = stockStandAlone;
           this.stockCalculation = stockCalculation;
           this.itemID = itemID;
           this.type = type;
           this.buyerDescriptiveText = buyerDescriptiveText;
           this.optionStockType = optionStockType;
           this.useOptionBuyQty = useOptionBuyQty;
           this.optVerType = optVerType;
           this.imageMatchingFinishYN = imageMatchingFinishYN;
           this.optRepImageLevel = optRepImageLevel;
           this.optDetailImageLevel = optDetailImageLevel;
           this.isStockQtyMng = isStockQtyMng;
    }


    /**
     * Gets the seller value for this ItemStockT.
     * 
     * @return seller
     */
    public MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this ItemStockT.
     * 
     * @param seller
     */
    public void setSeller(MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the optionObjectName value for this ItemStockT.
     * 
     * @return optionObjectName
     */
    public auction.schema.Arche_Service_xsd.OptionObjectNameT getOptionObjectName() {
        return optionObjectName;
    }


    /**
     * Sets the optionObjectName value for this ItemStockT.
     * 
     * @param optionObjectName
     */
    public void setOptionObjectName(auction.schema.Arche_Service_xsd.OptionObjectNameT optionObjectName) {
        this.optionObjectName = optionObjectName;
    }


    /**
     * Gets the orderStock value for this ItemStockT.
     * 
     * @return orderStock
     */
    public StockT[] getOrderStock() {
        return orderStock;
    }


    /**
     * Sets the orderStock value for this ItemStockT.
     * 
     * @param orderStock
     */
    public void setOrderStock(StockT[] orderStock) {
        this.orderStock = orderStock;
    }

    public StockT getOrderStock(int i) {
        return this.orderStock[i];
    }

    public void setOrderStock(int i, StockT _value) {
        this.orderStock[i] = _value;
    }


    /**
     * Gets the optionStock value for this ItemStockT.
     * 
     * @return optionStock
     */
    public auction.schema.Arche_Service_xsd.OptionStockT[] getOptionStock() {
        return optionStock;
    }


    /**
     * Sets the optionStock value for this ItemStockT.
     * 
     * @param optionStock
     */
    public void setOptionStock(auction.schema.Arche_Service_xsd.OptionStockT[] optionStock) {
        this.optionStock = optionStock;
    }

    public auction.schema.Arche_Service_xsd.OptionStockT getOptionStock(int i) {
        return this.optionStock[i];
    }

    public void setOptionStock(int i, auction.schema.Arche_Service_xsd.OptionStockT _value) {
        this.optionStock[i] = _value;
    }


    /**
     * Gets the stockText value for this ItemStockT.
     * 
     * @return stockText
     */
    public auction.schema.Arche_Service_xsd.StockTextT[] getStockText() {
        return stockText;
    }


    /**
     * Sets the stockText value for this ItemStockT.
     * 
     * @param stockText
     */
    public void setStockText(auction.schema.Arche_Service_xsd.StockTextT[] stockText) {
        this.stockText = stockText;
    }

    public auction.schema.Arche_Service_xsd.StockTextT getStockText(int i) {
        return this.stockText[i];
    }

    public void setStockText(int i, auction.schema.Arche_Service_xsd.StockTextT _value) {
        this.stockText[i] = _value;
    }


    /**
     * Gets the stockStandAlone value for this ItemStockT.
     * 
     * @return stockStandAlone
     */
    public auction.schema.Arche_Service_xsd.StockStandAloneT[] getStockStandAlone() {
        return stockStandAlone;
    }


    /**
     * Sets the stockStandAlone value for this ItemStockT.
     * 
     * @param stockStandAlone
     */
    public void setStockStandAlone(auction.schema.Arche_Service_xsd.StockStandAloneT[] stockStandAlone) {
        this.stockStandAlone = stockStandAlone;
    }

    public auction.schema.Arche_Service_xsd.StockStandAloneT getStockStandAlone(int i) {
        return this.stockStandAlone[i];
    }

    public void setStockStandAlone(int i, auction.schema.Arche_Service_xsd.StockStandAloneT _value) {
        this.stockStandAlone[i] = _value;
    }


    /**
     * Gets the stockCalculation value for this ItemStockT.
     * 
     * @return stockCalculation
     */
    public auction.schema.Arche_Service_xsd.StockCalculationT getStockCalculation() {
        return stockCalculation;
    }


    /**
     * Sets the stockCalculation value for this ItemStockT.
     * 
     * @param stockCalculation
     */
    public void setStockCalculation(auction.schema.Arche_Service_xsd.StockCalculationT stockCalculation) {
        this.stockCalculation = stockCalculation;
    }


    /**
     * Gets the itemID value for this ItemStockT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemStockT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the type value for this ItemStockT.
     * 
     * @return type
     */
    public auction.schema.Arche_Service_xsd.ItemStockTypeCode getType() {
        return type;
    }


    /**
     * Sets the type value for this ItemStockT.
     * 
     * @param type
     */
    public void setType(auction.schema.Arche_Service_xsd.ItemStockTypeCode type) {
        this.type = type;
    }


    /**
     * Gets the buyerDescriptiveText value for this ItemStockT.
     * 
     * @return buyerDescriptiveText
     */
    public String getBuyerDescriptiveText() {
        return buyerDescriptiveText;
    }


    /**
     * Sets the buyerDescriptiveText value for this ItemStockT.
     * 
     * @param buyerDescriptiveText
     */
    public void setBuyerDescriptiveText(String buyerDescriptiveText) {
        this.buyerDescriptiveText = buyerDescriptiveText;
    }


    /**
     * Gets the optionStockType value for this ItemStockT.
     * 
     * @return optionStockType
     */
    public auction.schema.Arche_Service_xsd.OptionStockTypeCode getOptionStockType() {
        return optionStockType;
    }


    /**
     * Sets the optionStockType value for this ItemStockT.
     * 
     * @param optionStockType
     */
    public void setOptionStockType(auction.schema.Arche_Service_xsd.OptionStockTypeCode optionStockType) {
        this.optionStockType = optionStockType;
    }


    /**
     * Gets the useOptionBuyQty value for this ItemStockT.
     * 
     * @return useOptionBuyQty
     */
    public boolean isUseOptionBuyQty() {
        return useOptionBuyQty;
    }


    /**
     * Sets the useOptionBuyQty value for this ItemStockT.
     * 
     * @param useOptionBuyQty
     */
    public void setUseOptionBuyQty(boolean useOptionBuyQty) {
        this.useOptionBuyQty = useOptionBuyQty;
    }


    /**
     * Gets the optVerType value for this ItemStockT.
     * 
     * @return optVerType
     */
    public auction.schema.Arche_Service_xsd.VerTypeCode getOptVerType() {
        return optVerType;
    }


    /**
     * Sets the optVerType value for this ItemStockT.
     * 
     * @param optVerType
     */
    public void setOptVerType(auction.schema.Arche_Service_xsd.VerTypeCode optVerType) {
        this.optVerType = optVerType;
    }


    /**
     * Gets the imageMatchingFinishYN value for this ItemStockT.
     * 
     * @return imageMatchingFinishYN
     */
    public boolean isImageMatchingFinishYN() {
        return imageMatchingFinishYN;
    }


    /**
     * Sets the imageMatchingFinishYN value for this ItemStockT.
     * 
     * @param imageMatchingFinishYN
     */
    public void setImageMatchingFinishYN(boolean imageMatchingFinishYN) {
        this.imageMatchingFinishYN = imageMatchingFinishYN;
    }


    /**
     * Gets the optRepImageLevel value for this ItemStockT.
     * 
     * @return optRepImageLevel
     */
    public short getOptRepImageLevel() {
        return optRepImageLevel;
    }


    /**
     * Sets the optRepImageLevel value for this ItemStockT.
     * 
     * @param optRepImageLevel
     */
    public void setOptRepImageLevel(short optRepImageLevel) {
        this.optRepImageLevel = optRepImageLevel;
    }


    /**
     * Gets the optDetailImageLevel value for this ItemStockT.
     * 
     * @return optDetailImageLevel
     */
    public short getOptDetailImageLevel() {
        return optDetailImageLevel;
    }


    /**
     * Sets the optDetailImageLevel value for this ItemStockT.
     * 
     * @param optDetailImageLevel
     */
    public void setOptDetailImageLevel(short optDetailImageLevel) {
        this.optDetailImageLevel = optDetailImageLevel;
    }


    /**
     * Gets the isStockQtyMng value for this ItemStockT.
     * 
     * @return isStockQtyMng
     */
    public boolean isIsStockQtyMng() {
        return isStockQtyMng;
    }


    /**
     * Sets the isStockQtyMng value for this ItemStockT.
     * 
     * @param isStockQtyMng
     */
    public void setIsStockQtyMng(boolean isStockQtyMng) {
        this.isStockQtyMng = isStockQtyMng;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemStockT)) return false;
        ItemStockT other = (ItemStockT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.optionObjectName==null && other.getOptionObjectName()==null) || 
             (this.optionObjectName!=null &&
              this.optionObjectName.equals(other.getOptionObjectName()))) &&
            ((this.orderStock==null && other.getOrderStock()==null) || 
             (this.orderStock!=null &&
              java.util.Arrays.equals(this.orderStock, other.getOrderStock()))) &&
            ((this.optionStock==null && other.getOptionStock()==null) || 
             (this.optionStock!=null &&
              java.util.Arrays.equals(this.optionStock, other.getOptionStock()))) &&
            ((this.stockText==null && other.getStockText()==null) || 
             (this.stockText!=null &&
              java.util.Arrays.equals(this.stockText, other.getStockText()))) &&
            ((this.stockStandAlone==null && other.getStockStandAlone()==null) || 
             (this.stockStandAlone!=null &&
              java.util.Arrays.equals(this.stockStandAlone, other.getStockStandAlone()))) &&
            ((this.stockCalculation==null && other.getStockCalculation()==null) || 
             (this.stockCalculation!=null &&
              this.stockCalculation.equals(other.getStockCalculation()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.buyerDescriptiveText==null && other.getBuyerDescriptiveText()==null) || 
             (this.buyerDescriptiveText!=null &&
              this.buyerDescriptiveText.equals(other.getBuyerDescriptiveText()))) &&
            ((this.optionStockType==null && other.getOptionStockType()==null) || 
             (this.optionStockType!=null &&
              this.optionStockType.equals(other.getOptionStockType()))) &&
            this.useOptionBuyQty == other.isUseOptionBuyQty() &&
            ((this.optVerType==null && other.getOptVerType()==null) || 
             (this.optVerType!=null &&
              this.optVerType.equals(other.getOptVerType()))) &&
            this.imageMatchingFinishYN == other.isImageMatchingFinishYN() &&
            this.optRepImageLevel == other.getOptRepImageLevel() &&
            this.optDetailImageLevel == other.getOptDetailImageLevel() &&
            this.isStockQtyMng == other.isIsStockQtyMng();
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
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getOptionObjectName() != null) {
            _hashCode += getOptionObjectName().hashCode();
        }
        if (getOrderStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderStock());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOrderStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptionStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionStock());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOptionStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockText());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStockText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockStandAlone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockStandAlone());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStockStandAlone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockCalculation() != null) {
            _hashCode += getStockCalculation().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBuyerDescriptiveText() != null) {
            _hashCode += getBuyerDescriptiveText().hashCode();
        }
        if (getOptionStockType() != null) {
            _hashCode += getOptionStockType().hashCode();
        }
        _hashCode += (isUseOptionBuyQty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOptVerType() != null) {
            _hashCode += getOptVerType().hashCode();
        }
        _hashCode += (isImageMatchingFinishYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOptRepImageLevel();
        _hashCode += getOptDetailImageLevel();
        _hashCode += (isIsStockQtyMng() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemStockT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerDescriptiveText");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerDescriptiveText"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optionStockType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptionStockType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useOptionBuyQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UseOptionBuyQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optVerType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptVerType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imageMatchingFinishYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImageMatchingFinishYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optRepImageLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptRepImageLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("optDetailImageLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OptDetailImageLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isStockQtyMng");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsStockQtyMng"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionObjectNameT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OrderStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionStockT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockTextT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockStandAlone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockStandAlone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockStandAloneT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockCalculation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockCalculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockCalculationT"));
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
