package com.jetxperience.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersAllergens;

public interface IUsersAllergensDAO extends JpaRepository<UsersAllergens, Integer>{

	public List<UsersAllergens> findByIdUsersId(int id);
	
	public UsersAllergens findByIdUsersIdAndIdAllergensId(int idUsers, int idAllergens);
}