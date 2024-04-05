package com.natwest.service;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.natwest.dto.LoginDto;
import com.natwest.dto.UserDto;
import com.natwest.entity.User;
import com.natwest.repositories.UserRepo;
import com.natwest.response.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addUser(UserDto userDto) {

        User user = new User(
                userDto.getUserId(),
                userDto.getUserName(),
                userDto.getAge(),
                userDto.getUserEmail(),
                userDto.getMoileNo(),
                this.passwordEncoder.encode(userDto.getPassword())
        );
        userRepo.save(user);
        return  user.getUserName();

    }

    @Override
    public LoginMessage loginUser(LoginDto loginDto) {

        String msg = "";
        User user = userRepo.findByUserName(loginDto.getUserName());
        if(user != null){
            String password = loginDto.getPassword();
            String encodedPassword = user.getPassword();
            Boolean isPasswordRight = passwordEncoder.matches(password,encodedPassword);

            if(isPasswordRight){
                Optional<User> user1 = userRepo.findOneByUserNameAndPassword(loginDto.getUserName(),encodedPassword);

                if(user1.isPresent()){
                    return new LoginMessage("Login Success",true);
                }else {
                    return new LoginMessage("Login Failed",false);
                }
            }
            else{
                return new LoginMessage("Password Not Match",false);
            }
        }
        else {
            return new LoginMessage("User Name not exists",false);
        }

    }
}
