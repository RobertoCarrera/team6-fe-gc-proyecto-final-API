package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersAllergensDAO;
import com.jetxperience.dto.UsersAllergens;

@Service
public class UsersAllergensServiceImpl implements IUsersAllergensService {

	@Autowired
	IUsersAllergensDAO iUsersAllergensDAO;
	
	@Override
	public List<UsersAllergens> listUsersAllergens() {

		return iUsersAllergensDAO.findAll();
	}
	
	public List<UsersAllergens> listUsersAllergensByUserId(int id){
		
		return iUsersAllergensDAO.findByIdUsersId(id);
	}
	
	@Override
	public UsersAllergens newUserAllergen(UsersAllergens userAllergen) {

		return iUsersAllergensDAO.save(userAllergen);
	}

	@Override
	public UsersAllergens userAllergenById(int id) {

		return iUsersAllergensDAO.findById(id).get();
	}

	@Override
	public UsersAllergens updateUserAllergen(UsersAllergens userAllergen) {

		return iUsersAllergensDAO.save(userAllergen);
	}

	@Override
	public void deleteUserAllergen(int id) {

		iUsersAllergensDAO.deleteById(id);
	}

}
