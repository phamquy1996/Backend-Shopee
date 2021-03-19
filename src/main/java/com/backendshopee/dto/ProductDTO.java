package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
	
	List<ClasifyDTO> clasifyDTO = new ArrayList<>();
	List<ImagesDTO> imagesDTO = new ArrayList<>();
	List<ShippingDTO> shippings = new ArrayList<>();
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private Float price;
	
	private String subclassify;
	
	private String classfly;
	
	private Float discount;
	
	private Long category_id;
	
	private Long subcategory_id;
	
	private Long childcategory_id;
	
	private Number gram;
	
	private Number view = 0;
	
	private int qty;
	
	private String content_discount;
	
	private Number user_id = 0;
	
	private Number unit_id;
	
	private String image = "0";
	
	private String classify;
	
	private Integer classify_id;
	
	private Integer subclassify_id;
	
	private Integer pricemax;
	
	private Integer pricemin;
	
	private Integer isNew;
	
	private Integer isOrderBefore;
	
	private String video;
	
	private Long userSaler_id;
	
	private Number number;
	
	private Number totalPages;
	
	public List<ClasifyDTO> getClasifyDTO() {
		return clasifyDTO;
	}

	public void setClasifyDTO(List<ClasifyDTO> clasifyDTO) {
		this.clasifyDTO = clasifyDTO;
	}

	public List<ImagesDTO> getImagesDTO() {
		return imagesDTO;
	}

	public void setImagesDTO(List<ImagesDTO> imagesDTO) {
		this.imagesDTO = imagesDTO;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getClassfly() {
		return classfly;
	}

	public void setClassfly(String classfly) {
		this.classfly = classfly;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
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

	public Long getCategory_id() {
		return category_id;
	}

	public Long getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(Long subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public Long getChildcategory_id() {
		return childcategory_id;
	}

	public void setChildcategory_id(Long childcategory_id) {
		this.childcategory_id = childcategory_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public List<ShippingDTO> getShippings() {
		return shippings;
	}

	public Long getUserSaler_id() {
		return userSaler_id;
	}

	public void setUserSaler_id(Long userSaler_id) {
		this.userSaler_id = userSaler_id;
	}

	public void setShippings(List<ShippingDTO> shippings) {
		this.shippings = shippings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Number getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Number totalPages) {
		this.totalPages = totalPages;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public String getSubclassify() {
		return subclassify;
	}

	public void setSubclassify(String subclassify) {
		this.subclassify = subclassify;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
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
