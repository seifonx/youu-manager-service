package com.youu.youu.manager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youu.youu.manager.bean.MessageModel;
import com.youu.youu.manager.dao.MessageModelMapper;
import com.youu.youu.manager.service.MessageModelService;

@Service
public class MessageModelServiceImpl implements MessageModelService {

	@Autowired
	MessageModelMapper messageModelMapper;
	
	@Override
	public List<MessageModel> getList() {
		// TODO Auto-generated method stub
		List<MessageModel> list = messageModelMapper.select(null);
		System.out.println(list);
		return list;
	}

	@Override
	public boolean addMsg(MessageModel messageModel) {
		// TODO Auto-generated method stub
		messageModel.setManagerid(1);
		messageModel.setDate(new Date());
		int i = messageModelMapper.insert(messageModel);
		return i == 1 ? true : false;
	}

	@Override
	public boolean update(MessageModel messageModel) {
		// TODO Auto-generated method stub
		int i = messageModelMapper.updateByPrimaryKeySelective(messageModel);
		return i == 1 ? true : false;
	}

	@Override
	public boolean delete(Integer mid) {
		// TODO Auto-generated method stub
		int i = messageModelMapper.deleteByPrimaryKey(mid);
		return i == 1 ? true : false;
	}

}
