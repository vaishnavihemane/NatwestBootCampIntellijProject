package com.natwest.authentication;

import com.natwest.entity.Account;
import com.natwest.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountInfoByType {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public  Account getAccountInfoByType(String transferTypeForPayment, String targetTransferId ){

        Account account = null;
        switch (transferTypeForPayment){

            case "mobileNo" -> {
              account = userDetailsRepo.findByMobileNo(targetTransferId);
            }

            case "accountNo" -> {
                account = userDetailsRepo.findByAccountNo(targetTransferId);
            }
        }

        System.out.println(account);
        return account;
    }
}
