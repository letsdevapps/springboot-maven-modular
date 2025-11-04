package com.pro.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public String getProductInfo() {
		return "This is product information from ProductService.";
	}
}