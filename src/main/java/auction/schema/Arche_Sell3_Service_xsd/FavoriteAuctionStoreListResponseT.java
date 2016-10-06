/**
 * FavoriteAuctionStoreListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteAuctionStoreListResponseT  implements java.io.Serializable {
    private MyFavoriteStoreListT[] myFavoriteStoreList;

    private int totalCount;  // attribute

    private String groupName;  // attribute

    private int storeCount;  // attribute

    public FavoriteAuctionStoreListResponseT() {
    }

    public FavoriteAuctionStoreListResponseT(
           MyFavoriteStoreListT[] myFavoriteStoreList,
           int totalCount,
           String groupName,
           int storeCount) {
           this.myFavoriteStoreList = myFavoriteStoreList;
           this.totalCount = totalCount;
           this.groupName = groupName;
           this.storeCount = storeCount;
    }


    /**
     * Gets the myFavoriteStoreList value for this FavoriteAuctionStoreListResponseT.
     * 
     * @return myFavoriteStoreList
     */
    public MyFavoriteStoreListT[] getMyFavoriteStoreList() {
        return myFavoriteStoreList;
    }


    /**
     * Sets the myFavoriteStoreList value for this FavoriteAuctionStoreListResponseT.
     * 
     * @param myFavoriteStoreList
     */
    public void setMyFavoriteStoreList(MyFavoriteStoreListT[] myFavoriteStoreList) {
        this.myFavoriteStoreList = myFavoriteStoreList;
    }

    public MyFavoriteStoreListT getMyFavoriteStoreList(int i) {
        return this.myFavoriteStoreList[i];
    }

    public void setMyFavoriteStoreList(int i, MyFavoriteStoreListT _value) {
        this.myFavoriteStoreList[i] = _value;
    }


    /**
     * Gets the totalCount value for this FavoriteAuctionStoreListResponseT.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this FavoriteAuctionStoreListResponseT.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the groupName value for this FavoriteAuctionStoreListResponseT.
     * 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this FavoriteAuctionStoreListResponseT.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the storeCount value for this FavoriteAuctionStoreListResponseT.
     * 
     * @return storeCount
     */
    public int getStoreCount() {
        return storeCount;
    }


    /**
     * Sets the storeCount value for this FavoriteAuctionStoreListResponseT.
     * 
     * @param storeCount
     */
    public void setStoreCount(int storeCount) {
        this.storeCount = storeCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteAuctionStoreListResponseT)) return false;
        FavoriteAuctionStoreListResponseT other = (FavoriteAuctionStoreListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myFavoriteStoreList==null && other.getMyFavoriteStoreList()==null) || 
             (this.myFavoriteStoreList!=null &&
              java.util.Arrays.equals(this.myFavoriteStoreList, other.getMyFavoriteStoreList()))) &&
            this.totalCount == other.getTotalCount() &&
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
        if (getMyFavoriteStoreList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyFavoriteStoreList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMyFavoriteStoreList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalCount();
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        _hashCode += getStoreCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteAuctionStoreListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionStoreListResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TotalCount"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myFavoriteStoreList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreListT"));
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
