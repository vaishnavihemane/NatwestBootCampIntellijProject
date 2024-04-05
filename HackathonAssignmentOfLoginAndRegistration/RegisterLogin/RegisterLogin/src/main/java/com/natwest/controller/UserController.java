package com.natwest.controller;

import com.natwest.dto.LoginDto;
import com.natwest.dto.UserDto;
import com.natwest.response.LoginMessage;
import com.natwest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/save")
    public ResponseEntity<String> add(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.addUser(userDto), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDto){
        LoginMessage loginMessage = userService.loginUser(loginDto);
        return ResponseEntity.ok(loginMessage);
    }


}
