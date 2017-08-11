package com.youu.youu.manager.service.impl;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youu.youu.manager.bean.TUser;
import com.youu.youu.manager.dao.TRoleMapper;
import com.youu.youu.manager.dao.TUserMapper;
import com.youu.youu.manager.service.BackstageUserService;
@Service
public class BackstageUserServiceImp implements BackstageUserService {
	@Autowired
	TUserMapper tUserMapper;
	@Autowired
	TRoleMapper tRoleMapper;
	
	
	@Override
	public HashSet<String> getRoleByManagerId(String manager) {
		HashSet<String> hashSet = tRoleMapper.selectRoleByManagerId(manager);
		System.out.println("当前用户拥有的角色有----》"+hashSet);
			
		return hashSet;
	}
	

	public TUser getManagerByLoginacc(String username) {
		TUser tUser = new TUser();
		tUser.setLoginacct(username);
		List<TUser> list = tUserMapper.select(tUser);
		return list.size() == 0 ? null : list.get(0);
	}

	

}
