package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Roles;

public interface IRolesDAO extends JpaRepository<Roles, Integer>{

}