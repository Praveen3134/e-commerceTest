package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Shipper;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;
import org.conti.example.jpah2sb.ecommerce.entity.SystemAdmin;

public interface AdminDAO {
	public void addAdmin(SystemAdmin admin);
	public SystemAdmin getAdmin(Long id);
	public SystemAdmin getAdminByName(String name);
	public void deleteAdmin(SystemAdmin admin);
	public void updateAdmin(SystemAdmin admin);
	public void addSupplier(Supplier supplier);
	public void addShipper(Shipper shipper);
}
