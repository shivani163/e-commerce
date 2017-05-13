package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;
import com.niit.model.User;

public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Category category) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(category);
		return 0;
	}
	@Transactional
	public List<Category> getAllcategory() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listCategory;
	}
	@Transactional
	public Category getCategoryBy(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public int deleteCategoryById(int categoryId) {
		Category category = new Category();
		category.setCategoryid(categoryId);
		sessionFactory.getCurrentSession().delete(category);
				return 0;
		
	}
	


}
