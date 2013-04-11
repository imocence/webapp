package com.tutushare.dao;

import com.tutushare.entity.user.User;

public interface UserDao extends BaseDao<User>{
	
	/**
	 * 根据name查询user
	 * @param name
	 * @return
	 */
	public abstract User findByUsername(String username);
}
