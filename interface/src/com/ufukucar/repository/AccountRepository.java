package com.ufukucar.repository;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {

        this.datastore.put(account.getId(), account.clone());

    }

    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    public void updateAccount(Account account) {

        this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {

        this.datastore.remove(id);
    }

}