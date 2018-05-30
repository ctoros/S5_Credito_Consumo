package com.mycompany.rest;

import javax.ws.rs.*;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

@Path("/restservice/")
@Produces
@Consumes
public interface GetQuoteResource {
	
	@POST
	@Path("/execute/")
//	@Produces("application/xml")
	public String getQuote(@Multipart String  input);
}
