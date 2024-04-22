
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEuroToDH_QNAME = new QName("http://ws/", "ConversionEuroToDH");
    private static final QName _ConversionEuroToDHResponse_QNAME = new QName("http://ws/", "ConversionEuroToDHResponse");
    private static final QName _GetCopmte_QNAME = new QName("http://ws/", "getCopmte");
    private static final QName _GetCopmteResponse_QNAME = new QName("http://ws/", "getCopmteResponse");
    private static final QName _ListComptes_QNAME = new QName("http://ws/", "listComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://ws/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDH }
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDHResponse }
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetCopmte }
     * 
     * @return
     *     the new instance of {@link GetCopmte }
     */
    public GetCopmte createGetCopmte() {
        return new GetCopmte();
    }

    /**
     * Create an instance of {@link GetCopmteResponse }
     * 
     * @return
     *     the new instance of {@link GetCopmteResponse }
     */
    public GetCopmteResponse createGetCopmteResponse() {
        return new GetCopmteResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopmte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCopmte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCopmte")
    public JAXBElement<GetCopmte> createGetCopmte(GetCopmte value) {
        return new JAXBElement<>(_GetCopmte_QNAME, GetCopmte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopmteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCopmteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCopmteResponse")
    public JAXBElement<GetCopmteResponse> createGetCopmteResponse(GetCopmteResponse value) {
        return new JAXBElement<>(_GetCopmteResponse_QNAME, GetCopmteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
