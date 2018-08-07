package com.cg.spring.repo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Product;
@Repository("Productrepo")
public class ProductRepoImpl implements ProductRepo {
	public static List<Product> AccountEntry=null;
	
	static {
		AccountEntry =  new ArrayList<Product>();
		Product proOne= new Product();
		proOne.setId("ABCD");
		proOne.setName("Iphone");
		proOne.setModel("6s");
		proOne.setPrice("30000");
		Product proTwo= new Product();
		proTwo.setId("ABC");
		proTwo.setName("Samsung");
		proTwo.setModel("j9");
		proTwo.setPrice("35000");
		Product proThree= new Product();
		proThree.setId("ACD");
		proThree.setName("Redmi");
		proThree.setModel("Prime");
		proThree.setPrice("20000");
		
		AccountEntry.add(proOne);
		AccountEntry.add(proTwo);
		AccountEntry.add(proThree);
		
	}
	
	@Override
	public List<Product> getAllProducts() {
		
		return AccountEntry;
	}

	@Override
	public Product getProductById(String id) {
		
		
		for (Product product : AccountEntry) {
			if(product.getId().equals(id))
				return product;
			
		}
		
	return null;
	}

	@Override
	public void addProduct(Product p) {
		AccountEntry.add(p);
		
	}

	@Override
	public void updateProduct(Product p,String id) {
		for(int i=0;i<AccountEntry.size(); i++) {
			if(AccountEntry.get(i).getId().equals(id)) {
				AccountEntry.set(i, p);
			}
		}
		
		
	}

	@Override
	public void deleteProduct(String id) {
		for (Product product : AccountEntry) {
			if(product.getId().equals(id))
				AccountEntry.remove(product);
				
		}
		
	}

}
