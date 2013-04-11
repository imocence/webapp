package com.tutushare.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.tutushare.entity.user.User;
import com.tutushare.util.PageUtil;

public interface UserService {

	public abstract User save(User user);
	
	public abstract User load(Long userId);
	
	public abstract void update(User user);
	
	public abstract void delete(User user);
	
	public abstract void delete(Long userId);
	
	public abstract User find(String name);

	public abstract List<User> findAll();
	
	public abstract PageUtil findAll(Pageable pageable);
}
