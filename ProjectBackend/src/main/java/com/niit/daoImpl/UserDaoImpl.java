package com.niit.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(User user) {
			this.sessionFactory.getCurrentSession().saveOrUpdate(user);

				return 0;
		
	}
	@Transactional
	public List<User> getAlluser() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listUser;
	}
	@Transactional
	public User getUserBy(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public int deleteUserById(int userId) {
		User user = new User();
		user.setUserid(userId);
		sessionFactory.getCurrentSession().delete(user);
				return 0;
	}
	
	


}
