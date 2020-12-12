package exceptions;

public class UnknownAccountException extends Exception{
    private int id;

    public int getId() { return id; }

    public UnknownAccountException(String message, int id) {
        super(message);
        this.id = id;
    }
}
