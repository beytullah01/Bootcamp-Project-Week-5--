package com.example.gateway.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.gateway.request.UserRequest;

import com.example.gateway.response.UserResponse;

@FeignClient(name="user-feign", url="http://localhost:8080/users")
public interface UserClientOpenFeing {

	

	@PostMapping(name="/users")
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest);

	@GetMapping(name="/users")
	public ResponseEntity<List<UserResponse>> getUsers();

	
}
