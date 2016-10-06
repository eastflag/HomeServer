/**
 * ItemSellingT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemSellingT  implements java.io.Serializable {
    private MemberT seller;

    private auction.schema.Arche_Service_xsd.SellingStatusT[] period;

    private auction.schema.Arche_Service_xsd.SellingFeatureT[] feature;

    private auction.schema.Arche_Service_xsd.ChargedWishKeywordT[] chargedWishKeyword;

    private String itemID;  // attribute

    public ItemSellingT() {
    }

    public ItemSellingT(
           MemberT seller,
           auction.schema.Arche_Service_xsd.SellingStatusT[] period,
           auction.schema.Arche_Service_xsd.SellingFeatureT[] feature,
           auction.schema.Arche_Service_xsd.ChargedWishKeywordT[] chargedWishKeyword,
           String itemID) {
           this.seller = seller;
           this.period = period;
           this.feature = feature;
           this.chargedWishKeyword = chargedWishKeyword;
           this.itemID = itemID;
    }


    /**
     * Gets the seller value for this ItemSellingT.
     * 
     * @return seller
     */
    public MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this ItemSellingT.
     * 
     * @param seller
     */
    public void setSeller(MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the period value for this ItemSellingT.
     * 
     * @return period
     */
    public auction.schema.Arche_Service_xsd.SellingStatusT[] getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this ItemSellingT.
     * 
     * @param period
     */
    public void setPeriod(auction.schema.Arche_Service_xsd.SellingStatusT[] period) {
        this.period = period;
    }

    public auction.schema.Arche_Service_xsd.SellingStatusT getPeriod(int i) {
        return this.period[i];
    }

    public void setPeriod(int i, auction.schema.Arche_Service_xsd.SellingStatusT _value) {
        this.period[i] = _value;
    }


    /**
     * Gets the feature value for this ItemSellingT.
     * 
     * @return feature
     */
    public auction.schema.Arche_Service_xsd.SellingFeatureT[] getFeature() {
        return feature;
    }


    /**
     * Sets the feature value for this ItemSellingT.
     * 
     * @param feature
     */
    public void setFeature(auction.schema.Arche_Service_xsd.SellingFeatureT[] feature) {
        this.feature = feature;
    }

    public auction.schema.Arche_Service_xsd.SellingFeatureT getFeature(int i) {
        return this.feature[i];
    }

    public void setFeature(int i, auction.schema.Arche_Service_xsd.SellingFeatureT _value) {
        this.feature[i] = _value;
    }


    /**
     * Gets the chargedWishKeyword value for this ItemSellingT.
     * 
     * @return chargedWishKeyword
     */
    public auction.schema.Arche_Service_xsd.ChargedWishKeywordT[] getChargedWishKeyword() {
        return chargedWishKeyword;
    }


    /**
     * Sets the chargedWishKeyword value for this ItemSellingT.
     * 
     * @param chargedWishKeyword
     */
    public void setChargedWishKeyword(auction.schema.Arche_Service_xsd.ChargedWishKeywordT[] chargedWishKeyword) {
        this.chargedWishKeyword = chargedWishKeyword;
    }

    public auction.schema.Arche_Service_xsd.ChargedWishKeywordT getChargedWishKeyword(int i) {
        return this.chargedWishKeyword[i];
    }

    public void setChargedWishKeyword(int i, auction.schema.Arche_Service_xsd.ChargedWishKeywordT _value) {
        this.chargedWishKeyword[i] = _value;
    }


    /**
     * Gets the itemID value for this ItemSellingT.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemSellingT.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSellingT)) return false;
        ItemSellingT other = (ItemSellingT) obj;
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
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              java.util.Arrays.equals(this.period, other.getPeriod()))) &&
            ((this.feature==null && other.getFeature()==null) || 
             (this.feature!=null &&
              java.util.Arrays.equals(this.feature, other.getFeature()))) &&
            ((this.chargedWishKeyword==null && other.getChargedWishKeyword()==null) || 
             (this.chargedWishKeyword!=null &&
              java.util.Arrays.equals(this.chargedWishKeyword, other.getChargedWishKeyword()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID())));
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
        if (getPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriod());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeature());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargedWishKeyword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargedWishKeyword());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChargedWishKeyword(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSellingT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingFeatureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargedWishKeyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChargedWishKeyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChargedWishKeywordT"));
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
