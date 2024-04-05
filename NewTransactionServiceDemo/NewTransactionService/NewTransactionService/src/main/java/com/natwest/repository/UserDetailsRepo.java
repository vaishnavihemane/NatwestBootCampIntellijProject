package com.natwest.repository;

import com.natwest.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<Account,Integer> {

    public Account findByMobileNo(String uniqueUserId);
    public Account findByAccountNo(String uniqueUserId);

    public Account findByEmailId(String emailId);

}
