package com.jetxperience.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersRewards;

public interface IUsersRewardsDAO extends JpaRepository<UsersRewards, Integer>{

	public List<UsersRewards> findByIdUsersId(int id);
}