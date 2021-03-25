package com.backendshopee.dto;

public class Products {
	private Long id;
	private String name;
	
	private String description;
	
	private int price;
	
	private String Subclassfly;

	private String classfly;
	
	private Integer discount;
	
	private Number gram;
	
	private Number view = 0;
	
	private Number qty = 0;
	
	private String content_discount;
	
	private Number user_id = 0;
	
	private Number unit_id;
	
	private String image = "0";
	
	private Integer pricemax;
	
	private Integer pricemin;
	
	private Integer isNew;
	
	private Integer isOrderBefore;
	
	private String video = "0";

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

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Number getGram() {
		return gram;
	}

	public void setGram(Number gram) {
		this.gram = gram;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
