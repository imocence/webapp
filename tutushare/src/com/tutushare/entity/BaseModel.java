package com.tutushare.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel implements Serializable {

	private static final long serialVersionUID = -1308795024262635690L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	protected Long id;

	protected final int hashCode(int code, Object obj){
		return 31 * code
				+ ((obj == null) ? 0 : obj.hashCode());
	}

	protected final boolean equals(Object propThis, Object propOther){
		if (propThis == null) 
			return propOther == null;
		return propThis.equals(propOther);
	}
	
	@Override
	public String toString() {
		return "id="+id;
	}

	@Override
	public int hashCode() {
		return hashCode(1, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		BaseModel other = (BaseModel) obj;
		if(!equals(this.getId(), other.getId()))
			return false;
		return true;
	}
	
	///////////////////////////////////

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
