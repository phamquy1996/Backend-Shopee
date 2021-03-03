package com.backendshopee.api.admin.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.SubCategoryEntity;

public class SubcategoryOutput {
	private List<SubCategoryEntity> listSubcate = new ArrayList<>();
	
	private int page;
	private int totalPage;
	
	public List<SubCategoryEntity> getListSubcate() {
		return listSubcate;
	}
	public void setListSubcate(List<SubCategoryEntity> listSubcate) {
		this.listSubcate = listSubcate;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
