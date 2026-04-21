public class ChildrensAccount implements Depositable{
    private double balance;
    private double interest;

    public ChildrensAccount(){
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
