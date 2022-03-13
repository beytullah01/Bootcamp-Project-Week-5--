package com.example.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gateway.client.AdvertClientOpenFeing;
import com.example.gateway.request.AdvertRequest;
import com.example.gateway.response.AdvertResponse;

@RestController
public class AdvertController {

	private final AdvertClientOpenFeing advertClientOpenFeing;
	
	@Autowired
	public AdvertController(AdvertClientOpenFeing advertClientOpenFeing ) {
	
		this.advertClientOpenFeing=advertClientOpenFeing;
		
	}
	
	@GetMapping(value="/adverts")
	public ResponseEntity<List<AdvertResponse>> getAdverts(){
		
		return advertClientOpenFeing.getAdverts();
		
	}
	
	@PostMapping(value="/adverts")
	public ResponseEntity<AdvertResponse> saveAdverts(@RequestBody AdvertRequest advertRequest){
		
		
		return advertClientOpenFeing.saveAdvert(advertRequest);
	}
}
