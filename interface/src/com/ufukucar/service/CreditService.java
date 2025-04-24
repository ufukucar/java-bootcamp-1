package com.ufukucar.service;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;
import com.ufukucar.pojo.Credit;
import com.ufukucar.repository.AccountRepository;

public class CreditService {


    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



    public void createAccount(Credit account) {

        this.accountRepository.createAccount(account);
    }

    public Account retrieveAccount(String id) {
        return (Credit) this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Credit account) {

        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {

        this.accountRepository.deleteAccount(id);
    }







}
