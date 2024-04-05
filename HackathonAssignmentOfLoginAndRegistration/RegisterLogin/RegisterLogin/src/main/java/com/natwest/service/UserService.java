package com.natwest.service;

import com.natwest.dto.LoginDto;
import com.natwest.dto.UserDto;
import com.natwest.response.LoginMessage;

public interface UserService {

    String addUser(UserDto userDto);

    LoginMessage loginUser(LoginDto loginDto);

}
ing