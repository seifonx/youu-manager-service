package com.youu.youu.manager.service;

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

}
