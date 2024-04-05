package com.natwest.controller;

import com.natwest.entity.Account;
import com.natwest.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {


    @Autowired
    AccountRepository accountRepository;

    @PostMapping("/account")
    public Account createNewAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }



    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }


    @GetMapping("/account/{id}")
    public Account getAccountById(@PathVariable int id){
        return accountRepository.findById(id).get();
    }


    @PutMapping("account/{id}")
    public Account updateAccount(@RequestBody Account account, @PathVariable int id){

        if(!accountRepository.existsById(id))
            System.out.println("no id present");

        return accountRepository.save(account);
    }


    @DeleteMapping("account/{id}")
    public Account deleteAcccount(@PathVariable int id){


        Account account = getAccountById(id);

        if(accountRepository.existsById(id)){

            accountRepository.deleteById(id);
            System.out.println("Successfully deleted");
        }
        else {
            System.out.println("Id does not exist");
        }

        return account;


    }


}
