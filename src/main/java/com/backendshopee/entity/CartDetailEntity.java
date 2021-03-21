package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CartDetail")
public class CartDetailEntity extends ParentEntity {
	
	@Column(name = "qty")
	private Integer qty;
	
	@Column(name = "checkBuy")
	private Number checkBuy = 0;
	
	@OneToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
	
	@Column(name = "user_id_buyer")
	private String user_id_buyer;
	
	@Column(name = "user_id_saler")
	private String user_id_saler;
	
	@Column(name = "classify_id")
	private Integer classify_id;
	
	@Column(name = "subclassify_id")
	private Integer subclassify_id;
	
	@ManyToOne
    @JoinColumn(name = "cart_id", nullable = true)
	private CartEntity cart;

	public Number getCheckBuy() {
		return checkBuy;
	}

	public void setCheckBuy(Number checkBuy) {
		this.checkBuy = checkBuy;
	}

	public String getUser_id_buyer() {
		return user_id_buyer;
	}

	public void setUser_id_buyer(String user_id_buyer) {
		this.user_id_buyer = user_id_buyer;
	}

	public String getUser_id_saler() {
		return user_id_saler;
	}

	public void setUser_id_saler(String user_id_saler) {
		this.user_id_saler = user_id_saler;
	}
	
	@JsonIgnore
	public CartEntity getCart() {
		return cart;
	}
	
	@JsonIgnore
	public void setCart(CartEntity cart) {
		this.cart = cart;
	}
	
	public ProductEntity getProduct() {
		return product;
	}
	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Integer getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Integer classify_id) {
		this.classify_id = classify_id;
	}

	public Integer getSubclassify_id() {
		return subclassify_id;
	}

	public void setSubclassify_id(Integer subclassify_id) {
		this.subclassify_id = subclassify_id;
	}
	
}
