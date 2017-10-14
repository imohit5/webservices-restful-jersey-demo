package com.restful.jersey.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("jerseyGet")
public class JerseyServerDemo {

	@GET
	public String hello() {
		return "Hello Jersey";
	}
	
}
