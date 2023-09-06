package com.jetxperience.security;

import org.springFramework.beans.factory.annotation.Autowired;
import org.springFramework.security.core.userdetails.UserDetails;
import org.springFramework.security.core.userdetails.UserDetailsService;
import org.springFramework.security.core.userdetails.UsernameNotFoundException;
import org.springFramework.stereotype.Service;
import pe.jetxperience.repository.UsuarioRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        usuarioRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con email " + email + " no existe."));

                return
    }
}