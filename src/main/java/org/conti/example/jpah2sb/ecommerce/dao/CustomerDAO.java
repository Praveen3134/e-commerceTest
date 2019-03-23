package org.conti.example.jpah2sb.ecommerce.dao;

import java.util.Map;

import org.conti.example.jpah2sb.ecommerce.entity.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer customer);
	public Customer getCustomerByName(String userName);
	public Customer getCustomerById(Long id);
	public void deleteCustomer(Customer customer);
	public void updateCustomer(Customer customer, Map<String, Object> parameters);
}
