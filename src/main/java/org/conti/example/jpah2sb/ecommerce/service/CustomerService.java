package org.conti.example.jpah2sb.ecommerce.service;

import java.util.List;
import java.util.Map;

import org.conti.example.jpah2sb.ecommerce.entity.Customer;
import org.conti.example.jpah2sb.ecommerce.entity.Product;

public interface CustomerService {
	public void addCustomer(String firstName,String lastName,String userName,String securityQuestion, String answer);
	public Customer getCustomerById(Long id);
	public Customer getCustomerByName(String userName);
	public void deleteCustomer(Long id);
	public void updateCustomer(Long id, Map<String, Object> parameters);
	public void signUpCustomer(String firstName,String lastName,String userName,String securityQuestion,String answer);
	public void placeOrder(List<Product> products);
}
