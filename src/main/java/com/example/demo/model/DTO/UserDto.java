package com.example.demo.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserDto {

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String country;

    private String state;

    private String address;
    private String avatar;
}
