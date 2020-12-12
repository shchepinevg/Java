import exceptions.NotEnoughMoneyException;
import exceptions.UnknownAccountException;

import java.io.IOException;
import java.util.Scanner;

public class AccountController implements AccountService {
    private final FileHelper context = new FileHelper("C:\\Users\\Asus\\Desktop\\study\\Java\\Lab4\\resources\\accounts.txt");

    public void Start() throws UnknownAccountException, NotEnoughMoneyException, IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("-> ");
            String input = in.nextLine();
            String choice = input.split(" ")[0];

            if (choice.equals("balance")) {
                int id = Integer.parseInt(input.split(" ")[1]);
                balance(id);
            } else if (choice.equals("withdraw")) {
                int id = Integer.parseInt(input.split(" ")[1]);
                double amount = Double.parseDouble(input.split( " ")[2]);
                withdraw(id, amount);
            } else if (choice.equals("deposit")) {
                int id = Integer.parseInt(input.split(" ")[1]);
                double amount = Double.parseDouble(input.split( " ")[2]);
                deposit(id, amount);
            } else if (choice.equals("transfer")) {
                int idFrom = Integer.parseInt(input.split(" ")[1]);
                int idTo = Integer.parseInt(input.split(" ")[2]);
                double amount = Double.parseDouble(input.split( " ")[3]);
                transfer(idFrom, idTo, amount);
            } else if (choice.equals("help"))
                printHelp();
            else if (choice.equals("exit"))
                break;
            else {
                System.out.println("The command does not exist");
            }
        }

        in.close();
    }

    @Override
    public void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        Account account = context.getAccount(accountId);
        double currentAmount = account.getAmount();

        if (currentAmount < amount)
            throw new NotEnoughMoneyException("Not enough money", currentAmount);

        context.updateAmount(accountId, currentAmount - amount);

        System.out.println("The specified amount has been withdrawn from the account");
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException, IOException {
        Account account = context.getAccount(accountId);

        System.out.println(account.getHolder() + "\n" + "Balance: " + account.getAmount());
    }

    @Override
    public void deposit(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        Account account = context.getAccount(accountId);
        double currentAmount = account.getAmount();

        if (currentAmount < amount)
            throw new NotEnoughMoneyException("Not enough money", amount);

        context.updateAmount(accountId, currentAmount + currentAmount);

        System.out.println("The specified amount has been deposited to the account");
    }

    @Override
    public void transfer(int fromId, int toId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        Account accountFrom = context.getAccount(fromId);
        Account accountTo = context.getAccount(toId);
        double currentAmountFrom = accountFrom.getAmount();
        double currentAmountTo = accountTo.getAmount();

        if (currentAmountFrom < amount)
            throw new NotEnoughMoneyException("Not enough money", currentAmountFrom);

        context.updateAmount(fromId, currentAmountFrom - amount);
        context.updateAmount(toId, currentAmountTo + amount);

        System.out.println("The specified amount has been transferred");
    }

    private void printHelp() {
        System.out.println("Print the balance: balance [id]");
        System.out.println("Withdraw the specified amount: withdraw [id] [amount]");
        System.out.println("Deposit the specified amount: deposit [id] [amount]");
        System.out.println("Transfer the amount from one account to another: transfer [from] [to] [amount]");
        System.out.println("Exit: exit\n");
    }
}
