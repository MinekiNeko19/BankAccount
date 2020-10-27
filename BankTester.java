public class BankTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0, "hackMe");
        // System.out.println(account1.getBalance());
        // System.out.println(account1.getAccount());

        // System.out.println(account1.forgotPassword());
        // account1.setPassword("crabs");
        // System.out.println(account1.forgotPassword());

        // System.out.println(account1.deposit(-10));
        // System.out.println(account1.getBalance());
        // System.out.println(account1.deposit(10.23));
        // System.out.println(account1.deposit(20.22343));
        // System.out.println(account1.getBalance());
        // System.out.println(account1.deposit(13));
        // System.out.println(account1.getBalance());
        
        System.out.println(account1.deposit(100));
        System.out.println(account1.withdraw(-10));
        System.out.println(account1.getBalance());
        System.out.println(account1.withdraw(10.50));
        System.out.println(account1.getBalance());
        System.out.println(account1.withdraw(23424));
        System.out.println(account1.getBalance());
        System.out.println(account1.withdraw(23.234124312));
        System.out.println(account1.getBalance());
    }
}
