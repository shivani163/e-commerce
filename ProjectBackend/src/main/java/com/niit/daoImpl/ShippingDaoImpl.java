package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ShippingDao;
import com.niit.model.Shipping;
import com.niit.model.User;

public class ShippingDaoImpl implements ShippingDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public ShippingDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Shipping shipping) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(shipping);
		return 0;
	}
	@Transactional
	public List<Shipping> getAllshipping() {
		@SuppressWarnings("unchecked")
		List<Shipping> listShipping = (List<Shipping>) sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listShipping;
	}
	@Transactional
	public Shipping getShippingBy(int shippingId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public int deleteShippingById(int shippingId) {
		Shipping shipping = new Shipping();
		shipping.setShippingid(shippingId);
		sessionFactory.getCurrentSession().delete(shipping);
				return 0;
	
	}
	


}
