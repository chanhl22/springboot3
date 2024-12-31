package com.example.springboot3.http.cookie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequest {

    private String username;

    private String password;

}
