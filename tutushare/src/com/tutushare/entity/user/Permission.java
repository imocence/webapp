package com.tutushare.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.tutushare.entity.BaseModel;

@Entity
@Table(name = "T_CMS_Permission")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Permission extends BaseModel{

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
