package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersAllergens;

public interface IUsersAllergensDAO extends JpaRepository<UsersAllergens, Integer>{

}