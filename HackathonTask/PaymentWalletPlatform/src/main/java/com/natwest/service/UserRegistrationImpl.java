package com.natwest.service;

import com.natwest.dto.UserDTO;
import com.natwest.entity.User;
import com.natwest.exception.InvalidEmailIdException;
import com.natwest.exception.InvalidMobileNumberException;
import com.natwest.exception.InvalidPasswordException;
import com.natwest.exception.InvalidUserNameException;
import com.natwest.repository.UserRepo;
import com.natwest.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserRegistrationImpl implements Registration{

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO registerUser(User user) throws InvalidEmailIdException, InvalidMobileNumberException, InvalidUserNameException, InvalidPasswordException {


        if(!user.getEmailId().endsWith(".com") || !user.getEmailId().contains("@")){
          throw new InvalidEmailIdException(AppConstant.INVALID_EMAIL_ID_MESSAGE);
        }

        if((user.getMoileNo().length()!=10)){
           throw new InvalidMobileNumberException(AppConstant.INVALID_MOBILE_NUMBER_MESSAGE);
        }

        if((user.getName().isEmpty()) || (user.getName()==null)){
          throw new InvalidUserNameException(AppConstant.INVALID_USER_NAME_MESSAGE);
        }

        if( user.getPassword().isEmpty() || user.getPassword()==null ){
           throw new InvalidPasswordException(AppConstant.INVALID_PASSWORD_MESSAGE);
        }

        userRepo.save(user);

        return new UserDTO(user.getEmailId(), user.getName(),user.getAddress(),user.getAccountNo(),user.getMoileNo());

    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }


}
