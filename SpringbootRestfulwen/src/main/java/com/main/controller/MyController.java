package com.main.controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.User;
import com.main.service.UserService;

@RestController
public class MyController {
	@Autowired
	private  UserService userService;
	@PostMapping("/user")
	public User addUserdetails(@RequestBody User user) {
		
		
		return userService.createUser(user) ;
	}
	@GetMapping("/user")
	public List<User> getdetalis(){
		
		return userService.getallUser();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getdetalisbyidd(@PathVariable int id){
		User user= userService.getUserdetailbyid(id).orElse(null);
		
		if(user!=null) {
			return ResponseEntity.ok().body(user);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserDetail(@PathVariable int id, @RequestBody User newUser) {
		
		User updatedUser = userService.updateUserDetails(id, newUser);
		if(updatedUser!=null) {
			return ResponseEntity.ok().body(updatedUser);
			
		}
		else {
			return ResponseEntity.notFound().build();
			}
		
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable int id){
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}

}
