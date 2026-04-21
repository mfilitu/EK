public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
        ChildrensAccount childrensaccount = new ChildrensAccount();

        transfer(account, account2, 200);
        transfer(account, childrensaccount, 200);
    }

    public static void transfer(Withdrawable fromAccount, Depositable toAccount, double amount){
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
