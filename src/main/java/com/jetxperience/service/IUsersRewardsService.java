package com.jetxperience.service;

import com.jetxperience.dto.UsersRewards;
import java.util.List;

public interface IUsersRewardsService {

    public List<UsersRewards> listUsersRewards();
	
	public UsersRewards newUserReward(UsersRewards userReward);
	
	public UsersRewards userRewardById(int id);
	
	public UsersRewards updateUserReward(UsersRewards userReward);
	
	public void deleteUserReward(int id);
}
