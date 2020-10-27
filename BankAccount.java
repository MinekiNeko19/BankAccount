public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    //constructor
    public BankAccount(int id, String pw) {
        balance = 0;
        accountID = id;
        password = pw;
    }
    
    //get methods for balance and account ID
    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return accountID;
    }
}
