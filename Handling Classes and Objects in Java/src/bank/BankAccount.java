package bank;

/**
 *
 *
 * @author Sebastian Dario Giraldo Rodas
 */

public class BankAccount {
    private int accountNumber;
    protected boolean activated = false;

    //Constructor
    //Create an instance of the BankAccount class

    public BankAccount (int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    //Getters and Setters
    //Are methods to get and change the instantiated values respectively


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return this.activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
