
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.oracle.xmlns.servicebusapplication.sbproject.productos;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2018-05-30T11:06:24.905-04:00
 * Generated source version: 3.1.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "$service.ServiceName",
                      targetNamespace = "$service.Namespace",
                      wsdlLocation = "classpath:wsdl/Productos.wsdl",
                      endpointInterface = "com.oracle.xmlns.servicebusapplication.sbproject.productos.ExecutePtt")
                      
public class ExecutePttImpl implements ExecutePtt {

    private static final Logger LOG = Logger.getLogger(ExecutePttImpl.class.getName());

    /* (non-Javadoc)
     * @see com.oracle.xmlns.servicebusapplication.sbproject.productos.ExecutePtt#execute(cl.productos.ProductosRequest productosRequest)*
     */
    public cl.productos.ProductosResponse execute(cl.productos.ProductosRequest productosRequest) { 
        LOG.info("Executing operation execute");
        System.out.println(productosRequest);
        try {
            cl.productos.ProductosResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}