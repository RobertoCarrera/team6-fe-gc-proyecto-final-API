package com.jetxperience.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.jetxperience.dao.IUsersDAO;

/**
 * @author Jose Marin
 */

@Component
public class WebUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsersDAO userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .map(WebUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found"));
    }
}