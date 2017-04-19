
package move;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the move package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetQuote_QNAME = new QName("http://move/", "getQuote");
    private final static QName _GetQuoteResponse_QNAME = new QName("http://move/", "getQuoteResponse");
    private final static QName _InvestmentValue_QNAME = new QName("http://move/", "investmentValue");
    private final static QName _InvestmentValueResponse_QNAME = new QName("http://move/", "investmentValueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: move
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link InvestmentValue }
     * 
     */
    public InvestmentValue createInvestmentValue() {
        return new InvestmentValue();
    }

    /**
     * Create an instance of {@link InvestmentValueResponse }
     * 
     */
    public InvestmentValueResponse createInvestmentValueResponse() {
        return new InvestmentValueResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://move/", name = "getQuote")
    public JAXBElement<GetQuote> createGetQuote(GetQuote value) {
        return new JAXBElement<GetQuote>(_GetQuote_QNAME, GetQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://move/", name = "getQuoteResponse")
    public JAXBElement<GetQuoteResponse> createGetQuoteResponse(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_GetQuoteResponse_QNAME, GetQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://move/", name = "investmentValue")
    public JAXBElement<InvestmentValue> createInvestmentValue(InvestmentValue value) {
        return new JAXBElement<InvestmentValue>(_InvestmentValue_QNAME, InvestmentValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://move/", name = "investmentValueResponse")
    public JAXBElement<InvestmentValueResponse> createInvestmentValueResponse(InvestmentValueResponse value) {
        return new JAXBElement<InvestmentValueResponse>(_InvestmentValueResponse_QNAME, InvestmentValueResponse.class, null, value);
    }

}
