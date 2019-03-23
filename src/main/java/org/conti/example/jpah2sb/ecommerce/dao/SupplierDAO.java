package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;

public interface SupplierDAO {
	public void addSupplier(Supplier supplier);
	public Supplier getSupplierByName(String name);
	public void deleteSupplier(Supplier supplier);
	public void updateSupplier(Supplier supplier);
	public void addProduct(String userName,Product product);
}
