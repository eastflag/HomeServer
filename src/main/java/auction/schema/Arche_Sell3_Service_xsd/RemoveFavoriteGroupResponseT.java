/**
 * RemoveFavoriteGroupResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class RemoveFavoriteGroupResponseT  implements java.io.Serializable {
    private FavoriteGroupResultT[] favoriteGroupResult;

    public RemoveFavoriteGroupResponseT() {
    }

    public RemoveFavoriteGroupResponseT(
           FavoriteGroupResultT[] favoriteGroupResult) {
           this.favoriteGroupResult = favoriteGroupResult;
    }


    /**
     * Gets the favoriteGroupResult value for this RemoveFavoriteGroupResponseT.
     * 
     * @return favoriteGroupResult
     */
    public FavoriteGroupResultT[] getFavoriteGroupResult() {
        return favoriteGroupResult;
    }


    /**
     * Sets the favoriteGroupResult value for this RemoveFavoriteGroupResponseT.
     * 
     * @param favoriteGroupResult
     */
    public void setFavoriteGroupResult(FavoriteGroupResultT[] favoriteGroupResult) {
        this.favoriteGroupResult = favoriteGroupResult;
    }

    public FavoriteGroupResultT getFavoriteGroupResult(int i) {
        return this.favoriteGroupResult[i];
    }

    public void setFavoriteGroupResult(int i, FavoriteGroupResultT _value) {
        this.favoriteGroupResult[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RemoveFavoriteGroupResponseT)) return false;
        RemoveFavoriteGroupResponseT other = (RemoveFavoriteGroupResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.favoriteGroupResult==null && other.getFavoriteGroupResult()==null) || 
             (this.favoriteGroupResult!=null &&
              java.util.Arrays.equals(this.favoriteGroupResult, other.getFavoriteGroupResult())));
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
        if (getFavoriteGroupResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteGroupResult());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFavoriteGroupResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveFavoriteGroupResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "RemoveFavoriteGroupResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteGroupResultT"));
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
