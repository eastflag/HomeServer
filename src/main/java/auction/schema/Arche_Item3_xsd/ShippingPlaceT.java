/**
 * ShippingPlaceT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Item3_xsd;

public class ShippingPlaceT  implements java.io.Serializable {
    private auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail;

    private auction.schema.Arche_Item3_xsd.ShippingPolicyT[] shippingPolicy;

    private SellerAddrT shippingAddress;

    private int shippingPlaceSeq;  // attribute

    private String sellerID;  // attribute

    private String shipmentPlace;  // attribute

    private boolean isDefaultPlace;  // attribute

    private java.util.Calendar insDate;  // attribute

    private java.util.Calendar updDate;  // attribute

    private int addFeeJeju;  // attribute

    private int addFeeExcludeJeju;  // attribute

    private int sellerAddrNo;  // attribute

    private String infoCp;  // attribute

    private String infoHt;  // attribute

    private String sellerAddrPostNo;  // attribute

    private String infoAd1;  // attribute

    private String infoAd2;  // attribute

    private int chargeTypeCode;  // attribute

    private boolean isPrepayable;  // attribute

    private boolean isArrival;  // attribute

    private boolean isBundleFree;  // attribute

    private String postNo;  // attribute

    private String addrPost;  // attribute

    private String addrDetail;  // attribute

    private String address;  // attribute

    private int imposeType;  // attribute

    public ShippingPlaceT() {
    }

    public ShippingPlaceT(
           auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail,
           auction.schema.Arche_Item3_xsd.ShippingPolicyT[] shippingPolicy,
           SellerAddrT shippingAddress,
           int shippingPlaceSeq,
           String sellerID,
           String shipmentPlace,
           boolean isDefaultPlace,
           java.util.Calendar insDate,
           java.util.Calendar updDate,
           int addFeeJeju,
           int addFeeExcludeJeju,
           int sellerAddrNo,
           String infoCp,
           String infoHt,
           String sellerAddrPostNo,
           String infoAd1,
           String infoAd2,
           int chargeTypeCode,
           boolean isPrepayable,
           boolean isArrival,
           boolean isBundleFree,
           String postNo,
           String addrPost,
           String addrDetail,
           String address,
           int imposeType) {
           this.shippingSellerDetail = shippingSellerDetail;
           this.shippingPolicy = shippingPolicy;
           this.shippingAddress = shippingAddress;
           this.shippingPlaceSeq = shippingPlaceSeq;
           this.sellerID = sellerID;
           this.shipmentPlace = shipmentPlace;
           this.isDefaultPlace = isDefaultPlace;
           this.insDate = insDate;
           this.updDate = updDate;
           this.addFeeJeju = addFeeJeju;
           this.addFeeExcludeJeju = addFeeExcludeJeju;
           this.sellerAddrNo = sellerAddrNo;
           this.infoCp = infoCp;
           this.infoHt = infoHt;
           this.sellerAddrPostNo = sellerAddrPostNo;
           this.infoAd1 = infoAd1;
           this.infoAd2 = infoAd2;
           this.chargeTypeCode = chargeTypeCode;
           this.isPrepayable = isPrepayable;
           this.isArrival = isArrival;
           this.isBundleFree = isBundleFree;
           this.postNo = postNo;
           this.addrPost = addrPost;
           this.addrDetail = addrDetail;
           this.address = address;
           this.imposeType = imposeType;
    }


    /**
     * Gets the shippingSellerDetail value for this ShippingPlaceT.
     * 
     * @return shippingSellerDetail
     */
    public auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] getShippingSellerDetail() {
        return shippingSellerDetail;
    }


    /**
     * Sets the shippingSellerDetail value for this ShippingPlaceT.
     * 
     * @param shippingSellerDetail
     */
    public void setShippingSellerDetail(auction.schema.Arche_Item3_xsd.ShippingSellerDetailT[] shippingSellerDetail) {
        this.shippingSellerDetail = shippingSellerDetail;
    }

    public auction.schema.Arche_Item3_xsd.ShippingSellerDetailT getShippingSellerDetail(int i) {
        return this.shippingSellerDetail[i];
    }

    public void setShippingSellerDetail(int i, auction.schema.Arche_Item3_xsd.ShippingSellerDetailT _value) {
        this.shippingSellerDetail[i] = _value;
    }


    /**
     * Gets the shippingPolicy value for this ShippingPlaceT.
     * 
     * @return shippingPolicy
     */
    public auction.schema.Arche_Item3_xsd.ShippingPolicyT[] getShippingPolicy() {
        return shippingPolicy;
    }


    /**
     * Sets the shippingPolicy value for this ShippingPlaceT.
     * 
     * @param shippingPolicy
     */
    public void setShippingPolicy(auction.schema.Arche_Item3_xsd.ShippingPolicyT[] shippingPolicy) {
        this.shippingPolicy = shippingPolicy;
    }

    public auction.schema.Arche_Item3_xsd.ShippingPolicyT getShippingPolicy(int i) {
        return this.shippingPolicy[i];
    }

    public void setShippingPolicy(int i, auction.schema.Arche_Item3_xsd.ShippingPolicyT _value) {
        this.shippingPolicy[i] = _value;
    }


    /**
     * Gets the shippingAddress value for this ShippingPlaceT.
     * 
     * @return shippingAddress
     */
    public SellerAddrT getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this ShippingPlaceT.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(SellerAddrT shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shippingPlaceSeq value for this ShippingPlaceT.
     * 
     * @return shippingPlaceSeq
     */
    public int getShippingPlaceSeq() {
        return shippingPlaceSeq;
    }


    /**
     * Sets the shippingPlaceSeq value for this ShippingPlaceT.
     * 
     * @param shippingPlaceSeq
     */
    public void setShippingPlaceSeq(int shippingPlaceSeq) {
        this.shippingPlaceSeq = shippingPlaceSeq;
    }


    /**
     * Gets the sellerID value for this ShippingPlaceT.
     * 
     * @return sellerID
     */
    public String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this ShippingPlaceT.
     * 
     * @param sellerID
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the shipmentPlace value for this ShippingPlaceT.
     * 
     * @return shipmentPlace
     */
    public String getShipmentPlace() {
        return shipmentPlace;
    }


    /**
     * Sets the shipmentPlace value for this ShippingPlaceT.
     * 
     * @param shipmentPlace
     */
    public void setShipmentPlace(String shipmentPlace) {
        this.shipmentPlace = shipmentPlace;
    }


    /**
     * Gets the isDefaultPlace value for this ShippingPlaceT.
     * 
     * @return isDefaultPlace
     */
    public boolean isIsDefaultPlace() {
        return isDefaultPlace;
    }


    /**
     * Sets the isDefaultPlace value for this ShippingPlaceT.
     * 
     * @param isDefaultPlace
     */
    public void setIsDefaultPlace(boolean isDefaultPlace) {
        this.isDefaultPlace = isDefaultPlace;
    }


    /**
     * Gets the insDate value for this ShippingPlaceT.
     * 
     * @return insDate
     */
    public java.util.Calendar getInsDate() {
        return insDate;
    }


    /**
     * Sets the insDate value for this ShippingPlaceT.
     * 
     * @param insDate
     */
    public void setInsDate(java.util.Calendar insDate) {
        this.insDate = insDate;
    }


    /**
     * Gets the updDate value for this ShippingPlaceT.
     * 
     * @return updDate
     */
    public java.util.Calendar getUpdDate() {
        return updDate;
    }


    /**
     * Sets the updDate value for this ShippingPlaceT.
     * 
     * @param updDate
     */
    public void setUpdDate(java.util.Calendar updDate) {
        this.updDate = updDate;
    }


    /**
     * Gets the addFeeJeju value for this ShippingPlaceT.
     * 
     * @return addFeeJeju
     */
    public int getAddFeeJeju() {
        return addFeeJeju;
    }


    /**
     * Sets the addFeeJeju value for this ShippingPlaceT.
     * 
     * @param addFeeJeju
     */
    public void setAddFeeJeju(int addFeeJeju) {
        this.addFeeJeju = addFeeJeju;
    }


    /**
     * Gets the addFeeExcludeJeju value for this ShippingPlaceT.
     * 
     * @return addFeeExcludeJeju
     */
    public int getAddFeeExcludeJeju() {
        return addFeeExcludeJeju;
    }


    /**
     * Sets the addFeeExcludeJeju value for this ShippingPlaceT.
     * 
     * @param addFeeExcludeJeju
     */
    public void setAddFeeExcludeJeju(int addFeeExcludeJeju) {
        this.addFeeExcludeJeju = addFeeExcludeJeju;
    }


    /**
     * Gets the sellerAddrNo value for this ShippingPlaceT.
     * 
     * @return sellerAddrNo
     */
    public int getSellerAddrNo() {
        return sellerAddrNo;
    }


    /**
     * Sets the sellerAddrNo value for this ShippingPlaceT.
     * 
     * @param sellerAddrNo
     */
    public void setSellerAddrNo(int sellerAddrNo) {
        this.sellerAddrNo = sellerAddrNo;
    }


    /**
     * Gets the infoCp value for this ShippingPlaceT.
     * 
     * @return infoCp
     */
    public String getInfoCp() {
        return infoCp;
    }


    /**
     * Sets the infoCp value for this ShippingPlaceT.
     * 
     * @param infoCp
     */
    public void setInfoCp(String infoCp) {
        this.infoCp = infoCp;
    }


    /**
     * Gets the infoHt value for this ShippingPlaceT.
     * 
     * @return infoHt
     */
    public String getInfoHt() {
        return infoHt;
    }


    /**
     * Sets the infoHt value for this ShippingPlaceT.
     * 
     * @param infoHt
     */
    public void setInfoHt(String infoHt) {
        this.infoHt = infoHt;
    }


    /**
     * Gets the sellerAddrPostNo value for this ShippingPlaceT.
     * 
     * @return sellerAddrPostNo
     */
    public String getSellerAddrPostNo() {
        return sellerAddrPostNo;
    }


    /**
     * Sets the sellerAddrPostNo value for this ShippingPlaceT.
     * 
     * @param sellerAddrPostNo
     */
    public void setSellerAddrPostNo(String sellerAddrPostNo) {
        this.sellerAddrPostNo = sellerAddrPostNo;
    }


    /**
     * Gets the infoAd1 value for this ShippingPlaceT.
     * 
     * @return infoAd1
     */
    public String getInfoAd1() {
        return infoAd1;
    }


    /**
     * Sets the infoAd1 value for this ShippingPlaceT.
     * 
     * @param infoAd1
     */
    public void setInfoAd1(String infoAd1) {
        this.infoAd1 = infoAd1;
    }


    /**
     * Gets the infoAd2 value for this ShippingPlaceT.
     * 
     * @return infoAd2
     */
    public String getInfoAd2() {
        return infoAd2;
    }


    /**
     * Sets the infoAd2 value for this ShippingPlaceT.
     * 
     * @param infoAd2
     */
    public void setInfoAd2(String infoAd2) {
        this.infoAd2 = infoAd2;
    }


    /**
     * Gets the chargeTypeCode value for this ShippingPlaceT.
     * 
     * @return chargeTypeCode
     */
    public int getChargeTypeCode() {
        return chargeTypeCode;
    }


    /**
     * Sets the chargeTypeCode value for this ShippingPlaceT.
     * 
     * @param chargeTypeCode
     */
    public void setChargeTypeCode(int chargeTypeCode) {
        this.chargeTypeCode = chargeTypeCode;
    }


    /**
     * Gets the isPrepayable value for this ShippingPlaceT.
     * 
     * @return isPrepayable
     */
    public boolean isIsPrepayable() {
        return isPrepayable;
    }


    /**
     * Sets the isPrepayable value for this ShippingPlaceT.
     * 
     * @param isPrepayable
     */
    public void setIsPrepayable(boolean isPrepayable) {
        this.isPrepayable = isPrepayable;
    }


    /**
     * Gets the isArrival value for this ShippingPlaceT.
     * 
     * @return isArrival
     */
    public boolean isIsArrival() {
        return isArrival;
    }


    /**
     * Sets the isArrival value for this ShippingPlaceT.
     * 
     * @param isArrival
     */
    public void setIsArrival(boolean isArrival) {
        this.isArrival = isArrival;
    }


    /**
     * Gets the isBundleFree value for this ShippingPlaceT.
     * 
     * @return isBundleFree
     */
    public boolean isIsBundleFree() {
        return isBundleFree;
    }


    /**
     * Sets the isBundleFree value for this ShippingPlaceT.
     * 
     * @param isBundleFree
     */
    public void setIsBundleFree(boolean isBundleFree) {
        this.isBundleFree = isBundleFree;
    }


    /**
     * Gets the postNo value for this ShippingPlaceT.
     * 
     * @return postNo
     */
    public String getPostNo() {
        return postNo;
    }


    /**
     * Sets the postNo value for this ShippingPlaceT.
     * 
     * @param postNo
     */
    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }


    /**
     * Gets the addrPost value for this ShippingPlaceT.
     * 
     * @return addrPost
     */
    public String getAddrPost() {
        return addrPost;
    }


    /**
     * Sets the addrPost value for this ShippingPlaceT.
     * 
     * @param addrPost
     */
    public void setAddrPost(String addrPost) {
        this.addrPost = addrPost;
    }


    /**
     * Gets the addrDetail value for this ShippingPlaceT.
     * 
     * @return addrDetail
     */
    public String getAddrDetail() {
        return addrDetail;
    }


    /**
     * Sets the addrDetail value for this ShippingPlaceT.
     * 
     * @param addrDetail
     */
    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }


    /**
     * Gets the address value for this ShippingPlaceT.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ShippingPlaceT.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the imposeType value for this ShippingPlaceT.
     * 
     * @return imposeType
     */
    public int getImposeType() {
        return imposeType;
    }


    /**
     * Sets the imposeType value for this ShippingPlaceT.
     * 
     * @param imposeType
     */
    public void setImposeType(int imposeType) {
        this.imposeType = imposeType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingPlaceT)) return false;
        ShippingPlaceT other = (ShippingPlaceT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingSellerDetail==null && other.getShippingSellerDetail()==null) || 
             (this.shippingSellerDetail!=null &&
              java.util.Arrays.equals(this.shippingSellerDetail, other.getShippingSellerDetail()))) &&
            ((this.shippingPolicy==null && other.getShippingPolicy()==null) || 
             (this.shippingPolicy!=null &&
              java.util.Arrays.equals(this.shippingPolicy, other.getShippingPolicy()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            this.shippingPlaceSeq == other.getShippingPlaceSeq() &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.shipmentPlace==null && other.getShipmentPlace()==null) || 
             (this.shipmentPlace!=null &&
              this.shipmentPlace.equals(other.getShipmentPlace()))) &&
            this.isDefaultPlace == other.isIsDefaultPlace() &&
            ((this.insDate==null && other.getInsDate()==null) || 
             (this.insDate!=null &&
              this.insDate.equals(other.getInsDate()))) &&
            ((this.updDate==null && other.getUpdDate()==null) || 
             (this.updDate!=null &&
              this.updDate.equals(other.getUpdDate()))) &&
            this.addFeeJeju == other.getAddFeeJeju() &&
            this.addFeeExcludeJeju == other.getAddFeeExcludeJeju() &&
            this.sellerAddrNo == other.getSellerAddrNo() &&
            ((this.infoCp==null && other.getInfoCp()==null) || 
             (this.infoCp!=null &&
              this.infoCp.equals(other.getInfoCp()))) &&
            ((this.infoHt==null && other.getInfoHt()==null) || 
             (this.infoHt!=null &&
              this.infoHt.equals(other.getInfoHt()))) &&
            ((this.sellerAddrPostNo==null && other.getSellerAddrPostNo()==null) || 
             (this.sellerAddrPostNo!=null &&
              this.sellerAddrPostNo.equals(other.getSellerAddrPostNo()))) &&
            ((this.infoAd1==null && other.getInfoAd1()==null) || 
             (this.infoAd1!=null &&
              this.infoAd1.equals(other.getInfoAd1()))) &&
            ((this.infoAd2==null && other.getInfoAd2()==null) || 
             (this.infoAd2!=null &&
              this.infoAd2.equals(other.getInfoAd2()))) &&
            this.chargeTypeCode == other.getChargeTypeCode() &&
            this.isPrepayable == other.isIsPrepayable() &&
            this.isArrival == other.isIsArrival() &&
            this.isBundleFree == other.isIsBundleFree() &&
            ((this.postNo==null && other.getPostNo()==null) || 
             (this.postNo!=null &&
              this.postNo.equals(other.getPostNo()))) &&
            ((this.addrPost==null && other.getAddrPost()==null) || 
             (this.addrPost!=null &&
              this.addrPost.equals(other.getAddrPost()))) &&
            ((this.addrDetail==null && other.getAddrDetail()==null) || 
             (this.addrDetail!=null &&
              this.addrDetail.equals(other.getAddrDetail()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.imposeType == other.getImposeType();
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
        if (getShippingSellerDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingSellerDetail());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingSellerDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingPolicy());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        _hashCode += getShippingPlaceSeq();
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getShipmentPlace() != null) {
            _hashCode += getShipmentPlace().hashCode();
        }
        _hashCode += (isIsDefaultPlace() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInsDate() != null) {
            _hashCode += getInsDate().hashCode();
        }
        if (getUpdDate() != null) {
            _hashCode += getUpdDate().hashCode();
        }
        _hashCode += getAddFeeJeju();
        _hashCode += getAddFeeExcludeJeju();
        _hashCode += getSellerAddrNo();
        if (getInfoCp() != null) {
            _hashCode += getInfoCp().hashCode();
        }
        if (getInfoHt() != null) {
            _hashCode += getInfoHt().hashCode();
        }
        if (getSellerAddrPostNo() != null) {
            _hashCode += getSellerAddrPostNo().hashCode();
        }
        if (getInfoAd1() != null) {
            _hashCode += getInfoAd1().hashCode();
        }
        if (getInfoAd2() != null) {
            _hashCode += getInfoAd2().hashCode();
        }
        _hashCode += getChargeTypeCode();
        _hashCode += (isIsPrepayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsArrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsBundleFree() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPostNo() != null) {
            _hashCode += getPostNo().hashCode();
        }
        if (getAddrPost() != null) {
            _hashCode += getAddrPost().hashCode();
        }
        if (getAddrDetail() != null) {
            _hashCode += getAddrDetail().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += getImposeType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingPlaceT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPlaceT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shippingPlaceSeq");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShippingPlaceSeq"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shipmentPlace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShipmentPlace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDefaultPlace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDefaultPlace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addFeeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addFeeExcludeJeju");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddFeeExcludeJeju"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        attrField.setFieldName("sellerAddrPostNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrPostNo"));
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
        attrField.setFieldName("chargeTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChargeTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isPrepayable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsPrepayable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isArrival");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsArrival"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isBundleFree");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsBundleFree"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("postNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PostNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrPost");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrPost"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrDetail");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrDetail"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("address");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imposeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImposeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingSellerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingSellerDetailT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingPolicyT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "ShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Item3.xsd", "SellerAddrT"));
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
