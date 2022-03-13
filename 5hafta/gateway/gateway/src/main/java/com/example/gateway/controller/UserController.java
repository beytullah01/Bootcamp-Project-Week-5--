package com.example.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.gateway.client.UserClientOpenFeing;
import com.example.gateway.request.UserRequest;
import com.example.gateway.response.UserResponse;

@RestController
public class UserController {
	
	private final UserClientOpenFeing userClientOpenFeing;
	
	@Autowired
	public UserController(UserClientOpenFeing userClientOpenFeing ) {
	
		this.userClientOpenFeing=userClientOpenFeing;
		
	}
	
	
	@GetMapping(value="/users")
	public ResponseEntity<List<UserResponse>> getUsers(){
		
		return userClientOpenFeing.getUsers();
		
	}
	
	@GetMapping(value="/users")
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest){
		
		return userClientOpenFeing.saveUser(userRequest);
		
	}
	

}
