package com.muniz.Spring.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.muniz.Spring.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {


	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1, "Ana", "ana.bolena@gmail.com", "61 98521-4521", "111214");
		
		return ResponseEntity.ok().body(u);		
	}
	
}
