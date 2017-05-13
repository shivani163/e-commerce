package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.model.User;

public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Product product) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(product);
		return 0;
	}
	@Transactional
	public List<Product> getAllproduct() {
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listProduct;
	}
	@Transactional
	public Product getProductBy(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public int deleteProductById(int productId) {
		Product product = new Product();
		product.setProductid(productId);
		sessionFactory.getCurrentSession().delete(product);
				return 0;
	}
	

}
