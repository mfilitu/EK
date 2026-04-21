public class BankAccount implements Withdrawable, Depositable{
    private double balance;

    public BankAccount(){
        this.balance = 0;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
