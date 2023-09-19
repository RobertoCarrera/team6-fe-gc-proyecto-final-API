package com.jetxperience.service;

import com.jetxperience.dto.UsersAllergens;
import java.util.List;

public interface IUsersAllergensService {
    
    public List<UsersAllergens> listUsersAllergens();
	
	public UsersAllergens newUserAllergen(UsersAllergens userAllergen);
	
	public UsersAllergens userAllergenById(int id);
	
    public boolean updateIsAllergicStatus(int idUsers, int idAllergens, boolean isAllergic);
    
    public Boolean getIsAllergicStatus(int idUsers, int idAllergens);
	
	public void deleteUserAllergen(int id);
}
