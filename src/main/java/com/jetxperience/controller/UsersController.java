package com.jetxperience.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jetxperience.dto.Users;
import com.jetxperience.service.UserRecord;
import com.jetxperience.service.UsersServiceImpl;

import java.util.List;



@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersServiceImpl usersServiceImpl = new UsersServiceImpl();

    @GetMapping("/all")
    public ResponseEntity<List<UserRecord>> getAllUsers() {
        List<UserRecord> users = usersServiceImpl.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> add(@RequestBody Users users) {
        Users addedUser = usersServiceImpl.add(users);
        return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Users> getByEmail(@PathVariable("email") String email) {
        Users user = usersServiceImpl.getUser(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> delete(@PathVariable("email") String email) {
        usersServiceImpl.delete(email);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update")
    public ResponseEntity<Users> update(@RequestBody Users users) {
        Users updatedUser = usersServiceImpl.update(users);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
