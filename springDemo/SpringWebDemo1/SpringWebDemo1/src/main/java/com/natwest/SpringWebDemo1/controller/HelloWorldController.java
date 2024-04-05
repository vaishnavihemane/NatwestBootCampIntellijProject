package com.natwest.SpringWebDemo1.controller;


import com.natwest.SpringWebDemo1.modal.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v2")
public class HelloWorldController {


    ArrayList<Account> accounts = new ArrayList<>();


    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
        accounts.add(account);
        return account;
    }


    @GetMapping("/account")
    public List<Account> getAllAccount(){
        return accounts;
    }



}
