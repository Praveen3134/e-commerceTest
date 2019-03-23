package org.conti.example.jpah2sb.ecommerce.service.impl;

import javax.transaction.Transactional;

import org.conti.example.jpah2sb.ecommerce.dao.ProductDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO dao;
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		dao.addProduct(product);
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
