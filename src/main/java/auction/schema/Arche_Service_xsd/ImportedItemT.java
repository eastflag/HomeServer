/**
 * ImportedItemT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ImportedItemT  implements java.io.Serializable {
    private String nation;  // attribute

    private String importAgency;  // attribute

    private boolean isMultiple;  // attribute

    public ImportedItemT() {
    }

    public ImportedItemT(
           String nation,
           String importAgency,
           boolean isMultiple) {
           this.nation = nation;
           this.importAgency = importAgency;
           this.isMultiple = isMultiple;
    }


    /**
     * Gets the nation value for this ImportedItemT.
     * 
     * @return nation
     */
    public String getNation() {
        return nation;
    }


    /**
     * Sets the nation value for this ImportedItemT.
     * 
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }


    /**
     * Gets the importAgency value for this ImportedItemT.
     * 
     * @return importAgency
     */
    public String getImportAgency() {
        return importAgency;
    }


    /**
     * Sets the importAgency value for this ImportedItemT.
     * 
     * @param importAgency
     */
    public void setImportAgency(String importAgency) {
        this.importAgency = importAgency;
    }


    /**
     * Gets the isMultiple value for this ImportedItemT.
     * 
     * @return isMultiple
     */
    public boolean isIsMultiple() {
        return isMultiple;
    }


    /**
     * Sets the isMultiple value for this ImportedItemT.
     * 
     * @param isMultiple
     */
    public void setIsMultiple(boolean isMultiple) {
        this.isMultiple = isMultiple;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ImportedItemT)) return false;
        ImportedItemT other = (ImportedItemT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nation==null && other.getNation()==null) || 
             (this.nation!=null &&
              this.nation.equals(other.getNation()))) &&
            ((this.importAgency==null && other.getImportAgency()==null) || 
             (this.importAgency!=null &&
              this.importAgency.equals(other.getImportAgency()))) &&
            this.isMultiple == other.isIsMultiple();
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
        if (getNation() != null) {
            _hashCode += getNation().hashCode();
        }
        if (getImportAgency() != null) {
            _hashCode += getImportAgency().hashCode();
        }
        _hashCode += (isIsMultiple() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportedItemT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ImportedItemT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Nation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("importAgency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImportAgency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMultiple");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMultiple"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
