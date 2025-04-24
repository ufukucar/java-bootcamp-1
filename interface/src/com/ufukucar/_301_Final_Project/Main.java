package com.ufukucar._301_Final_Project;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.ufukucar.constants.AccountType;
import com.ufukucar.constants.Transaction;
import com.ufukucar.pojo.Checking;
import com.ufukucar.pojo.Credit;
import com.ufukucar.repository.AccountRepository;
import com.ufukucar.service.AccountService;
import com.ufukucar.service.CheckingService;
import com.ufukucar.service.CreditService;

public class Main {

    static Path[] paths = new Path[] {Paths.get("src/com/ufukucar/_301_Final_Project/data/accounts.txt"), Paths.get("src/com/ufukucar/_301_Final_Project/data/transactions.txt")};
    static AccountRepository accountRepository = new AccountRepository();
    static CheckingService checkingService = new CheckingService(accountRepository);
    static CreditService creditService = new CreditService(accountRepository);

    public static void main(String[] args) {
        try {
            loadAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadAccounts() throws IOException {
        Files.lines(paths[0])
                .forEach(line -> {
                    String[] words = line.split(" ");
                    if (words[0].equals(AccountType.CHECKING.toString())) {
                        checkingService.createAccount(new Checking(words[1], new BigDecimal(words[2])));
                    } else {
                        creditService.createAccount(new Credit(words[1], new BigDecimal(words[2])));
                    }
                });
    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
                .forEach(line -> {
                    String[] words = line.split(" ");
                    Boolean isChecking = words[0].equals(AccountType.CHECKING.toString());
                    AccountService accountService = isChecking ? checkingService : creditService;
                    Transaction transaction = Transaction.valueOf(words[2]);
                    if (transaction.equals(Transaction.DEPOSIT)) {
                        accountService.deposit(words[1], new BigDecimal(words[3]));
                    } else {
                        accountService.withdraw(words[1], new BigDecimal(words[3]));
                    }
                });
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Balance: " + ((Checking) checkingService.retrieveAccount("A1234B")).getBalance());
        System.out.println("Account E3456F Balance: " + ((Checking) checkingService.retrieveAccount("E3456F")).getBalance());
        System.out.println("Account I5678J Balance: " + ((Checking) checkingService.retrieveAccount("I5678J")).getBalance());
        System.out.println("Account C2345D Credit: " + ((Credit) creditService.retrieveAccount("C2345D")).getCredit());
        System.out.println("Account G4567H Credit: " + ((Credit) creditService.retrieveAccount("G4567H")).getCredit());
    }

}