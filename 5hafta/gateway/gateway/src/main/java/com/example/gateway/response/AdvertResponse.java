package com.example.gateway.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertResponse {
	
	private String baslik;
	private BigDecimal fiyat;

}
