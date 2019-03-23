package org.conti.example.jpah2sb.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="find_customer_by_userName",query="select cust from Customer cust where first_Name=?1")
public class Customer extends SystemUser{

	private String securityQuestion;
	private String answer;
	@OneToMany(mappedBy="customer")
	private List<BillingInfo> billingInfo=new ArrayList<BillingInfo>();
	@OneToMany(mappedBy="customer")
	private List<PurchaseOrder> orders=new ArrayList<PurchaseOrder>();
	
	public Customer() {
		super();
	}
	public Customer(String firstName,String lastName,String userName,String securityQuestion, String answer) {
		super(firstName,lastName,userName);
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<BillingInfo> getBillingInfo() {
		return billingInfo;
	}
	public void addBillingInfo(BillingInfo billingInfo) {
		this.billingInfo.add(billingInfo);
	}
	public void removeBillingInfo(BillingInfo billingInfo) {
		this.billingInfo.remove(billingInfo);
	}
	public List<PurchaseOrder> getOrders() {
		return orders;
	}
	public void addOrer(PurchaseOrder order) {
		this.orders.add(order);
	}
	public void removeOrder(PurchaseOrder orders) {
		this.orders.remove(orders);
	}
	@Override
	public String toString() {
		
		return "Customer [userId=" + this.getUserId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", userName="
				+ this.getUserName() + "securityQuestion=" + securityQuestion + ", answer=" + answer + "]";
	}
}
