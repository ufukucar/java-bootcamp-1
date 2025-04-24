package com.ufukucar.service;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;
import com.ufukucar.repository.AccountRepository;

public class CheckingService {

    AccountRepository accountRepository;


    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Checking account) {

        this.accountRepository.createAccount(account);
    }

    public Account retrieveAccount(String id) {
        return (Checking) this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Checking account) {

        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {

        this.accountRepository.deleteAccount(id);
    }





}
