package org.conti.example.jpah2sb.ecommerce.dao.impl;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.conti.example.jpah2sb.ecommerce.dao.CustomerDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		em.persist(customer);
	}

	@Override
	@Transactional
	public Customer getCustomerByName(String userName) {
		TypedQuery<Customer> customer = em.createNamedQuery("find_customer_by_userName", Customer.class);
		customer.setParameter(1, userName);
		Customer fetchedCustomer = customer.getSingleResult();
		return fetchedCustomer;
	}

	@Override
	public void deleteCustomer(Customer customer) {

	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer,Map<String, Object> parameters) {
		parameters.keySet().forEach(updateParameter->{
			switch (updateParameter) {
			case "":
				
				break;

			default:
				break;
			}
		});
	}

	@Override
	public Customer getCustomerById(Long id) {
		Customer customer = em.find(Customer.class, id);
		return customer;
	}

}
