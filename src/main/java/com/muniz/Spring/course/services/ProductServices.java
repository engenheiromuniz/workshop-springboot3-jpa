package com.muniz.Spring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muniz.Spring.course.entities.Product;

import jakarta.persistence.OneToMany;
import repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
