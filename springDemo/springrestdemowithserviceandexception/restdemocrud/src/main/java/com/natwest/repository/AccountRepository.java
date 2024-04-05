package com.natwest.repository;

import com.natwest.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

    public List<Account> findByAccountType(String name);
}
