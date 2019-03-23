package org.conti.example.jpah2sb.ecommerce.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_supplier_userName",query="Select supp from Supplier supp where user_Name=?1")
public class Supplier extends SystemUser{
	private String companyName;
	@ManyToMany(mappedBy="suppliers")
	private List<Product> products=new ArrayList<Product>();
	
	public Supplier() {
		super();
	}

	public Supplier(String firstName,String lastName,String userName,String companyName) {
		super(firstName,lastName,userName);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
		return "Supplier [userId=" + this.getUserId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", userName="
				+ this.getUserName() + ", companyName=" + companyName + "]";
	}
}
