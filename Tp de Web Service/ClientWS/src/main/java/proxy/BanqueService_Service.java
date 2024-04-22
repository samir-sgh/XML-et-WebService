
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanqueService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8181/?wsdl")
public class BanqueService_Service
    extends Service
{

    private static final URL BANQUESERVICE_WSDL_LOCATION;
    private static final WebServiceException BANQUESERVICE_EXCEPTION;
    private static final QName BANQUESERVICE_QNAME = new QName("http://ws/", "BanqueService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUESERVICE_WSDL_LOCATION = url;
        BANQUESERVICE_EXCEPTION = e;
    }

    public BanqueService_Service() {
        super(__getWsdlLocation(), BANQUESERVICE_QNAME);
    }

    public BanqueService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUESERVICE_QNAME, features);
    }

    public BanqueService_Service(URL wsdlLocation) {
        super(wsdlLocation, BANQUESERVICE_QNAME);
    }

    public BanqueService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUESERVICE_QNAME, features);
    }

    public BanqueService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUESERVICE_EXCEPTION!= null) {
            throw BANQUESERVICE_EXCEPTION;
        }
        return BANQUESERVICE_WSDL_LOCATION;
    }

}
