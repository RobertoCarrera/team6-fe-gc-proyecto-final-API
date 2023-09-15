package com.jetxperience.service;

import java.util.List;
import java.util.Optional;

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
	public Users userByID(String email) {

		return iUsersServiceDAO.findByEmail(email).get();
	}

	@Override
	public Users updateUser(Users user) {

		return iUsersServiceDAO.save(user);
	}

	@Override
	public void deleteUser(String email) {

		iUsersServiceDAO.deleteByEmail(email);
	}
	
	@Override
	public Optional<Users> getUserByEmail(String email) {

		return iUsersServiceDAO.findByEmail(email);
	}
	
	
	
	
    @Override
    public String getRoleNameByEmail(String email) {
        Users user = iUsersServiceDAO.findByEmail(email).orElse(null); // Encuentra al usuario por su correo electrónico
        if (user != null && user.getRole() != null) {
            return user.getRole().getName(); // Obtiene el nombre del rol a través de la relación
        }
        return null; // Devuelve null si el usuario o el rol no existen
    }

}
