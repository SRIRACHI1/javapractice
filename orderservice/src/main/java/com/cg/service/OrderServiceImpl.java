package com.cg.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Book;
import com.cg.model.Order;
import com.cg.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Order saveOrder(Order order) {
		
		order.setOrderStatus("Success");
		Order orderDetails = orderRepository.save(order);
		return orderDetails;
	}

	@Override
	public Order getOrderById(long orderId) {
Optional<Order>  optionalOrder = orderRepository.findById(orderId);
		
		if(optionalOrder.isEmpty()) {
			throw new ResourceNotFoundException("Order not existing with id: "+orderId);
		}
		
		return optionalOrder.get();
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Order order) {

		Optional<Order> optionalOrder =  orderRepository.findById(order.getOrderId());
		
		if(optionalOrder.isEmpty()) {
			throw new ResourceNotFoundException("Order Details Not found with id: "+order.getOrderId());
		}
		
		Order updatedOrder = orderRepository.save(order);
		
		return updatedOrder;
	}

	@Override
	public void deleteOrder(long orderId) {
		
Optional<Order>  optionalOrder = orderRepository.findById(orderId);
		
		if(optionalOrder.isEmpty()) {
			throw new ResourceNotFoundException("Order not existing with id: "+orderId);
		}
		
		orderRepository.deleteById(orderId);
	}

	
		

}
