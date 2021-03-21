package com.backendshopee.entity;

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
@Table(name = "Cart")
public class CartEntity extends ParentEntity {	
	@OneToOne
    @JoinColumn(name = "user_id_buyer")
    private UserEntity user_buyer; 
	
//	@OneToOne
//    @JoinColumn(name = "user_id_saler")
//    private UserEntity user_saler;
	
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<CartDetailEntity> cartDetails = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_saler")
	private UserEntity user;
	
	@Column(name = "price")
	private Integer price;
	
	@JsonIgnore
	public UserEntity getUser_buyer() {
		return user_buyer;
	}
	
	@JsonIgnore
	public void setUser_buyer(UserEntity user_buyer) {
		this.user_buyer = user_buyer;
	}
	
	public Long getUseBuyerId() {
		return user_buyer.getId();
	}
	
	public String getUseBuyerName() {
		return user_buyer.getName();
	}
	
	public List<CartDetailEntity> getCartDetails() {
		return cartDetails;
	}
	
	public void setCartDetails(List<CartDetailEntity> cartDetails) {
		this.cartDetails = cartDetails;
	}
	
	@JsonIgnore
	public UserEntity getUser() {
		return user;
	}
	
	@JsonIgnore
	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


//	public UserEntity getUser_saler() {
//		return user_saler;
//	}
//
//	public void setUser_saler(UserEntity user_saler) {
//		this.user_saler = user_saler;
//	} 
	
}
