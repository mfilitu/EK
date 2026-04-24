import java.lang.reflect.Array;
import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //sortingStuff();

        // CompareTo
        Student mateusz = new Student("Mateusz", "Filipowski");
        Student anna = new Student("Anna", "Banana");
        Student bo = new Student("Bo", "Dil");

        System.out.println(mateusz.compareTo(mateusz)); // 0 fordi samme fullname
        System.out.println(mateusz.compareTo(anna)); // + fordi anna før mateusz
        System.out.println(anna.compareTo(mateusz)); // - fordi anna før mateusz
        System.out.println(bo.compareTo(anna)); // + fordi bo skal være efter anna

        ArrayList<Student> students = new ArrayList<>();
        students.add(mateusz);
        students.add(anna);
        students.add(bo);

        Collections.sort(students, new LastNameComparator());

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFullName());
        }

    }

    private static void sortingStuff() {
        int[] intArr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        char[] charArr = {'f', 'd', 'a', 'ø', 'p', 'g'};

        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(charArr);
        System.out.println(charArr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);

        Collections.sort(list);

        printList(list);

        // Sorting text after language (could also be Svedish "sv-SE")
        String[] letters = {"Ø", "Å", "Æ", "C", "B", "A"};
        Collator danishCollator = Collator.getInstance(Locale.forLanguageTag("da-DK"));

        Arrays.sort(letters, danishCollator);
        System.out.println(Arrays.toString(letters));
    }

    private static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
