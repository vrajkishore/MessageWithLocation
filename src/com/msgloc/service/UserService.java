package com.msgloc.service;

import java.util.List;

import com.msgloc.dao.UserDao;
import com.msgloc.models.User;

public class UserService {
	private UserDao userDao;

	public UserService() {
		super();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String saveUser(User user) {
		// TODO Auto-generated method stub
		Boolean status=false;
		String message="Not created";
		try {
			userDao.save(user);
			status=true;
			message="User Created";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "{\"status\":"+status+",\"message\":\""+message+"\"}";
	}

	public String updateUser(User user, Integer id) {
		// TODO Auto-generated method stub
		Boolean status=false;
		String message="Not Updated";
		user.setId(id);
		try {
			userDao.updateUser(user);
			status=true;
			message="User Updated";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{\"status\":"+status+",\"message\":\""+message+"\"}";
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		Boolean status=false;
		String message="Not Updated";
		User user = null;
		try {
			user = userDao.getUserById(id);
			status=true;
			message="User Updated";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> user = null;
		try {
			user = userDao.getAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	
}
