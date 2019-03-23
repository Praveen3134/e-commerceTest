package org.conti.example.jpah2sb.ecommerce.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.conti.example.jpah2sb.ecommerce.dao.SupplierDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public class SupplierDAOImpl implements SupplierDAO {

	@PersistenceContext
	EntityManager mgr;
	
	@Override
	@Transactional
	public void addSupplier(Supplier supplier) {
		mgr.persist(supplier);
	}

	@Override
	@Transactional
	public Supplier getSupplierByName(String name) {
		TypedQuery<Supplier> query = mgr.createNamedQuery("find_supplier_userName", Supplier.class);
		query.setParameter(1, name);
		return query.getSingleResult();
	}

	@Override
	public void deleteSupplier(Supplier supplier) {

	}

	@Override
	public void updateSupplier(Supplier supplier) {

	}

	@Override
	@Transactional
	public void addProduct(String userName,Product product) {
		Product suppliedProduct = mgr.find(Product.class,product.getId());
		TypedQuery<Supplier> query = mgr.createNamedQuery("find_supplier_userName", Supplier.class);
		query.setParameter(1, userName);
		Supplier supplier = query.getSingleResult();
		suppliedProduct.addSupplier(supplier);
		supplier.addProduct(suppliedProduct);
		
		mgr.persist(suppliedProduct);
		mgr.persist(supplier);
	}

}
