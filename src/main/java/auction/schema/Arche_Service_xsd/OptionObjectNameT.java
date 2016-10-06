/**
 * OptionObjectNameT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class OptionObjectNameT  implements java.io.Serializable {
    private String claseName1;  // attribute

    private long objOptNo1;  // attribute

    private String claseName2;  // attribute

    private long objOptNo2;  // attribute

    private String claseName3;  // attribute

    private long objOptNo3;  // attribute

    private String claseName4;  // attribute

    private long objOptNo4;  // attribute

    private String claseName5;  // attribute

    private long objOptNo5;  // attribute

    public OptionObjectNameT() {
    }

    public OptionObjectNameT(
           String claseName1,
           long objOptNo1,
           String claseName2,
           long objOptNo2,
           String claseName3,
           long objOptNo3,
           String claseName4,
           long objOptNo4,
           String claseName5,
           long objOptNo5) {
           this.claseName1 = claseName1;
           this.objOptNo1 = objOptNo1;
           this.claseName2 = claseName2;
           this.objOptNo2 = objOptNo2;
           this.claseName3 = claseName3;
           this.objOptNo3 = objOptNo3;
           this.claseName4 = claseName4;
           this.objOptNo4 = objOptNo4;
           this.claseName5 = claseName5;
           this.objOptNo5 = objOptNo5;
    }


    /**
     * Gets the claseName1 value for this OptionObjectNameT.
     * 
     * @return claseName1
     */
    public String getClaseName1() {
        return claseName1;
    }


    /**
     * Sets the claseName1 value for this OptionObjectNameT.
     * 
     * @param claseName1
     */
    public void setClaseName1(String claseName1) {
        this.claseName1 = claseName1;
    }


    /**
     * Gets the objOptNo1 value for this OptionObjectNameT.
     * 
     * @return objOptNo1
     */
    public long getObjOptNo1() {
        return objOptNo1;
    }


    /**
     * Sets the objOptNo1 value for this OptionObjectNameT.
     * 
     * @param objOptNo1
     */
    public void setObjOptNo1(long objOptNo1) {
        this.objOptNo1 = objOptNo1;
    }


    /**
     * Gets the claseName2 value for this OptionObjectNameT.
     * 
     * @return claseName2
     */
    public String getClaseName2() {
        return claseName2;
    }


    /**
     * Sets the claseName2 value for this OptionObjectNameT.
     * 
     * @param claseName2
     */
    public void setClaseName2(String claseName2) {
        this.claseName2 = claseName2;
    }


    /**
     * Gets the objOptNo2 value for this OptionObjectNameT.
     * 
     * @return objOptNo2
     */
    public long getObjOptNo2() {
        return objOptNo2;
    }


    /**
     * Sets the objOptNo2 value for this OptionObjectNameT.
     * 
     * @param objOptNo2
     */
    public void setObjOptNo2(long objOptNo2) {
        this.objOptNo2 = objOptNo2;
    }


    /**
     * Gets the claseName3 value for this OptionObjectNameT.
     * 
     * @return claseName3
     */
    public String getClaseName3() {
        return claseName3;
    }


    /**
     * Sets the claseName3 value for this OptionObjectNameT.
     * 
     * @param claseName3
     */
    public void setClaseName3(String claseName3) {
        this.claseName3 = claseName3;
    }


    /**
     * Gets the objOptNo3 value for this OptionObjectNameT.
     * 
     * @return objOptNo3
     */
    public long getObjOptNo3() {
        return objOptNo3;
    }


    /**
     * Sets the objOptNo3 value for this OptionObjectNameT.
     * 
     * @param objOptNo3
     */
    public void setObjOptNo3(long objOptNo3) {
        this.objOptNo3 = objOptNo3;
    }


    /**
     * Gets the claseName4 value for this OptionObjectNameT.
     * 
     * @return claseName4
     */
    public String getClaseName4() {
        return claseName4;
    }


    /**
     * Sets the claseName4 value for this OptionObjectNameT.
     * 
     * @param claseName4
     */
    public void setClaseName4(String claseName4) {
        this.claseName4 = claseName4;
    }


    /**
     * Gets the objOptNo4 value for this OptionObjectNameT.
     * 
     * @return objOptNo4
     */
    public long getObjOptNo4() {
        return objOptNo4;
    }


    /**
     * Sets the objOptNo4 value for this OptionObjectNameT.
     * 
     * @param objOptNo4
     */
    public void setObjOptNo4(long objOptNo4) {
        this.objOptNo4 = objOptNo4;
    }


    /**
     * Gets the claseName5 value for this OptionObjectNameT.
     * 
     * @return claseName5
     */
    public String getClaseName5() {
        return claseName5;
    }


    /**
     * Sets the claseName5 value for this OptionObjectNameT.
     * 
     * @param claseName5
     */
    public void setClaseName5(String claseName5) {
        this.claseName5 = claseName5;
    }


    /**
     * Gets the objOptNo5 value for this OptionObjectNameT.
     * 
     * @return objOptNo5
     */
    public long getObjOptNo5() {
        return objOptNo5;
    }


    /**
     * Sets the objOptNo5 value for this OptionObjectNameT.
     * 
     * @param objOptNo5
     */
    public void setObjOptNo5(long objOptNo5) {
        this.objOptNo5 = objOptNo5;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OptionObjectNameT)) return false;
        OptionObjectNameT other = (OptionObjectNameT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claseName1==null && other.getClaseName1()==null) || 
             (this.claseName1!=null &&
              this.claseName1.equals(other.getClaseName1()))) &&
            this.objOptNo1 == other.getObjOptNo1() &&
            ((this.claseName2==null && other.getClaseName2()==null) || 
             (this.claseName2!=null &&
              this.claseName2.equals(other.getClaseName2()))) &&
            this.objOptNo2 == other.getObjOptNo2() &&
            ((this.claseName3==null && other.getClaseName3()==null) || 
             (this.claseName3!=null &&
              this.claseName3.equals(other.getClaseName3()))) &&
            this.objOptNo3 == other.getObjOptNo3() &&
            ((this.claseName4==null && other.getClaseName4()==null) || 
             (this.claseName4!=null &&
              this.claseName4.equals(other.getClaseName4()))) &&
            this.objOptNo4 == other.getObjOptNo4() &&
            ((this.claseName5==null && other.getClaseName5()==null) || 
             (this.claseName5!=null &&
              this.claseName5.equals(other.getClaseName5()))) &&
            this.objOptNo5 == other.getObjOptNo5();
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
        if (getClaseName1() != null) {
            _hashCode += getClaseName1().hashCode();
        }
        _hashCode += new Long(getObjOptNo1()).hashCode();
        if (getClaseName2() != null) {
            _hashCode += getClaseName2().hashCode();
        }
        _hashCode += new Long(getObjOptNo2()).hashCode();
        if (getClaseName3() != null) {
            _hashCode += getClaseName3().hashCode();
        }
        _hashCode += new Long(getObjOptNo3()).hashCode();
        if (getClaseName4() != null) {
            _hashCode += getClaseName4().hashCode();
        }
        _hashCode += new Long(getObjOptNo4()).hashCode();
        if (getClaseName5() != null) {
            _hashCode += getClaseName5().hashCode();
        }
        _hashCode += new Long(getObjOptNo5()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OptionObjectNameT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OptionObjectNameT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptNo1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptNo1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptNo2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptNo2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName3");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName3"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptNo3");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptNo3"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName4");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName4"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptNo4");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptNo4"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claseName5");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClaseName5"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objOptNo5");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObjOptNo5"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
