package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.SystemAdmin;

public interface AdminService {
	public void addAdmin(SystemAdmin admin);
	public SystemAdmin getAdmin(Long id);
	public void deleteAdmin(SystemAdmin admin);
	public void updateAdmin(SystemAdmin admin);
	public SystemAdmin getAdminByName(String name);
	public void registerSupplier(String firstName,String lastName,String userName,String companyName);
	public void registerShipper(String	companyName,String phoneNo);
}
