/**
 * FavoriteAuctionModelT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.schema.Arche_Sell3_Service_xsd;

public class FavoriteAuctionModelT  implements java.io.Serializable {
    private SubFavoriteModelT[] subFavoriteAuctionModel;

    private long catalogID;  // attribute

    private String catalogName;  // attribute

    private String brandName;  // attribute

    private String makeName;  // attribute

    private java.util.Calendar prodDate;  // attribute

    private String prodDateAttr;  // attribute

    private String mainDescription;  // attribute

    private java.math.BigDecimal lowestPrice;  // attribute

    private int matchingItemCnt;  // attribute

    private java.math.BigDecimal feedbackCount;  // attribute

    private String image;  // attribute

    private boolean isRepresentation;  // attribute

    private int groupNo;  // attribute

    private boolean isCatalog;  // attribute

    public FavoriteAuctionModelT() {
    }

    public FavoriteAuctionModelT(
           SubFavoriteModelT[] subFavoriteAuctionModel,
           long catalogID,
           String catalogName,
           String brandName,
           String makeName,
           java.util.Calendar prodDate,
           String prodDateAttr,
           String mainDescription,
           java.math.BigDecimal lowestPrice,
           int matchingItemCnt,
           java.math.BigDecimal feedbackCount,
           String image,
           boolean isRepresentation,
           int groupNo,
           boolean isCatalog) {
           this.subFavoriteAuctionModel = subFavoriteAuctionModel;
           this.catalogID = catalogID;
           this.catalogName = catalogName;
           this.brandName = brandName;
           this.makeName = makeName;
           this.prodDate = prodDate;
           this.prodDateAttr = prodDateAttr;
           this.mainDescription = mainDescription;
           this.lowestPrice = lowestPrice;
           this.matchingItemCnt = matchingItemCnt;
           this.feedbackCount = feedbackCount;
           this.image = image;
           this.isRepresentation = isRepresentation;
           this.groupNo = groupNo;
           this.isCatalog = isCatalog;
    }


    /**
     * Gets the subFavoriteAuctionModel value for this FavoriteAuctionModelT.
     * 
     * @return subFavoriteAuctionModel
     */
    public SubFavoriteModelT[] getSubFavoriteAuctionModel() {
        return subFavoriteAuctionModel;
    }


    /**
     * Sets the subFavoriteAuctionModel value for this FavoriteAuctionModelT.
     * 
     * @param subFavoriteAuctionModel
     */
    public void setSubFavoriteAuctionModel(SubFavoriteModelT[] subFavoriteAuctionModel) {
        this.subFavoriteAuctionModel = subFavoriteAuctionModel;
    }

    public SubFavoriteModelT getSubFavoriteAuctionModel(int i) {
        return this.subFavoriteAuctionModel[i];
    }

    public void setSubFavoriteAuctionModel(int i, SubFavoriteModelT _value) {
        this.subFavoriteAuctionModel[i] = _value;
    }


    /**
     * Gets the catalogID value for this FavoriteAuctionModelT.
     * 
     * @return catalogID
     */
    public long getCatalogID() {
        return catalogID;
    }


    /**
     * Sets the catalogID value for this FavoriteAuctionModelT.
     * 
     * @param catalogID
     */
    public void setCatalogID(long catalogID) {
        this.catalogID = catalogID;
    }


    /**
     * Gets the catalogName value for this FavoriteAuctionModelT.
     * 
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }


    /**
     * Sets the catalogName value for this FavoriteAuctionModelT.
     * 
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }


    /**
     * Gets the brandName value for this FavoriteAuctionModelT.
     * 
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this FavoriteAuctionModelT.
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the makeName value for this FavoriteAuctionModelT.
     * 
     * @return makeName
     */
    public String getMakeName() {
        return makeName;
    }


    /**
     * Sets the makeName value for this FavoriteAuctionModelT.
     * 
     * @param makeName
     */
    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }


    /**
     * Gets the prodDate value for this FavoriteAuctionModelT.
     * 
     * @return prodDate
     */
    public java.util.Calendar getProdDate() {
        return prodDate;
    }


    /**
     * Sets the prodDate value for this FavoriteAuctionModelT.
     * 
     * @param prodDate
     */
    public void setProdDate(java.util.Calendar prodDate) {
        this.prodDate = prodDate;
    }


    /**
     * Gets the prodDateAttr value for this FavoriteAuctionModelT.
     * 
     * @return prodDateAttr
     */
    public String getProdDateAttr() {
        return prodDateAttr;
    }


    /**
     * Sets the prodDateAttr value for this FavoriteAuctionModelT.
     * 
     * @param prodDateAttr
     */
    public void setProdDateAttr(String prodDateAttr) {
        this.prodDateAttr = prodDateAttr;
    }


    /**
     * Gets the mainDescription value for this FavoriteAuctionModelT.
     * 
     * @return mainDescription
     */
    public String getMainDescription() {
        return mainDescription;
    }


    /**
     * Sets the mainDescription value for this FavoriteAuctionModelT.
     * 
     * @param mainDescription
     */
    public void setMainDescription(String mainDescription) {
        this.mainDescription = mainDescription;
    }


    /**
     * Gets the lowestPrice value for this FavoriteAuctionModelT.
     * 
     * @return lowestPrice
     */
    public java.math.BigDecimal getLowestPrice() {
        return lowestPrice;
    }


    /**
     * Sets the lowestPrice value for this FavoriteAuctionModelT.
     * 
     * @param lowestPrice
     */
    public void setLowestPrice(java.math.BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }


    /**
     * Gets the matchingItemCnt value for this FavoriteAuctionModelT.
     * 
     * @return matchingItemCnt
     */
    public int getMatchingItemCnt() {
        return matchingItemCnt;
    }


    /**
     * Sets the matchingItemCnt value for this FavoriteAuctionModelT.
     * 
     * @param matchingItemCnt
     */
    public void setMatchingItemCnt(int matchingItemCnt) {
        this.matchingItemCnt = matchingItemCnt;
    }


    /**
     * Gets the feedbackCount value for this FavoriteAuctionModelT.
     * 
     * @return feedbackCount
     */
    public java.math.BigDecimal getFeedbackCount() {
        return feedbackCount;
    }


    /**
     * Sets the feedbackCount value for this FavoriteAuctionModelT.
     * 
     * @param feedbackCount
     */
    public void setFeedbackCount(java.math.BigDecimal feedbackCount) {
        this.feedbackCount = feedbackCount;
    }


    /**
     * Gets the image value for this FavoriteAuctionModelT.
     * 
     * @return image
     */
    public String getImage() {
        return image;
    }


    /**
     * Sets the image value for this FavoriteAuctionModelT.
     * 
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }


    /**
     * Gets the isRepresentation value for this FavoriteAuctionModelT.
     * 
     * @return isRepresentation
     */
    public boolean isIsRepresentation() {
        return isRepresentation;
    }


    /**
     * Sets the isRepresentation value for this FavoriteAuctionModelT.
     * 
     * @param isRepresentation
     */
    public void setIsRepresentation(boolean isRepresentation) {
        this.isRepresentation = isRepresentation;
    }


    /**
     * Gets the groupNo value for this FavoriteAuctionModelT.
     * 
     * @return groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }


    /**
     * Sets the groupNo value for this FavoriteAuctionModelT.
     * 
     * @param groupNo
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }


    /**
     * Gets the isCatalog value for this FavoriteAuctionModelT.
     * 
     * @return isCatalog
     */
    public boolean isIsCatalog() {
        return isCatalog;
    }


    /**
     * Sets the isCatalog value for this FavoriteAuctionModelT.
     * 
     * @param isCatalog
     */
    public void setIsCatalog(boolean isCatalog) {
        this.isCatalog = isCatalog;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FavoriteAuctionModelT)) return false;
        FavoriteAuctionModelT other = (FavoriteAuctionModelT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subFavoriteAuctionModel==null && other.getSubFavoriteAuctionModel()==null) || 
             (this.subFavoriteAuctionModel!=null &&
              java.util.Arrays.equals(this.subFavoriteAuctionModel, other.getSubFavoriteAuctionModel()))) &&
            this.catalogID == other.getCatalogID() &&
            ((this.catalogName==null && other.getCatalogName()==null) || 
             (this.catalogName!=null &&
              this.catalogName.equals(other.getCatalogName()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.makeName==null && other.getMakeName()==null) || 
             (this.makeName!=null &&
              this.makeName.equals(other.getMakeName()))) &&
            ((this.prodDate==null && other.getProdDate()==null) || 
             (this.prodDate!=null &&
              this.prodDate.equals(other.getProdDate()))) &&
            ((this.prodDateAttr==null && other.getProdDateAttr()==null) || 
             (this.prodDateAttr!=null &&
              this.prodDateAttr.equals(other.getProdDateAttr()))) &&
            ((this.mainDescription==null && other.getMainDescription()==null) || 
             (this.mainDescription!=null &&
              this.mainDescription.equals(other.getMainDescription()))) &&
            ((this.lowestPrice==null && other.getLowestPrice()==null) || 
             (this.lowestPrice!=null &&
              this.lowestPrice.equals(other.getLowestPrice()))) &&
            this.matchingItemCnt == other.getMatchingItemCnt() &&
            ((this.feedbackCount==null && other.getFeedbackCount()==null) || 
             (this.feedbackCount!=null &&
              this.feedbackCount.equals(other.getFeedbackCount()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            this.isRepresentation == other.isIsRepresentation() &&
            this.groupNo == other.getGroupNo() &&
            this.isCatalog == other.isIsCatalog();
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
        if (getSubFavoriteAuctionModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubFavoriteAuctionModel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubFavoriteAuctionModel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCatalogID()).hashCode();
        if (getCatalogName() != null) {
            _hashCode += getCatalogName().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getMakeName() != null) {
            _hashCode += getMakeName().hashCode();
        }
        if (getProdDate() != null) {
            _hashCode += getProdDate().hashCode();
        }
        if (getProdDateAttr() != null) {
            _hashCode += getProdDateAttr().hashCode();
        }
        if (getMainDescription() != null) {
            _hashCode += getMainDescription().hashCode();
        }
        if (getLowestPrice() != null) {
            _hashCode += getLowestPrice().hashCode();
        }
        _hashCode += getMatchingItemCnt();
        if (getFeedbackCount() != null) {
            _hashCode += getFeedbackCount().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        _hashCode += (isIsRepresentation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getGroupNo();
        _hashCode += (isIsCatalog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FavoriteAuctionModelT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteAuctionModelT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("makeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MakeName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("prodDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProdDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("prodDateAttr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProdDateAttr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mainDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MainDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lowestPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LowestPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("matchingItemCnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MatchingItemCnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("feedbackCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FeedbackCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("image");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Image"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isRepresentation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsRepresentation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isCatalog");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsCatalog"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFavoriteAuctionModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "subFavoriteAuctionModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "subFavoriteModelT"));
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
