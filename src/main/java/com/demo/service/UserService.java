package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	int insertUser(User user);
	
	public void insertUser(List<User> users);

}
