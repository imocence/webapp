package com.tutushare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tutushare.dao.RoleDao;
import com.tutushare.entity.user.Role;
import com.tutushare.service.RoleService;
import com.tutushare.util.PageUtil;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;
	
	public Role save(Role role) {
		return roleDao.save(role);
	}
	
	public Role load(Long roleId) {
		
		return roleDao.findOne(roleId);
	}

	public void update(Role role) {
		
	}

	public void delete(Role role) {
		
	}

	public void delete(Long roleId) {
		
	}

	public Role find(String name) {
		return null;
	}

	public List<Role> findAll() {
		return null;
	}

	public PageUtil findAll(Pageable pageable) {
		return null;
	}

	public List<Role> save(List<Role> roles) {
		return roleDao.save(roles);
	}


}
