public class CheckingAccount extends BankAccount implements Depositable, Withdrawable{
    public CheckingAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}