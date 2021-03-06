package com.backendshopee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Address")
public class AddressEntity extends ParentEntity{
	@Column(name  = "name")
	private String name;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "village")
	private String village;
	
	@Column(name = "province_id")
	private Integer province_id;
	
	@Column(name = "district_id")
	private Integer district_id;
	
	@Column(name = "ward_id")
	private Integer ward_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
	private UserEntity user;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public Integer getProvince_id() {
		return province_id;
	}

	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}

	public Integer getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}

	public Integer getWard_id() {
		return ward_id;
	}

	public void setWard_id(Integer ward_id) {
		this.ward_id = ward_id;
	}
	
	@JsonIgnore
	public UserEntity getUser() {
		return user;
	}
	
	@JsonIgnore
	public void setUser(UserEntity user) {
		this.user = user;
	}
}
