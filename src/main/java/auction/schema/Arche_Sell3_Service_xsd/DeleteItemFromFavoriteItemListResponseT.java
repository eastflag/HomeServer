/**
 * DeleteItemFromFavoriteItemListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class DeleteItemFromFavoriteItemListResponseT  implements java.io.Serializable {
    private DeleteFavoriteItemResultT[] deleteFavoriteItemResult;

    public DeleteItemFromFavoriteItemListResponseT() {
    }

    public DeleteItemFromFavoriteItemListResponseT(
           DeleteFavoriteItemResultT[] deleteFavoriteItemResult) {
           this.deleteFavoriteItemResult = deleteFavoriteItemResult;
    }


    /**
     * Gets the deleteFavoriteItemResult value for this DeleteItemFromFavoriteItemListResponseT.
     * 
     * @return deleteFavoriteItemResult
     */
    public DeleteFavoriteItemResultT[] getDeleteFavoriteItemResult() {
        return deleteFavoriteItemResult;
    }


    /**
     * Sets the deleteFavoriteItemResult value for this DeleteItemFromFavoriteItemListResponseT.
     * 
     * @param deleteFavoriteItemResult
     */
    public void setDeleteFavoriteItemResult(DeleteFavoriteItemResultT[] deleteFavoriteItemResult) {
        this.deleteFavoriteItemResult = deleteFavoriteItemResult;
    }

    public DeleteFavoriteItemResultT getDeleteFavoriteItemResult(int i) {
        return this.deleteFavoriteItemResult[i];
    }

    public void setDeleteFavoriteItemResult(int i, DeleteFavoriteItemResultT _value) {
        this.deleteFavoriteItemResult[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteItemFromFavoriteItemListResponseT)) return false;
        DeleteItemFromFavoriteItemListResponseT other = (DeleteItemFromFavoriteItemListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteFavoriteItemResult==null && other.getDeleteFavoriteItemResult()==null) || 
             (this.deleteFavoriteItemResult!=null &&
              java.util.Arrays.equals(this.deleteFavoriteItemResult, other.getDeleteFavoriteItemResult())));
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
        if (getDeleteFavoriteItemResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteFavoriteItemResult());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeleteFavoriteItemResult(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteItemFromFavoriteItemListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteItemFromFavoriteItemListResponseT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteFavoriteItemResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteItemResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteItemResultT"));
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
