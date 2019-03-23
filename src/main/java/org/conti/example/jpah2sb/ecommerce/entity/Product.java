package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int discount;
	private float unitWeight;
	private int unitsInStock;
	private String description;
	private Long price;
	@ManyToOne
	private Category category;
	@ManyToOne
	private PurchaseOrder purchaseOrder;
	@ManyToMany
	private List<Supplier> suppliers=new ArrayList<Supplier>();
	public Product(String name, int discount, float unitWeight, int unitsInStock, String description, Long price) {
		super();
		this.name = name;
		this.discount = discount;
		this.unitWeight = unitWeight;
		this.unitsInStock = unitsInStock;
		this.description = description;
		this.price = price;
	}
	public Product() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public float getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(float unitWeight) {
		this.unitWeight = unitWeight;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void addSupplier(Supplier supplier) {
		this.suppliers.add(supplier);
	}
	public void removeSupplier(Supplier supplier) {
		this.suppliers.remove(supplier);
	}
	public Long getId() {
		return id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", discount=" + discount + ", unitWeight=" + unitWeight
				+ ", unitsInStock=" + unitsInStock + ", description=" + description + ", price=" + price + ", suppliers="
				+ suppliers + "]";
	}
}
