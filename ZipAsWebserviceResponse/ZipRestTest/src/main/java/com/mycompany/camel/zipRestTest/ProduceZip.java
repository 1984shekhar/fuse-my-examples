package com.mycompany.camel.zipRestTest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

/**
 * An interface for implementing Hello services.
 */
public class ProduceZip {

	@POST
	@Produces("application/zip")
	@Path("/zip/docs")
	public byte[] exportZip() {
		return null;
	}
	
}
