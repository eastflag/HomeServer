/**
 * ChildProductSafeCertT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ChildProductSafeCertT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT[] childProductSafeCertDetailInfoList;

    private auction.schema.Arche_Service_xsd.ChildProductSafeCertType certificationType;  // attribute

    private ChangeTypeCode changeType;  // attribute

    public ChildProductSafeCertT() {
    }

    public ChildProductSafeCertT(
           auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT[] childProductSafeCertDetailInfoList,
           auction.schema.Arche_Service_xsd.ChildProductSafeCertType certificationType,
           ChangeTypeCode changeType) {
           this.childProductSafeCertDetailInfoList = childProductSafeCertDetailInfoList;
           this.certificationType = certificationType;
           this.changeType = changeType;
    }


    /**
     * Gets the childProductSafeCertDetailInfoList value for this ChildProductSafeCertT.
     * 
     * @return childProductSafeCertDetailInfoList
     */
    public auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT[] getChildProductSafeCertDetailInfoList() {
        return childProductSafeCertDetailInfoList;
    }


    /**
     * Sets the childProductSafeCertDetailInfoList value for this ChildProductSafeCertT.
     * 
     * @param childProductSafeCertDetailInfoList
     */
    public void setChildProductSafeCertDetailInfoList(auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT[] childProductSafeCertDetailInfoList) {
        this.childProductSafeCertDetailInfoList = childProductSafeCertDetailInfoList;
    }

    public auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT getChildProductSafeCertDetailInfoList(int i) {
        return this.childProductSafeCertDetailInfoList[i];
    }

    public void setChildProductSafeCertDetailInfoList(int i, auction.schema.Arche_Service_xsd.ChildProductSafeCertDetailInfoT _value) {
        this.childProductSafeCertDetailInfoList[i] = _value;
    }


    /**
     * Gets the certificationType value for this ChildProductSafeCertT.
     * 
     * @return certificationType
     */
    public auction.schema.Arche_Service_xsd.ChildProductSafeCertType getCertificationType() {
        return certificationType;
    }


    /**
     * Sets the certificationType value for this ChildProductSafeCertT.
     * 
     * @param certificationType
     */
    public void setCertificationType(auction.schema.Arche_Service_xsd.ChildProductSafeCertType certificationType) {
        this.certificationType = certificationType;
    }


    /**
     * Gets the changeType value for this ChildProductSafeCertT.
     * 
     * @return changeType
     */
    public ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this ChildProductSafeCertT.
     * 
     * @param changeType
     */
    public void setChangeType(ChangeTypeCode changeType) {
        this.changeType = changeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChildProductSafeCertT)) return false;
        ChildProductSafeCertT other = (ChildProductSafeCertT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childProductSafeCertDetailInfoList==null && other.getChildProductSafeCertDetailInfoList()==null) || 
             (this.childProductSafeCertDetailInfoList!=null &&
              java.util.Arrays.equals(this.childProductSafeCertDetailInfoList, other.getChildProductSafeCertDetailInfoList()))) &&
            ((this.certificationType==null && other.getCertificationType()==null) || 
             (this.certificationType!=null &&
              this.certificationType.equals(other.getCertificationType()))) &&
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
        if (getChildProductSafeCertDetailInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildProductSafeCertDetailInfoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChildProductSafeCertDetailInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificationType() != null) {
            _hashCode += getCertificationType().hashCode();
        }
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildProductSafeCertT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificationType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CertificationType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childProductSafeCertDetailInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertDetailInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChildProductSafeCertDetailInfoT"));
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
