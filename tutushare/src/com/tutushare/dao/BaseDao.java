package com.tutushare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutushare.entity.BaseModel;

public interface BaseDao <T extends BaseModel>  extends JpaRepository<T, Long>{

}
