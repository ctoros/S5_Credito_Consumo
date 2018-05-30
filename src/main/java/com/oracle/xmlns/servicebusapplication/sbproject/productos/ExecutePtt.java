package com.oracle.xmlns.servicebusapplication.sbproject.productos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2018-05-30T11:06:24.943-04:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://xmlns.oracle.com/ServiceBusApplication/SBProject/Productos", name = "execute_ptt")
@XmlSeeAlso({cl.productos.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExecutePtt {

    @WebMethod(action = "execute")
    @WebResult(name = "productosResponse", targetNamespace = "http://www.productos.cl", partName = "productosResponse")
    public cl.productos.ProductosResponse execute(
        @WebParam(partName = "productosRequest", name = "productosRequest", targetNamespace = "http://www.productos.cl")
        cl.productos.ProductosRequest productosRequest
    );
}
