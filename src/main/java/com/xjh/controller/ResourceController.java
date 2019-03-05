package com.xjh.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjh.pojo.Resource;
import com.xjh.pojo.User;

@RestController
public class ResourceController {
	@Autowired
	private Resource resource;
	@RequestMapping("/getResource")
	public Resource getResource() {
		Resource bean=new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}
}
