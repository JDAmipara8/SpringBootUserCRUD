package com.springBootApk.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springBootApk.entities.User;

import com.springBootApk.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	private RestTemplate restTamplate;
	
	@GetMapping
	public List<User> getusers() {
		return userService.getUsers();
	}
	
	@GetMapping("/{uId}")
	public User getUser(@PathVariable(required = true) long uId) {
		User user = this.userService.getUserById(uId);
		List contact = this.restTamplate.getForObject("http://localhost:8082/microServices/contact/user/"+user.getuId(), List.class);
		user.setContact(contact);
		return user;
		
	}
	
	@PostMapping("/add")
	public User postUser(@RequestBody User user) {
		  userService.add(user);
		return user;
	}
	
	@GetMapping("/{uId}")
	public User getByID(@PathVariable(required = true) long uId) {
		
		return userService.getUserById(uId);
	}
	
	@DeleteMapping("/{uId}")
	public void delete(@PathVariable(required = true) long uId) {
		userService.delete(uId);
	}
	
	@PutMapping("/{uId}")
	public User update(@RequestBody User user, 
						@PathVariable(required = true) long uId) {
		 return userService.updateUser(user, uId);
		
	}
	
}
