package com.niit.ProjectBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;



public class CategoryTest {
	public static void main(String args[]){

	AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	
	CategoryDao categoryDao = (CategoryDao) ctx.getBean("categoryDao");
	Category category=(Category) ctx.getBean("category");
	
	category.setCategoryid(1004);
	category.setCategory("mobile");
	
	categoryDao.saveOrUpdate(category);
	
	//categoryDao.deleteCategoryById(1004);
	
//	List<Category> lst=categoryDao.getAllcategory();
	//for(Category cat:lst){
//System.out.println(cat.getCategory()+" "+cat.getCategoryid());
	//}
}
}

