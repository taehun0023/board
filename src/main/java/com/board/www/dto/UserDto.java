package com.board.www.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String userId;
    private String userPassword;
    private String userName;
    private String phone;
    private String address;
    private String email;
    private Timestamp joinDate;
}
