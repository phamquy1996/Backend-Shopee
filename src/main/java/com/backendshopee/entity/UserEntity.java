package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "User")
public class UserEntity extends ParentEntity{
	@Column(name = "name")
	@Size(min=2, max=30)
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "token")
	@Size(min=2, max=30)
	private String token;
	
	@ManyToMany
	@JoinTable(name = "user_role", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<RoleEntity> roles =  new ArrayList<>();
	
//	@ManyToMany
//	@JoinTable(name = "user_product", 
//				joinColumns = @JoinColumn(name = "user_id"), 
//				inverseJoinColumns = @JoinColumn(name = "product_id"))
//	private List<ProductEntity> productsFavourite =  new ArrayList<>();
//	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userEntity")
	private List<ProductEntity> products = new ArrayList<>();
//	
//	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user" )
	private List<CartEntity> carts = new ArrayList<>();
	
//	public void removeClassB(ProductEntity product) {
//		productsFavourite.remove(product);
//        product.getProductsFavourite().remove(this);
//    } 
//	
//	public void addClassB(ProductEntity product) {
//		productsFavourite.add(product);
//        product.getProductsFavourite().add(this);
//    } 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	
	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
//
//	public List<ProductEntity> getProductsFavourite() {
//		return productsFavourite;
//	}
//
//	public void setProductsFavourite(List<ProductEntity> productsFavourite) {
//		this.productsFavourite = productsFavourite;
//	}
//
	public List<CartEntity> getCarts() {
		return carts;
	}

	public void setCarts(List<CartEntity> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", email=" + email + ", password=" + password + ", avatar=" + avatar
				+ ", token=" + token + ", roles=" + roles + ", products=" + products + ", carts=" + carts + "]";
	}

}
