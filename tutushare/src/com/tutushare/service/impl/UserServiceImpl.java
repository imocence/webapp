package com.tutushare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tutushare.dao.UserDao;
import com.tutushare.entity.user.User;
import com.tutushare.service.UserService;
import com.tutushare.util.PageUtil;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 添加 user
	 * @param user
	 */
	public User save(User user) {
		return userDao.save(user);
	}
	
	/**
	 * 加载用户
	 * @param OID
	 * @return
	 */
	public User load(Long userId) {
		return userDao.findOne(userId);
	}
	
	/**
	 * 根据名称查询用户
	 * @param name
	 * @return
	 */
	public User find(String username) {
		return userDao.findByUsername(username);
	}
	
	/**
	 * 查询所有 user
	 * @return
	 */
	public List<User> findAll() {
		return userDao.findAll();
	}

	/**
	 * 修改 user
	 * @param user
	 */
	public void update(User user) {
		userDao.save(user);
	}
	
	/**
	 * 删除 user
	 * @param user
	 */
	public void delete(User user){
		userDao.delete(user);
	}
	
	/**
	 * 删除 user
	 * @param userId
	 */
	public void delete(Long userId){
		userDao.delete(userId);
	}
	
	/**
	 * 分页查询
	 * @param pageable
	 * @return
	 */
	public PageUtil findAll(Pageable pageable) {
		Page userPage = userDao.findAll(pageable);
		return PageUtil.createPageUtil(userPage);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
