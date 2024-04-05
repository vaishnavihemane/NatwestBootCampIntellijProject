package com.natwest.service;

import com.natwest.dto.AccountDto;
import com.natwest.entity.Account;
import com.natwest.exception.IdNotFoundException;
import com.natwest.exception.InvalidAmountException;
import com.natwest.repository.AccountRepository;
import com.natwest.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) throws InvalidAmountException {
        if(account.getBalance()<1000){
            throw new InvalidAmountException(AppConstant.INVALID_AMOUNT_MESSAGE);
        }

        return accountRepository.save(account);
    }


    @Override
    public List<Account> getAllAccounts() {

        System.out.println(accountRepository);
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(int id) throws IdNotFoundException {

        return accountRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE));
    }

    @Override
    public String deletedById(int id) throws IdNotFoundException {

        if(!accountRepository.existsById(id))
        {
            throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
        }

        accountRepository.deleteById(id);

        return AppConstant.DELETED_MESSAGE;

    }

    @Override
    public List<Account> getAccountsByAccountType(String name) {
        return accountRepository.findByAccountType(name);


    }



    @Override
    public Account updateAccount(int id, Account account) throws IdNotFoundException{

        if(!accountRepository.existsById(id)){
            throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
        }
        return accountRepository.save(account);
    }

    @Override
    public AccountDto getAccountById2(int id) {

        Account account = accountRepository.findById(id).get();
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountId(account.getAccountId());
        accountDto.setAccountHolderName(account.getAccountHolderName());
        accountDto.setAccountType(account.getAccountType());
        return accountDto;
    }


}
