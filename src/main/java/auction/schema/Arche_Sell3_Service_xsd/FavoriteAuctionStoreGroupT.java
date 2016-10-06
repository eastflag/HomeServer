/**
 * FavoriteAuctionStoreGroupT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteAuctionStoreGroupT  implements java.io.Serializable {
    private int groupNo;  // attribute

    private String groupName;  // attribute

    private int storeCount;  // attribute

    public FavoriteAuctionStoreGroupT() {
    }

    public FavoriteAuctionStoreGroupT(
           int groupNo,
           String groupName,
           int storeCount) {
           this.groupNo = groupNo;
           this.groupName = groupName;
           this.storeCount = storeCount;
    }


    /**
     * Gets the groupNo value for this FavoriteAuctionStoreGroupT.
     * 
     * @return groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }


    /**
     * Sets the groupNo value for this FavoriteAuctionStoreGroupT.
     * 
     * @param groupNo
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }


    /**
     * Gets the groupName value for this FavoriteAuctionStoreGroupT.
     * 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this FavoriteAuctionStoreGroupT.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the storeCount value for this FavoriteAuctionStoreGroupT.
     * 
     * @return storeCount
     */
    public int getStoreCount() {
        return storeCount;
    }


    /**
     * Sets the storeCount value for this FavoriteAuctionStoreGroupT.
     * 
     * @param storeCount
     */
    public void setStoreCount(int storeCount) {
        this.storeCount = storeCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteAuctionStoreGroupT)) return false;
        FavoriteAuctionStoreGroupT other = (FavoriteAuctionStoreGroupT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.groupNo == other.getGroupNo() &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            this.storeCount == other.getStoreCount();
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
        _hashCode += getGroupNo();
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        _hashCode += getStoreCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteAuctionStoreGroupT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreGroupT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("storeCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StoreCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
