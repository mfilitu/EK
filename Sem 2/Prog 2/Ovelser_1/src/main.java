import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {

        //arrayListOpgave();

        //bogOpgave();

        //System.out.println(grass(0, 0.8));

        //square(6, "%");

        //System.out.println(properCase("HEJ meD diG mateusz"));

        //Sortering();

        //søg();


        //ArrayList vs LinkedList

        /*
        addFirstArrayList(1000);
        addFirstLinkedList(1000);

        addFirstArrayList(10000);
        addFirstLinkedList(10000);

        addFirstArrayList(10000);
        addFirstLinkedList(10000);

        addFirstArrayList(1000000);
        addFirstLinkedList(1000000);*/

        /*
        ArrayList<Integer> arrayList = addLastArrayList(1000);
        LinkedList<Integer> linkedList = addLastLinkedList(1000);
        getArrayList(arrayList);
        getLinkedList(linkedList);

        ArrayList<Integer> arrayList1 = addLastArrayList(10000);
        LinkedList<Integer> linkedList1 = addLastLinkedList(10000);
        getArrayList(arrayList1);
        getLinkedList(linkedList1);

        ArrayList<Integer> arrayList2 = addLastArrayList(100000);
        LinkedList<Integer> linkedList2 = addLastLinkedList(100000);
        getArrayList(arrayList2);
        getLinkedList(linkedList2);

        ArrayList<Integer> arrayList3 = addLastArrayList(100000);
        LinkedList<Integer> linkedList3 = addLastLinkedList(100000);
        getArrayList(arrayList3);
        getLinkedList(linkedList3);*/


    }

    private static void søg() {
        ArrayList<String> myArr = new ArrayList<>();
        myArr.add("Hej");
        myArr.add("med");
        myArr.add("dig");

        System.out.println(sogning(myArr, "lol"));
        System.out.println(sogning(myArr, "Hej"));
        System.out.println(sogning(myArr, "med"));
        System.out.println(sogning(myArr, "dig"));
    }

    public static int sogning(ArrayList<String> array, String s){

        for (String word : array){
            if (s.equals(word)){
                return array.indexOf(word);
            }
        }
        return -1;
    }

    public static void Sortering(){
        Scanner scanner = new Scanner(System.in);

        String[] asd = new String[5];

        ArrayList<String> myArr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Indtast et ord:");
            myArr.add(scanner.nextLine());

        }

        Collections.sort(myArr, Collections.reverseOrder());

        for (String word : myArr){
            System.out.println(word);
        }

    }

    public static String properCase(String s){
        String[] data = s.split(" ");

        String result = "";

        for (String words : data) {
            if (words.equals(words.toUpperCase())){
                result += (words + " ");
            } else if (words.length() > 3) {
                result += (words.substring(0,1).toUpperCase() + words.substring(1).toLowerCase() + " ");

            } else if (words.length() <= 3){
                result += words.toLowerCase() + " ";
            }
        }



        return result;
    }

    public static void getArrayList(ArrayList<Integer> arrayList) {
        long before = System.nanoTime();

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }

        long after = System.nanoTime();
        long time = after - before;
        System.out.println("getArrayList: " + time / 1000000.0 + " milli");
    }

    public static void getLinkedList(LinkedList<Integer> linkedList) {
        long before = System.nanoTime();

        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long after = System.nanoTime();
        long time = after - before;
        System.out.println("getLinkedList: " + time / 1000000.0 + " milli");
    }


    public static LinkedList<Integer> addLastLinkedList(int n){
        long before = System.nanoTime();
        LinkedList<Integer> linked = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            linked.addLast(i);
        }
        long after = System.nanoTime();
        long time = after-before;
        System.out.println(time / 1000000.0 + " milli");
        return linked;
    }

    public static ArrayList<Integer> addLastArrayList(int n){
        long before = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.addLast(i);
        }
        long after = System.nanoTime();
        long time = after-before;
        System.out.println(time / 1000000.0 + " milli");
        return arrayList;
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
