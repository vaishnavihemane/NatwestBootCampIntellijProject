package com.natwest.TransactionPerformation;

import com.natwest.entity.Account;
import com.natwest.exception.InsufficientBalanceException;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MakePayment {

    public boolean payment(Account sourceAccount, Account targetAccount, BigDecimal transferAmount) throws InsufficientBalanceException {
        return true;
    }

}
