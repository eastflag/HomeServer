/**
 * BookInfoT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class BookInfoT  implements java.io.Serializable {
    private String originalTitle;  // attribute

    private String author;  // attribute

    private String translator;  // attribute

    private String publisher;  // attribute

    private java.math.BigDecimal bookPrice;  // attribute

    public BookInfoT() {
    }

    public BookInfoT(
           String originalTitle,
           String author,
           String translator,
           String publisher,
           java.math.BigDecimal bookPrice) {
           this.originalTitle = originalTitle;
           this.author = author;
           this.translator = translator;
           this.publisher = publisher;
           this.bookPrice = bookPrice;
    }


    /**
     * Gets the originalTitle value for this BookInfoT.
     * 
     * @return originalTitle
     */
    public String getOriginalTitle() {
        return originalTitle;
    }


    /**
     * Sets the originalTitle value for this BookInfoT.
     * 
     * @param originalTitle
     */
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }


    /**
     * Gets the author value for this BookInfoT.
     * 
     * @return author
     */
    public String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this BookInfoT.
     * 
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * Gets the translator value for this BookInfoT.
     * 
     * @return translator
     */
    public String getTranslator() {
        return translator;
    }


    /**
     * Sets the translator value for this BookInfoT.
     * 
     * @param translator
     */
    public void setTranslator(String translator) {
        this.translator = translator;
    }


    /**
     * Gets the publisher value for this BookInfoT.
     * 
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this BookInfoT.
     * 
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the bookPrice value for this BookInfoT.
     * 
     * @return bookPrice
     */
    public java.math.BigDecimal getBookPrice() {
        return bookPrice;
    }


    /**
     * Sets the bookPrice value for this BookInfoT.
     * 
     * @param bookPrice
     */
    public void setBookPrice(java.math.BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BookInfoT)) return false;
        BookInfoT other = (BookInfoT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalTitle==null && other.getOriginalTitle()==null) || 
             (this.originalTitle!=null &&
              this.originalTitle.equals(other.getOriginalTitle()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.translator==null && other.getTranslator()==null) || 
             (this.translator!=null &&
              this.translator.equals(other.getTranslator()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.bookPrice==null && other.getBookPrice()==null) || 
             (this.bookPrice!=null &&
              this.bookPrice.equals(other.getBookPrice())));
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
        if (getOriginalTitle() != null) {
            _hashCode += getOriginalTitle().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getTranslator() != null) {
            _hashCode += getTranslator().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getBookPrice() != null) {
            _hashCode += getBookPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookInfoT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BookInfoT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originalTitle");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginalTitle"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("author");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("translator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Translator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("publisher");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Publisher"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bookPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BookPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
