package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shipping")
public class ShippingEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "maxgram")
	private Number maxgram;
	
	@Column(name = "mingram")
	private Number mingram;
	
	@Column(name = "money_shipping")
	private Number money_shipping;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}