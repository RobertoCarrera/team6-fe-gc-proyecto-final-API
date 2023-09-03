package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersDishesDAO;
import com.jetxperience.dto.UsersDishes;

@Service
public class UsersDishesServiceImpl implements IUsersDishesService {

	@Autowired
	IUsersDishesDAO iUsersDishesDAO;
	
	@Override
	public List<UsersDishes> listUsersDishes() {

		return iUsersDishesDAO.findAll();
	}

	@Override
	public UsersDishes newUserDish(UsersDishes userDish) {

		return iUsersDishesDAO.save(userDish);
	}

	@Override
	public UsersDishes userDishById(int id) {

		return iUsersDishesDAO.findById(id).get();
	}

	@Override
	public UsersDishes updateUserDish(UsersDishes userDish) {

		return iUsersDishesDAO.save(userDish);
	}

	@Override
	public void deleteUserDish(int id) {

		iUsersDishesDAO.deleteById(id);
	}

}
