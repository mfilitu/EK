import java.util.Random;

public class array {
    public static void main(String[] args) {
        int[] scores = randomArray(100);

        int[] counts = new int[100];

        for (int score : scores) {
            counts[score]++;
        }

        printArray(counts);

    }

    public static int[] randomArray(int size) {
        Random random = new Random(60);
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.println(a[i]);
        }
        return a;
    }

    public static void printArray(int[] a) {
        System.out.print("{" + a[0] + ", ");
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("}");
    }
}