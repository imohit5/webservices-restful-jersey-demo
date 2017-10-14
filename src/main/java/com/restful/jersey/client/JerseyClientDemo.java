package com.restful.jersey.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class JerseyClientDemo {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();

		String result = client.target("http://localhost:8080/webservices-restful-jersey-demo/jersey/jerseyGet")
				.request().get(String.class);

		System.out.println(result);
	}

}
