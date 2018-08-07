package com.cg.spring.repo;

import java.util.List;

import com.cg.spring.dto.Product;

public interface ProductRepo {
	public List<Product>getAllProducts();
	public Product getProductById(String id);
	public void addProduct(Product p);
	public void updateProduct(Product p, String id);
	public void deleteProduct(String id);
}
