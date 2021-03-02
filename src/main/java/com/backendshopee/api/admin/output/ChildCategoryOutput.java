package com.backendshopee.api.admin.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;

public class ChildCategoryOutput {
	private List<CategoryEntity> listCategory = new ArrayList<>();
	private List<SubCategoryEntity> listSubcate = new ArrayList<>();
	public List<CategoryEntity> getListCategory() {
		return listCategory;
	}
	public void setListCategory(List<CategoryEntity> listCategory) {
		this.listCategory = listCategory;
	}
	public List<SubCategoryEntity> getListSubcate() {
		return listSubcate;
	}
	public void setListSubcate(List<SubCategoryEntity> listSubcate) {
		this.listSubcate = listSubcate;
	}
}
