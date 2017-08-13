package com.youu.youu.manager.service;

import java.util.List;

import com.youu.youu.manager.bean.MessageModel;


public interface MessageModelService {
	
	/**
	 * 获取所有的消息模版
	 * @return
	 */
	List<MessageModel> getList();
	
	/**
	 * 添加一条消息模版
	 * @param messageModel
	 * @return
	 */
	boolean addMsg(MessageModel messageModel);
	
	/**
	 * 更新消息模版
	 * @param messageModel
	 * @return
	 */
	boolean update(MessageModel messageModel);
	
	/**
	 * 删除一条消息模版
	 * @param mid
	 * @return
	 */
	boolean delete(Integer mid);
}
