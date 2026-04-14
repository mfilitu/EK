public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance){
            throw new InsufficientFundsException("Can not overdraw!");
        }
        setBalance(balance - amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            throw new InsufficientFundsException("Balance can not be negative!");
        }
        this.balance = balance;
    }
}