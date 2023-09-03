package com.jetxperience.service;

import com.jetxperience.dto.UsersAllergens;
import java.util.List;

public interface IUsersAllergensService {
    
    public List<UsersAllergens> listUsersAllergens();
	
	public UsersAllergens newUserAllergen(UsersAllergens userAllergen);
	
	public UsersAllergens userAllergenById(int id);
	
	public UsersAllergens updateUserAllergen(UsersAllergens userAllergen);
	
	public void deleteUserAllergen(int id);
}
