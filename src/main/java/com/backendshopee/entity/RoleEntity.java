package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class RoleEntity extends ParentEntity{
	
	@Column(name = "role_id")
    private Number role_id;
	
	@Column(name = "role")
    private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Number getRole_id() {
		return role_id;
	}

	public void setRole_id(Number role_id) {
		this.role_id = role_id;
	}
}
