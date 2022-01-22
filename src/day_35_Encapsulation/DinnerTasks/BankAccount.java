package day_35_Encapsulation.DinnerTasks;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.err.println("Deposit cannot be negative or 0");
            return;
        }
        balance += amount;
        System.out.println("balance = " + balance);
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.err.println("Withdraw cannot be more than balance");
            return;
        }
        balance -=amount;
        System.out.println(balance);
    }
    public void checkBalance(){
        System.out.println(balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
