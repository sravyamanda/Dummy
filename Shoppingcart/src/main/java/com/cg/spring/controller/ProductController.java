package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.dto.Product;
import com.cg.spring.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService service;

	
	@RequestMapping("/getproduct")
	public List<Product> getAllProducts(){
	return service .getAllProducts();
}
	
	
	@RequestMapping("/getproduct/{id}")
	public Product getProductById(@PathVariable String id)  {
		return service.getProductById(id);
	}
	
	@RequestMapping(value="/getproduct", method=RequestMethod.POST)
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
	}
	
	@RequestMapping(value="/getproduct/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String id) {
		service.deleteProduct(id);
	}
	
	@RequestMapping(value="/getproduct/{id}", method=RequestMethod.PUT)
	public void updateProduct(@RequestBody Product p,@PathVariable String id) {
		service.updateProduct(p,id);
	}
	
	
}
