/**
 * ItemOfficialNotice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemOfficialNotice  implements java.io.Serializable {
    private String itemID;

    private Integer notiItemGroupNo;

    private auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT[] itemOfficialNotiValue;

    public ItemOfficialNotice() {
    }

    public ItemOfficialNotice(
           String itemID,
           Integer notiItemGroupNo,
           auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT[] itemOfficialNotiValue) {
           this.itemID = itemID;
           this.notiItemGroupNo = notiItemGroupNo;
           this.itemOfficialNotiValue = itemOfficialNotiValue;
    }


    /**
     * Gets the itemID value for this ItemOfficialNotice.
     * 
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemOfficialNotice.
     * 
     * @param itemID
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the notiItemGroupNo value for this ItemOfficialNotice.
     * 
     * @return notiItemGroupNo
     */
    public Integer getNotiItemGroupNo() {
        return notiItemGroupNo;
    }


    /**
     * Sets the notiItemGroupNo value for this ItemOfficialNotice.
     * 
     * @param notiItemGroupNo
     */
    public void setNotiItemGroupNo(Integer notiItemGroupNo) {
        this.notiItemGroupNo = notiItemGroupNo;
    }


    /**
     * Gets the itemOfficialNotiValue value for this ItemOfficialNotice.
     * 
     * @return itemOfficialNotiValue
     */
    public auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT[] getItemOfficialNotiValue() {
        return itemOfficialNotiValue;
    }


    /**
     * Sets the itemOfficialNotiValue value for this ItemOfficialNotice.
     * 
     * @param itemOfficialNotiValue
     */
    public void setItemOfficialNotiValue(auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT[] itemOfficialNotiValue) {
        this.itemOfficialNotiValue = itemOfficialNotiValue;
    }

    public auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT getItemOfficialNotiValue(int i) {
        return this.itemOfficialNotiValue[i];
    }

    public void setItemOfficialNotiValue(int i, auction.schema.Arche_Service_xsd.ItemOfficialNotiValueT _value) {
        this.itemOfficialNotiValue[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemOfficialNotice)) return false;
        ItemOfficialNotice other = (ItemOfficialNotice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.notiItemGroupNo==null && other.getNotiItemGroupNo()==null) || 
             (this.notiItemGroupNo!=null &&
              this.notiItemGroupNo.equals(other.getNotiItemGroupNo()))) &&
            ((this.itemOfficialNotiValue==null && other.getItemOfficialNotiValue()==null) || 
             (this.itemOfficialNotiValue!=null &&
              java.util.Arrays.equals(this.itemOfficialNotiValue, other.getItemOfficialNotiValue())));
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getNotiItemGroupNo() != null) {
            _hashCode += getNotiItemGroupNo().hashCode();
        }
        if (getItemOfficialNotiValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemOfficialNotiValue());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemOfficialNotiValue(), i);
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
        new org.apache.axis.description.TypeDesc(ItemOfficialNotice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notiItemGroupNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "NotiItemGroupNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOfficialNotiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemOfficialNotiValueT"));
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
