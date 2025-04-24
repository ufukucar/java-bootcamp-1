package com.ufukucar._301_Final_Project.service;


import java.math.BigDecimal;

public interface AccountService {

    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);

}