package com.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.User;
import com.dubbo.service.UserService;

@RestController
public class UserController {

	@Reference
	private UserService userService;
	
	@RequestMapping("/getUserInfo")
	public User getUserInfo(String userId) {
		return userService.getUserInfoByUserId(userId);
	}
}
