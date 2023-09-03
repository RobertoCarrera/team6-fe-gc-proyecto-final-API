package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersIngredientsDAO;
import com.jetxperience.dto.UsersIngredients;

@Service
public class UsersIngredientsServiceImpl implements IUsersIngredientsService {

	@Autowired
	IUsersIngredientsDAO iUsersIngredientsDAO;
	
	@Override
	public List<UsersIngredients> listUsersIngredients() {

		return iUsersIngredientsDAO.findAll();
	}

	@Override
	public UsersIngredients newUserIngredient(UsersIngredients userIngredient) {

		return iUsersIngredientsDAO.save(userIngredient);
	}

	@Override
	public UsersIngredients userIngredientById(int id) {

		return iUsersIngredientsDAO.findById(id).get();
	}

	@Override
	public UsersIngredients updateUserIngredient(UsersIngredients userIngredient) {

		return iUsersIngredientsDAO.save(userIngredient);
	}

	@Override
	public void deleteUserIngredient(int id) {

		iUsersIngredientsDAO.deleteById(id);
	}

}
