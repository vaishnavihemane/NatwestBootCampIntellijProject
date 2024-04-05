import com.natwest.model.Account;
import com.natwest.service.AccountService;
import com.natwest.service.AccountServiceImpl;

public class Main {
    public static void main(String[] args) {

        AccountServiceImpl accountserviceimpl = new AccountServiceImpl();

        Account account = new Account(12345,10000,"SavingAccount");

        System.out.println(accountserviceimpl.deposit(600,account));
        System.out.println(accountserviceimpl.withdraw(500,account));
    }
}