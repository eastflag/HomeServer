/**
 * SubFavoriteModelT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class SubFavoriteModelT  implements java.io.Serializable {
    private long catalogID;  // attribute

    private String attributeElementName;  // attribute

    private int matchingItemCnt;  // attribute

    private java.math.BigDecimal lowestPrice;  // attribute

    private String lowestItemNo;  // attribute

    public SubFavoriteModelT() {
    }

    public SubFavoriteModelT(
           long catalogID,
           String attributeElementName,
           int matchingItemCnt,
           java.math.BigDecimal lowestPrice,
           String lowestItemNo) {
           this.catalogID = catalogID;
           this.attributeElementName = attributeElementName;
           this.matchingItemCnt = matchingItemCnt;
           this.lowestPrice = lowestPrice;
           this.lowestItemNo = lowestItemNo;
    }


    /**
     * Gets the catalogID value for this SubFavoriteModelT.
     * 
     * @return catalogID
     */
    public long getCatalogID() {
        return catalogID;
    }


    /**
     * Sets the catalogID value for this SubFavoriteModelT.
     * 
     * @param catalogID
     */
    public void setCatalogID(long catalogID) {
        this.catalogID = catalogID;
    }


    /**
     * Gets the attributeElementName value for this SubFavoriteModelT.
     * 
     * @return attributeElementName
     */
    public String getAttributeElementName() {
        return attributeElementName;
    }


    /**
     * Sets the attributeElementName value for this SubFavoriteModelT.
     * 
     * @param attributeElementName
     */
    public void setAttributeElementName(String attributeElementName) {
        this.attributeElementName = attributeElementName;
    }


    /**
     * Gets the matchingItemCnt value for this SubFavoriteModelT.
     * 
     * @return matchingItemCnt
     */
    public int getMatchingItemCnt() {
        return matchingItemCnt;
    }


    /**
     * Sets the matchingItemCnt value for this SubFavoriteModelT.
     * 
     * @param matchingItemCnt
     */
    public void setMatchingItemCnt(int matchingItemCnt) {
        this.matchingItemCnt = matchingItemCnt;
    }


    /**
     * Gets the lowestPrice value for this SubFavoriteModelT.
     * 
     * @return lowestPrice
     */
    public java.math.BigDecimal getLowestPrice() {
        return lowestPrice;
    }


    /**
     * Sets the lowestPrice value for this SubFavoriteModelT.
     * 
     * @param lowestPrice
     */
    public void setLowestPrice(java.math.BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }


    /**
     * Gets the lowestItemNo value for this SubFavoriteModelT.
     * 
     * @return lowestItemNo
     */
    public String getLowestItemNo() {
        return lowestItemNo;
    }


    /**
     * Sets the lowestItemNo value for this SubFavoriteModelT.
     * 
     * @param lowestItemNo
     */
    public void setLowestItemNo(String lowestItemNo) {
        this.lowestItemNo = lowestItemNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubFavoriteModelT)) return false;
        SubFavoriteModelT other = (SubFavoriteModelT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.catalogID == other.getCatalogID() &&
            ((this.attributeElementName==null && other.getAttributeElementName()==null) || 
             (this.attributeElementName!=null &&
              this.attributeElementName.equals(other.getAttributeElementName()))) &&
            this.matchingItemCnt == other.getMatchingItemCnt() &&
            ((this.lowestPrice==null && other.getLowestPrice()==null) || 
             (this.lowestPrice!=null &&
              this.lowestPrice.equals(other.getLowestPrice()))) &&
            ((this.lowestItemNo==null && other.getLowestItemNo()==null) || 
             (this.lowestItemNo!=null &&
              this.lowestItemNo.equals(other.getLowestItemNo())));
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
        _hashCode += new Long(getCatalogID()).hashCode();
        if (getAttributeElementName() != null) {
            _hashCode += getAttributeElementName().hashCode();
        }
        _hashCode += getMatchingItemCnt();
        if (getLowestPrice() != null) {
            _hashCode += getLowestPrice().hashCode();
        }
        if (getLowestItemNo() != null) {
            _hashCode += getLowestItemNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubFavoriteModelT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "subFavoriteModelT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attributeElementName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttributeElementName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("matchingItemCnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MatchingItemCnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lowestPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LowestPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lowestItemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LowestItemNo"));
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
