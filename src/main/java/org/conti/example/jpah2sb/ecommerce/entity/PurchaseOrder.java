package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrder {
	@Id
	@GeneratedValue
	private Long id;
	@GeneratedValue
	private String orderNo;
	private Date orderDate;
	private Date shippingDate;
	private Date expectedDeliveryDate;
	@OneToOne
	private Shipper shipper;
	@ManyToOne
	private Customer customer;
	@OneToOne(mappedBy="purchaseOrder")
	private OrderDetails orderDetails;
	@ManyToMany(mappedBy="purchaseOrder")
	private List<Product> cartProducts=new ArrayList<Product>();
	@OneToOne
	private BillingInfo billingInfo;
	
	public PurchaseOrder() {
	}
	
	public PurchaseOrder(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderNo() {
		return orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public Shipper getShipper() {
		return shipper;
	}
	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Long getId() {
		return id;
	}
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	public BillingInfo getBillingInfo() {
		return billingInfo;
	}
	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}
	public List<Product> getCartProducts() {
		return cartProducts;
	}
	public void addCartProducts(Product cartProduct) {
		this.cartProducts.add(cartProduct);
	}
	public void removeCartProducts(Product cartProduct) {
		this.cartProducts.remove(cartProduct);
	}
}
