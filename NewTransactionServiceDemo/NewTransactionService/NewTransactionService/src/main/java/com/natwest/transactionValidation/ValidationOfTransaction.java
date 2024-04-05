package com.natwest.transactionValidation;

import com.natwest.entity.Account;
import com.natwest.entity.Transaction;

import com.natwest.exception.TransactionLimitOfMoneyExceedException;
import com.natwest.repository.UserDetailsRepo;
import com.natwest.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ValidationOfTransaction {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public boolean checkTransactionIsValid(String sourceUserEmailId,BigDecimal transferAmount) throws TransactionLimitOfMoneyExceedException {

        // List of all transaction
        List<Transaction> todayTransactionList = userDetailsRepo.findByEmailId(sourceUserEmailId).getTransactions();

        BigDecimal totalMoneyOfTodayTransaction = transferAmount;

        // Calculate total amount of today transactions
        for (Transaction transaction : todayTransactionList) {

            int count = transaction.getDateTime().toLocalDate().compareTo(LocalDate.now());

            if((count == 0) && (transaction.getType().equals("Debit")))
            {
                totalMoneyOfTodayTransaction = totalMoneyOfTodayTransaction.add(transaction.getAmount());
            }

        }

        System.out.println("Total money of Today transactions: " + totalMoneyOfTodayTransaction);

      // Compare total amount with a predefined limit

        if (totalMoneyOfTodayTransaction.compareTo(AppConstant.TRANSACTION_LIMIT_FOR_TODAY) <= 0) {
            return true;
        } else {
            throw new TransactionLimitOfMoneyExceedException(AppConstant.TRANSACTION_LIMIT_OF_MONEY_FOR_TODAY_EXCEEDED_MESSAGE);
        }

    }






}
