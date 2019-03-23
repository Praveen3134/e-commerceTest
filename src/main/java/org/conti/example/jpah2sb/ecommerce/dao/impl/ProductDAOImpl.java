package org.conti.example.jpah2sb.ecommerce.dao.impl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.conti.example.jpah2sb.ecommerce.dao.ProductDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	EntityManager mgr;
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		mgr.persist(product);
		System.out.println();
	}

	@Override
	public Product getProduct(Long id) {
		return null;
	}

	@Override
	public void deleteProduct(Product product) {

	}

	@Override
	public void updateProduct(Product product) {

	}

}
