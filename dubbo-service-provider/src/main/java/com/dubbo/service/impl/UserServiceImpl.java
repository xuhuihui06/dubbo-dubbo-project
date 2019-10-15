package com.dubbo.service.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.bean.User;
import com.dubbo.service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public User getUserInfoByUserId(String userId) {
		User user = new User("001", "ilikejava", "123456", "张三丰", "15788888888", null, null, null, null, null,
				new Date());
		if(userId != null && !userId.isEmpty() && userId.equals(user.getId())) {
			return user;
		}
		return null;
	}

}
