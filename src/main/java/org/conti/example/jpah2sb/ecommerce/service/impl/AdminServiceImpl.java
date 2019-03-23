package org.conti.example.jpah2sb.ecommerce.service.impl;

import org.conti.example.jpah2sb.ecommerce.dao.AdminDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Shipper;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;
import org.conti.example.jpah2sb.ecommerce.entity.SystemAdmin;
import org.conti.example.jpah2sb.ecommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public void addAdmin(SystemAdmin admin) {
		SystemAdmin systemAdmin = new SystemAdmin(40009876L,admin.getUserId(), admin.getPassword(), admin.getName());
		adminDAO.addAdmin(systemAdmin);
	}

	@Override
	public SystemAdmin getAdmin(Long id) {
		SystemAdmin admin = adminDAO.getAdmin(id);
		return admin;
	}
	
	@Override
	public SystemAdmin getAdminByName(String name) {
		SystemAdmin admin = adminDAO.getAdminByName(name);
		return admin;
	}

	@Override
	public void deleteAdmin(SystemAdmin admin) {
		
	}

	@Override
	public void updateAdmin(SystemAdmin admin) {
		
	}

	@Override
	public void registerSupplier(String firstName,String lastName,String userName,String companyName) {
		adminDAO.addSupplier(new Supplier(firstName,lastName,userName, companyName));
	}

	@Override
	public void registerShipper(String companyName,String phoneNo) {
		adminDAO.addShipper(new Shipper(companyName,phoneNo));
	}

}
