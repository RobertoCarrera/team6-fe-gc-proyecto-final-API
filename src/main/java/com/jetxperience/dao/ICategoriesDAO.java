package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Categories;

public interface ICategoriesDAO extends JpaRepository<Categories, Integer>{

}