public class Account {

    // Attributes
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public Account(String accountNumber,String holderName,double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw Method
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // Getter Methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter Methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display Method
    public void displayAccount() {

        System.out.println("\n==============================");
        System.out.println("ACCOUNT DETAILS");
        System.out.println("==============================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("==============================");
    }
}