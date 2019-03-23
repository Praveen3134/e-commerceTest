package org.conti.example.jpah2sb.ecommerce.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.conti.example.jpah2sb.ecommerce.entity.SystemAdmin;
import org.conti.example.jpah2sb.ecommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("admin")
public class AdminController {

	@Autowired
	AdminService service;
	
	@POST
	@Path("addAdmin")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SystemAdmin addAdmin(SystemAdmin admin){
		service.addAdmin(admin);
		SystemAdmin adminData = service.getAdminByName("admin");
		return adminData;
	}
}
