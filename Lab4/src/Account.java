public class Account {
    private int id;
    private String holder;
    private double amount;

    public Account(int id, String holder, double amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() { return id; }

    public String getHolder() {
        return holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setAmount(double amount) { this.amount = amount; }
}
