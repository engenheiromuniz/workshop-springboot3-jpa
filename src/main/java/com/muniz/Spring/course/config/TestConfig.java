package com.muniz.Spring.course.config;

import java.time.Instant;
import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.muniz.Spring.course.entities.Order;
import com.muniz.Spring.course.entities.Product;
import com.muniz.Spring.course.entities.User;
import com.muniz.Spring.course.entities.Category;
import com.muniz.Spring.course.entities.enuns.OrderStatus;

import repository.CategoryRepository;
import repository.OrderRepository;
import repository.ProductRepository;
import repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  User u1 = new User(null, "Mary Brown", "marybrown@gmail.com", "741 98546 985412", "487 548 9541");
		  User u2 = new User(null, "Alex Green", "alexg@gmail.com", "574 45632 254789", "554 234 4564");		
		  
		  Order o1 = new Order(null,Instant.parse("2025-09-26T10:40:25Z"), OrderStatus.PAID, u1);
		  Order o2 = new Order(null,Instant.parse("2025-04-26T12:55:50Z"), OrderStatus.WAITING_PAYMENT,u2);
		  Order o3 = new Order(null,Instant.parse("2025-11-17T19:50:45Z"), OrderStatus.WAITING_PAYMENT,u1);
		  
		  Category cat1 = new Category(null, "Electronics");
		  Category cat2 = new Category(null, "Books");
		  Category cat3 = new Category(null, "Computers");
		  
		  Product p1 = new Product(null, "The Lord of Rings", "It's a great movie talking about the Frodo's life and his adventure.", 90.5, "");
		  Product p2 = new Product(null, "Smart TV", "Super and technology TV flat 68'.", 2190.0, "");
		  Product p3 = new Product(null, "MacBook Pro", "Notebook high end new genaration.", 1250.45, "");
		  Product p4 = new Product(null, "PC Gamer", "Processor I7, 64GB RAM, SSD 1TB.", 1200.50, "");
		  Product p5 = new Product(null, "Rails for Dumnmies", "This book brings to revolution for knowleges Ruby on Rails", 100.99, "");
		  
		  p1.getCategories().add(cat2);
		  p2.getCategories().add(cat1);
		  p2.getCategories().add(cat3);
		  p3.getCategories().add(cat3);
		  p4.getCategories().add(cat3);
		  p5.getCategories().add(cat2);
		  
		  userRepository.saveAll(Arrays.asList(u1,u2));		
		  orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		  categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		  productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	}
	
	
	
	
}
