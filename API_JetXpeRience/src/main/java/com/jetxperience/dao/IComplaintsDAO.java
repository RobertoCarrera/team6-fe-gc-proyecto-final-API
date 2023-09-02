package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Complaints;

public interface IComplaintsDAO extends JpaRepository<Complaints, Integer>{

}