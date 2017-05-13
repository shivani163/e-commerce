package com.niit.dao;

import java.util.List;

import com.niit.model.Shipping;

public interface ShippingDao {
	int saveOrUpdate(Shipping shipping);
	List<Shipping>getAllshipping();
	Shipping getShippingBy(int shippingId);
	int deleteShippingById(int shippingId);

}
