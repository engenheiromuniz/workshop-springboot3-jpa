package com.muniz.Spring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.muniz.Spring.course.entities.User;
import com.muniz.Spring.course.resource.UserResource;

import repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
