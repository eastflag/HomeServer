/**
 * ReviseAttributeResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class ReviseAttributeResponseT  implements java.io.Serializable {
    private String itemNo;  // attribute

    private String result;  // attribute

    private String reason;  // attribute

    public ReviseAttributeResponseT() {
    }

    public ReviseAttributeResponseT(
           String itemNo,
           String result,
           String reason) {
           this.itemNo = itemNo;
           this.result = result;
           this.reason = reason;
    }


    /**
     * Gets the itemNo value for this ReviseAttributeResponseT.
     * 
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this ReviseAttributeResponseT.
     * 
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the result value for this ReviseAttributeResponseT.
     * 
     * @return result
     */
    public String getResult() {
        return result;
    }


    /**
     * Sets the result value for this ReviseAttributeResponseT.
     * 
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }


    /**
     * Gets the reason value for this ReviseAttributeResponseT.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ReviseAttributeResponseT.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReviseAttributeResponseT)) return false;
        ReviseAttributeResponseT other = (ReviseAttributeResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNo==null && other.getItemNo()==null) || 
             (this.itemNo!=null &&
              this.itemNo.equals(other.getItemNo()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getItemNo() != null) {
            _hashCode += getItemNo().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviseAttributeResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseAttributeResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("result");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResultVO"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reason");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
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
