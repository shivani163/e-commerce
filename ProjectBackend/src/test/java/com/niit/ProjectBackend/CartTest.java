package com.niit.ProjectBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartDao;
import com.niit.model.Cart;



public class CartTest {

	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		System.out.println("done");
		
		CartDao cartDao=(CartDao) ctx.getBean("cartDao");
		Cart cart=(Cart) ctx.getBean("cart");
		
		cart.setCartid(1001);
		cart.setId_userid(1002);
		cart.setProductid(1003);
		cart.setProductprice(1123);
		cart.setProductname("av");
		cartDao.saveOrUpdate(cart);
		
//		System.out.println("successfully inserted");
//		
		//cartDao.deleteCartById(1001);	
		//List<Cart> lst=cartDao.getAllcart();
		//for(Cart crt :lst)
			//System.out.println(crt.getCartid()+" "+crt.getId_userid()+" "+crt.getProductid()+" "+crt.getProductname()+" "+crt.getProductprice());
		//} 
		
		}
}
