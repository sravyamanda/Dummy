package com.cg.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dto.Product;
import com.cg.spring.repo.ProductRepo;


@Service("productservice")
public class ProductServiceImpl implements ProductService {
		@Autowired
		private ProductRepo repo;
	@Override
	public List<Product> getAllProducts() {
		
		return repo.getAllProducts();
	}

	@Override
	public Product getProductById(String id) {
		
		return repo.getProductById(id);
	}

	@Override
	public void addProduct(Product p) {
		repo.addProduct(p);
		
	}

	@Override
	public void updateProduct(Product p, String id) {
		repo.updateProduct(p, id);
		
	}

	@Override
	public void deleteProduct(String id) {
		repo.deleteProduct(id);
		
	}

}
