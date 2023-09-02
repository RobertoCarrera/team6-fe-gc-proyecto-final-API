package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Ingredients;

public interface IIngredientsDAO extends JpaRepository<Ingredients, Integer>{

}