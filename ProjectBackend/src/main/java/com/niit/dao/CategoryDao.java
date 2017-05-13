package com.niit.dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDao {
	int saveOrUpdate(Category category);
	List<Category>getAllcategory();
	Category getCategoryBy(int categoryId);
	int deleteCategoryById(int categoryId);

}
