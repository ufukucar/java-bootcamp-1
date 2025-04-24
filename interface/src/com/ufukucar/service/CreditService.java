package com.ufukucar.service;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;
import com.ufukucar.pojo.Credit;
import com.ufukucar.repository.AccountRepository;

import java.math.BigDecimal;

public class CreditService implements AccountService {

    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit account = (Credit) retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(amount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {

        Credit account = (Credit) retrieveAccount(id);
        account.setCredit(account.getCredit().add(amount));
        updateAccount(account);

    }

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
