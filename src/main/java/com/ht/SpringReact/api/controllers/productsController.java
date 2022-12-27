package com.ht.SpringReact.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.SpringReact.business.abstracts.ProductService;
import com.ht.SpringReact.core.utilities.DataResult;
import com.ht.SpringReact.core.utilities.Result;
import com.ht.SpringReact.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class productsController {

	private ProductService productService;

	@Autowired
	public productsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll() {
		return productService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {

		return productService.add(product);

	}

}
