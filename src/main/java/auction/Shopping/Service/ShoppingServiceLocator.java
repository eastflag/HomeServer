/**
 * ShoppingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Shopping.Service;

public class ShoppingServiceLocator extends org.apache.axis.client.Service implements ShoppingService {

/**
 * Auction에서 제공되는 Open API에 대한 WSDL입니다.
 */

    public ShoppingServiceLocator() {
    }


    public ShoppingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShoppingServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShoppingServiceSoap
    private String ShoppingServiceSoap_address = "http://api.auction.co.kr/APIv1/ShoppingService.asmx";

    public String getShoppingServiceSoapAddress() {
        return ShoppingServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String ShoppingServiceSoapWSDDServiceName = "ShoppingServiceSoap";

    public String getShoppingServiceSoapWSDDServiceName() {
        return ShoppingServiceSoapWSDDServiceName;
    }

    public void setShoppingServiceSoapWSDDServiceName(String name) {
        ShoppingServiceSoapWSDDServiceName = name;
    }

    public ShoppingServiceSoap getShoppingServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShoppingServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShoppingServiceSoap(endpoint);
    }

    public ShoppingServiceSoap getShoppingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            auction.Shopping.Service.ShoppingServiceSoapStub _stub = new auction.Shopping.Service.ShoppingServiceSoapStub(portAddress, this);
            _stub.setPortName(getShoppingServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShoppingServiceSoapEndpointAddress(String address) {
        ShoppingServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ShoppingServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                auction.Shopping.Service.ShoppingServiceSoapStub _stub = new auction.Shopping.Service.ShoppingServiceSoapStub(new java.net.URL(ShoppingServiceSoap_address), this);
                _stub.setPortName(getShoppingServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ShoppingServiceSoap".equals(inputPortName)) {
            return getShoppingServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ShoppingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.auction.co.kr/APIv1/ShoppingService", "ShoppingServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ShoppingServiceSoap".equals(portName)) {
            setShoppingServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
