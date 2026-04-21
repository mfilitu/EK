public class ChildrensAccount extends BankAccount implements Depositable, InterestBearing {
    private double interestRate;

    public ChildrensAccount(double balance) {
        super(balance);
        this.interestRate = 0.01; // 1% rente
    }

    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

}