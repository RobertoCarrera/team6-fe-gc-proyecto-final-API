package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.UsersRewardsServiceImpl;
import com.jetxperience.dto.UsersRewards;

@RestController
public class UsersRewardsController {

	@Autowired
	UsersRewardsServiceImpl usuarios_premiosServiceImpl;
	
	@GetMapping("/users_rewards")
	public List<UsersRewards> listUsersRewards(){
		
		return usuarios_premiosServiceImpl.listUsersRewards(); 
	}
	
	@GetMapping("/users_rewards/{id}")
	public UsersRewards usersRewardsById(@PathVariable(name="id") int id) {
		
		UsersRewards usersRewards_byID = new UsersRewards();
		
		usersRewards_byID = usuarios_premiosServiceImpl.userRewardById(id);
		
		System.out.println("Usuario_Platos byID: "+usersRewards_byID);
		
		return usersRewards_byID;
	}
	
	@PostMapping("/users_rewards")
	public UsersRewards newUserReward(@RequestBody UsersRewards usersRewards) {
		
		return usuarios_premiosServiceImpl.newUserReward(usersRewards);
	}
	
	@DeleteMapping("/users_rewards/{id}")
	public void deleteUserReward(@PathVariable(name="id") int id) {
		
		usuarios_premiosServiceImpl.deleteUserReward(id);
	}
}