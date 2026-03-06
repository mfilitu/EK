public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, int accountNumber, double intrestRate){
        super(balance, accountNumber);
        this.interestRate = intrestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}
