package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.ShippingEntity;

public class ShippingDTO {
	
	List<ShippingEntity> shippings = new ArrayList<>();
	
	private String name;
	private Number maxgram;
	private Number mingram;
	private Number money_shipping;
	public List<ShippingEntity> getShippings() {
		return shippings;
	}
	public void setShippings(List<ShippingEntity> shippings) {
		this.shippings = shippings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getMaxgram() {
		return maxgram;
	}
	public void setMaxgram(Number maxgram) {
		this.maxgram = maxgram;
	}
	public Number getMingram() {
		return mingram;
	}
	public void setMingram(Number mingram) {
		this.mingram = mingram;
	}
	public Number getMoney_shipping() {
		return money_shipping;
	}
	public void setMoney_shipping(Number money_shipping) {
		this.money_shipping = money_shipping;
	}
}
