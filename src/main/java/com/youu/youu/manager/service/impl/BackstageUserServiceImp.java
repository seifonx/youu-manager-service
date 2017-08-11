package com.youu.youu.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youu.youu.manager.bean.TUser;
import com.youu.youu.manager.dao.TUserMapper;
import com.youu.youu.manager.service.BackstageUserService;
@Service
public class BackstageUserServiceImp implements BackstageUserService {
	@Autowired
	TUserMapper tUserMapper;

	public TUser getManagerByLoginacc(String username) {
		TUser tUser = new TUser();
		tUser.setLoginacct(username);
		List<TUser> list = tUserMapper.select(tUser);
		return list.size() == 0 ? null : list.get(0);
	}

}
