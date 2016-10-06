/**
 * MobilePhoneRealPriceInstallmentT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class MobilePhoneRealPriceInstallmentT  implements java.io.Serializable {
    private String itemNo;  // attribute

    private int owPrice;  // attribute

    private int aidAmnt;  // attribute

    private int makerAidAmnt;  // attribute

    private int cmpAidAmnt;  // attribute

    private int addDiscountAmnt;  // attribute

    private int instPricipal;  // attribute

    private String joinAplnURL;  // attribute

    public MobilePhoneRealPriceInstallmentT() {
    }

    public MobilePhoneRealPriceInstallmentT(
           String itemNo,
           int owPrice,
           int aidAmnt,
           int makerAidAmnt,
           int cmpAidAmnt,
           int addDiscountAmnt,
           int instPricipal,
           String joinAplnURL) {
           this.itemNo = itemNo;
           this.owPrice = owPrice;
           this.aidAmnt = aidAmnt;
           this.makerAidAmnt = makerAidAmnt;
           this.cmpAidAmnt = cmpAidAmnt;
           this.addDiscountAmnt = addDiscountAmnt;
           this.instPricipal = instPricipal;
           this.joinAplnURL = joinAplnURL;
    }


    /**
     * Gets the itemNo value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the owPrice value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return owPrice
     */
    public int getOwPrice() {
        return owPrice;
    }


    /**
     * Sets the owPrice value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param owPrice
     */
    public void setOwPrice(int owPrice) {
        this.owPrice = owPrice;
    }


    /**
     * Gets the aidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return aidAmnt
     */
    public int getAidAmnt() {
        return aidAmnt;
    }


    /**
     * Sets the aidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param aidAmnt
     */
    public void setAidAmnt(int aidAmnt) {
        this.aidAmnt = aidAmnt;
    }


    /**
     * Gets the makerAidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return makerAidAmnt
     */
    public int getMakerAidAmnt() {
        return makerAidAmnt;
    }


    /**
     * Sets the makerAidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param makerAidAmnt
     */
    public void setMakerAidAmnt(int makerAidAmnt) {
        this.makerAidAmnt = makerAidAmnt;
    }


    /**
     * Gets the cmpAidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return cmpAidAmnt
     */
    public int getCmpAidAmnt() {
        return cmpAidAmnt;
    }


    /**
     * Sets the cmpAidAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param cmpAidAmnt
     */
    public void setCmpAidAmnt(int cmpAidAmnt) {
        this.cmpAidAmnt = cmpAidAmnt;
    }


    /**
     * Gets the addDiscountAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return addDiscountAmnt
     */
    public int getAddDiscountAmnt() {
        return addDiscountAmnt;
    }


    /**
     * Sets the addDiscountAmnt value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param addDiscountAmnt
     */
    public void setAddDiscountAmnt(int addDiscountAmnt) {
        this.addDiscountAmnt = addDiscountAmnt;
    }


    /**
     * Gets the instPricipal value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return instPricipal
     */
    public int getInstPricipal() {
        return instPricipal;
    }


    /**
     * Sets the instPricipal value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param instPricipal
     */
    public void setInstPricipal(int instPricipal) {
        this.instPricipal = instPricipal;
    }


    /**
     * Gets the joinAplnURL value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @return joinAplnURL
     */
    public String getJoinAplnURL() {
        return joinAplnURL;
    }


    /**
     * Sets the joinAplnURL value for this MobilePhoneRealPriceInstallmentT.
     * 
     * @param joinAplnURL
     */
    public void setJoinAplnURL(String joinAplnURL) {
        this.joinAplnURL = joinAplnURL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MobilePhoneRealPriceInstallmentT)) return false;
        MobilePhoneRealPriceInstallmentT other = (MobilePhoneRealPriceInstallmentT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNo==null && other.getItemNo()==null) || 
             (this.itemNo!=null &&
              this.itemNo.equals(other.getItemNo()))) &&
            this.owPrice == other.getOwPrice() &&
            this.aidAmnt == other.getAidAmnt() &&
            this.makerAidAmnt == other.getMakerAidAmnt() &&
            this.cmpAidAmnt == other.getCmpAidAmnt() &&
            this.addDiscountAmnt == other.getAddDiscountAmnt() &&
            this.instPricipal == other.getInstPricipal() &&
            ((this.joinAplnURL==null && other.getJoinAplnURL()==null) || 
             (this.joinAplnURL!=null &&
              this.joinAplnURL.equals(other.getJoinAplnURL())));
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
        if (getItemNo() != null) {
            _hashCode += getItemNo().hashCode();
        }
        _hashCode += getOwPrice();
        _hashCode += getAidAmnt();
        _hashCode += getMakerAidAmnt();
        _hashCode += getCmpAidAmnt();
        _hashCode += getAddDiscountAmnt();
        _hashCode += getInstPricipal();
        if (getJoinAplnURL() != null) {
            _hashCode += getJoinAplnURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobilePhoneRealPriceInstallmentT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MobilePhoneRealPriceInstallmentT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OwPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("aidAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AidAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("makerAidAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MakerAidAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cmpAidAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CmpAidAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addDiscountAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddDiscountAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("instPricipal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InstPricipal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("joinAplnURL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "JoinAplnURL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
