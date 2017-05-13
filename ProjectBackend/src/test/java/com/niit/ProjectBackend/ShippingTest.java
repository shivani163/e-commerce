package com.niit.ProjectBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ShippingDao;
import com.niit.dao.UserDao;
import com.niit.model.Shipping;
import com.niit.model.User;

public class ShippingTest {
	public static void main(String args[]){
	
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	System.out.println("done");
	
	ShippingDao shippingDao=(ShippingDao) ctx.getBean("shippingDao");
	Shipping shipping=(Shipping) ctx.getBean("shipping");
	
	shipping.setArea("bangalore");
	shipping.setCity("bangalore");
	shipping.setContact("100232");
	shipping.setFirstname("priya");
	shipping.setLastname("yadav");
	shipping.setLoginid(1002);
	shipping.setPincode(5944);
	shipping.setShippingid(1004);
	shipping.setShipping("karnataka");
	shipping.setUserid(1234);
	shippingDao.saveOrUpdate(shipping);
	
	//shippingDao.deleteShippingById(1004);
	//List<Shipping> lst=shippingDao.getAllshipping();
	//for(Shipping ship:lst){
		//System.out.println(ship.getShippingid()+" "+ship.getArea()+" "+ship.getCity()+" "+ship.getContact()+" "+ship.getFirstname()+" "+ship.getLastname()+" "+ship.getLoginid()+" "+ship.getPincode()+" "+ship.getShipping()+" "+ship.getUserid());
	//} 

}
}
