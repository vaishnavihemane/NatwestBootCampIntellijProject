package com.natwest.service;

import com.natwest.dto.UserDto;
import com.natwest.entity.User;
import com.natwest.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User createUser(User user) {
        User userSavedToDB = this.userRepository.save(user);
        return userSavedToDB;

    }

    @Override
    public UserDto getUser(int userId) {
        User user = this.userRepository.getById(userId);
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;

    }
}
