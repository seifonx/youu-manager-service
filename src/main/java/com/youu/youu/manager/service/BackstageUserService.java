package com.youu.youu.manager.service;

import java.util.HashSet;

import com.youu.youu.manager.bean.TUser;

public interface BackstageUserService {
	/**
	 * 
	 * @Description (通过用户名查找该用户)
	 * @param username
	 * @param password
	 * @return
	 */
	TUser getManagerByLoginacc(String username);
	/**
	 * 
	 * @Description (通过用户名获取角色信息)
	 * @param principal
	 * @return
	 */
	HashSet<String> getRoleByManagerId(String manager);

}
