package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private int cartid;
	private int Id_userid;
	private int productid;
	private String productname;
	private int productprice;
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getId_userid() {
		return Id_userid;
	}
	public void setId_userid(int id_userid) {
		Id_userid = id_userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
}
