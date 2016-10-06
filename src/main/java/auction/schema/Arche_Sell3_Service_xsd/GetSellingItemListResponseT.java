/**
 * GetSellingItemListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class GetSellingItemListResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.SellingItemListT searchResult;

    private int totalCount;  // attribute

    public GetSellingItemListResponseT() {
    }

    public GetSellingItemListResponseT(
           auction.schema.Arche_Service_xsd.SellingItemListT searchResult,
           int totalCount) {
           this.searchResult = searchResult;
           this.totalCount = totalCount;
    }


    /**
     * Gets the searchResult value for this GetSellingItemListResponseT.
     * 
     * @return searchResult
     */
    public auction.schema.Arche_Service_xsd.SellingItemListT getSearchResult() {
        return searchResult;
    }


    /**
     * Sets the searchResult value for this GetSellingItemListResponseT.
     * 
     * @param searchResult
     */
    public void setSearchResult(auction.schema.Arche_Service_xsd.SellingItemListT searchResult) {
        this.searchResult = searchResult;
    }


    /**
     * Gets the totalCount value for this GetSellingItemListResponseT.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this GetSellingItemListResponseT.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetSellingItemListResponseT)) return false;
        GetSellingItemListResponseT other = (GetSellingItemListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchResult==null && other.getSearchResult()==null) || 
             (this.searchResult!=null &&
              this.searchResult.equals(other.getSearchResult()))) &&
            this.totalCount == other.getTotalCount();
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
        if (getSearchResult() != null) {
            _hashCode += getSearchResult().hashCode();
        }
        _hashCode += getTotalCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSellingItemListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellingItemListResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TotalCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "SearchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListT"));
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
