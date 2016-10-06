/**
 * MedicalInstrumentLicenseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class MedicalInstrumentLicenseT  implements java.io.Serializable {
    private String registerOfficeName;  // attribute

    private String sellerRegisterNo;  // attribute

    private String itemLicenseNo;  // attribute

    private String adDeliberationNo;  // attribute

    private boolean isMedicalInstrument;  // attribute

    private ChangeTypeCode changeType;  // attribute

    public MedicalInstrumentLicenseT() {
    }

    public MedicalInstrumentLicenseT(
           String registerOfficeName,
           String sellerRegisterNo,
           String itemLicenseNo,
           String adDeliberationNo,
           boolean isMedicalInstrument,
           ChangeTypeCode changeType) {
           this.registerOfficeName = registerOfficeName;
           this.sellerRegisterNo = sellerRegisterNo;
           this.itemLicenseNo = itemLicenseNo;
           this.adDeliberationNo = adDeliberationNo;
           this.isMedicalInstrument = isMedicalInstrument;
           this.changeType = changeType;
    }


    /**
     * Gets the registerOfficeName value for this MedicalInstrumentLicenseT.
     * 
     * @return registerOfficeName
     */
    public String getRegisterOfficeName() {
        return registerOfficeName;
    }


    /**
     * Sets the registerOfficeName value for this MedicalInstrumentLicenseT.
     * 
     * @param registerOfficeName
     */
    public void setRegisterOfficeName(String registerOfficeName) {
        this.registerOfficeName = registerOfficeName;
    }


    /**
     * Gets the sellerRegisterNo value for this MedicalInstrumentLicenseT.
     * 
     * @return sellerRegisterNo
     */
    public String getSellerRegisterNo() {
        return sellerRegisterNo;
    }


    /**
     * Sets the sellerRegisterNo value for this MedicalInstrumentLicenseT.
     * 
     * @param sellerRegisterNo
     */
    public void setSellerRegisterNo(String sellerRegisterNo) {
        this.sellerRegisterNo = sellerRegisterNo;
    }


    /**
     * Gets the itemLicenseNo value for this MedicalInstrumentLicenseT.
     * 
     * @return itemLicenseNo
     */
    public String getItemLicenseNo() {
        return itemLicenseNo;
    }


    /**
     * Sets the itemLicenseNo value for this MedicalInstrumentLicenseT.
     * 
     * @param itemLicenseNo
     */
    public void setItemLicenseNo(String itemLicenseNo) {
        this.itemLicenseNo = itemLicenseNo;
    }


    /**
     * Gets the adDeliberationNo value for this MedicalInstrumentLicenseT.
     * 
     * @return adDeliberationNo
     */
    public String getAdDeliberationNo() {
        return adDeliberationNo;
    }


    /**
     * Sets the adDeliberationNo value for this MedicalInstrumentLicenseT.
     * 
     * @param adDeliberationNo
     */
    public void setAdDeliberationNo(String adDeliberationNo) {
        this.adDeliberationNo = adDeliberationNo;
    }


    /**
     * Gets the isMedicalInstrument value for this MedicalInstrumentLicenseT.
     * 
     * @return isMedicalInstrument
     */
    public boolean isIsMedicalInstrument() {
        return isMedicalInstrument;
    }


    /**
     * Sets the isMedicalInstrument value for this MedicalInstrumentLicenseT.
     * 
     * @param isMedicalInstrument
     */
    public void setIsMedicalInstrument(boolean isMedicalInstrument) {
        this.isMedicalInstrument = isMedicalInstrument;
    }


    /**
     * Gets the changeType value for this MedicalInstrumentLicenseT.
     * 
     * @return changeType
     */
    public ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this MedicalInstrumentLicenseT.
     * 
     * @param changeType
     */
    public void setChangeType(ChangeTypeCode changeType) {
        this.changeType = changeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MedicalInstrumentLicenseT)) return false;
        MedicalInstrumentLicenseT other = (MedicalInstrumentLicenseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerOfficeName==null && other.getRegisterOfficeName()==null) || 
             (this.registerOfficeName!=null &&
              this.registerOfficeName.equals(other.getRegisterOfficeName()))) &&
            ((this.sellerRegisterNo==null && other.getSellerRegisterNo()==null) || 
             (this.sellerRegisterNo!=null &&
              this.sellerRegisterNo.equals(other.getSellerRegisterNo()))) &&
            ((this.itemLicenseNo==null && other.getItemLicenseNo()==null) || 
             (this.itemLicenseNo!=null &&
              this.itemLicenseNo.equals(other.getItemLicenseNo()))) &&
            ((this.adDeliberationNo==null && other.getAdDeliberationNo()==null) || 
             (this.adDeliberationNo!=null &&
              this.adDeliberationNo.equals(other.getAdDeliberationNo()))) &&
            this.isMedicalInstrument == other.isIsMedicalInstrument() &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType())));
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
        if (getRegisterOfficeName() != null) {
            _hashCode += getRegisterOfficeName().hashCode();
        }
        if (getSellerRegisterNo() != null) {
            _hashCode += getSellerRegisterNo().hashCode();
        }
        if (getItemLicenseNo() != null) {
            _hashCode += getItemLicenseNo().hashCode();
        }
        if (getAdDeliberationNo() != null) {
            _hashCode += getAdDeliberationNo().hashCode();
        }
        _hashCode += (isIsMedicalInstrument() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedicalInstrumentLicenseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MedicalInstrumentLicenseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registerOfficeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RegisterOfficeName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerRegisterNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerRegisterNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemLicenseNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemLicenseNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("adDeliberationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdDeliberationNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMedicalInstrument");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMedicalInstrument"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode"));
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
