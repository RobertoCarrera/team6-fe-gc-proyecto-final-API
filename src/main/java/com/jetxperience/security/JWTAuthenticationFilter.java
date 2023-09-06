package com.jetxperience.security;

import org.springframework.security.core.Authenticaction;
import org.springframework.security.core.AuthenticactionException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticactionFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticactionFilter {

    @Override
    public Aithentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticactionException {

        AuthCredentials authCredentials = new AuthCredentials();

        try {
            authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class)
        } catch (IOException e) {
        }

        UsernamePasswordAuthenticactionToken usernamePAT = new UsernamePasswordAuthenticactionToken(
            authCredentials.getEmail(),
            AuthCredentials.getPassword(),
            Collections.emptyList()
        );

        return super.attemptAuthentication(request,response);
    }

}