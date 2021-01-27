package com.backendshopee.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Bill")
public class BillEntity extends ParentEntity{
	@Column(name = "name", nullable = true, unique = true)
	private String name;
	
	@Column(name  = "description", nullable = true, unique = true)
	private String description;
	
	@Column(name = "type_payment")
	private Number type_payment;
	
	@Column(name = "date_order")
	private Date date_order;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "sum")
	private Number sum = 0;
	
	@Column(name = "user_id_buyer")
	private Number user_id_buyer;
	
	@Column(name = "user_id_saler")
	private Number user_id_saler;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Number getType_payment() {
		return type_payment;
	}

	public void setType_payment(Number type_payment) {
		this.type_payment = type_payment;
	}

	public Date getDate_order() {
		return date_order;
	}

	public void setDate_order(Date date_order) {
		this.date_order = date_order;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Number getSum() {
		return sum;
	}

	public void setSum(Number sum) {
		this.sum = sum;
	}

	public Number getUser_id_buyer() {
		return user_id_buyer;
	}

	public void setUser_id_buyer(Number user_id_buyer) {
		this.user_id_buyer = user_id_buyer;
	}

	public Number getUser_id_saler() {
		return user_id_saler;
	}

	public void setUser_id_saler(Number user_id_saler) {
		this.user_id_saler = user_id_saler;
	}
	
}
