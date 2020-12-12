import exceptions.NotEnoughMoneyException;
import exceptions.UnknownAccountException;

public class Main {

    public static void main(String[] args) {
	    try {
	        AccountController accountController = new AccountController();
	        accountController.Start();
        } catch (UnknownAccountException ex) {
	        System.out.println("An error has occurred: " + ex.getMessage() + "," + " id = " + ex.getId());
        } catch (NotEnoughMoneyException ex) {
	        System.out.println("An error has occurred: " + ex.getMessage() + "," + " amount = " + ex.getAmount());
        } catch (Exception ex) {
	        System.out.println("An error has occurred: " + ex.getMessage());
        }
    }
}
