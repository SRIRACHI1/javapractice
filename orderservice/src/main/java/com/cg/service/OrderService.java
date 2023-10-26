package com.cg.service;

import java.util.List;

import com.cg.model.Order;

public interface OrderService {
	
	Order saveOrder(Order order);

	Order getOrderById(long orderId);

	List<Order> getAllOrders();

	public Order updateOrder(Order order);

	public void deleteOrder(long orderId);

}
