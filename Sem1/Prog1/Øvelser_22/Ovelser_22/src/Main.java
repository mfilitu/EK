import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Zoe", "Asraf", "Mia",
                "Kevin", "Lina", "Alva",
                "Ahmed", "Muhammed", "Åge",
                "Øyvind", "Emil", "Sofie"));

        Collator danishCollator = Collator.getInstance(
                Locale.forLanguageTag("da-DK"));
        Collections.sort(names, danishCollator);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }

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

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFullName());
        }

    }
}
