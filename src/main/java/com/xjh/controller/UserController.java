package com.xjh.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjh.pojo.User;

@RestController
public class UserController {
	@RequestMapping("/getUser")
	public User getUser() {
		
		User user=new User();
		user.setName("张三dcscd");
		user.setPassword("ssaS123");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setDesc("你好");
		return user;
		
	}
}
