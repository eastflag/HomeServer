/**
 * AddItemMobileRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class AddItemMobileRequestT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private auction.schema.Arche_Service_xsd.ItemT item;

    private auction.schema.Arche_Service_xsd.ItemStockT itemStock;

    private auction.schema.Arche_Service_xsd.ItemSellingT itemSelling;

    private int version;  // attribute

    private String inputChannel;  // attribute

    public AddItemMobileRequestT() {
    }

    public AddItemMobileRequestT(
           auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           auction.schema.Arche_Service_xsd.ItemT item,
           auction.schema.Arche_Service_xsd.ItemStockT itemStock,
           auction.schema.Arche_Service_xsd.ItemSellingT itemSelling,
           int version,
           String inputChannel) {
           this.memberTicket = memberTicket;
           this.item = item;
           this.itemStock = itemStock;
           this.itemSelling = itemSelling;
           this.version = version;
           this.inputChannel = inputChannel;
    }


    /**
     * Gets the memberTicket value for this AddItemMobileRequestT.
     * 
     * @return memberTicket
     */
    public auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this AddItemMobileRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the item value for this AddItemMobileRequestT.
     * 
     * @return item
     */
    public auction.schema.Arche_Service_xsd.ItemT getItem() {
        return item;
    }


    /**
     * Sets the item value for this AddItemMobileRequestT.
     * 
     * @param item
     */
    public void setItem(auction.schema.Arche_Service_xsd.ItemT item) {
        this.item = item;
    }


    /**
     * Gets the itemStock value for this AddItemMobileRequestT.
     * 
     * @return itemStock
     */
    public auction.schema.Arche_Service_xsd.ItemStockT getItemStock() {
        return itemStock;
    }


    /**
     * Sets the itemStock value for this AddItemMobileRequestT.
     * 
     * @param itemStock
     */
    public void setItemStock(auction.schema.Arche_Service_xsd.ItemStockT itemStock) {
        this.itemStock = itemStock;
    }


    /**
     * Gets the itemSelling value for this AddItemMobileRequestT.
     * 
     * @return itemSelling
     */
    public auction.schema.Arche_Service_xsd.ItemSellingT getItemSelling() {
        return itemSelling;
    }


    /**
     * Sets the itemSelling value for this AddItemMobileRequestT.
     * 
     * @param itemSelling
     */
    public void setItemSelling(auction.schema.Arche_Service_xsd.ItemSellingT itemSelling) {
        this.itemSelling = itemSelling;
    }


    /**
     * Gets the version value for this AddItemMobileRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddItemMobileRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the inputChannel value for this AddItemMobileRequestT.
     * 
     * @return inputChannel
     */
    public String getInputChannel() {
        return inputChannel;
    }


    /**
     * Sets the inputChannel value for this AddItemMobileRequestT.
     * 
     * @param inputChannel
     */
    public void setInputChannel(String inputChannel) {
        this.inputChannel = inputChannel;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddItemMobileRequestT)) return false;
        AddItemMobileRequestT other = (AddItemMobileRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberTicket==null && other.getMemberTicket()==null) || 
             (this.memberTicket!=null &&
              this.memberTicket.equals(other.getMemberTicket()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemStock==null && other.getItemStock()==null) || 
             (this.itemStock!=null &&
              this.itemStock.equals(other.getItemStock()))) &&
            ((this.itemSelling==null && other.getItemSelling()==null) || 
             (this.itemSelling!=null &&
              this.itemSelling.equals(other.getItemSelling()))) &&
            this.version == other.getVersion() &&
            ((this.inputChannel==null && other.getInputChannel()==null) || 
             (this.inputChannel!=null &&
              this.inputChannel.equals(other.getInputChannel())));
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
        if (getMemberTicket() != null) {
            _hashCode += getMemberTicket().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemStock() != null) {
            _hashCode += getItemStock().hashCode();
        }
        if (getItemSelling() != null) {
            _hashCode += getItemSelling().hashCode();
        }
        _hashCode += getVersion();
        if (getInputChannel() != null) {
            _hashCode += getInputChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddItemMobileRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inputChannel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InputChannel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSelling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemSelling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemSellingT"));
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
