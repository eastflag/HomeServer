/**
 * SellerAddrT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Item3_xsd;

public class SellerAddrT  implements java.io.Serializable {
    private int sellerAddrNo;  // attribute

    private String membId;  // attribute

    private String sellerAddrName;  // attribute

    private String infoCp;  // attribute

    private String infoHt;  // attribute

    private String postNo;  // attribute

    private String infoAd1;  // attribute

    private String infoAd2;  // attribute

    private String mapUrl;  // attribute

    private String contactInfoNa;  // attribute

    private org.apache.axis.types.UnsignedByte addrType;  // attribute

    private boolean defaultAddrYN;  // attribute

    private boolean defaultVisitTakeAddrYN;  // attribute

    private boolean defaultReturnAddrYN;  // attribute

    private boolean defaultShipmentPlaceAddrYN;  // attribute

    private String addrDesc;  // attribute

    private String addrImagePath;  // attribute

    private java.util.Calendar insDate;  // attribute

    private java.util.Calendar updDate;  // attribute

    public SellerAddrT() {
    }

    public SellerAddrT(
           int sellerAddrNo,
           String membId,
           String sellerAddrName,
           String infoCp,
           String infoHt,
           String postNo,
           String infoAd1,
           String infoAd2,
           String mapUrl,
           String contactInfoNa,
           org.apache.axis.types.UnsignedByte addrType,
           boolean defaultAddrYN,
           boolean defaultVisitTakeAddrYN,
           boolean defaultReturnAddrYN,
           boolean defaultShipmentPlaceAddrYN,
           String addrDesc,
           String addrImagePath,
           java.util.Calendar insDate,
           java.util.Calendar updDate) {
           this.sellerAddrNo = sellerAddrNo;
           this.membId = membId;
           this.sellerAddrName = sellerAddrName;
           this.infoCp = infoCp;
           this.infoHt = infoHt;
           this.postNo = postNo;
           this.infoAd1 = infoAd1;
           this.infoAd2 = infoAd2;
           this.mapUrl = mapUrl;
           this.contactInfoNa = contactInfoNa;
           this.addrType = addrType;
           this.defaultAddrYN = defaultAddrYN;
           this.defaultVisitTakeAddrYN = defaultVisitTakeAddrYN;
           this.defaultReturnAddrYN = defaultReturnAddrYN;
           this.defaultShipmentPlaceAddrYN = defaultShipmentPlaceAddrYN;
           this.addrDesc = addrDesc;
           this.addrImagePath = addrImagePath;
           this.insDate = insDate;
           this.updDate = updDate;
    }


    /**
     * Gets the sellerAddrNo value for this SellerAddrT.
     * 
     * @return sellerAddrNo
     */
    public int getSellerAddrNo() {
        return sellerAddrNo;
    }


    /**
     * Sets the sellerAddrNo value for this SellerAddrT.
     * 
     * @param sellerAddrNo
     */
    public void setSellerAddrNo(int sellerAddrNo) {
        this.sellerAddrNo = sellerAddrNo;
    }


    /**
     * Gets the membId value for this SellerAddrT.
     * 
     * @return membId
     */
    public String getMembId() {
        return membId;
    }


    /**
     * Sets the membId value for this SellerAddrT.
     * 
     * @param membId
     */
    public void setMembId(String membId) {
        this.membId = membId;
    }


    /**
     * Gets the sellerAddrName value for this SellerAddrT.
     * 
     * @return sellerAddrName
     */
    public String getSellerAddrName() {
        return sellerAddrName;
    }


    /**
     * Sets the sellerAddrName value for this SellerAddrT.
     * 
     * @param sellerAddrName
     */
    public void setSellerAddrName(String sellerAddrName) {
        this.sellerAddrName = sellerAddrName;
    }


    /**
     * Gets the infoCp value for this SellerAddrT.
     * 
     * @return infoCp
     */
    public String getInfoCp() {
        return infoCp;
    }


    /**
     * Sets the infoCp value for this SellerAddrT.
     * 
     * @param infoCp
     */
    public void setInfoCp(String infoCp) {
        this.infoCp = infoCp;
    }


    /**
     * Gets the infoHt value for this SellerAddrT.
     * 
     * @return infoHt
     */
    public String getInfoHt() {
        return infoHt;
    }


    /**
     * Sets the infoHt value for this SellerAddrT.
     * 
     * @param infoHt
     */
    public void setInfoHt(String infoHt) {
        this.infoHt = infoHt;
    }


    /**
     * Gets the postNo value for this SellerAddrT.
     * 
     * @return postNo
     */
    public String getPostNo() {
        return postNo;
    }


    /**
     * Sets the postNo value for this SellerAddrT.
     * 
     * @param postNo
     */
    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }


    /**
     * Gets the infoAd1 value for this SellerAddrT.
     * 
     * @return infoAd1
     */
    public String getInfoAd1() {
        return infoAd1;
    }


    /**
     * Sets the infoAd1 value for this SellerAddrT.
     * 
     * @param infoAd1
     */
    public void setInfoAd1(String infoAd1) {
        this.infoAd1 = infoAd1;
    }


    /**
     * Gets the infoAd2 value for this SellerAddrT.
     * 
     * @return infoAd2
     */
    public String getInfoAd2() {
        return infoAd2;
    }


    /**
     * Sets the infoAd2 value for this SellerAddrT.
     * 
     * @param infoAd2
     */
    public void setInfoAd2(String infoAd2) {
        this.infoAd2 = infoAd2;
    }


    /**
     * Gets the mapUrl value for this SellerAddrT.
     * 
     * @return mapUrl
     */
    public String getMapUrl() {
        return mapUrl;
    }


    /**
     * Sets the mapUrl value for this SellerAddrT.
     * 
     * @param mapUrl
     */
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }


    /**
     * Gets the contactInfoNa value for this SellerAddrT.
     * 
     * @return contactInfoNa
     */
    public String getContactInfoNa() {
        return contactInfoNa;
    }


    /**
     * Sets the contactInfoNa value for this SellerAddrT.
     * 
     * @param contactInfoNa
     */
    public void setContactInfoNa(String contactInfoNa) {
        this.contactInfoNa = contactInfoNa;
    }


    /**
     * Gets the addrType value for this SellerAddrT.
     * 
     * @return addrType
     */
    public org.apache.axis.types.UnsignedByte getAddrType() {
        return addrType;
    }


    /**
     * Sets the addrType value for this SellerAddrT.
     * 
     * @param addrType
     */
    public void setAddrType(org.apache.axis.types.UnsignedByte addrType) {
        this.addrType = addrType;
    }


    /**
     * Gets the defaultAddrYN value for this SellerAddrT.
     * 
     * @return defaultAddrYN
     */
    public boolean isDefaultAddrYN() {
        return defaultAddrYN;
    }


    /**
     * Sets the defaultAddrYN value for this SellerAddrT.
     * 
     * @param defaultAddrYN
     */
    public void setDefaultAddrYN(boolean defaultAddrYN) {
        this.defaultAddrYN = defaultAddrYN;
    }


    /**
     * Gets the defaultVisitTakeAddrYN value for this SellerAddrT.
     * 
     * @return defaultVisitTakeAddrYN
     */
    public boolean isDefaultVisitTakeAddrYN() {
        return defaultVisitTakeAddrYN;
    }


    /**
     * Sets the defaultVisitTakeAddrYN value for this SellerAddrT.
     * 
     * @param defaultVisitTakeAddrYN
     */
    public void setDefaultVisitTakeAddrYN(boolean defaultVisitTakeAddrYN) {
        this.defaultVisitTakeAddrYN = defaultVisitTakeAddrYN;
    }


    /**
     * Gets the defaultReturnAddrYN value for this SellerAddrT.
     * 
     * @return defaultReturnAddrYN
     */
    public boolean isDefaultReturnAddrYN() {
        return defaultReturnAddrYN;
    }


    /**
     * Sets the defaultReturnAddrYN value for this SellerAddrT.
     * 
     * @param defaultReturnAddrYN
     */
    public void setDefaultReturnAddrYN(boolean defaultReturnAddrYN) {
        this.defaultReturnAddrYN = defaultReturnAddrYN;
    }


    /**
     * Gets the defaultShipmentPlaceAddrYN value for this SellerAddrT.
     * 
     * @return defaultShipmentPlaceAddrYN
     */
    public boolean isDefaultShipmentPlaceAddrYN() {
        return defaultShipmentPlaceAddrYN;
    }


    /**
     * Sets the defaultShipmentPlaceAddrYN value for this SellerAddrT.
     * 
     * @param defaultShipmentPlaceAddrYN
     */
    public void setDefaultShipmentPlaceAddrYN(boolean defaultShipmentPlaceAddrYN) {
        this.defaultShipmentPlaceAddrYN = defaultShipmentPlaceAddrYN;
    }


    /**
     * Gets the addrDesc value for this SellerAddrT.
     * 
     * @return addrDesc
     */
    public String getAddrDesc() {
        return addrDesc;
    }


    /**
     * Sets the addrDesc value for this SellerAddrT.
     * 
     * @param addrDesc
     */
    public void setAddrDesc(String addrDesc) {
        this.addrDesc = addrDesc;
    }


    /**
     * Gets the addrImagePath value for this SellerAddrT.
     * 
     * @return addrImagePath
     */
    public String getAddrImagePath() {
        return addrImagePath;
    }


    /**
     * Sets the addrImagePath value for this SellerAddrT.
     * 
     * @param addrImagePath
     */
    public void setAddrImagePath(String addrImagePath) {
        this.addrImagePath = addrImagePath;
    }


    /**
     * Gets the insDate value for this SellerAddrT.
     * 
     * @return insDate
     */
    public java.util.Calendar getInsDate() {
        return insDate;
    }


    /**
     * Sets the insDate value for this SellerAddrT.
     * 
     * @param insDate
     */
    public void setInsDate(java.util.Calendar insDate) {
        this.insDate = insDate;
    }


    /**
     * Gets the updDate value for this SellerAddrT.
     * 
     * @return updDate
     */
    public java.util.Calendar getUpdDate() {
        return updDate;
    }


    /**
     * Sets the updDate value for this SellerAddrT.
     * 
     * @param updDate
     */
    public void setUpdDate(java.util.Calendar updDate) {
        this.updDate = updDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SellerAddrT)) return false;
        SellerAddrT other = (SellerAddrT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellerAddrNo == other.getSellerAddrNo() &&
            ((this.membId==null && other.getMembId()==null) || 
             (this.membId!=null &&
              this.membId.equals(other.getMembId()))) &&
            ((this.sellerAddrName==null && other.getSellerAddrName()==null) || 
             (this.sellerAddrName!=null &&
              this.sellerAddrName.equals(other.getSellerAddrName()))) &&
            ((this.infoCp==null && other.getInfoCp()==null) || 
             (this.infoCp!=null &&
              this.infoCp.equals(other.getInfoCp()))) &&
            ((this.infoHt==null && other.getInfoHt()==null) || 
             (this.infoHt!=null &&
              this.infoHt.equals(other.getInfoHt()))) &&
            ((this.postNo==null && other.getPostNo()==null) || 
             (this.postNo!=null &&
              this.postNo.equals(other.getPostNo()))) &&
            ((this.infoAd1==null && other.getInfoAd1()==null) || 
             (this.infoAd1!=null &&
              this.infoAd1.equals(other.getInfoAd1()))) &&
            ((this.infoAd2==null && other.getInfoAd2()==null) || 
             (this.infoAd2!=null &&
              this.infoAd2.equals(other.getInfoAd2()))) &&
            ((this.mapUrl==null && other.getMapUrl()==null) || 
             (this.mapUrl!=null &&
              this.mapUrl.equals(other.getMapUrl()))) &&
            ((this.contactInfoNa==null && other.getContactInfoNa()==null) || 
             (this.contactInfoNa!=null &&
              this.contactInfoNa.equals(other.getContactInfoNa()))) &&
            ((this.addrType==null && other.getAddrType()==null) || 
             (this.addrType!=null &&
              this.addrType.equals(other.getAddrType()))) &&
            this.defaultAddrYN == other.isDefaultAddrYN() &&
            this.defaultVisitTakeAddrYN == other.isDefaultVisitTakeAddrYN() &&
            this.defaultReturnAddrYN == other.isDefaultReturnAddrYN() &&
            this.defaultShipmentPlaceAddrYN == other.isDefaultShipmentPlaceAddrYN() &&
            ((this.addrDesc==null && other.getAddrDesc()==null) || 
             (this.addrDesc!=null &&
              this.addrDesc.equals(other.getAddrDesc()))) &&
            ((this.addrImagePath==null && other.getAddrImagePath()==null) || 
             (this.addrImagePath!=null &&
              this.addrImagePath.equals(other.getAddrImagePath()))) &&
            ((this.insDate==null && other.getInsDate()==null) || 
             (this.insDate!=null &&
              this.insDate.equals(other.getInsDate()))) &&
            ((this.updDate==null && other.getUpdDate()==null) || 
             (this.updDate!=null &&
              this.updDate.equals(other.getUpdDate())));
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
        _hashCode += getSellerAddrNo();
        if (getMembId() != null) {
            _hashCode += getMembId().hashCode();
        }
        if (getSellerAddrName() != null) {
            _hashCode += getSellerAddrName().hashCode();
        }
        if (getInfoCp() != null) {
            _hashCode += getInfoCp().hashCode();
        }
        if (getInfoHt() != null) {
            _hashCode += getInfoHt().hashCode();
        }
        if (getPostNo() != null) {
            _hashCode += getPostNo().hashCode();
        }
        if (getInfoAd1() != null) {
            _hashCode += getInfoAd1().hashCode();
        }
        if (getInfoAd2() != null) {
            _hashCode += getInfoAd2().hashCode();
        }
        if (getMapUrl() != null) {
            _hashCode += getMapUrl().hashCode();
        }
        if (getContactInfoNa() != null) {
            _hashCode += getContactInfoNa().hashCode();
        }
        if (getAddrType() != null) {
            _hashCode += getAddrType().hashCode();
        }
        _hashCode += (isDefaultAddrYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultVisitTakeAddrYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultReturnAddrYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultShipmentPlaceAddrYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAddrDesc() != null) {
            _hashCode += getAddrDesc().hashCode();
        }
        if (getAddrImagePath() != null) {
            _hashCode += getAddrImagePath().hashCode();
        }
        if (getInsDate() != null) {
            _hashCode += getInsDate().hashCode();
        }
        if (getUpdDate() != null) {
            _hashCode += getUpdDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerAddrT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "SellerAddrT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("membId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MembId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoCp");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InfoCp"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoHt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InfoHt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("postNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PostNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoAd1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InfoAd1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoAd2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InfoAd2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mapUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MapUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contactInfoNa");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ContactInfoNa"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultAddrYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultAddrYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultVisitTakeAddrYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultVisitTakeAddrYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultReturnAddrYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultReturnAddrYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultShipmentPlaceAddrYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultShipmentPlaceAddrYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrDesc");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrDesc"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrImagePath");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrImagePath"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("insDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InsDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UpdDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
