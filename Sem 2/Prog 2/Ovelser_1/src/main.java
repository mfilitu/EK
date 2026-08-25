import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        //arrayListOpgave();

        //bogOpgave();

        //System.out.println(grass(0, 0.8));

        //square(6, "%");

        //ArrayList vs LinkedList

        addFirstArrayList(1000000);

        addFirstLinkedList(1000000);




    }

    public static LinkedList<Integer> addFirstLinkedList(int n){
        long before = System.nanoTime();
        LinkedList<Integer> linked = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            linked.addFirst(i);
        }
        long after = System.nanoTime();
        long time = after-before;
        System.out.println(time / 1000000.0 + " milli");
        return linked;
    }

    public static ArrayList<Integer> addFirstArrayList(int n){
        long before = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.addFirst(i);
        }
        long after = System.nanoTime();
        long time = after-before;
        System.out.println(time / 1000000.0 + " milli");
        return arrayList;
    }

    public static void square(int size, String character){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(character+"  ");
            }
            System.out.println();
        }
    }

    public static double grass(double currentHeight, double maxHeight) {
        double daysUntillCut;
        double growth = 0.8;

        daysUntillCut = (maxHeight - currentHeight) / growth;

        return daysUntillCut;
    }

    private static void arrayListOpgave() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("test");
        myList.add("test1");
        myList.add("test2");
        myList.add("test3");

        doesArraylistContainString(myList, "Hej");
        doesArraylistContainString(myList, "Hej");
    }

    private static void bogOpgave() {
        Bibliotek bib = new Bibliotek();
        Bog bog1 = new Bog(123, "test", 2000);
        Bog bog2 = new Bog(124, "test1", 2000);
        Bog bog3 = new Bog(125, "test2", 2000);
        bib.addBook(bog1);
        bib.addBook(bog2);
        bib.addBook(bog3);
        Bog bog4 = new Bog(111, "test bog", 2012);

        bib.isBookFound(bog4);

        Bog bog5 = new Bog(125, "test2", 2000);

        bib.isBookFound(bog5);
    }

    public static boolean doesArraylistContainString(ArrayList<String> list, String target) {

        for (String string : list) {
            if (target.equalsIgnoreCase(string)) {

                System.out.println("The string has been found!");
                return true;
            }
        }

        list.add(target);
        return false;
    }
}
