package com.muniz.Spring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muniz.Spring.course.entities.Order;
import com.muniz.Spring.course.entities.User;

import jakarta.persistence.OneToMany;
import repository.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository repository;
	

	@OneToMany(mappedBy = "client")
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
