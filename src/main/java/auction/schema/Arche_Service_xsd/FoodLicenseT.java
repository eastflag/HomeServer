/**
 * FoodLicenseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class FoodLicenseT  implements java.io.Serializable {
    private String registerOfficeName;  // attribute

    private String sellerRegisterNo;  // attribute

    private boolean isFoodCertIs;  // attribute

    private boolean foodImportCertIs;  // attribute

    private auction.schema.Arche_Service_xsd.ChangeTypeCode changeType;  // attribute

    public FoodLicenseT() {
    }

    public FoodLicenseT(
           String registerOfficeName,
           String sellerRegisterNo,
           boolean isFoodCertIs,
           boolean foodImportCertIs,
           auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
           this.registerOfficeName = registerOfficeName;
           this.sellerRegisterNo = sellerRegisterNo;
           this.isFoodCertIs = isFoodCertIs;
           this.foodImportCertIs = foodImportCertIs;
           this.changeType = changeType;
    }


    /**
     * Gets the registerOfficeName value for this FoodLicenseT.
     * 
     * @return registerOfficeName
     */
    public String getRegisterOfficeName() {
        return registerOfficeName;
    }


    /**
     * Sets the registerOfficeName value for this FoodLicenseT.
     * 
     * @param registerOfficeName
     */
    public void setRegisterOfficeName(String registerOfficeName) {
        this.registerOfficeName = registerOfficeName;
    }


    /**
     * Gets the sellerRegisterNo value for this FoodLicenseT.
     * 
     * @return sellerRegisterNo
     */
    public String getSellerRegisterNo() {
        return sellerRegisterNo;
    }


    /**
     * Sets the sellerRegisterNo value for this FoodLicenseT.
     * 
     * @param sellerRegisterNo
     */
    public void setSellerRegisterNo(String sellerRegisterNo) {
        this.sellerRegisterNo = sellerRegisterNo;
    }


    /**
     * Gets the isFoodCertIs value for this FoodLicenseT.
     * 
     * @return isFoodCertIs
     */
    public boolean isIsFoodCertIs() {
        return isFoodCertIs;
    }


    /**
     * Sets the isFoodCertIs value for this FoodLicenseT.
     * 
     * @param isFoodCertIs
     */
    public void setIsFoodCertIs(boolean isFoodCertIs) {
        this.isFoodCertIs = isFoodCertIs;
    }


    /**
     * Gets the foodImportCertIs value for this FoodLicenseT.
     * 
     * @return foodImportCertIs
     */
    public boolean isFoodImportCertIs() {
        return foodImportCertIs;
    }


    /**
     * Sets the foodImportCertIs value for this FoodLicenseT.
     * 
     * @param foodImportCertIs
     */
    public void setFoodImportCertIs(boolean foodImportCertIs) {
        this.foodImportCertIs = foodImportCertIs;
    }


    /**
     * Gets the changeType value for this FoodLicenseT.
     * 
     * @return changeType
     */
    public auction.schema.Arche_Service_xsd.ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this FoodLicenseT.
     * 
     * @param changeType
     */
    public void setChangeType(auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
        this.changeType = changeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FoodLicenseT)) return false;
        FoodLicenseT other = (FoodLicenseT) obj;
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
            this.isFoodCertIs == other.isIsFoodCertIs() &&
            this.foodImportCertIs == other.isFoodImportCertIs() &&
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
        _hashCode += (isIsFoodCertIs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFoodImportCertIs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FoodLicenseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FoodLicenseT"));
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
        attrField.setFieldName("isFoodCertIs");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsFoodCertIs"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("foodImportCertIs");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FoodImportCertIs"));
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
