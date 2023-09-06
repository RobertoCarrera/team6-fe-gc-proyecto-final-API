package com.jetxperience.jwt;

import lombok.Data;

/**
 * @author Jose Marin
 */

@Data
public class JWTAuthenticationRequest {
    private String userName;
    private String password;
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return userName;
    }
}