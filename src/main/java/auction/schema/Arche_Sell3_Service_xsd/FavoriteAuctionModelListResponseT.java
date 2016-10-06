/**
 * FavoriteAuctionModelListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteAuctionModelListResponseT  implements java.io.Serializable {
    private FavoriteAuctionModelT[] favoriteAuctionModel;

    private int totalCount;  // attribute

    public FavoriteAuctionModelListResponseT() {
    }

    public FavoriteAuctionModelListResponseT(
           FavoriteAuctionModelT[] favoriteAuctionModel,
           int totalCount) {
           this.favoriteAuctionModel = favoriteAuctionModel;
           this.totalCount = totalCount;
    }


    /**
     * Gets the favoriteAuctionModel value for this FavoriteAuctionModelListResponseT.
     * 
     * @return favoriteAuctionModel
     */
    public FavoriteAuctionModelT[] getFavoriteAuctionModel() {
        return favoriteAuctionModel;
    }


    /**
     * Sets the favoriteAuctionModel value for this FavoriteAuctionModelListResponseT.
     * 
     * @param favoriteAuctionModel
     */
    public void setFavoriteAuctionModel(FavoriteAuctionModelT[] favoriteAuctionModel) {
        this.favoriteAuctionModel = favoriteAuctionModel;
    }

    public FavoriteAuctionModelT getFavoriteAuctionModel(int i) {
        return this.favoriteAuctionModel[i];
    }

    public void setFavoriteAuctionModel(int i, FavoriteAuctionModelT _value) {
        this.favoriteAuctionModel[i] = _value;
    }


    /**
     * Gets the totalCount value for this FavoriteAuctionModelListResponseT.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this FavoriteAuctionModelListResponseT.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteAuctionModelListResponseT)) return false;
        FavoriteAuctionModelListResponseT other = (FavoriteAuctionModelListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.favoriteAuctionModel==null && other.getFavoriteAuctionModel()==null) || 
             (this.favoriteAuctionModel!=null &&
              java.util.Arrays.equals(this.favoriteAuctionModel, other.getFavoriteAuctionModel()))) &&
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
        if (getFavoriteAuctionModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteAuctionModel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFavoriteAuctionModel(), i);
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
        new org.apache.axis.description.TypeDesc(FavoriteAuctionModelListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelListResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TotalCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteAuctionModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelT"));
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
