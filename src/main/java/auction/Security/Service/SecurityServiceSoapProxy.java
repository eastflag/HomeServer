package auction.Security.Service;

public class SecurityServiceSoapProxy implements SecurityServiceSoap {
  private String _endpoint = null;
  private SecurityServiceSoap securityServiceSoap = null;
  
  public SecurityServiceSoapProxy() {
    _initSecurityServiceSoapProxy();
  }
  
  public SecurityServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSecurityServiceSoapProxy();
  }
  
  private void _initSecurityServiceSoapProxy() {
    try {
      securityServiceSoap = (new SecurityServiceLocator()).getSecurityServiceSoap();
      if (securityServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)securityServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)securityServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (securityServiceSoap != null)
      ((javax.xml.rpc.Stub)securityServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SecurityServiceSoap getSecurityServiceSoap() {
    if (securityServiceSoap == null)
      _initSecurityServiceSoapProxy();
    return securityServiceSoap;
  }
  
  public String requestEncryptionKey() throws java.rmi.RemoteException{
    if (securityServiceSoap == null)
      _initSecurityServiceSoapProxy();
    return securityServiceSoap.requestEncryptionKey();
  }
  
  public String requestTicket(String encryptedAuthInfo) throws java.rmi.RemoteException{
    if (securityServiceSoap == null)
      _initSecurityServiceSoapProxy();
    return securityServiceSoap.requestTicket(encryptedAuthInfo);
  }
  
  public String requestTicketValidityPeriod(String encryptedTicket) throws java.rmi.RemoteException{
    if (securityServiceSoap == null)
      _initSecurityServiceSoapProxy();
    return securityServiceSoap.requestTicketValidityPeriod(encryptedTicket);
  }
  
  public String requestApplicationTicket(auction.schema.Security.RequestApplicationTicketRequestT req) throws java.rmi.RemoteException{
    if (securityServiceSoap == null)
      _initSecurityServiceSoapProxy();
    return securityServiceSoap.requestApplicationTicket(req);
  }
  
  
}