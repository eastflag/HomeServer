/**
 * NationListT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Code_xsd;

public class NationListT  implements java.io.Serializable {
    private String originCode;  // attribute

    private String originName;  // attribute

    private String originNameDetail;  // attribute

    public NationListT() {
    }

    public NationListT(
           String originCode,
           String originName,
           String originNameDetail) {
           this.originCode = originCode;
           this.originName = originName;
           this.originNameDetail = originNameDetail;
    }


    /**
     * Gets the originCode value for this NationListT.
     * 
     * @return originCode
     */
    public String getOriginCode() {
        return originCode;
    }


    /**
     * Sets the originCode value for this NationListT.
     * 
     * @param originCode
     */
    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }


    /**
     * Gets the originName value for this NationListT.
     * 
     * @return originName
     */
    public String getOriginName() {
        return originName;
    }


    /**
     * Sets the originName value for this NationListT.
     * 
     * @param originName
     */
    public void setOriginName(String originName) {
        this.originName = originName;
    }


    /**
     * Gets the originNameDetail value for this NationListT.
     * 
     * @return originNameDetail
     */
    public String getOriginNameDetail() {
        return originNameDetail;
    }


    /**
     * Sets the originNameDetail value for this NationListT.
     * 
     * @param originNameDetail
     */
    public void setOriginNameDetail(String originNameDetail) {
        this.originNameDetail = originNameDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NationListT)) return false;
        NationListT other = (NationListT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originCode==null && other.getOriginCode()==null) || 
             (this.originCode!=null &&
              this.originCode.equals(other.getOriginCode()))) &&
            ((this.originName==null && other.getOriginName()==null) || 
             (this.originName!=null &&
              this.originName.equals(other.getOriginName()))) &&
            ((this.originNameDetail==null && other.getOriginNameDetail()==null) || 
             (this.originNameDetail!=null &&
              this.originNameDetail.equals(other.getOriginNameDetail())));
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
        if (getOriginCode() != null) {
            _hashCode += getOriginCode().hashCode();
        }
        if (getOriginName() != null) {
            _hashCode += getOriginName().hashCode();
        }
        if (getOriginNameDetail() != null) {
            _hashCode += getOriginNameDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NationListT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Code.xsd", "NationListT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originNameDetail");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginNameDetail"));
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
