package exceptions;

public class NotEnoughMoneyException extends Exception {
    private double amount;

    public double getAmount() { return amount; }

    public NotEnoughMoneyException(String message, double amount) {
        super(message);
        this.amount = amount;
    }
}
