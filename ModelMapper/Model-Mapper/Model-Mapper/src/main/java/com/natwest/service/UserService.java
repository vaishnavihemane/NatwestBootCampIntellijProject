package com.natwest.service;

import com.natwest.dto.UserDto;
import com.natwest.entity.User;

public interface UserService {


    public User createUser(User user);

    public UserDto getUser(int userId);

}
