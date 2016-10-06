/**
 * ItemOfficialNotiCodeT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemOfficialNotiCodeT  implements java.io.Serializable {
    private String notiItemCode;  // attribute

    private String notiItemCodeName;  // attribute

    private boolean essenIs;  // attribute

    private String guideText;  // attribute

    public ItemOfficialNotiCodeT() {
    }

    public ItemOfficialNotiCodeT(
           String notiItemCode,
           String notiItemCodeName,
           boolean essenIs,
           String guideText) {
           this.notiItemCode = notiItemCode;
           this.notiItemCodeName = notiItemCodeName;
           this.essenIs = essenIs;
           this.guideText = guideText;
    }


    /**
     * Gets the notiItemCode value for this ItemOfficialNotiCodeT.
     * 
     * @return notiItemCode
     */
    public String getNotiItemCode() {
        return notiItemCode;
    }


    /**
     * Sets the notiItemCode value for this ItemOfficialNotiCodeT.
     * 
     * @param notiItemCode
     */
    public void setNotiItemCode(String notiItemCode) {
        this.notiItemCode = notiItemCode;
    }


    /**
     * Gets the notiItemCodeName value for this ItemOfficialNotiCodeT.
     * 
     * @return notiItemCodeName
     */
    public String getNotiItemCodeName() {
        return notiItemCodeName;
    }


    /**
     * Sets the notiItemCodeName value for this ItemOfficialNotiCodeT.
     * 
     * @param notiItemCodeName
     */
    public void setNotiItemCodeName(String notiItemCodeName) {
        this.notiItemCodeName = notiItemCodeName;
    }


    /**
     * Gets the essenIs value for this ItemOfficialNotiCodeT.
     * 
     * @return essenIs
     */
    public boolean isEssenIs() {
        return essenIs;
    }


    /**
     * Sets the essenIs value for this ItemOfficialNotiCodeT.
     * 
     * @param essenIs
     */
    public void setEssenIs(boolean essenIs) {
        this.essenIs = essenIs;
    }


    /**
     * Gets the guideText value for this ItemOfficialNotiCodeT.
     * 
     * @return guideText
     */
    public String getGuideText() {
        return guideText;
    }


    /**
     * Sets the guideText value for this ItemOfficialNotiCodeT.
     * 
     * @param guideText
     */
    public void setGuideText(String guideText) {
        this.guideText = guideText;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemOfficialNotiCodeT)) return false;
        ItemOfficialNotiCodeT other = (ItemOfficialNotiCodeT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notiItemCode==null && other.getNotiItemCode()==null) || 
             (this.notiItemCode!=null &&
              this.notiItemCode.equals(other.getNotiItemCode()))) &&
            ((this.notiItemCodeName==null && other.getNotiItemCodeName()==null) || 
             (this.notiItemCodeName!=null &&
              this.notiItemCodeName.equals(other.getNotiItemCodeName()))) &&
            this.essenIs == other.isEssenIs() &&
            ((this.guideText==null && other.getGuideText()==null) || 
             (this.guideText!=null &&
              this.guideText.equals(other.getGuideText())));
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
        if (getNotiItemCode() != null) {
            _hashCode += getNotiItemCode().hashCode();
        }
        if (getNotiItemCodeName() != null) {
            _hashCode += getNotiItemCodeName().hashCode();
        }
        _hashCode += (isEssenIs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGuideText() != null) {
            _hashCode += getGuideText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemOfficialNotiCodeT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiCodeT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemCodeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemCodeName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("essenIs");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EssenIs"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("guideText");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GuideText"));
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
