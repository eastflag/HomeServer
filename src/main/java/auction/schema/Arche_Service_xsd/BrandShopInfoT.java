/**
 * BrandShopInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class BrandShopInfoT  implements java.io.Serializable {
    private MemberT seller;

    private auction.schema.Arche_Service_xsd.ItemBrandShopPictureT[] itemBrandShopPicture;

    private String itemID;  // attribute

    private boolean isBrandShop;  // attribute

    private String categoryCode;  // attribute

    private int brandCode;  // attribute

    public BrandShopInfoT() {
    }

    public BrandShopInfoT(
           MemberT seller,
           auction.schema.Arche_Service_xsd.ItemBrandShopPictureT[] itemBrandShopPicture,
           String itemID,
           boolean isBrandShop,
           String categoryCode,
           int brandCode) {
           this.seller = seller;
           this.itemBrandShopPicture = itemBrandShopPicture;
           this.itemID = itemID;
           this.isBrandShop = isBrandShop;
           this.categoryCode = categoryCode;
           this.brandCode = brandCode;
    }


    /**
     * Gets the seller value for this BrandShopInfoT.
     * 
     * @return seller
     */
    public MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this BrandShopInfoT.
     * 
     * @param seller
     */
    public void setSeller(MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the itemBrandShopPicture value for this BrandShopInfoT.
     * 
     * @return itemBrandShopPicture
     */
    public auction.schema.Arche_Service_xsd.ItemBrandShopPictureT[] getItemBrandShopPicture() {
        return itemBrandShopPicture;
    }


    /**
     * Sets the itemBrandShopPicture value for this BrandShopInfoT.
     * 
     * @param itemBrandShopPicture
     */
    public void setItemBrandShopPicture(auction.schema.Arche_Service_xsd.ItemBrandShopPictureT[] itemBrandShopPicture) {
        this.itemBrandShopPicture = itemBrandShopPicture;
    }

    public auction.schema.Arche_Service_xsd.ItemBrandShopPictureT getItemBrandShopPicture(int i) {
        return this.itemBrandShopPicture[i];
    }

    public void setItemBrandShopPicture(int i, auction.schema.Arche_Service_xsd.ItemBrandShopPictureT _value) {
        this.itemBrandShopPicture[i] = _value;
    }


    /**
     * Gets the itemID value for this BrandShopInfoT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this BrandShopInfoT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the isBrandShop value for this BrandShopInfoT.
     * 
     * @return isBrandShop
     */
    public boolean isIsBrandShop() {
        return isBrandShop;
    }


    /**
     * Sets the isBrandShop value for this BrandShopInfoT.
     * 
     * @param isBrandShop
     */
    public void setIsBrandShop(boolean isBrandShop) {
        this.isBrandShop = isBrandShop;
    }


    /**
     * Gets the categoryCode value for this BrandShopInfoT.
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this BrandShopInfoT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the brandCode value for this BrandShopInfoT.
     * 
     * @return brandCode
     */
    public int getBrandCode() {
        return brandCode;
    }


    /**
     * Sets the brandCode value for this BrandShopInfoT.
     * 
     * @param brandCode
     */
    public void setBrandCode(int brandCode) {
        this.brandCode = brandCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BrandShopInfoT)) return false;
        BrandShopInfoT other = (BrandShopInfoT) obj;
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
            ((this.itemBrandShopPicture==null && other.getItemBrandShopPicture()==null) || 
             (this.itemBrandShopPicture!=null &&
              java.util.Arrays.equals(this.itemBrandShopPicture, other.getItemBrandShopPicture()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            this.isBrandShop == other.isIsBrandShop() &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            this.brandCode == other.getBrandCode();
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
        if (getItemBrandShopPicture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemBrandShopPicture());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemBrandShopPicture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        _hashCode += (isIsBrandShop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        _hashCode += getBrandCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrandShopInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BrandShopInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isBrandShop");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsBrandShop"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBrandShopPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBrandShopPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemBrandShopPictureT"));
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
