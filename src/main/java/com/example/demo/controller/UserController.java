package com.example.demo.controller;

import com.example.demo.model.DTO.UserDto;
import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public ResponseEntity<Object> saveUser(@RequestBody UserDto userDto) {
        return null;
    }
}
