package com.tutushare.entity.nav;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.tutushare.entity.BaseModel;

public class Nav extends BaseModel{
	
	private String cname;//英文名称
	private String ename;//中文名称
	private String marking;//标记
	
	@ManyToOne
	private Nav parent;//父节点
	
	@OneToMany
	private Set<Nav> children = new HashSet<Nav>();//子节点
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getMarking() {
		return marking;
	}
	public void setMarking(String marking) {
		this.marking = marking;
	}
	public Nav getParent() {
		return parent;
	}
	public void setParent(Nav parent) {
		this.parent = parent;
	}
	public Set<Nav> getChildren() {
		return children;
	}
	public void setChildren(Set<Nav> children) {
		this.children = children;
	}
}
