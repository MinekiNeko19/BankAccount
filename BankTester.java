public class BankTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0, "hackMe");
        // System.out.println(account1.getBalance());
        // System.out.println(account1.getAccount());

        System.out.println(account1.forgotPassword());
        account1.setPassword("crabs");
        System.out.println(account1.forgotPassword());
    }
}
