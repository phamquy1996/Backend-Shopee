package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Product")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProductEntity extends ParentEntity{
	@Column(name = "name", nullable = true)
	private String name;
	
	@Lob
	@Column(name  = "description", nullable = true)
	private String description;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "Subclassfly")
	private String Subclassfly;
	
	@Column(name = "classfly")
	private String classfly;
	
	@Column(name = "discount")
	private Integer discount;
	
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
	
	@Column(name = "pricemax")
	private Integer pricemax;
	
	@Column(name = "pricemin")
	private Integer pricemin;
	
	@Column(name = "isNew")
	private Integer isNew;
	
	@Column(name = "isOrderBefore")
	private Integer isOrderBefore;
	
	@Column(name = "video")
	private String video = "0";
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
	@JsonBackReference
	private CategoryEntity categoryentity;
	
	@ManyToOne
    @JoinColumn(name = "subcategory_id", nullable = false)
	private SubCategoryEntity subCategoryEntity;
	
	@ManyToOne
    @JoinColumn(name = "userSaler_id", nullable = false)
	private UserEntity userEntity; 
	
	@ManyToOne
    @JoinColumn(name = "childCategory_id", nullable = false)
	private ChildCategoryEntity childCategoryEntity;
	
	@OneToMany(mappedBy = "productEntity",cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true) 
	private List<ClassifyEntity> classifyEntity = new ArrayList<>();
	
	@OneToMany(mappedBy = "productEntity")
	private List<SubClassifyEntity> subClassifies = new ArrayList<>();
	
	@OneToMany(mappedBy = "productEntity")
	private List<MulImageProductEntity> MulImageProducts = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "product_shipping", 
				joinColumns = @JoinColumn(name = "product_id"), 
				inverseJoinColumns = @JoinColumn(name = "shipping_id"))
	private List<ShippingEntity> shippings =  new ArrayList<>();
	
//	@OneToOne(mappedBy = "product")
//    private CartDetailEntity CartDetailEntity;  
	
	public Long getCategory_id(){
        return categoryentity.getId();
    }
	
    public String getCategoryName(){
        return categoryentity.getName();
    }
    
    public Long getSubcategory_id(){
        return subCategoryEntity.getId();
    }
	
    public String getSubcategoryName(){
        return subCategoryEntity.getName();
    }
    
    public Long getChildCategory_id(){
        return childCategoryEntity.getId();
    }
	
    public String getChildCategoryName(){
        return childCategoryEntity.getName();
    }
    
    
    public Long getUserSalerid(){
        return userEntity.getId();
    }
	
    public String getUserName(){
        return userEntity.getName();
    }
    
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
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
	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "productsFavourite", cascade = CascadeType.ALL)
//    private List<UserEntity> ListUsers;
	
	
	@JsonIgnore
	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}
	
	@JsonIgnore
	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}
	
	@JsonIgnore
	public SubCategoryEntity getSubCategoryEntity() {
		return subCategoryEntity;
	}
	
	@JsonIgnore
	public void setSubCategoryEntity(SubCategoryEntity subCategoryEntity) {
		this.subCategoryEntity = subCategoryEntity;
	}
	
	@JsonIgnore
	public ChildCategoryEntity getChildCategoryEntity() {
		return childCategoryEntity;
	}
	
	@JsonIgnore
	public void setChildCategoryEntity(ChildCategoryEntity childCategoryEntity) {
		this.childCategoryEntity = childCategoryEntity;
	}
	
	public List<ClassifyEntity> getClassifyEntity() {
		return classifyEntity;
	}

	public void setClassifyEntity(List<ClassifyEntity> classifyEntity) {
		this.classifyEntity = classifyEntity;
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

	public List<SubClassifyEntity> getSubClassifies() {
		return subClassifies;
	}

	public void setSubClassifies(List<SubClassifyEntity> subClassifies) {
		this.subClassifies = subClassifies;
	}

	public List<MulImageProductEntity> getMulImageProducts() {
		return MulImageProducts;
	}

	public void setMulImageProducts(List<MulImageProductEntity> mulImageProducts) {
		MulImageProducts = mulImageProducts;
	}
	
	@JsonIgnore
	public UserEntity getUserEntity() {
		return userEntity;
	}
	
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	public List<RoleEntity> getProductsFavourite() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getPricemax() {
		return pricemax;
	}

	public void setPricemax(Integer pricemax) {
		this.pricemax = pricemax;
	}

	public Integer getPricemin() {
		return pricemin;
	}

	public void setPricemin(Integer pricemin) {
		this.pricemin = pricemin;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsOrderBefore() {
		return isOrderBefore;
	}

	public void setIsOrderBefore(Integer isOrderBefore) {
		this.isOrderBefore = isOrderBefore;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	
//	@JsonIgnore
//	public CartDetailEntity getCartDetailEntity() {
//		return CartDetailEntity;
//	}
//	
//	@JsonIgnore
//	public void setCartDetailEntity(CartDetailEntity cartDetailEntity) {
//		CartDetailEntity = cartDetailEntity;
//	}


}
