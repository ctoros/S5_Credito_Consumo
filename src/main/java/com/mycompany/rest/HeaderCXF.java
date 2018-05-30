package com.mycompany.rest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HeaderCXF implements Processor{
	
	
//	public String HeaderSend(String entrada) {
//	
//		
//	String xmlHeader = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prod=\"http://www.productos.cl\">\r\n" + 
//			"   <soapenv:Header/>\r\n" + 
//			"   <soapenv:Body>\r\n" + 
//			"      <prod:productosRequest>\r\n"+ entrada +"\r\n</prod:productosRequest>\r\n" + 
//					"   </soapenv:Body>\r\n" + 
//					"</soapenv:Envelope>";
//			;
//				
//		return xmlHeader;
//	}

	@Override
	public void process(Exchange exchange) throws Exception {
		String producto=exchange.getIn().getHeader("entrada").toString();
		StringBuilder salida=new StringBuilder();
		salida.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prod=\"http://www.productos.cl\">")
		.append("<soapenv:Header/>")
		.append("<soapenv:Body>")
		.append("<prod:productosRequest>")
		.append(producto)
		.append("</prod:productosRequest>") 
		.append("   </soapenv:Body>")
		.append("</soapenv:Envelope>");
		
		exchange.getIn().setBody(salida);
	}
	
	
}
