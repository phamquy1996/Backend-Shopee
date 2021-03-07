package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Product")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProductEntity extends ParentEntity{
	@Column(name = "name", nullable = true, unique = true)
	private String name;
	
	@Lob
	@Column(name  = "description", nullable = true, unique = true)
	private String description;
	
	@Column(name = "price")
	private Float price;
	
	@Column(name = "Subclassfly")
	private String Subclassfly;
	
	@Column(name = "classfly")
	private String classfly;
	
	@Column(name = "discount")
	private Float discount;
	
	@Column(name = "gram")
	private Number gram;
	
	@Column(name = "view")
	private Number view = 0;
	
	@Column(name = "qty")
	private Number qty = 0;
	
	@Column(name = "content_discount", length = 512)
	private String content_discount;
	
	@Column(name = "user_id")
	private Number user_id = 0;
	
	@Column(name = "unit_id")
	private Number unit_id;
	
	@Column(name = "image")
	private String image = "0";
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity categoryentity;
	
	@ManyToOne
    @JoinColumn(name = "subcategory_id", nullable = false)
	private SubCategoryEntity subCategoryEntity;
	
	@ManyToOne
    @JoinColumn(name = "childCategory_id", nullable = false)
	private ChildCategoryEntity childCategoryEntity;
	
	@OneToMany(mappedBy = "productEntity")
	private List<ClassifyEntity> classifyEntity = new ArrayList<>();
	
	@OneToMany(mappedBy = "productEntity")
	private List<SubClassifyEntity> subClassifyEntity = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "product_shipping", 
				joinColumns = @JoinColumn(name = "product_id"), 
				inverseJoinColumns = @JoinColumn(name = "shipping_id"))
	private List<ShippingEntity> shippings =  new ArrayList<>();
	
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Number getView() {
		return view;
	}

	public void setView(Number view) {
		this.view = view;
	}

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}

	public String getContent_discount() {
		return content_discount;
	}

	public void setContent_discount(String content_discount) {
		this.content_discount = content_discount;
	}

	public Number getUser_id() {
		return user_id;
	}

	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}

	public Number getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Number unit_id) {
		this.unit_id = unit_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}

	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}

	public SubCategoryEntity getSubCategoryEntity() {
		return subCategoryEntity;
	}

	public void setSubCategoryEntity(SubCategoryEntity subCategoryEntity) {
		this.subCategoryEntity = subCategoryEntity;
	}

	public ChildCategoryEntity getChildCategoryEntity() {
		return childCategoryEntity;
	}

	public void setChildCategoryEntity(ChildCategoryEntity childCategoryEntity) {
		this.childCategoryEntity = childCategoryEntity;
	}

	public List<ClassifyEntity> getClassifyEntity() {
		return classifyEntity;
	}

	public void setClassifyEntity(List<ClassifyEntity> classifyEntity) {
		this.classifyEntity = classifyEntity;
	}

	public List<SubClassifyEntity> getSubClassifyEntity() {
		return subClassifyEntity;
	}

	public void setSubClassifyEntity(List<SubClassifyEntity> subClassifyEntity) {
		this.subClassifyEntity = subClassifyEntity;
	}

	public String getSubclassfly() {
		return Subclassfly;
	}

	public void setSubclassfly(String subclassfly) {
		Subclassfly = subclassfly;
	}

	public String getClassfly() {
		return classfly;
	}

	public void setClassfly(String classfly) {
		this.classfly = classfly;
	}

	public Number getGram() {
		return gram;
	}

	public void setGram(Number gram) {
		this.gram = gram;
	}

	public List<ShippingEntity> getShippings() {
		return shippings;
	}

	public void setShippings(List<ShippingEntity> shippings) {
		this.shippings = shippings;
	}
}
