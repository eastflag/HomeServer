/**
 * ItemOfficialNotiGroupT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemOfficialNotiGroupT  implements java.io.Serializable {
    private int notiItemGroupNo;  // attribute

    private String notiItemGroupName;  // attribute

    public ItemOfficialNotiGroupT() {
    }

    public ItemOfficialNotiGroupT(
           int notiItemGroupNo,
           String notiItemGroupName) {
           this.notiItemGroupNo = notiItemGroupNo;
           this.notiItemGroupName = notiItemGroupName;
    }


    /**
     * Gets the notiItemGroupNo value for this ItemOfficialNotiGroupT.
     * 
     * @return notiItemGroupNo
     */
    public int getNotiItemGroupNo() {
        return notiItemGroupNo;
    }


    /**
     * Sets the notiItemGroupNo value for this ItemOfficialNotiGroupT.
     * 
     * @param notiItemGroupNo
     */
    public void setNotiItemGroupNo(int notiItemGroupNo) {
        this.notiItemGroupNo = notiItemGroupNo;
    }


    /**
     * Gets the notiItemGroupName value for this ItemOfficialNotiGroupT.
     * 
     * @return notiItemGroupName
     */
    public String getNotiItemGroupName() {
        return notiItemGroupName;
    }


    /**
     * Sets the notiItemGroupName value for this ItemOfficialNotiGroupT.
     * 
     * @param notiItemGroupName
     */
    public void setNotiItemGroupName(String notiItemGroupName) {
        this.notiItemGroupName = notiItemGroupName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemOfficialNotiGroupT)) return false;
        ItemOfficialNotiGroupT other = (ItemOfficialNotiGroupT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notiItemGroupNo == other.getNotiItemGroupNo() &&
            ((this.notiItemGroupName==null && other.getNotiItemGroupName()==null) || 
             (this.notiItemGroupName!=null &&
              this.notiItemGroupName.equals(other.getNotiItemGroupName())));
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
        _hashCode += getNotiItemGroupNo();
        if (getNotiItemGroupName() != null) {
            _hashCode += getNotiItemGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemOfficialNotiGroupT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiGroupT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemGroupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemGroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notiItemGroupName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotiItemGroupName"));
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
