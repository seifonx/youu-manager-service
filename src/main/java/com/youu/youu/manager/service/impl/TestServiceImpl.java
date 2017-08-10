package com.youu.youu.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youu.youu.manager.bean.Ttest;
import com.youu.youu.manager.dao.TtestMapper;
import com.youu.youu.manager.service.TestService;


@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TtestMapper ttestMapper;

	public Ttest getTest() {
		List<Ttest> list = ttestMapper.select(null);
		return list.get(0);
	}
	

}
