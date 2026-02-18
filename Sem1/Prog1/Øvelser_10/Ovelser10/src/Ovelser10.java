import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Ovelser10 {
    public static void main(String[] args) {
        //opgave 1
        //arraysMethods();

        //opgave 2
        //average();

        //opgave 3
        //pizza();

        //opgave 4
        String text = """
                Der var engang en fattig Prinds;
                han havde et Kongerige, der var
                ganske lille, men det var da altid
                stort nok til at gifte sig paa,
                og gifte sig det vilde han.
                """;
        //System.out.println(fairytale(text, 'h'));

        //opgave 5
        //fairytaleAgain(text);

        //opgave 6
        int[] arr = {-1,1,1,1,6,6,1,-2,3,3,3,9};
        //System.out.println(arrayMax(arr));
        //System.out.println(arrayMin(arr));

    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void fairytaleAgain(String text) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int[] counts = new int[alphabet.length];

        for (char c : text.toLowerCase().toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if (c == alphabet[i]) {
                    counts[i]++;
                }
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + ": " + counts[i]);
        }
    }

    public static int fairytale(String text, char target) {
        int count = 0;
        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void pizza() {
        String[] bund = {"tynd", "deeppan", "fuldkorns", "glutenfri"};
        String[] fyld = {"ost", "pepperoni", "ananas", "champignon", "skinke", "peberfrugt", "løg", "oliven", "kebab", "artiskok", "rucola", "parmaskinke", "mozzarella", "jalapenos", "chorizo"};
        String[] sovs = {"tomat", "creme fraiche", "pesto", "mascarpone"};

        Random random = new Random();

        System.out.printf("Din pizza har\n- %s bund\n- %s-sovs\n- %s, %s, %s som fyld\nVelbekomme!", bund[random.nextInt(bund.length)], sovs[random.nextInt(bund.length)], fyld[random.nextInt(bund.length)], fyld[random.nextInt(bund.length)], fyld[random.nextInt(bund.length)]);
    }

    public static void average() {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Summen er: " + sum);
        System.out.println("Gennemsnittet er: " + average);
    }

    public static void arraysMethods() {
        String[] royalNames = {"Gorm", "Harald", "Svend", "Knud", "Valdemar", "Christian", "Frederik", "Margrethe", "Erik", "Oluf"};
        System.out.println(Arrays.toString(royalNames));
        Arrays.sort(royalNames);

        String[] newArray = Arrays.copyOf(royalNames, royalNames.length);
        System.out.println(Arrays.toString(newArray));
        newArray[0] = "xDD";
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(royalNames));
    }

}
