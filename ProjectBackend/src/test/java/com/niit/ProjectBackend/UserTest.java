package com.niit.ProjectBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.niit.dao.UserDao;
import com.niit.model.User;

public class UserTest {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		System.out.println("done");
		
		UserDao userDao=(UserDao) ctx.getBean("userDao");
		User user=(User) ctx.getBean("user");		
		user.setUserid(3);
		user.setName("shi");
		user.setPassword("adc");
		user.setRole("ROLE_ADMIN");
		userDao.saveOrUpdate(user);
		
		
		//userDao.deleteUserById(2);		
		
		
		//List<User> lst=userDao.getAlluser();
		//for(User usr:lst){
		//	System.out.println(usr.getUserid()+" "+usr.getName()+" "+usr.getPassword()+" "+usr.getRole());
		//}
	}

}
