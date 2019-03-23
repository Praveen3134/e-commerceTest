package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BillingInfo extends Information{
	private String phoneNo;
	private String email;
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy="billingInfo")
	private List<PurchaseOrder> purchaseOrders=new ArrayList<PurchaseOrder>();
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}
	public void addOrder(PurchaseOrder purchaseOder) {
		this.purchaseOrders.add(purchaseOder);
	}
	@Override
	public String toString() {
		return "PersonalInfo [ phoneNo=" + phoneNo + ", email=" + email + "]";
	}
}
