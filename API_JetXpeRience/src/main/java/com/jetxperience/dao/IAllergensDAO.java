package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Allergens;

public interface IAllergensDAO extends JpaRepository<Allergens, Integer>{

}