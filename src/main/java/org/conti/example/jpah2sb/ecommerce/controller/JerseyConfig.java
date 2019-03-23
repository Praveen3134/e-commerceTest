package org.conti.example.jpah2sb.ecommerce.controller;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig(){
		register(AdminController.class);
	}
}
