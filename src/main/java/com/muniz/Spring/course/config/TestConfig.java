package com.muniz.Spring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.muniz.Spring.course.entities.User;

import repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  User u1 = new User(null, "Mary Brown", "marybrown@gmail.com", "741 98546 985412", "487 548 9541");
		  User u2 = new User(null, "Alex Green", "alexg@gmail.com", "574 45632 254789", "554 234 4564");		
		  
		  userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
