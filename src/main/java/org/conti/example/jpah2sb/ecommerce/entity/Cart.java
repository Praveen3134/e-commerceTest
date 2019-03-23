package org.conti.example.jpah2sb.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Long id;
	private float toalPrice;
	@OneToOne
	private Customer customer;
//	private List<Product> products=new ArrayList<Product>();
	public float getToalPrice() {
		return toalPrice;
	}
	public void setToalPrice(float toalPrice) {
		this.toalPrice = toalPrice;
	}
	public Long getId() {
		return id;
	}
	
}
