package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Product;

public interface ProductDAO {
	public void addProduct(Product product);
	public Product getProduct(Long id);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
}
