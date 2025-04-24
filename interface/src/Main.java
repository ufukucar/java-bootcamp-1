import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;
import com.ufukucar.pojo.Credit;
import com.ufukucar.repository.AccountRepository;
import com.ufukucar.service.CheckingService;
import com.ufukucar.service.CreditService;

public class Main {


    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();

        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E3456F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1534B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {

            if ( account instanceof Checking ) {
                checkingService.createAccount((Checking) account);
            }

            else {
                creditService.createAccount((Credit) account);
            }

        });

        System.out.println();

        Checking checking = (Checking) repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);
        repository.deleteAccount("G4567H");






    }
}