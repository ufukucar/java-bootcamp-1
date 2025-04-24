import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.ufukucar.pojo.Account;
import com.ufukucar.pojo.Checking;
import com.ufukucar.pojo.Credit;
import com.ufukucar.repository.AccountRepository;
import com.ufukucar.service.AccountService;
import com.ufukucar.service.CheckingService;
import com.ufukucar.service.CreditService;

public class Main {


    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();

        Checking checking = (Checking) repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);
        repository.deleteAccount("G4567H");


        AccountService creditService = new CreditService(repository);
        creditService.deposit("1", new BigDecimal("100"));
        creditService.withdraw("1", new BigDecimal("50"));




    }
}