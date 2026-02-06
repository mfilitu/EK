public class Co2Udledning {
    public static void main(String[] args) {
        System.out.printf("%.3f", co2(2));
    }

    public static double co2(int år) {
        double co2PrÅr = 6.7 * år;
        double rumfandPrTon = 1.96;

        double sideAfKasse = co2PrÅr * rumfandPrTon;
        return Math.cbrt(sideAfKasse); //cube root
    }
}
