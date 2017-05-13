package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;


public interface CartDao {
	int saveOrUpdate(Cart cart);
	List<Cart>getAllcart();
	Cart getCartBy(int cartId);
	int deleteCartById(int cartId);

}
