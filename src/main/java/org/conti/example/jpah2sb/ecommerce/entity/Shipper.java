package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shipper {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String companyName;
	@Column(nullable=false)
	private String phoneNo;
	@OneToMany(mappedBy="shipper")
	private List<PurchaseOrder> purchaseOrders=new ArrayList<PurchaseOrder>();
	public Shipper(String companyName, String phoneNo) {
		super();
		this.companyName = companyName;
		this.phoneNo = phoneNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getId() {
		return id;
	}
	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}
	public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrders.add(purchaseOrder);
	}
	public void removePurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrders.remove(purchaseOrder);
	}
	@Override
	public String toString() {
		return "Shipper [id=" + id + ", companyName=" + companyName + ", phoneNo=" + phoneNo + "]";
	}
}
