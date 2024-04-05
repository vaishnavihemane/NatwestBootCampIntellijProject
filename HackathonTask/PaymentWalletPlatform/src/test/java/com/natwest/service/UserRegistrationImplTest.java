package com.natwest.service;

import com.natwest.dto.UserDTO;
import com.natwest.entity.User;
import com.natwest.exception.InvalidEmailIdException;
import com.natwest.exception.InvalidMobileNumberException;
import com.natwest.exception.InvalidPasswordException;
import com.natwest.exception.InvalidUserNameException;
import com.natwest.repository.UserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserRegistrationImplTest {



    @InjectMocks
    UserRegistrationImpl userRegistration;

    @Mock
    User user;

//    @Mock
//    UserDTO userDTO;

    @Mock
    UserRepo userRepo;
    private MockitoAnnotations MokitoAnnotations;


    @BeforeEach
    public void setUp(){
        MokitoAnnotations.openMocks(this);
    }



    @Test
    void registerUser() throws InvalidMobileNumberException, InvalidEmailIdException, InvalidPasswordException, InvalidUserNameException {

    }

    @Test
    void getAllUser() {
    }
}