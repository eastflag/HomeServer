/**
 * ChildProductSafeCertDetailInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ChildProductSafeCertDetailInfoT  implements java.io.Serializable {
    private String certificationNo;  // attribute

    private ChildProductSafeCertTargetCode certificationTargetCode;  // attribute

    private String certificationStatus;  // attribute

    private java.util.Calendar certificationDate;  // attribute

    private String certificationType;  // attribute

    private String firstCertificationNo;  // attribute

    private String productName;  // attribute

    private String modelName;  // attribute

    private String certificationImgUrl;  // attribute

    private ChildProductSafeCertInputType inputType;  // attribute

    public ChildProductSafeCertDetailInfoT() {
    }

    public ChildProductSafeCertDetailInfoT(
           String certificationNo,
           ChildProductSafeCertTargetCode certificationTargetCode,
           String certificationStatus,
           java.util.Calendar certificationDate,
           String certificationType,
           String firstCertificationNo,
           String productName,
           String modelName,
           String certificationImgUrl,
           ChildProductSafeCertInputType inputType) {
           this.certificationNo = certificationNo;
           this.certificationTargetCode = certificationTargetCode;
           this.certificationStatus = certificationStatus;
           this.certificationDate = certificationDate;
           this.certificationType = certificationType;
           this.firstCertificationNo = firstCertificationNo;
           this.productName = productName;
           this.modelName = modelName;
           this.certificationImgUrl = certificationImgUrl;
           this.inputType = inputType;
    }


    /**
     * Gets the certificationNo value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationNo
     */
    public String getCertificationNo() {
        return certificationNo;
    }


    /**
     * Sets the certificationNo value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationNo
     */
    public void setCertificationNo(String certificationNo) {
        this.certificationNo = certificationNo;
    }


    /**
     * Gets the certificationTargetCode value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationTargetCode
     */
    public ChildProductSafeCertTargetCode getCertificationTargetCode() {
        return certificationTargetCode;
    }


    /**
     * Sets the certificationTargetCode value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationTargetCode
     */
    public void setCertificationTargetCode(ChildProductSafeCertTargetCode certificationTargetCode) {
        this.certificationTargetCode = certificationTargetCode;
    }


    /**
     * Gets the certificationStatus value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationStatus
     */
    public String getCertificationStatus() {
        return certificationStatus;
    }


    /**
     * Sets the certificationStatus value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationStatus
     */
    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus;
    }


    /**
     * Gets the certificationDate value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationDate
     */
    public java.util.Calendar getCertificationDate() {
        return certificationDate;
    }


    /**
     * Sets the certificationDate value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationDate
     */
    public void setCertificationDate(java.util.Calendar certificationDate) {
        this.certificationDate = certificationDate;
    }


    /**
     * Gets the certificationType value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationType
     */
    public String getCertificationType() {
        return certificationType;
    }


    /**
     * Sets the certificationType value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationType
     */
    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }


    /**
     * Gets the firstCertificationNo value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return firstCertificationNo
     */
    public String getFirstCertificationNo() {
        return firstCertificationNo;
    }


    /**
     * Sets the firstCertificationNo value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param firstCertificationNo
     */
    public void setFirstCertificationNo(String firstCertificationNo) {
        this.firstCertificationNo = firstCertificationNo;
    }


    /**
     * Gets the productName value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * Gets the modelName value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the certificationImgUrl value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return certificationImgUrl
     */
    public String getCertificationImgUrl() {
        return certificationImgUrl;
    }


    /**
     * Sets the certificationImgUrl value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param certificationImgUrl
     */
    public void setCertificationImgUrl(String certificationImgUrl) {
        this.certificationImgUrl = certificationImgUrl;
    }


    /**
     * Gets the inputType value for this ChildProductSafeCertDetailInfoT.
     * 
     * @return inputType
     */
    public ChildProductSafeCertInputType getInputType() {
        return inputType;
    }


    /**
     * Sets the inputType value for this ChildProductSafeCertDetailInfoT.
     * 
     * @param inputType
     */
    public void setInputType(ChildProductSafeCertInputType inputType) {
        this.inputType = inputType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChildProductSafeCertDetailInfoT)) return false;
        ChildProductSafeCertDetailInfoT other = (ChildProductSafeCertDetailInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificationNo==null && other.getCertificationNo()==null) || 
             (this.certificationNo!=null &&
              this.certificationNo.equals(other.getCertificationNo()))) &&
            ((this.certificationTargetCode==null && other.getCertificationTargetCode()==null) || 
             (this.certificationTargetCode!=null &&
              this.certificationTargetCode.equals(other.getCertificationTargetCode()))) &&
            ((this.certificationStatus==null && other.getCertificationStatus()==null) || 
             (this.certificationStatus!=null &&
              this.certificationStatus.equals(other.getCertificationStatus()))) &&
            ((this.certificationDate==null && other.getCertificationDate()==null) || 
             (this.certificationDate!=null &&
              this.certificationDate.equals(other.getCertificationDate()))) &&
            ((this.certificationType==null && other.getCertificationType()==null) || 
             (this.certificationType!=null &&
              this.certificationType.equals(other.getCertificationType()))) &&
            ((this.firstCertificationNo==null && other.getFirstCertificationNo()==null) || 
             (this.firstCertificationNo!=null &&
              this.firstCertificationNo.equals(other.getFirstCertificationNo()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            ((this.certificationImgUrl==null && other.getCertificationImgUrl()==null) || 
             (this.certificationImgUrl!=null &&
              this.certificationImgUrl.equals(other.getCertificationImgUrl()))) &&
            ((this.inputType==null && other.getInputType()==null) || 
             (this.inputType!=null &&
              this.inputType.equals(other.getInputType())));
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
        if (getCertificationNo() != null) {
            _hashCode += getCertificationNo().hashCode();
        }
        if (getCertificationTargetCode() != null) {
            _hashCode += getCertificationTargetCode().hashCode();
        }
        if (getCertificationStatus() != null) {
            _hashCode += getCertificationStatus().hashCode();
        }
        if (getCertificationDate() != null) {
            _hashCode += getCertificationDate().hashCode();
        }
        if (getCertificationType() != null) {
            _hashCode += getCertificationType().hashCode();
        }
        if (getFirstCertificationNo() != null) {
            _hashCode += getFirstCertificationNo().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        if (getCertificationImgUrl() != null) {
            _hashCode += getCertificationImgUrl().hashCode();
        }
        if (getInputType() != null) {
            _hashCode += getInputType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildProductSafeCertDetailInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertDetailInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationTargetCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationTargetCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertTargetCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("firstCertificationNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FirstCertificationNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("productName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProductName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("modelName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ModelName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationImgUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationImgUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inputType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InputType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertInputType"));
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
