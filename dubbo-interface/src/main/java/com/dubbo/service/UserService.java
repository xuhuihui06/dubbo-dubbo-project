package com.dubbo.service;

import com.dubbo.bean.User;

/**
 * 用户相关API接口
 * @author huihuixu
 *
 */
public interface UserService {

	/**
	 * 根据用户ID查询用户信息
	 * @param userId
	 * @return
	 */
	User getUserInfoByUserId(String userId);
}
