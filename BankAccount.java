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

    public int getAccountID() {
        return accountID;
    }

    // set method for password
    public void setPassword(String newPass) {
        password = newPass;
    }

    // public String forgotPassword() {    // for testing setPassword()
    //     return password;
    // }

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

    // toString method  // automatically called when a string is needed
    public String toString() {
        return "ACCOUNT: #" + accountID + "\tBALANCE: $" + balance;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        if (authenticate(password) && this.withdraw(amount) && other.deposit(amount)) {
            return true;
        } else {
            return false;
        }
    }
}
