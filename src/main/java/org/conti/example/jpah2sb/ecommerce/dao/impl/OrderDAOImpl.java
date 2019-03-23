package org.conti.example.jpah2sb.ecommerce.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.conti.example.jpah2sb.ecommerce.dao.OrderDAO;
import org.conti.example.jpah2sb.ecommerce.entity.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addOrder(PurchaseOrder order) {
		em.persist(order);
	}

	@Override
	public PurchaseOrder getOrder(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub

	}

}
