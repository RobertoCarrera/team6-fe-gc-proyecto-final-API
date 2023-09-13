package com.jetxperience.jwt;



import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
@RequestMapping("/login")
public class JWTController {
    private final JWTService jwtService;
    private final AuthenticationManager authenticationManager;
    private final IUsersService usersService; // Inyecta el servicio

    @PostMapping
    public Object getTokenForAuthenticatedUser(@RequestBody JWTAuthenticationRequest authRequest) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(authRequest.getUserName());

            // Accede al nombre del rol utilizando el servicio IUsersService
            String roleName = usersService.getRoleNameByEmail(authRequest.getUserName());

            // Obtén el ID del usuario utilizando el servicio IUsersService
            Users user = usersService.userByID(authRequest.getUserName());
            Integer userId = (user != null) ? user.getId() : null;

            // Crear un objeto de respuesta que contiene el token, el nombre de usuario, el nombre del rol y el ID del usuario
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("username", authRequest.getUserName());
            response.put("roleName", roleName);
            response.put("userId", userId); // Agrega el ID del usuario al mapa

            return response;
        } else {
            throw new UserNotFoundException("Invalid user credentials");
        }
    }
}

