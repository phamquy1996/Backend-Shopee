package com.backendshopee.api.admin.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;

public class SubcategoryOutput {
	private List<SubCategoryEntity> listSubcate = new ArrayList<>();
	private List<CategoryEntity> listCate = new ArrayList<>();
	
	public List<SubCategoryEntity> getListSubcate() {
		return listSubcate;
	}
	public void setListSubcate(List<SubCategoryEntity> listSubcate) {
		this.listSubcate = listSubcate;
	}
	public List<CategoryEntity> getListCate() {
		return listCate;
	}
	public void setListCate(List<CategoryEntity> listCate) {
		this.listCate = listCate;
	}
}
