package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersIngredients;

public interface IUsersIngredientsDAO extends JpaRepository<UsersIngredients, Integer>{

}