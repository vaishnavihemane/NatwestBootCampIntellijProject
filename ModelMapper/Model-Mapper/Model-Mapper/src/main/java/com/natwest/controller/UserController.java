package com.natwest.controller;


import com.natwest.dto.UserDto;
import com.natwest.entity.User;
import com.natwest.service.UserService;
import com.natwest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User userCreated = this.userServiceImpl.createUser(user);
        return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
    }

//    @GetMapping("/{userId}")
//    public User getUser(@PathVariable int userId) {
//        return userService.getUser(userId);
//    }



    @GetMapping("/get/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") int userId){
        UserDto userDto = this.userServiceImpl.getUser(userId);
        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
    }


}