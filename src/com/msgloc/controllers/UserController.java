package com.msgloc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.msgloc.models.User;
import com.msgloc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	public UserController() {
		super();
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public @ResponseBody String saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public @ResponseBody String updateUser(@RequestBody User user, @PathVariable Integer id){
		return userService.updateUser(user,id);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable Integer id){
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	
}
