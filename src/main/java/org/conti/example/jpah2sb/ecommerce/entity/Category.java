package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String Name;
	private String description;
	@OneToMany
 	private List<Product> products=new ArrayList<Product>();
	public Category(String name, String description) {
		super();
		Name = name;
		this.description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void removeProduct(Product product) {
		this.products.remove(product);
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", Name=" + Name + ", description=" + description + "]";
	}
}
