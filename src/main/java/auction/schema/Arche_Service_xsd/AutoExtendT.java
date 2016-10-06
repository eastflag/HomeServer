/**
 * AutoExtendT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class AutoExtendT  implements java.io.Serializable {
    private int extsDays;  // attribute

    private boolean extsLimitYN;  // attribute

    private java.util.Calendar extsExpireDt;  // attribute

    public AutoExtendT() {
    }

    public AutoExtendT(
           int extsDays,
           boolean extsLimitYN,
           java.util.Calendar extsExpireDt) {
           this.extsDays = extsDays;
           this.extsLimitYN = extsLimitYN;
           this.extsExpireDt = extsExpireDt;
    }


    /**
     * Gets the extsDays value for this AutoExtendT.
     * 
     * @return extsDays
     */
    public int getExtsDays() {
        return extsDays;
    }


    /**
     * Sets the extsDays value for this AutoExtendT.
     * 
     * @param extsDays
     */
    public void setExtsDays(int extsDays) {
        this.extsDays = extsDays;
    }


    /**
     * Gets the extsLimitYN value for this AutoExtendT.
     * 
     * @return extsLimitYN
     */
    public boolean isExtsLimitYN() {
        return extsLimitYN;
    }


    /**
     * Sets the extsLimitYN value for this AutoExtendT.
     * 
     * @param extsLimitYN
     */
    public void setExtsLimitYN(boolean extsLimitYN) {
        this.extsLimitYN = extsLimitYN;
    }


    /**
     * Gets the extsExpireDt value for this AutoExtendT.
     * 
     * @return extsExpireDt
     */
    public java.util.Calendar getExtsExpireDt() {
        return extsExpireDt;
    }


    /**
     * Sets the extsExpireDt value for this AutoExtendT.
     * 
     * @param extsExpireDt
     */
    public void setExtsExpireDt(java.util.Calendar extsExpireDt) {
        this.extsExpireDt = extsExpireDt;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AutoExtendT)) return false;
        AutoExtendT other = (AutoExtendT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.extsDays == other.getExtsDays() &&
            this.extsLimitYN == other.isExtsLimitYN() &&
            ((this.extsExpireDt==null && other.getExtsExpireDt()==null) || 
             (this.extsExpireDt!=null &&
              this.extsExpireDt.equals(other.getExtsExpireDt())));
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
        _hashCode += getExtsDays();
        _hashCode += (isExtsLimitYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtsExpireDt() != null) {
            _hashCode += getExtsExpireDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoExtendT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AutoExtendT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extsDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExtsDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extsLimitYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExtsLimitYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extsExpireDt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExtsExpireDt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
