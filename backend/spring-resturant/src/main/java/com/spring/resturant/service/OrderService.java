package com.spring.resturant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.resturant.model.Order;
import com.spring.resturant.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findOrder(Long id) {
		return orderRepository.findById(id).orElseThrow();
	} 
	
	public Order insert(Order order ) {
		return orderRepository.save(order);
	}
	
	public void delete(Long id) {
	   orderRepository.deleteById(id);
	}
	

}
