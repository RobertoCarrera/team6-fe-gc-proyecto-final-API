package com.jetxperience.service;

import java.util.List;

import com.jetxperience.dto.Users;

public interface IUsersService {
    Users add(Users users);
    List<UserRecord> getAllUsers();
    void delete(String email);
    Users getUser(String email);
    Users update(Users users);
}