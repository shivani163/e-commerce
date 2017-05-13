package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDao;
import com.niit.model.Cart;
import com.niit.model.User;

public class CartDaoImpl implements CartDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public CartDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Cart cart) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(cart);
		return 0;
	}
	@Transactional
	public List<Cart> getAllcart() {
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listCart;
	}
	@Transactional
	public Cart getCartBy(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public int deleteCartById(int cartId) {
		Cart cart = new Cart();
		cart.setCartid(cartId);
		sessionFactory.getCurrentSession().delete(cart);
				return 0;
	}
	

}
