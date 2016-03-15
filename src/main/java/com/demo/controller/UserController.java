package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.impl.UserServiceImpl;
 
@Controller
public class UserController {
 
	@Autowired
	private UserServiceImpl userService;
	
    @RequestMapping(value="index")
    public ModelAndView index(User user){
    	userService.insertUser(user);
    	User user2 = new User();
    	user2.setName("a");
    	user2.setPassword("bcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	List<User> users = new ArrayList<User>();
    	users.add(user);
    	users.add(user2);
    	userService.insertUser(users);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        mav.addObject("user",user);
        return mav;
    }
     
}