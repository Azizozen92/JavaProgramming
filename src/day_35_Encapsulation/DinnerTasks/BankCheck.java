package day_35_Encapsulation.DinnerTasks;

public class BankCheck {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Aziz",1222345554,500000);
        bank1.checkBalance();
        bank1.withdraw(10000);
        bank1.deposit(5000);
        bank1.withdraw(10000000);
    }
}
