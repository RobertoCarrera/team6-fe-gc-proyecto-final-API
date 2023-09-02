package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Answers;

public interface IAnswersDAO extends JpaRepository<Answers, Integer>{

}