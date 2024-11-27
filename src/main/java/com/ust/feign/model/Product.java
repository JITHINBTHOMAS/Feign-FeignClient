package com.ust.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
}
