package com.jetxperience.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersDAO;
import com.jetxperience.dto.Roles;
import com.jetxperience.dto.Users;

import jakarta.transaction.Transactional;

@Service
public class UsersServiceImpl implements IUsersService {

	@Autowired
	IUsersDAO iUsersServiceDAO;
	
	@Override
	@Transactional
	public List<Users> listUsers() {

		return iUsersServiceDAO.findAll();
	}

	@Override
	@Transactional
	public Users newUser(Users user) {

		return iUsersServiceDAO.save(user);
	}

	@Override
	@Transactional
	public Users userByID(String email) {

		return iUsersServiceDAO.findByEmail(email).get();
	}

	@Override
	@Transactional
	public Users updateUser(Users user) {

		return iUsersServiceDAO.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
	    iUsersServiceDAO.deleteById(id);
	}

	
	@Override
	@Transactional
	public Optional<Users> getUserByEmail(String email) {

		return iUsersServiceDAO.findByEmail(email);
	}
	
	@Override
	@Transactional
	public List<Users> getAllUsersByRole(Roles role) {

		return iUsersServiceDAO.findByRoleOrderByNameAsc(role);
	}
	
	@Override
	@Transactional
	public Optional<Users> getUserByName(String name) {

		return iUsersServiceDAO.findByName(name);
	}
	
	
	@Override
	@Transactional
	public Optional<Users> getUserBySurname(String surname) {

		return iUsersServiceDAO.findBySurname(surname);
	}
	
	@Override
	@Transactional
	public Users getUserById(int id) {

		return iUsersServiceDAO.findById(id).get();
	}
	
	
    @Override
    @Transactional
    public String getRoleNameByEmail(String email) {
        Users user = iUsersServiceDAO.findByEmail(email).orElse(null); // Encuentra al usuario por su correo electrónico
        if (user != null && user.getRole() != null) {
            return user.getRole().getName(); // Obtiene el nombre del rol a través de la relación
        }
        return null; // Devuelve null si el usuario o el rol no existen
    }

}
