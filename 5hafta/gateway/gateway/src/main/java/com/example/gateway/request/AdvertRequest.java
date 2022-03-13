package com.example.gateway.request;

import java.math.BigDecimal;
import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertRequest {


	private String baslik;
	private BigDecimal fiyat;
	
}
