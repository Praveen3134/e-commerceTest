package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;

public interface SupplierService {
	public void signUpSupplier(String firstName,String lastName,String userName,String companyName);
	public Supplier getSupplierByUserName(String userName);
	public void deleteSupplier(Supplier supplier);
	public void updateSupplier(Supplier supplier);
	public void addProduct(String userName,Product product);
}
