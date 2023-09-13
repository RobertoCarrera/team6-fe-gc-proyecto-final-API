package com.jetxperience.service;

import com.jetxperience.dto.Users;
import java.util.List;

public interface IUsersService {

	public List<Users> listUsers();
	
	public String getRoleNameByEmail(String email);

	public Users newUser(Users user);
	
	public Users userByID(String email);
	
	public Users updateUser(Users user);
	
	public void deleteUser(String email);
	
}