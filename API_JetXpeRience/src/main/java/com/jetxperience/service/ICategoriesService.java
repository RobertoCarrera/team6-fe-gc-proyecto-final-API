package com.jetxperience.service;

import com.jetxperience.dto.Categories;
import java.util.List;

public interface ICategoriesService {

	public List<Categories> listCategory();
	
	public Categories newCategory(Categories category);
	
	public Categories categoryByID(int id);
	
	public Categories updateCategory(Categories category);
	
	public void deleteCategory(int id);
}