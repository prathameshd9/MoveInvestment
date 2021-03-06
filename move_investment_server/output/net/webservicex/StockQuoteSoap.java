package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-02-16T14:15:11.942-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface StockQuoteSoap {

    /**
     * Get Stock quote for a company Symbol
     */
    @WebMethod(operationName = "GetQuote", action = "http://www.webserviceX.NET/GetQuote")
    @RequestWrapper(localName = "GetQuote", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.GetQuote")
    @ResponseWrapper(localName = "GetQuoteResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.GetQuoteResponse")
    @WebResult(name = "GetQuoteResult", targetNamespace = "http://www.webserviceX.NET/")
    public java.lang.String getQuote(
        @WebParam(name = "symbol", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String symbol
    );
}
