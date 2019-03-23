package org.conti.example.jpah2sb.ecommerce.service.impl;

import org.conti.example.jpah2sb.ecommerce.dao.SupplierDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;
import org.conti.example.jpah2sb.ecommerce.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierDAO dao;
	
	@Override
	public void signUpSupplier(String firstName,String lastName,String userName,String companyName) {
		Supplier supplier = new Supplier(firstName, lastName, userName, companyName);
		dao.addSupplier(supplier);
	}

	@Override
	public Supplier getSupplierByUserName(String userName) {
		return dao.getSupplierByName(userName);
	}

	@Override
	public void deleteSupplier(Supplier supplier) {

	}

	@Override
	public void updateSupplier(Supplier supplier) {

	}

	@Override
	public void addProduct(String userName,Product product) {
		dao.addProduct(userName,product);
	}

}
