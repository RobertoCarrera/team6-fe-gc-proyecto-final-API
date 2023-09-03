package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.ICategoriesDAO;
import com.jetxperience.dto.Categories;

@Service
public class CategoriesServiceImpl implements ICategoriesService {

	@Autowired
	ICategoriesDAO iCategoriesDAO;
	
	@Override
	public List<Categories> listCategory() {
		
		return iCategoriesDAO.findAll();
	}

	@Override
	public Categories newCategory(Categories category) {
		
		return iCategoriesDAO.save(category);
	}

	@Override
	public Categories categoryByID(int id) {
		
		return iCategoriesDAO.findById(id).get();
	}

	@Override
	public Categories updateCategory(Categories category) {
		
		return iCategoriesDAO.save(category);
	}

	@Override
	public void deleteCategory(int id) {
		
		iCategoriesDAO.deleteById(id);
	}

}
