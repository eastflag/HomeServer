/**
 * ItemPictureUsedMarketT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemPictureUsedMarketT  implements java.io.Serializable {
    private PictureT picture1;

    private PictureT picture2;

    private PictureT picture3;

    private PictureT picture4;

    private PictureT picture5;

    public ItemPictureUsedMarketT() {
    }

    public ItemPictureUsedMarketT(
           PictureT picture1,
           PictureT picture2,
           PictureT picture3,
           PictureT picture4,
           PictureT picture5) {
           this.picture1 = picture1;
           this.picture2 = picture2;
           this.picture3 = picture3;
           this.picture4 = picture4;
           this.picture5 = picture5;
    }


    /**
     * Gets the picture1 value for this ItemPictureUsedMarketT.
     * 
     * @return picture1
     */
    public PictureT getPicture1() {
        return picture1;
    }


    /**
     * Sets the picture1 value for this ItemPictureUsedMarketT.
     * 
     * @param picture1
     */
    public void setPicture1(PictureT picture1) {
        this.picture1 = picture1;
    }


    /**
     * Gets the picture2 value for this ItemPictureUsedMarketT.
     * 
     * @return picture2
     */
    public PictureT getPicture2() {
        return picture2;
    }


    /**
     * Sets the picture2 value for this ItemPictureUsedMarketT.
     * 
     * @param picture2
     */
    public void setPicture2(PictureT picture2) {
        this.picture2 = picture2;
    }


    /**
     * Gets the picture3 value for this ItemPictureUsedMarketT.
     * 
     * @return picture3
     */
    public PictureT getPicture3() {
        return picture3;
    }


    /**
     * Sets the picture3 value for this ItemPictureUsedMarketT.
     * 
     * @param picture3
     */
    public void setPicture3(PictureT picture3) {
        this.picture3 = picture3;
    }


    /**
     * Gets the picture4 value for this ItemPictureUsedMarketT.
     * 
     * @return picture4
     */
    public PictureT getPicture4() {
        return picture4;
    }


    /**
     * Sets the picture4 value for this ItemPictureUsedMarketT.
     * 
     * @param picture4
     */
    public void setPicture4(PictureT picture4) {
        this.picture4 = picture4;
    }


    /**
     * Gets the picture5 value for this ItemPictureUsedMarketT.
     * 
     * @return picture5
     */
    public PictureT getPicture5() {
        return picture5;
    }


    /**
     * Sets the picture5 value for this ItemPictureUsedMarketT.
     * 
     * @param picture5
     */
    public void setPicture5(PictureT picture5) {
        this.picture5 = picture5;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemPictureUsedMarketT)) return false;
        ItemPictureUsedMarketT other = (ItemPictureUsedMarketT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.picture1==null && other.getPicture1()==null) || 
             (this.picture1!=null &&
              this.picture1.equals(other.getPicture1()))) &&
            ((this.picture2==null && other.getPicture2()==null) || 
             (this.picture2!=null &&
              this.picture2.equals(other.getPicture2()))) &&
            ((this.picture3==null && other.getPicture3()==null) || 
             (this.picture3!=null &&
              this.picture3.equals(other.getPicture3()))) &&
            ((this.picture4==null && other.getPicture4()==null) || 
             (this.picture4!=null &&
              this.picture4.equals(other.getPicture4()))) &&
            ((this.picture5==null && other.getPicture5()==null) || 
             (this.picture5!=null &&
              this.picture5.equals(other.getPicture5())));
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
        if (getPicture1() != null) {
            _hashCode += getPicture1().hashCode();
        }
        if (getPicture2() != null) {
            _hashCode += getPicture2().hashCode();
        }
        if (getPicture3() != null) {
            _hashCode += getPicture3().hashCode();
        }
        if (getPicture4() != null) {
            _hashCode += getPicture4().hashCode();
        }
        if (getPicture5() != null) {
            _hashCode += getPicture5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemPictureUsedMarketT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPictureUsedMarketT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Picture1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Picture2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Picture3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Picture4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Picture5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PictureT"));
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
