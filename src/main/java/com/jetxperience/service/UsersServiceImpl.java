package com.jetxperience.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jetxperience.dao.IUsersDAO;
import com.jetxperience.dto.Users;
import com.jetxperience.exception.UserAlreadyExistsException;
import com.jetxperience.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements IUsersService {
    private final IUsersDAO iUsersDAO = null;
    private final PasswordEncoder passwordEncoder = null;

    @Override
    public Users add(Users users) {
        Optional<Users> theUser = iUsersDAO.findByEmail(users.getEmail());
        if (theUser.isPresent()){
            throw new UserAlreadyExistsException("A user with " + users.getEmail() + " already exists");
        }
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        return iUsersDAO.save(users);
    }

    @Override
    public List<UserRecord> getAllUsers() {
        return iUsersDAO.findAll()
                .stream()
                .map(user -> new UserRecord(
                        user.getId(),
                        user.getName(),
                        user.getSurname(),
                        user.getEmail(),
                        user.getPassword()))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void delete(String email) {
        iUsersDAO.deleteByEmail(email);
    }

    @Override
    public Users getUser(String email) {
        return iUsersDAO.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @Override
    public Users update(Users users) {
        // No estoy seguro de qué debería hacer esta parte
        // users.setRole(users.getRole());
        return iUsersDAO.save(users);
    }
}
