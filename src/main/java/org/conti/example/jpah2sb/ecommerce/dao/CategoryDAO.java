package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Category;

public interface CategoryDAO {
	public void addCategory(Category category);
	public Category getCategory(Long id);
	public void deleteCategory(Category category);
	public void updateCategory(Category category);
}
