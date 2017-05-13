package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao {
	int saveOrUpdate(User user);
	List<User>getAlluser();
	User getUserBy(int userId);
	int deleteUserById(int userId);

}
