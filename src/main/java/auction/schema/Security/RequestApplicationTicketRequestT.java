/**
 * RequestApplicationTicketRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Security;

public class RequestApplicationTicketRequestT  implements java.io.Serializable {
    private String devID;  // attribute

    private String appID;  // attribute

    private String appPassword;  // attribute

    public RequestApplicationTicketRequestT() {
    }

    public RequestApplicationTicketRequestT(
           String devID,
           String appID,
           String appPassword) {
           this.devID = devID;
           this.appID = appID;
           this.appPassword = appPassword;
    }


    /**
     * Gets the devID value for this RequestApplicationTicketRequestT.
     * 
     * @return devID
     */
    public String getDevID() {
        return devID;
    }


    /**
     * Sets the devID value for this RequestApplicationTicketRequestT.
     * 
     * @param devID
     */
    public void setDevID(String devID) {
        this.devID = devID;
    }


    /**
     * Gets the appID value for this RequestApplicationTicketRequestT.
     * 
     * @return appID
     */
    public String getAppID() {
        return appID;
    }


    /**
     * Sets the appID value for this RequestApplicationTicketRequestT.
     * 
     * @param appID
     */
    public void setAppID(String appID) {
        this.appID = appID;
    }


    /**
     * Gets the appPassword value for this RequestApplicationTicketRequestT.
     * 
     * @return appPassword
     */
    public String getAppPassword() {
        return appPassword;
    }


    /**
     * Sets the appPassword value for this RequestApplicationTicketRequestT.
     * 
     * @param appPassword
     */
    public void setAppPassword(String appPassword) {
        this.appPassword = appPassword;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestApplicationTicketRequestT)) return false;
        RequestApplicationTicketRequestT other = (RequestApplicationTicketRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devID==null && other.getDevID()==null) || 
             (this.devID!=null &&
              this.devID.equals(other.getDevID()))) &&
            ((this.appID==null && other.getAppID()==null) || 
             (this.appID!=null &&
              this.appID.equals(other.getAppID()))) &&
            ((this.appPassword==null && other.getAppPassword()==null) || 
             (this.appPassword!=null &&
              this.appPassword.equals(other.getAppPassword())));
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
        if (getDevID() != null) {
            _hashCode += getDevID().hashCode();
        }
        if (getAppID() != null) {
            _hashCode += getAppID().hashCode();
        }
        if (getAppPassword() != null) {
            _hashCode += getAppPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestApplicationTicketRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.APISvc.xsd", "RequestApplicationTicketRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("devID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DevID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("appID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AppID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("appPassword");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AppPassword"));
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
