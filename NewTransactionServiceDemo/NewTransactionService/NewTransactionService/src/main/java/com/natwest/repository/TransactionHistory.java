package com.natwest.repository;

import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionHistory extends JpaRepository<Transaction, String> {

    public List<Transaction> findByAccount(Account userAccount);
}
