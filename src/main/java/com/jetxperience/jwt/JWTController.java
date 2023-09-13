package com.jetxperience.jwt;



import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetxperience.dto.Users;
import com.jetxperience.exception.UserNotFoundException;
import com.jetxperience.service.IUsersService;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

/**
 * @author Samson Effes
 */

@RestController
@RequestMapping("/login")
public class JWTController {

	@Autowired
	JWTService jwtService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@PostMapping
	public Object getTokenForAuthenticatedUser(@RequestBody JWTAuthenticationRequest authRequest){
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		
		if (authentication.isAuthenticated()){
			String token =  jwtService.generateToken(authRequest.getUserName());
			JSONObject jsonObject = new JSONObject("{\"token\": \"" + token + "\"}");
			jsonObject.put("token",token );
			return jsonObject.toMap();//devuelve token por body
		}
		else {
			throw new UserNotFoundException("Usuario no encontrado.", HttpStatus.NOT_FOUND.value());
		}
	}
}
