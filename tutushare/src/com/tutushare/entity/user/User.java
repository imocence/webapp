package com.tutushare.entity.user;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.tutushare.entity.BaseModel;

@Entity
@Table(name = "T_CMS_USER")
@DynamicUpdate(true)
@DynamicInsert(true)
public class User extends BaseModel{
	private String username;//用户名
	private String password;//密码
	private int age;//姓名
	
	//把枚举里的sring存储进去
	@Enumerated(EnumType.STRING)
	private Sex sex;//性别
	
	private String email;//邮箱
	private String card;//身份证
	
	private Timestamp addtime;//添加时间
	
	/**
	 * cascade 
	 * 
	 *    all: 所有情况下均进行关联操作，即save-update和delete。
	 * 	  none: 所有情况下均不进行关联操作。这是默认值。 
	 *    save-update: 在执行save/update/saveOrUpdate时进行关联操作。 
	 *    delete: 在执行delete 时进行关联操作。
	 */
	
	@ManyToMany(targetEntity=Role.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER) 
	@JoinTable(name="T_CMS_USER_ROLE")
	private Set<Role> roles = new HashSet<Role>();
	
	@ManyToMany(targetEntity=Permission.class, fetch=FetchType.EAGER) 
	@JoinTable(name="T_CMS_USER_PERMISSION")
	private Set<Permission> permissions = new HashSet<Permission>();
	
	//不需要数据库维护关系
	@Transient//隐藏属性，不会被映射到表中
	private List<String> permissionStr = new ArrayList<String>();
	
	public User() {
		this.setAddtime(new Timestamp(System.currentTimeMillis()));
	}
	
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Set<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
	public List<String> getPermissionStr() {
		return permissionStr;
	}
	public void setPermissionStr(List<String> permissionStr) {
		this.permissionStr = permissionStr;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	/**
	 * 定义枚举类型
	 * @author YIDE
	 *
	 */
	public enum Sex{
		BOY, GIRL
	}	

}

