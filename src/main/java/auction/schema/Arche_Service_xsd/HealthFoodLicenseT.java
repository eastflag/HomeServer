/**
 * HealthFoodLicenseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class HealthFoodLicenseT  implements java.io.Serializable {
    private String registerOfficeName;  // attribute

    private String sellerRegisterNo;  // attribute

    private String adDeliberationNo;  // attribute

    private boolean isHealthFood;  // attribute

    private boolean isAdDeliberation;  // attribute

    private ChangeTypeCode changeType;  // attribute

    public HealthFoodLicenseT() {
    }

    public HealthFoodLicenseT(
           String registerOfficeName,
           String sellerRegisterNo,
           String adDeliberationNo,
           boolean isHealthFood,
           boolean isAdDeliberation,
           ChangeTypeCode changeType) {
           this.registerOfficeName = registerOfficeName;
           this.sellerRegisterNo = sellerRegisterNo;
           this.adDeliberationNo = adDeliberationNo;
           this.isHealthFood = isHealthFood;
           this.isAdDeliberation = isAdDeliberation;
           this.changeType = changeType;
    }


    /**
     * Gets the registerOfficeName value for this HealthFoodLicenseT.
     * 
     * @return registerOfficeName
     */
    public String getRegisterOfficeName() {
        return registerOfficeName;
    }


    /**
     * Sets the registerOfficeName value for this HealthFoodLicenseT.
     * 
     * @param registerOfficeName
     */
    public void setRegisterOfficeName(String registerOfficeName) {
        this.registerOfficeName = registerOfficeName;
    }


    /**
     * Gets the sellerRegisterNo value for this HealthFoodLicenseT.
     * 
     * @return sellerRegisterNo
     */
    public String getSellerRegisterNo() {
        return sellerRegisterNo;
    }


    /**
     * Sets the sellerRegisterNo value for this HealthFoodLicenseT.
     * 
     * @param sellerRegisterNo
     */
    public void setSellerRegisterNo(String sellerRegisterNo) {
        this.sellerRegisterNo = sellerRegisterNo;
    }


    /**
     * Gets the adDeliberationNo value for this HealthFoodLicenseT.
     * 
     * @return adDeliberationNo
     */
    public String getAdDeliberationNo() {
        return adDeliberationNo;
    }


    /**
     * Sets the adDeliberationNo value for this HealthFoodLicenseT.
     * 
     * @param adDeliberationNo
     */
    public void setAdDeliberationNo(String adDeliberationNo) {
        this.adDeliberationNo = adDeliberationNo;
    }


    /**
     * Gets the isHealthFood value for this HealthFoodLicenseT.
     * 
     * @return isHealthFood
     */
    public boolean isIsHealthFood() {
        return isHealthFood;
    }


    /**
     * Sets the isHealthFood value for this HealthFoodLicenseT.
     * 
     * @param isHealthFood
     */
    public void setIsHealthFood(boolean isHealthFood) {
        this.isHealthFood = isHealthFood;
    }


    /**
     * Gets the isAdDeliberation value for this HealthFoodLicenseT.
     * 
     * @return isAdDeliberation
     */
    public boolean isIsAdDeliberation() {
        return isAdDeliberation;
    }


    /**
     * Sets the isAdDeliberation value for this HealthFoodLicenseT.
     * 
     * @param isAdDeliberation
     */
    public void setIsAdDeliberation(boolean isAdDeliberation) {
        this.isAdDeliberation = isAdDeliberation;
    }


    /**
     * Gets the changeType value for this HealthFoodLicenseT.
     * 
     * @return changeType
     */
    public ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this HealthFoodLicenseT.
     * 
     * @param changeType
     */
    public void setChangeType(ChangeTypeCode changeType) {
        this.changeType = changeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HealthFoodLicenseT)) return false;
        HealthFoodLicenseT other = (HealthFoodLicenseT) obj;
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
            ((this.adDeliberationNo==null && other.getAdDeliberationNo()==null) || 
             (this.adDeliberationNo!=null &&
              this.adDeliberationNo.equals(other.getAdDeliberationNo()))) &&
            this.isHealthFood == other.isIsHealthFood() &&
            this.isAdDeliberation == other.isIsAdDeliberation() &&
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
        if (getAdDeliberationNo() != null) {
            _hashCode += getAdDeliberationNo().hashCode();
        }
        _hashCode += (isIsHealthFood() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAdDeliberation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HealthFoodLicenseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "HealthFoodLicenseT"));
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
        attrField.setFieldName("adDeliberationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdDeliberationNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isHealthFood");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsHealthFood"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isAdDeliberation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsAdDeliberation"));
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
