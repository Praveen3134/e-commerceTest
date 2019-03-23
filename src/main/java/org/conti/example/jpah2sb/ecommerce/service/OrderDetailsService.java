package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.OrderDetails;

public interface OrderDetailsService {
	public void addOrderDetails(OrderDetails orderDetails);
	public OrderDetails getOrderDetails(Long id);
	public void deleteOrderDetails(OrderDetails orderDetails);
	public void updateOrderDetails(OrderDetails orderDetails);
}
