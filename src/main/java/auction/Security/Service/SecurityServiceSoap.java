/**
 * SecurityServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package auction.Security.Service;

public interface SecurityServiceSoap extends java.rmi.Remote {

    /**
     * 인증정보 암호화에 사용할 공개키를 요청합니다.
     */
    public String requestEncryptionKey() throws java.rmi.RemoteException;

    /**
     * 암호화된 인증파라메터를 전달하고 인증티켓을 요청합니다.
     */
    public String requestTicket(String encryptedAuthInfo) throws java.rmi.RemoteException;

    /**
     * 암호화된 인증티켓문자열을 전달하고 유효기간을 반환받습니다.
     */
    public String requestTicketValidityPeriod(String encryptedTicket) throws java.rmi.RemoteException;

    /**
     * 인증파라메터를 전달하고 애플리케이션 인증티켓을 요청합니다.
     */
    public String requestApplicationTicket(auction.schema.Security.RequestApplicationTicketRequestT req) throws java.rmi.RemoteException;
}
