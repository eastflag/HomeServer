/**
 * ExtraInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ExtraInfoT  implements java.io.Serializable {
    private String returnTel;  // attribute

    private String mobileTel;  // attribute

    private java.math.BigDecimal returnFee;  // attribute

    private String returnNotice;  // attribute

    public ExtraInfoT() {
    }

    public ExtraInfoT(
           String returnTel,
           String mobileTel,
           java.math.BigDecimal returnFee,
           String returnNotice) {
           this.returnTel = returnTel;
           this.mobileTel = mobileTel;
           this.returnFee = returnFee;
           this.returnNotice = returnNotice;
    }


    /**
     * Gets the returnTel value for this ExtraInfoT.
     * 
     * @return returnTel
     */
    public String getReturnTel() {
        return returnTel;
    }


    /**
     * Sets the returnTel value for this ExtraInfoT.
     * 
     * @param returnTel
     */
    public void setReturnTel(String returnTel) {
        this.returnTel = returnTel;
    }


    /**
     * Gets the mobileTel value for this ExtraInfoT.
     * 
     * @return mobileTel
     */
    public String getMobileTel() {
        return mobileTel;
    }


    /**
     * Sets the mobileTel value for this ExtraInfoT.
     * 
     * @param mobileTel
     */
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }


    /**
     * Gets the returnFee value for this ExtraInfoT.
     * 
     * @return returnFee
     */
    public java.math.BigDecimal getReturnFee() {
        return returnFee;
    }


    /**
     * Sets the returnFee value for this ExtraInfoT.
     * 
     * @param returnFee
     */
    public void setReturnFee(java.math.BigDecimal returnFee) {
        this.returnFee = returnFee;
    }


    /**
     * Gets the returnNotice value for this ExtraInfoT.
     * 
     * @return returnNotice
     */
    public String getReturnNotice() {
        return returnNotice;
    }


    /**
     * Sets the returnNotice value for this ExtraInfoT.
     * 
     * @param returnNotice
     */
    public void setReturnNotice(String returnNotice) {
        this.returnNotice = returnNotice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExtraInfoT)) return false;
        ExtraInfoT other = (ExtraInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnTel==null && other.getReturnTel()==null) || 
             (this.returnTel!=null &&
              this.returnTel.equals(other.getReturnTel()))) &&
            ((this.mobileTel==null && other.getMobileTel()==null) || 
             (this.mobileTel!=null &&
              this.mobileTel.equals(other.getMobileTel()))) &&
            ((this.returnFee==null && other.getReturnFee()==null) || 
             (this.returnFee!=null &&
              this.returnFee.equals(other.getReturnFee()))) &&
            ((this.returnNotice==null && other.getReturnNotice()==null) || 
             (this.returnNotice!=null &&
              this.returnNotice.equals(other.getReturnNotice())));
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
        if (getReturnTel() != null) {
            _hashCode += getReturnTel().hashCode();
        }
        if (getMobileTel() != null) {
            _hashCode += getMobileTel().hashCode();
        }
        if (getReturnFee() != null) {
            _hashCode += getReturnFee().hashCode();
        }
        if (getReturnNotice() != null) {
            _hashCode += getReturnNotice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtraInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ExtraInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnTel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnTel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mobileTel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MobileTel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnNotice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnNotice"));
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
