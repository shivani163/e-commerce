package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {
	int saveOrUpdate(Product product);
	List<Product>getAllproduct();
	Product getProductBy(int productId);
	int deleteProductById(int productId);
}
