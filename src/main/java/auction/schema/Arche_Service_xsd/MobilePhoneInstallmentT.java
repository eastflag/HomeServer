/**
 * MobilePhoneInstallmentT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class MobilePhoneInstallmentT  implements java.io.Serializable {
    private int principal;  // attribute

    private short installmentCount;  // attribute

    private int payment;  // attribute

    private int subsidy;  // attribute

    public MobilePhoneInstallmentT() {
    }

    public MobilePhoneInstallmentT(
           int principal,
           short installmentCount,
           int payment,
           int subsidy) {
           this.principal = principal;
           this.installmentCount = installmentCount;
           this.payment = payment;
           this.subsidy = subsidy;
    }


    /**
     * Gets the principal value for this MobilePhoneInstallmentT.
     * 
     * @return principal
     */
    public int getPrincipal() {
        return principal;
    }


    /**
     * Sets the principal value for this MobilePhoneInstallmentT.
     * 
     * @param principal
     */
    public void setPrincipal(int principal) {
        this.principal = principal;
    }


    /**
     * Gets the installmentCount value for this MobilePhoneInstallmentT.
     * 
     * @return installmentCount
     */
    public short getInstallmentCount() {
        return installmentCount;
    }


    /**
     * Sets the installmentCount value for this MobilePhoneInstallmentT.
     * 
     * @param installmentCount
     */
    public void setInstallmentCount(short installmentCount) {
        this.installmentCount = installmentCount;
    }


    /**
     * Gets the payment value for this MobilePhoneInstallmentT.
     * 
     * @return payment
     */
    public int getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this MobilePhoneInstallmentT.
     * 
     * @param payment
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }


    /**
     * Gets the subsidy value for this MobilePhoneInstallmentT.
     * 
     * @return subsidy
     */
    public int getSubsidy() {
        return subsidy;
    }


    /**
     * Sets the subsidy value for this MobilePhoneInstallmentT.
     * 
     * @param subsidy
     */
    public void setSubsidy(int subsidy) {
        this.subsidy = subsidy;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MobilePhoneInstallmentT)) return false;
        MobilePhoneInstallmentT other = (MobilePhoneInstallmentT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.principal == other.getPrincipal() &&
            this.installmentCount == other.getInstallmentCount() &&
            this.payment == other.getPayment() &&
            this.subsidy == other.getSubsidy();
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
        _hashCode += getPrincipal();
        _hashCode += getInstallmentCount();
        _hashCode += getPayment();
        _hashCode += getSubsidy();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobilePhoneInstallmentT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MobilePhoneInstallmentT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("principal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Principal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("installmentCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InstallmentCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("payment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Payment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("subsidy");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Subsidy"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
