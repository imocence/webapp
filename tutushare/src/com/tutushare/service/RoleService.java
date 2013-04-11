package com.tutushare.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.tutushare.entity.user.Role;
import com.tutushare.util.PageUtil;

public interface RoleService {
	
	public abstract Role save(Role role);
	
	public abstract List<Role> save(List<Role> roles);
	
	public abstract Role load(Long roleId);
	
	public abstract void update(Role role);
	
	public abstract void delete(Role role);
	
	public abstract void delete(Long roleId);
	
	public abstract Role find(String name);

	public abstract List<Role> findAll();
	
	public abstract PageUtil findAll(Pageable pageable);
}
