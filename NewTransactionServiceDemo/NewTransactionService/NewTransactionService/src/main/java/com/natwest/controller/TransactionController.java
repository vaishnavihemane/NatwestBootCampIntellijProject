package com.natwest.controller;


import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import com.natwest.exception.*;
import com.natwest.repository.TransactionHistory;
import com.natwest.service.MoneyTransferProvider;
import com.natwest.service.TransactionManagementImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private MoneyTransferProvider moneyTransferProvider;

    @Autowired
    private TransactionManagementImpl transactionManagement;

    @PostMapping("/register")
    public ResponseEntity<Account> add(@RequestBody Account userAccount) {
        return new ResponseEntity<>(moneyTransferProvider.registerUser(userAccount), HttpStatus.OK);
    }


    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts() {
        return new ResponseEntity<>(moneyTransferProvider.getAllAccounts(), HttpStatus.OK);
    }


    @GetMapping("/transfer/{sourceUserEmailId}/{transferTypeForPayment}/{targetUserTransferId}/{transferAmount}")
    public ResponseEntity<Transaction> transferMoneyForPayment(@PathVariable String sourceUserEmailId,@PathVariable String transferTypeForPayment, @PathVariable String targetUserTransferId, @PathVariable BigDecimal transferAmount) throws OTPTimeExpiredException, InsufficientBalanceException, MissedAllAttemptOfOTPValidation, TransactionFailedException, TransactionLimitOfMoneyExceedException {
        return new ResponseEntity<>(moneyTransferProvider.transferMoney(sourceUserEmailId,transferTypeForPayment, targetUserTransferId, transferAmount), HttpStatus.OK);
    }

    @GetMapping("/transaction")
    public ResponseEntity<Optional<Transaction>> getTransactionById(String transactionId){
        return new ResponseEntity<>(transactionManagement.getTransactionById(transactionId),HttpStatus.OK);
    }

    @GetMapping("/transactionhistory")
    public ResponseEntity<List<Transaction>> getAllTransactions(String userEmailId){
        return new ResponseEntity<>(transactionManagement.getAllTransactions(userEmailId), HttpStatus.OK);
    }




}
