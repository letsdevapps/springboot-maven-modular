package com.pro.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProdutcApi {

	@Autowired
	private ProductService productService;

	@GetMapping({ "", "/" })
	public ResponseEntity<String> getProductById() {
		String prdouctInfo = productService.getProductInfo();
		return ResponseEntity.ok(prdouctInfo);
	}
}