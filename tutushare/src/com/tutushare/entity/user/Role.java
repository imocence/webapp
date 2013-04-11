package com.tutushare.entity.user;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.tutushare.entity.BaseModel;

@Entity
@Table(name = "T_CMS_ROLE")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Role extends BaseModel{


	private String name;
	
	@ManyToMany(targetEntity=Permission.class, fetch=FetchType.EAGER) 
	@JoinTable(name="T_CMS_ROLE_PERMISSION")
	private Set<Permission> permissions = new HashSet<Permission>();
	
	//不需要数据库维护关系
	@Transient
	private List<String> permissionStr = new ArrayList<String>();
	
	private Timestamp addtime;//添加时间
	
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Set<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPermissionStr() {
		return permissionStr;
	}
	public void setPermissionStr(List<String> permissionStr) {
		this.permissionStr = permissionStr;
	}
	
}