package org.conti.example.jpah2sb.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue
	private Long id;
	private int discount;
	private Long unitPrice;
	private int quantity;
	@OneToOne
	private PurchaseOrder purchaseOrder;
//	@OneToOne
//	private Product product;
//	public OrderDetails(int discount, Long unitPrice, int quantity, Order order, Product product) {
//		super();
//		this.discount = discount;
//		this.unitPrice = unitPrice;
//		this.quantity = quantity;
//		this.order = order;
//		this.product = product;
//	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Long getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
	public Long getId() {
		return id;
	}
//	@Override
//	public String toString() {
//		return "OrderDetails [id=" + id + ", discount=" + discount + ", unitPrice=" + unitPrice + ", quantity="
//				+ quantity + ", order=" + order + ", product=" + product + "]";
//	}
}
