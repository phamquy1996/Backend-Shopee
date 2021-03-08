package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
	
	List<ClasifyDTO> clasifyDTO = new ArrayList<>();
	List<ImagesDTO> imagesDTO = new ArrayList<>();
	List<ShippingDTO> shippings = new ArrayList<>();
	
	private String name;
	
	private String description;
	
	private Float price;
	
	private String Subclassfly;
	
	private String classfly;
	
	private Float discount;
	
	private Number gram;
	
	private Number view = 0;
	
	private Number qty = 0;
	
	private String content_discount;
	
	private Number user_id = 0;
	
	private Number unit_id;
	
	private String image = "0";
	
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

	public List<ShippingDTO> getShippings() {
		return shippings;
	}

	public void setShippings(List<ShippingDTO> shippings) {
		this.shippings = shippings;
	}
}
