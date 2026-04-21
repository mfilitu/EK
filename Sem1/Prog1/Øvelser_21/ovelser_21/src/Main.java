public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 0.1);
        SavingsAccount savings2 = new SavingsAccount(1000, 0.1);

        ChildrensAccount childrens = new ChildrensAccount(1000);


        // transfer(childrens, savings, 200); Fejler good!
        System.out.println("Before:\n");
        System.out.println("From: " + savings.getBalance());
        System.out.println("To: " + childrens.getBalance());
        transfer(savings, childrens, 200);
        System.out.println("\nAfter:\n");
        System.out.println("From: " + savings.getBalance());
        System.out.println("To: " + childrens.getBalance());
    }

    public static void transfer(Withdrawable from, Depositable to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
