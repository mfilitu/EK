public class Main {
    public static void main(String[] args) {
        Bmi mateusz = new Bmi(85, 1.8);
        System.out.println(mateusz.calculate());

        System.out.println(mateusz.isUnderWeight());
        System.out.println(mateusz.isNormalWeight());
        System.out.println(mateusz.isOverweight());
    }
}
