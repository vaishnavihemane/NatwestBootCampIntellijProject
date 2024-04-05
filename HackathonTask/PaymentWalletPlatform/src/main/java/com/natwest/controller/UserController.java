package com.natwest.controller;


import com.natwest.dto.UserDTO;
import com.natwest.entity.User;
import com.natwest.exception.InvalidEmailIdException;
import com.natwest.exception.InvalidMobileNumberException;
import com.natwest.exception.InvalidPasswordException;
import com.natwest.exception.InvalidUserNameException;
import com.natwest.service.UserRegistrationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserRegistrationImpl userRegistration;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> add(@RequestBody User user) throws InvalidMobileNumberException, InvalidEmailIdException, InvalidPasswordException, InvalidUserNameException {
        return new ResponseEntity<>(userRegistration.registerUser(user), HttpStatus.OK);
    }


    @GetMapping("/register")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userRegistration.getAllUser(),HttpStatus.OK);
    }



}
