package com.natwest.service;

import com.natwest.dto.UserDTO;
import com.natwest.entity.User;
import com.natwest.exception.InvalidEmailIdException;
import com.natwest.exception.InvalidMobileNumberException;
import com.natwest.exception.InvalidPasswordException;
import com.natwest.exception.InvalidUserNameException;

import java.util.List;

public interface Registration {
    
    UserDTO registerUser(User user) throws InvalidEmailIdException, InvalidMobileNumberException, InvalidUserNameException, InvalidPasswordException;


    List<User> getAllUser();
}
