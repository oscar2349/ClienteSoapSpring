package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2021-06-17T10:47:30.861-05:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "serviceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceSoap {

    @WebMethod(operationName = "Execute", action = "http://tempuri.org/Execute")
    @RequestWrapper(localName = "Execute", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Execute")
    @ResponseWrapper(localName = "ExecuteResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ExecuteResponse")
    @WebResult(name = "ExecuteResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String execute(
        @WebParam(name = "xmlCommand", targetNamespace = "http://tempuri.org/")
        java.lang.String xmlCommand
    );
}
