package com.example.gateway.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.gateway.request.AdvertRequest;
import com.example.gateway.response.AdvertResponse;

@FeignClient(name="advert-feign", url="http://localhost:8080/adverts")
public interface AdvertClientOpenFeing {
	
	
		@PostMapping(name="/adverts")
		public ResponseEntity<AdvertResponse> saveAdvert(@RequestBody AdvertRequest advertRequest);

		@GetMapping(name="/adverts")
		public ResponseEntity<List<AdvertResponse>> getAdverts();

}
