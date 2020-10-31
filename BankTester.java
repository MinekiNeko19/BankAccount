public class BankTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0, "hackMe");
        BankAccount account2 = new BankAccount(1, "octopus");
        System.out.println(account1.deposit(1000));

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
        
        // System.out.println(account1.deposit(100));
        // System.out.println(account1.withdraw(-10));
        // System.out.println(account1.getBalance());
        // System.out.println(account1.withdraw(10.50));
        // System.out.println(account1.getBalance());
        // System.out.println(account1.withdraw(23424));
        // System.out.println(account1.getBalance());
        // System.out.println(account1.withdraw(23.234124312));
        // System.out.println(account1.getBalance());

        // System.out.println(account1.toString());

        // System.out.println(account1.authenticate("hackMe")); // temporarily a public method
        System.out.println(account2.transferTo(account1, 50, "toad"));
        System.out.println(account2.transferTo(account1, 50, "octopus"));
        System.out.println(account1.transferTo(account2, 50, "toad"));
        System.out.println(account1.transferTo(account2, 50, "hackMe"));
    }
}
