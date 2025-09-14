package com.muniz.Spring.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.muniz.Spring.course.entities.Order;
import com.muniz.Spring.course.entities.User;
import com.muniz.Spring.course.entities.enuns.OrderStatus;

import repository.OrderRepository;
import repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  User u1 = new User(null, "Mary Brown", "marybrown@gmail.com", "741 98546 985412", "487 548 9541");
		  User u2 = new User(null, "Alex Green", "alexg@gmail.com", "574 45632 254789", "554 234 4564");		
		  
		  Order o1 = new Order(null,Instant.parse("2025-09-26T10:40:25Z"), OrderStatus.PAID, u1);
		  Order o2 = new Order(null,Instant.parse("2025-04-26T12:55:50Z"), OrderStatus.WAITING_PAYMENT,u2);
		  Order o3 = new Order(null,Instant.parse("2025-11-17T19:50:45Z"), OrderStatus.WAITING_PAYMENT,u1);
		  
		  userRepository.saveAll(Arrays.asList(u1,u2));		
		  orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
	
}
