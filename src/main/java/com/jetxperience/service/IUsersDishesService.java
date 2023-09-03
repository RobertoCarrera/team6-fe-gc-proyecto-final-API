package com.jetxperience.service;

import com.jetxperience.dto.UsersDishes;
import java.util.List;

public interface IUsersDishesService {
    
    public List<UsersDishes> listUsersDishes();
	
	public UsersDishes newUserDish(UsersDishes userDish);
	
	public UsersDishes userDishById(int id);
	
	public UsersDishes updateUserDish(UsersDishes userDish);
	
	public void deleteUserDish(int id);
}