package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Ingredients;

public interface IIngredientsDAO extends JpaRepository<Ingredients, Integer>{

}