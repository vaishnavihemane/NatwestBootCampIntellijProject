package com.natwest.repositories;

import com.natwest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {



    Optional<User> findOneByUserNameAndPassword(String userName,String password);

     User findByUserName(String userName);
}
