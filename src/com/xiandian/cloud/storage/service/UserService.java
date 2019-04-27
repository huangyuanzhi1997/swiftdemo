/*
 * Copyright (c) 2014, 2015, XIANDIAN and/or its affiliates. All rights reserved.
 * XIANDIAN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.xiandian.cloud.storage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiandian.cloud.storage.dao.UserDao;
import com.xiandian.cloud.storage.domain.User;

/**
 * 用户管理服务器，负责查询用户、注册用户等操作
 * 
 * 
 */
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 根据用户名查找用户
	 * @param mail
	 * @return
	 */
	public User getUserByname(String username)
	{
		return userDao.getUserByname(username);
	}
}
