package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.UsersRewardsServiceImpl;
import com.jetxperience.dto.UsersRewards;

@RestController
public class UsersRewardsController {

	@Autowired
	UsersRewardsServiceImpl users_rewardsServiceImpl;
	
	@GetMapping("/users_rewards")
	public List<UsersRewards> listUsersRewards(){
		
		return users_rewardsServiceImpl.listUsersRewards(); 
	}
	
	@GetMapping("/users_rewards/user/{id}")
	public List<UsersRewards> listUsersRewardsByUsers(@PathVariable int id){
		
		return users_rewardsServiceImpl.listUsersRewardsByUserId(id);
	}
	
	@GetMapping("/users_rewards/{id}")
	public UsersRewards usersRewardsById(@PathVariable(name="id") int id) {
		
		UsersRewards usersRewards_byID = new UsersRewards();
		
		usersRewards_byID = users_rewardsServiceImpl.userRewardById(id);
		
		System.out.println("Users_Rewards byID: "+usersRewards_byID);
		
		return usersRewards_byID;
	}
	
	 @PutMapping("/users_rewards/updateAvailability/{id}")
	    public ResponseEntity<String> updateAvailability(
	            @PathVariable(name = "id") int id,
	            @RequestParam(name = "isAvailable") boolean isAvailable) {

	        try {
	            UsersRewards usersRewards = users_rewardsServiceImpl.userRewardById(id);
	            
	            if (usersRewards == null) {
	            	
	                return ResponseEntity.notFound().build();
	            }
	            
	            usersRewards.setIsAvailable(isAvailable);
	            users_rewardsServiceImpl.updateUserReward(usersRewards);
	            
	            return ResponseEntity.ok("Disponibilidad actualizada con éxito");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error al actualizar la disponibilidad");
	        }
	 }
	
	@PostMapping("/users_rewards")
	public UsersRewards newUserReward(@RequestBody UsersRewards usersRewards) {
		
		return users_rewardsServiceImpl.newUserReward(usersRewards);
	}
	
	@DeleteMapping("/users_rewards/{id}")
	public void deleteUserReward(@PathVariable(name="id") int id) {
		
		users_rewardsServiceImpl.deleteUserReward(id);
	}
}