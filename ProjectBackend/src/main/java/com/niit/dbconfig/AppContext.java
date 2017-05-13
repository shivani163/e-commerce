package com.niit.dbconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.CartDao;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.ShippingDao;
import com.niit.dao.UserDao;
import com.niit.daoImpl.CartDaoImpl;
import com.niit.daoImpl.CategoryDaoImpl;
import com.niit.daoImpl.ProductDaoImpl;
import com.niit.daoImpl.ShippingDaoImpl;
import com.niit.daoImpl.UserDaoImpl;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Shipping;
import com.niit.model.User;




@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class AppContext {
	
	@Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/Mydatabase");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("");
    	
    	return dataSource;
    }
  private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.format_sql", "true");
    	properties.put("hibernate.hbm2ddl.auto", "update");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(User.class);
    	sessionBuilder.addAnnotatedClasses(Shipping.class);
    	sessionBuilder.addAnnotatedClasses(Product.class);
    	sessionBuilder.addAnnotatedClasses(Category.class);
    	sessionBuilder.addAnnotatedClasses(Cart.class);
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    
	@Autowired
	@Bean(name="userDao")
	public UserDao getUserDao(SessionFactory sessionFactory)
	{
		return new UserDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="user")
	public User getUser()
	{
		return new User();
	}
	
	@Autowired
	@Bean(name="shippingDao")
	public ShippingDao getShippingDao(SessionFactory sessionFactory)
	{
		return new ShippingDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="shipping")
	public Shipping getshipping()
	{
		return new Shipping();
	}
	
	@Autowired
	@Bean(name="productDao")
	public ProductDao getProductDao(SessionFactory sessionFactory)
	{
		return new ProductDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="product")
	public Product getProduct()
	{
		return new Product();
	}
	
	@Autowired
	@Bean(name="categoryDao")
	public CategoryDao getCategoryDao(SessionFactory sessionFactory)
	{
		return new CategoryDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="category")
	public Category getCategory()
	{
		return new Category();
	}
	
	@Autowired
	@Bean(name="cartDao")
	public CartDao getCartDao(SessionFactory sessionFactory)
	{
		return new CartDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="cart")
	public Cart getCart()
	{
		return new Cart();
	}
}
