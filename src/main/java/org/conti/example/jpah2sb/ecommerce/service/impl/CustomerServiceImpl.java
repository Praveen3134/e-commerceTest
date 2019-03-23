package org.conti.example.jpah2sb.ecommerce.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.conti.example.jpah2sb.ecommerce.dao.CustomerDAO;
import org.conti.example.jpah2sb.ecommerce.dao.OrderDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Customer;
import org.conti.example.jpah2sb.ecommerce.entity.Product;
import org.conti.example.jpah2sb.ecommerce.entity.PurchaseOrder;
import org.conti.example.jpah2sb.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	public void addCustomer(String firstName,String lastName,String userName,String securityQuestion, String answer) {
		Customer customer = new Customer(firstName, lastName, userName, securityQuestion, answer);
		customerDAO.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		Customer customer = customerDAO.getCustomerById(id);
		return customer;
	}

	@Override
	public void deleteCustomer(Long id) {

	}

	@Override
	public void updateCustomer(Long id,Map<String,Object> parameters) {
		Customer customer = getCustomerById(id);
		customerDAO.updateCustomer(customer,parameters);
	}

	@Override
	public void signUpCustomer(String firstName,String lastName,String userName,String securityQuestion,String answer) {
		Customer customer = new Customer(firstName,lastName,userName, securityQuestion, answer);
		customerDAO.addCustomer(customer);
	}

	@Override
	public Customer getCustomerByName(String userName) {
		Customer customer = customerDAO.getCustomerByName(userName);
		return customer;
	}

	@Override
	public void placeOrder(List<Product> products) {
		PurchaseOrder purchaseOrder = new PurchaseOrder(new Date());
		purchaseOrder.setShippingDate(generateShippingDate(purchaseOrder.getOrderDate(),2));
		orderDAO.addOrder(purchaseOrder);
	}

	private Date generateShippingDate(Date orderDate,int bufferDays){
		return orderDate;
	}
}
