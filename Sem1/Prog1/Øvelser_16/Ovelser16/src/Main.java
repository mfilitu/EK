import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //opg1
        //opg1();

        //opg2
        //opg2();

        opg3();
    }

    public static void opg3() {
        ChildrensSavingsAccount kid = new ChildrensSavingsAccount(0, 123, 0.05, "1502107137");
        System.out.println(kid);
        kid.deposit(1000);
        System.out.println(kid);
        kid.applyInterest();
        System.out.println(kid);
        kid.withdraw(200);
        System.out.println(kid);

        ChildrensSavingsAccount adult = new ChildrensSavingsAccount(0, 321, 0.05, "1502007137");
        System.out.println(adult);
        adult.deposit(1000);
        System.out.println(adult);
        adult.applyInterest();
        System.out.println(adult);
        adult.withdraw(200); // virker
        System.out.println(adult);
    }

    public static void opg1() {
        BankAccount ba = new BankAccount(0, 3267);
        System.out.println(ba); // Konto 3267: 0.0 kr.
        ba.deposit(500);
        System.out.println(ba); // Konto 3267: 500.0 kr.
        ba.withdraw(700);
        System.out.println(ba); // Konto 3267: -200.0 kr.
    }

    public static void opg2() {
        SavingsAccount sa = new SavingsAccount(0, 3267, 0.05);
        System.out.println(sa);
        sa.deposit(1000);
        System.out.println(sa);
        sa.applyInterest();
        System.out.println(sa);
        sa.withdraw(200);
        System.out.println(sa);

    }

}
