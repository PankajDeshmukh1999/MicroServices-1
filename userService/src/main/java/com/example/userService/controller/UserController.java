package com.example.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.userService.entity.User;
import com.example.userService.service.userService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private userService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/{id}")
	public User getUser(@PathVariable ("id") Long id) {
//		return this.service.getuser(id);
		 User user = this.service.getuser(id);

	        List contacts = this.restTemplate.getForObject("http://contact-service/contact/112" + user.getId(), List.class);

	        user.setContact( contacts);
	        
	        return user;
	}

}
