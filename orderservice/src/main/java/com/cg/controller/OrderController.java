package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.model.Book;
import com.cg.model.Order;
import com.cg.model.ResponseOrder;
import com.cg.service.OrderService;
@EnableEurekaClient
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/save")
	public ResponseOrder orderBook(@RequestBody Order order)
	{
		
		Order newOrder = orderService.saveOrder(order);
		
		Book book = restTemplate.getForObject("http://localhost:8081/Book/"+order.getBookId(), Book.class);
		
		ResponseOrder responseOrder = new ResponseOrder();
		responseOrder.setOrder(newOrder);
		responseOrder.setBook(book);
		return responseOrder;
	}
	

	@GetMapping("/{orderId}")
	public ResponseEntity<Order> fetchOrder(@PathVariable("orderId") long orderId) {
		Order newOrder = orderService.getOrderById(orderId);
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(newOrder, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/all")
	public List<Order> fetchAllOrder() {

		List<Order> orderList = orderService.getAllOrders();
		return orderList;
	}

	@DeleteMapping("/delete/{orderId}")
	public ResponseEntity<String> removeBook(@PathVariable("orderId") long bookId) {

		orderService.deleteOrder(bookId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
		return responseEntity;
	}

	@PutMapping("/update")
	public ResponseEntity<Order> modifyOrder(@RequestBody Order order) {

		Order updatedOrder = orderService.updateOrder(order);
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(order, HttpStatus.CREATED);
		return responseEntity;
	}
}
