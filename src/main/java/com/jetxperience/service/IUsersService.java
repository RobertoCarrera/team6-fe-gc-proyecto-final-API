package com.jetxperience.service;

import com.jetxperience.dto.Users;
import java.util.List;
import java.util.Optional;

public interface IUsersService {

	public List<Users> listUsers();
	
	public String getRoleNameByEmail(String email);

	public Users newUser(Users user);
	
	public Users userByID(String email);
	
	public Users updateUser(Users user);
	
	// Buscar usuario por email
	public Optional<Users> getUserByEmail(String email);
	
	public void deleteUser(String email);
	
}