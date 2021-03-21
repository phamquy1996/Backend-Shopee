package com.backendshopee.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	
	@OneToOne
    @JoinColumn(name = "user_id_buyer")
    private UserEntity user_buyer;
	
	@OneToMany(mappedBy = "bill")
	private List<BillDetailEntiy> billDetails = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_saler", nullable = false)
	private UserEntity user;

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
	@JsonIgnore
	public UserEntity getUser_buyer() {
		return user_buyer;
	}
	@JsonIgnore
	public void setUser_buyer(UserEntity user_buyer) {
		this.user_buyer = user_buyer;
	}

	public List<BillDetailEntiy> getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(List<BillDetailEntiy> billDetails) {
		this.billDetails = billDetails;
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
