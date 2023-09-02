package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Hours;

public interface IHoursDAO extends JpaRepository<Hours, Integer>{

}