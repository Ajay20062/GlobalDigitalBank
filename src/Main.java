public class Main {

    public static void main(String[] args) {

        // Create Account Object
        Account account1 =new Account("A001","Ajay",10000.00);

        // Display Account Details
        account1.displayAccount();

        // Deposit Amount
        account1.deposit(5000);

        System.out.println("\nAfter Deposit");
        System.out.println("Balance = ₹" +
                account1.getBalance());

        // Withdraw Amount
        account1.withdraw(3000);

        System.out.println("\nAfter Withdrawal");
        System.out.println("Balance = ₹" +
                account1.getBalance());

        // Final Details
        account1.displayAccount();
    }
}
