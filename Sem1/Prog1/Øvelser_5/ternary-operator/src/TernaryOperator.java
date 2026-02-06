public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(applyDiscount(100.00, false));
        System.out.println(applyDiscount(100.00, true));

    }

    public static double applyDiscount(double price, boolean isMember) {

        return (isMember) ? price * 0.9 : price;
    }
}
