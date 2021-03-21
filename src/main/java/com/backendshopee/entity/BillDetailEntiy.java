package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "BillDetail")
public class BillDetailEntiy extends ParentEntity {
	@Column(name = "name", nullable = true, unique = true)
	private String name;
	
	@Column(name  = "content", nullable = true, unique = true)
	private String content;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "qty")
	private Integer qty;
	
	@Column(name = "image")
	private String image = "0";
	
	@OneToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
	
	@Column(name = "user_id_buyer")
	private Number user_id_buyer;
	
	@Column(name = "user_id_saler")
	private Number user_id_saler;
	
	@ManyToOne
    @JoinColumn(name = "bill_id")
	private BillEntity bill;
	
	
	@Column(name = "classify_id")
	private Integer classify_id;
	
	@Column(name = "subclassify_id")
	private Integer subclassify_id;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	@JsonIgnore
	public BillEntity getBill() {
		return bill;
	}
	@JsonIgnore
	public void setBill(BillEntity bill) {
		this.bill = bill;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
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
