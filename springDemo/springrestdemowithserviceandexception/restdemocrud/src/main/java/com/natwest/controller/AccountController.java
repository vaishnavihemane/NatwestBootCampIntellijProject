package com.natwest.controller;

import com.natwest.dto.AccountDto;
import com.natwest.entity.Account;
import com.natwest.exception.IdNotFoundException;
import com.natwest.exception.InvalidAmountException;
import com.natwest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) throws InvalidAmountException {
         return new ResponseEntity<>(accountService.addAccount(account), HttpStatus.OK);
    }


    @GetMapping("/account")
    public ResponseEntity<List<Account>> getAllAccounts(){
        return new ResponseEntity<>(accountService.getAllAccounts(), HttpStatus.OK);
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable int id) throws IdNotFoundException {
        return new ResponseEntity<>(accountService.getAccountById(id),HttpStatus.OK);
    }



    @GetMapping("/accountdto/{id}")
    public ResponseEntity<AccountDto> getAccountDtoById(@PathVariable int id)
    {
        return new ResponseEntity<>(accountService.getAccountById2(id), HttpStatus.OK);
    }






}
