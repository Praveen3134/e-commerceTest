package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.OrderDetails;

public interface OrderDetailsDAO {
	public void addOrderDetails(OrderDetails orderDetails);
	public OrderDetails getOrderDetails(Long id);
	public void deleteOrderDetails(OrderDetails orderDetails);
	public void updateOrderDetails(OrderDetails orderDetails);
}
