import exceptions.NotEnoughMoneyException;
import exceptions.UnknownAccountException;

import java.io.IOException;

public interface AccountService {
    void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException;

    void balance(int accountId) throws UnknownAccountException, IOException;

    void deposit(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException;

    void transfer(int from, int to, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException;
}
