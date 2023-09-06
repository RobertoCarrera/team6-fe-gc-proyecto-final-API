package com.jetxperience.service;

import com.jetxperience.dto.Users;
import java.util.List;

public interface IUsersService {

	public List<Users> listUsers();
	
	public Users newUser(Users user);
	
	public Users userByID(int id);
	
	public Users updateUser(Users user);
	
	public void deleteUser(int id);
	

	
}