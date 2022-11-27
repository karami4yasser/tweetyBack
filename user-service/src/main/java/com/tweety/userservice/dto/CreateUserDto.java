package com.tweety.userservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDto {

    private String userName;
    private String picture;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
