
package co.edu.eam.ingesoft.pa2.clientedatacredito;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DatacreditoService", targetNamespace = "http://co.gov.centralriesgo.consulta", wsdlLocation = "http://174.142.65.144:28080/orderprocesor/centralriego?wsdl")
public class DatacreditoService
    extends Service
{

    private final static URL DATACREDITOSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATACREDITOSERVICE_EXCEPTION;
    private final static QName DATACREDITOSERVICE_QNAME = new QName("http://co.gov.centralriesgo.consulta", "DatacreditoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://174.142.65.144:28080/orderprocesor/centralriego?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATACREDITOSERVICE_WSDL_LOCATION = url;
        DATACREDITOSERVICE_EXCEPTION = e;
    }

    public DatacreditoService() {
        super(__getWsdlLocation(), DATACREDITOSERVICE_QNAME);
    }

    public DatacreditoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATACREDITOSERVICE_QNAME, features);
    }

    public DatacreditoService(URL wsdlLocation) {
        super(wsdlLocation, DATACREDITOSERVICE_QNAME);
    }

    public DatacreditoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATACREDITOSERVICE_QNAME, features);
    }

    public DatacreditoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DatacreditoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Centralriego
     */
    @WebEndpoint(name = "centralriesgo")
    public Centralriego getCentralriesgo() {
        return super.getPort(new QName("http://co.gov.centralriesgo.consulta", "centralriesgo"), Centralriego.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Centralriego
     */
    @WebEndpoint(name = "centralriesgo")
    public Centralriego getCentralriesgo(WebServiceFeature... features) {
        return super.getPort(new QName("http://co.gov.centralriesgo.consulta", "centralriesgo"), Centralriego.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATACREDITOSERVICE_EXCEPTION!= null) {
            throw DATACREDITOSERVICE_EXCEPTION;
        }
        return DATACREDITOSERVICE_WSDL_LOCATION;
    }

}
