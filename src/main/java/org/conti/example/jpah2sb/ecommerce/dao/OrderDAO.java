package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.PurchaseOrder;

public interface OrderDAO {
	public void addOrder(PurchaseOrder order);
	public PurchaseOrder getOrder(Long id);
	public void deleteOrder(PurchaseOrder order);
	public void updateOrder(PurchaseOrder order);
}
