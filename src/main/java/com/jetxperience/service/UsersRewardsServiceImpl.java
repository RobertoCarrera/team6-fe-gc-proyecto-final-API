package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IUsersRewardsDAO;
import com.jetxperience.dto.Rewards;
import com.jetxperience.dto.UsersRewards;

@Service
public class UsersRewardsServiceImpl implements IUsersRewardsService {

	@Autowired
	IUsersRewardsDAO iUsersRewardsDAO;
	
	@Override
	public List<UsersRewards> listUsersRewards() {

		return iUsersRewardsDAO.findAll();
	}
	
	public List<Rewards> listRewardsUsers(int id){
		
		return iUsersRewardsDAO.findRewardsByIdUsers(id);
	}

	@Override
	public UsersRewards newUserReward(UsersRewards userReward) {

		return iUsersRewardsDAO.save(userReward);
	}

	@Override
	public UsersRewards userRewardById(int id) {

		return iUsersRewardsDAO.findById(id).get();
	}

	@Override
	public UsersRewards updateUserReward(UsersRewards userReward) {

		return iUsersRewardsDAO.save(userReward);
	}

	@Override
	public void deleteUserReward(int id) {

		iUsersRewardsDAO.deleteById(id);
	}

}
