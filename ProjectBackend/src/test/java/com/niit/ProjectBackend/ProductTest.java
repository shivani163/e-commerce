package com.niit.ProjectBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;



public class ProductTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		System.out.println("done");
		
		ProductDao productDao=(ProductDao) ctx.getBean("productDao");
		Product product=(Product) ctx.getBean("product");
		
		//product.setCategory("mobile");
		//product.setPrice(12666.99);
		//product.setProductid(1002);
		//product.setProductname("asus");
		//productDao.saveOrUpdate(product);
		
		productDao.deleteProductById(1002);
		
	
		
		//List<Product> lst=productDao.getAllproduct();
		//for(Product pdt:lst){
		//	System.out.println(pdt.getCategory()+" "+pdt.getProductid()+" "+pdt.getProductname()+" "+pdt.getPrice());
		//} 
		
		}

}
