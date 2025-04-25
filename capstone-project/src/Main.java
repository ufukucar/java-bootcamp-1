import constants.TradeAccountType;
import constants.Transaction;
import pojo.CashAccount;
import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;
import service.TradeAccountService;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        /** PART 1
         CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
         System.out.println("Cash Account Details:");
         System.out.println("ID: " + cashAccount.getId());
         System.out.println("Cash Balance: " + cashAccount.getCashBalance());

         CashAccount clonedCashAccount = (CashAccount) cashAccount.clone();
         System.out.println("Cloned Cash Account Details:");
         System.out.println("ID: " + clonedCashAccount.getId());
         System.out.println("Cash Balance: " + clonedCashAccount.getCashBalance());

         System.out.println();

         MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
         System.out.println("Margin Account Details:");
         System.out.println("ID: " + marginAccount.getId());
         System.out.println("Margin: " + marginAccount.getMargin());

         MarginAccount clonedMarginAccount = (MarginAccount) marginAccount.clone();
         System.out.println("Cloned Margin Account Details:");
         System.out.println("ID: " + clonedMarginAccount.getId());
         System.out.println("Margin: " + clonedMarginAccount.getMargin());

         */


        /* PART 2
        TradeAccountRepository repository = new TradeAccountRepository();

        CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
        repository.createTradeAccount(cashAccount);

        MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
        repository.createTradeAccount(marginAccount);

        TradeAccount retrievedCashAccount = repository.retrieveTradeAccount("C123");
        System.out.println("Retrieved Cash Account ID: " + retrievedCashAccount.getId());
        System.out.println("Cash Balance: " + ((CashAccount) retrievedCashAccount).getCashBalance());

        TradeAccount retrievedMarginAccount = repository.retrieveTradeAccount("M456");
        System.out.println("Retrieved Margin Account ID: " + retrievedMarginAccount.getId());
        System.out.println("Margin: " + ((MarginAccount) retrievedMarginAccount).getMargin());

         */

        /** PART 3
        TradeAccountRepository repository = new TradeAccountRepository();
        CashAccountService cashAccountService = new CashAccountService(repository);
        MarginAccountService marginAccountService = new MarginAccountService(repository);

        // Create CashAccount and MarginAccount objects
        CashAccount cashAccount = new CashAccount("1", BigDecimal.valueOf(1000));
        MarginAccount marginAccount = new MarginAccount("2", BigDecimal.valueOf(2000));

        // Add the accounts to the repository
        cashAccountService.createTradeAccount(cashAccount);
        marginAccountService.createTradeAccount(marginAccount);

        // Deposit and withdraw amounts
        cashAccountService.deposit("1", BigDecimal.valueOf(500));
        cashAccountService.withdraw("1", BigDecimal.valueOf(200));
        marginAccountService.deposit("2", BigDecimal.valueOf(1000));
        marginAccountService.withdraw("2", BigDecimal.valueOf(500));

        // Retrieve and print the updated account balances
        CashAccount updatedCashAccount = (CashAccount) cashAccountService.retrieveTradeAccount("1");
        MarginAccount updatedMarginAccount = (MarginAccount) marginAccountService.retrieveTradeAccount("2");
        System.out.println("Updated CashAccount balance: " + updatedCashAccount.getCashBalance());
        System.out.println("Updated MarginAccount margin: " + updatedMarginAccount.getMargin());

        // Delete the accounts
        cashAccountService.deleteTradeAccount("1");
        marginAccountService.deleteTradeAccount("2");
        */

        // PART 4

        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }



    static Path[] paths = new Path[] {Paths.get("src/data/accounts.txt"), Paths.get("src/data/transactions.txt")};
    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);




    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
                .forEach(line -> {
                    String[] words = line.split(" ");
                    if (words[0].equals(TradeAccountType.CASH.toString())) {
                        cashAccountService.createTradeAccount(new CashAccount(words[1], new BigDecimal(words[2])));
                    } else {
                        marginAccountService.createTradeAccount(new MarginAccount(words[1], new BigDecimal(words[2])));
                    }
                });
    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
                .forEach(line -> {
                    String[] words = line.split(" ");
                    Boolean isCash = words[0].equals(TradeAccountType.CASH.toString());
                    TradeAccountService tradeAccountService = isCash ? cashAccountService : marginAccountService;
                    Transaction transaction = Transaction.valueOf(words[2]);
                    if (transaction.equals(Transaction.DEPOSIT)) {
                        tradeAccountService.deposit(words[1], new BigDecimal(words[3]));
                    } else {
                        tradeAccountService.withdraw(words[1], new BigDecimal(words[3]));
                    }
                });
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + ((CashAccount) cashAccountService.retrieveTradeAccount("A1234B")).getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + ((CashAccount) cashAccountService.retrieveTradeAccount("E3456F")).getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + ((CashAccount) cashAccountService.retrieveTradeAccount("I5678J")).getCashBalance());
        System.out.println("Account C2345D Margin: " + ((MarginAccount) marginAccountService.retrieveTradeAccount("C2345D")).getMargin());
        System.out.println("Account G4567H Margin: " + ((MarginAccount) marginAccountService.retrieveTradeAccount("G4567H")).getMargin());
    }






}

