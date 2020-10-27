public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    // constructor
    public BankAccount(int id, String pw) {
        balance = 0;
        accountID = id;
        password = pw;
    }
    
    // get methods for balance and account ID
    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return accountID;
    }

    // set method for password
    public void setPassword(String newPass) {
        password = newPass;
    }

    public String forgotPassword() {    // for testing setPassword()
        return password;
    }

    // withdraw and deposit methods
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        } else {
            if (amount*1000 % 10 != 0) { // checks if the value is to the nearest cent
                return false;
            }
            balance += amount;
            return true;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || balance - amount < 0) {
            return false;
        } else {
            if (amount*1000 % 10 != 0) { // checks if the value is to the nearest cent
                return false;
            }
            balance -= amount;
            return true;
        }
    }
}
