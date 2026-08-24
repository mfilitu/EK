import java.util.ArrayList;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("test");
        myList.add("test1");
        myList.add("test2");
        myList.add("test3");

        doesArraylistContainString(myList, "Hej");
        doesArraylistContainString(myList, "Hej");

        Bibliotek bib = new Bibliotek();
        Bog bog1 = new Bog(111, "test bog", 2012);

        bib.isBookFound(111);

        Bog bog3 = new Bog(125, "test2", 2000);

        bib.isBookFound(123);

    }

    public static boolean doesArraylistContainString(ArrayList<String> list, String target){

        for (String string : list){
            if (target.equalsIgnoreCase(string)){

                System.out.println("The string has been found!");
                return true;
            }
        }

        list.add(target);
        return false;
    }
}
