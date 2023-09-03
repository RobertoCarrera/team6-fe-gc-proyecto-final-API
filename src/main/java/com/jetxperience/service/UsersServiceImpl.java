package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersDAO;
import com.jetxperience.dto.Users;

@Service
public class UsersServiceImpl implements IUsersService {

	@Autowired
	IUsersDAO iUsersServiceDAO;
	
	@Override
	public List<Users> listUsers() {

		return iUsersServiceDAO.findAll();
	}

	@Override
	public Users newUser(Users user) {

		return iUsersServiceDAO.save(user);
	}

	@Override
	public Users userByID(int id) {

		return iUsersServiceDAO.findById(id).get();
	}

	@Override
	public Users updateUser(Users user) {

		return iUsersServiceDAO.save(user);
	}

	@Override
	public void deleteUser(int id) {

		iUsersServiceDAO.deleteById(id);
	}

}
