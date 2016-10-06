/**
 * SecurityService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Security.Service;

public interface SecurityService extends javax.xml.rpc.Service {

/**
 * APIv1(Auction) Security Service
 */
    public String getSecurityServiceSoapAddress();

    public auction.Security.Service.SecurityServiceSoap getSecurityServiceSoap() throws javax.xml.rpc.ServiceException;

    public auction.Security.Service.SecurityServiceSoap getSecurityServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
