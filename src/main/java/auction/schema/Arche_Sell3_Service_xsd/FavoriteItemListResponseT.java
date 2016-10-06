/**
 * FavoriteItemListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteItemListResponseT  implements java.io.Serializable {
    private auction.schema.Arche_Service_xsd.FavoriteItemT[] favoriteItem;

    private int totalCount;  // attribute

    public FavoriteItemListResponseT() {
    }

    public FavoriteItemListResponseT(
           auction.schema.Arche_Service_xsd.FavoriteItemT[] favoriteItem,
           int totalCount) {
           this.favoriteItem = favoriteItem;
           this.totalCount = totalCount;
    }


    /**
     * Gets the favoriteItem value for this FavoriteItemListResponseT.
     * 
     * @return favoriteItem
     */
    public auction.schema.Arche_Service_xsd.FavoriteItemT[] getFavoriteItem() {
        return favoriteItem;
    }


    /**
     * Sets the favoriteItem value for this FavoriteItemListResponseT.
     * 
     * @param favoriteItem
     */
    public void setFavoriteItem(auction.schema.Arche_Service_xsd.FavoriteItemT[] favoriteItem) {
        this.favoriteItem = favoriteItem;
    }

    public auction.schema.Arche_Service_xsd.FavoriteItemT getFavoriteItem(int i) {
        return this.favoriteItem[i];
    }

    public void setFavoriteItem(int i, auction.schema.Arche_Service_xsd.FavoriteItemT _value) {
        this.favoriteItem[i] = _value;
    }


    /**
     * Gets the totalCount value for this FavoriteItemListResponseT.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this FavoriteItemListResponseT.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteItemListResponseT)) return false;
        FavoriteItemListResponseT other = (FavoriteItemListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.favoriteItem==null && other.getFavoriteItem()==null) || 
             (this.favoriteItem!=null &&
              java.util.Arrays.equals(this.favoriteItem, other.getFavoriteItem()))) &&
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
        if (getFavoriteItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteItem());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFavoriteItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteItemListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TotalCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "FavoriteItemT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
