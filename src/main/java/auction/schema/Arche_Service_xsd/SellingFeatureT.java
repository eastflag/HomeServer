/**
 * SellingFeatureT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class SellingFeatureT  implements java.io.Serializable {
    private PeriodT period;

    private AutoExtendT autoExtend;

    private FeatureTypeCode featureType;  // attribute

    private int applyingCoupon;  // attribute

    public SellingFeatureT() {
    }

    public SellingFeatureT(
           PeriodT period,
           AutoExtendT autoExtend,
           FeatureTypeCode featureType,
           int applyingCoupon) {
           this.period = period;
           this.autoExtend = autoExtend;
           this.featureType = featureType;
           this.applyingCoupon = applyingCoupon;
    }


    /**
     * Gets the period value for this SellingFeatureT.
     * 
     * @return period
     */
    public PeriodT getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this SellingFeatureT.
     * 
     * @param period
     */
    public void setPeriod(PeriodT period) {
        this.period = period;
    }


    /**
     * Gets the autoExtend value for this SellingFeatureT.
     * 
     * @return autoExtend
     */
    public AutoExtendT getAutoExtend() {
        return autoExtend;
    }


    /**
     * Sets the autoExtend value for this SellingFeatureT.
     * 
     * @param autoExtend
     */
    public void setAutoExtend(AutoExtendT autoExtend) {
        this.autoExtend = autoExtend;
    }


    /**
     * Gets the featureType value for this SellingFeatureT.
     * 
     * @return featureType
     */
    public FeatureTypeCode getFeatureType() {
        return featureType;
    }


    /**
     * Sets the featureType value for this SellingFeatureT.
     * 
     * @param featureType
     */
    public void setFeatureType(FeatureTypeCode featureType) {
        this.featureType = featureType;
    }


    /**
     * Gets the applyingCoupon value for this SellingFeatureT.
     * 
     * @return applyingCoupon
     */
    public int getApplyingCoupon() {
        return applyingCoupon;
    }


    /**
     * Sets the applyingCoupon value for this SellingFeatureT.
     * 
     * @param applyingCoupon
     */
    public void setApplyingCoupon(int applyingCoupon) {
        this.applyingCoupon = applyingCoupon;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SellingFeatureT)) return false;
        SellingFeatureT other = (SellingFeatureT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.autoExtend==null && other.getAutoExtend()==null) || 
             (this.autoExtend!=null &&
              this.autoExtend.equals(other.getAutoExtend()))) &&
            ((this.featureType==null && other.getFeatureType()==null) || 
             (this.featureType!=null &&
              this.featureType.equals(other.getFeatureType()))) &&
            this.applyingCoupon == other.getApplyingCoupon();
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getAutoExtend() != null) {
            _hashCode += getAutoExtend().hashCode();
        }
        if (getFeatureType() != null) {
            _hashCode += getFeatureType().hashCode();
        }
        _hashCode += getApplyingCoupon();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellingFeatureT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingFeatureT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("featureType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FeatureType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FeatureTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyingCoupon");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyingCoupon"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExtend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AutoExtend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AutoExtendT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
