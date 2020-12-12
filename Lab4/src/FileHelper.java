import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import exceptions.UnknownAccountException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHelper {
    private String path;

    public FileHelper(String path) {
        try {
            this.path = path;
            File file = new File(path);
            if (!file.isFile()) {
                file.createNewFile();
                ArrayList<Account> accounts = new ArrayList<Account>();
                accounts.add(new Account(1, "Иванов Иван Иванович", 10000.0));
                accounts.add(new Account(2, "Петров Петр Петрович", 20000.0));
                accounts.add(new Account(3, "Сидоров Петр Иванович", 30000.0));
                accounts.add(new Account(4, "Зыков Владислав Дмитриевич", 400000.0));
                accounts.add(new Account(5, "Петров Михаил Алексеевич", 50000.0));
                accounts.add(new Account(6, "Прохоров Сергей Евгеньевич", 60000.0));
                accounts.add(new Account(7, "Ермаков Илья Игоревич", 70000.0));
                accounts.add(new Account(8, "Белых Андрей Сергеевич", 80000.0));
                accounts.add(new Account(9, "Вантеев Никита Андреевич", 90000.0));
                accounts.add(new Account(10, "Сибиряков Константин Сергеевич", 100000.0));

                FileWriter writer = new FileWriter(path, false);
                for (Account account : accounts)
                    writer.write(account.getId() + ";" + account.getHolder() + ";" + account.getAmount() + "\n");

                writer.flush();
            }
        } catch (IOException ex) {
            System.out.println("An error has occurred: " + ex.getMessage());
        }
    }

    public Account getAccount(int id) throws UnknownAccountException, IOException {
        String text = new String(Files.readAllBytes(Paths.get(path)));
        String[] data = text.split("\n");
        Account result = null;

        for (String account : data) {
            int currentId = Integer.parseInt(account.split(";")[0]);
            if (currentId == id) {
                String holder = account.split(";")[1];
                double amount = Double.parseDouble(account.split(";")[2]);
                result = new Account(id, holder, amount);
                break;
            }
        }

        if (result == null)
            throw new UnknownAccountException("Unknown account", id);

        return result;
    }

    public void updateAmount(int id, double amount) throws UnknownAccountException, IOException {
        String text = new String(Files.readAllBytes(Paths.get(path)));
        String[] data = text.split("\n");
        ArrayList<Account> accounts = new ArrayList<Account>();
        Account currentAccount = null;

        for (String account : data) {
            int currentId = Integer.parseInt(account.split(";")[0]);
            String currentHolder = account.split(";")[1];
            double currentAmount = Double.parseDouble(account.split(";")[2]);
            accounts.add(new Account(currentId, currentHolder, currentAmount));
            if (currentId == id)
                currentAccount = new Account(currentId, currentHolder, currentAmount);
        }

        if (currentAccount == null)
            throw new UnknownAccountException("Unknown account", id);

        FileWriter writer = new FileWriter(path, false);

        for (Account account : accounts) {
            if (account.getId() == id) {
                account.setAmount(amount);
            }
            writer.write(account.getId() + ";" + account.getHolder() + ";" + account.getAmount() + "\n");
        }

        writer.flush();
    }
}