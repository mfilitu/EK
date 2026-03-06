public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAccountNumer() {
        return accountNumber;
    }

    private void setAccountNumer(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            setBalance(getBalance() - amount);
        }
    }

    public String toString(){
        return String.format("Konto %s: %s kr.", getAccountNumer(), getBalance());
    }
}
