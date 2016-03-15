package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserDAO;
import com.demo.model.User;
 
 
 
@Service
public class UserServiceImpl{
 
    @Autowired
    private UserDAO userDAO;
     
    @Transactional
    public void insertUser(List<User> users) {
    	for (User user2 : users) {
    		userDAO.insertUser(user2);
		}
    }

	public int insertUser(User user) {
		return 0;
	}
 
}