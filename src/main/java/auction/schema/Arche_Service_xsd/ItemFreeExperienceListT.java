/**
 * ItemFreeExperienceListT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Service_xsd;

public class ItemFreeExperienceListT  implements java.io.Serializable {
    private ItemFreeExperienceT[] itemFreeExperience;

    public ItemFreeExperienceListT() {
    }

    public ItemFreeExperienceListT(
           ItemFreeExperienceT[] itemFreeExperience) {
           this.itemFreeExperience = itemFreeExperience;
    }


    /**
     * Gets the itemFreeExperience value for this ItemFreeExperienceListT.
     * 
     * @return itemFreeExperience
     */
    public ItemFreeExperienceT[] getItemFreeExperience() {
        return itemFreeExperience;
    }


    /**
     * Sets the itemFreeExperience value for this ItemFreeExperienceListT.
     * 
     * @param itemFreeExperience
     */
    public void setItemFreeExperience(ItemFreeExperienceT[] itemFreeExperience) {
        this.itemFreeExperience = itemFreeExperience;
    }

    public ItemFreeExperienceT getItemFreeExperience(int i) {
        return this.itemFreeExperience[i];
    }

    public void setItemFreeExperience(int i, ItemFreeExperienceT _value) {
        this.itemFreeExperience[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFreeExperienceListT)) return false;
        ItemFreeExperienceListT other = (ItemFreeExperienceListT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemFreeExperience==null && other.getItemFreeExperience()==null) || 
             (this.itemFreeExperience!=null &&
              java.util.Arrays.equals(this.itemFreeExperience, other.getItemFreeExperience())));
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
        if (getItemFreeExperience() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemFreeExperience());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemFreeExperience(), i);
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
        new org.apache.axis.description.TypeDesc(ItemFreeExperienceListT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceListT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFreeExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceT"));
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
