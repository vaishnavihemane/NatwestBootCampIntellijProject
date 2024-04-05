package com.natwest.controller;


import com.natwest.service.BankingProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class TransactionController {


    @Autowired
    BankingProviderImpl bankingProvider;




}
