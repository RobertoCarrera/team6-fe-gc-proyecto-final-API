package com.jetxperience.jwt;

import lombok.Data;

/**
 * @author Jose Marin
 */

@Data
public class JWTAuthenticationRequest {
    private String name;
    private String password;
    
    
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public Object getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
}