package com.natwest.service;

import com.natwest.dto.UserDto;
import com.natwest.entity.User;
import com.natwest.repositories.UserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceImplTest {


    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserDto userDto;

    @Mock
    User user;

    @Mock
    UserRepo userRepo;
    private MockitoAnnotations MokitoAnnotations;


    @BeforeEach
    public void setUp(){
        MokitoAnnotations.openMocks(this);
    }


    @Test
    void addUser() {

    }

    @Test
    void loginUser() {

    }
}