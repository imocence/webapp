package com.tutushare.controller.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutushare.entity.user.Role;
import com.tutushare.entity.user.User;
import com.tutushare.service.RoleService;
import com.tutushare.service.UserService;
import com.tutushare.util.PageUtil;

@Controller
@RequestMapping(value="/manager/user")
public class UserController {
	
	private final static String viewPath = "manager/user";
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	/**
	 * user 首页
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index(){
		return viewPath + "/index";
	}
	
	/**
	 * 添加 user
	 * @param user
	 */
	@RequestMapping(value="/insert")
	public void insert(@ModelAttribute User user){
		userService.save(user);
	}
	
	@RequestMapping(value="/add")
	public void add(){
		User user = new User();
		user = userService.save(user);
		Role role1 = new Role();
		role1.setName("cooc");
		
		Role role2 = new Role();
		role2.setName("coco");
		
		List<Role> roles = new ArrayList<Role>();
		
		roles.add(role1);
		roles.add(role2);
		
		roles = roleService.save(roles);
		
		
		user.setRoles(new HashSet<Role>(roles));
		
		
	}
	
	
	/**
	 * 分页显示 user
	 * @param user
	 */
	@RequestMapping(value="/list/{number}")
	public void list(ModelMap modeMap,
				@ModelAttribute User user){
		Pageable pageable = new PageRequest(0, 15, new Sort("id"));
		PageUtil pageUtil = userService.findAll(pageable);
		modeMap.put("pageUtil", pageUtil);
	}
	
	/**
	 * 更新 user
	 * @param user
	 */
	@RequestMapping(value="/update/{userId}")
	public void update(@ModelAttribute User user){
		userService.update(user);
	}
	
	/**
	 * 删除 user
	 * @param userId
	 */
	@RequestMapping(value="/delete/{userId}")
	public void delete(@PathVariable("userId") Long userId){
		userService.delete(userId);
	}
}
