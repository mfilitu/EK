import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Køb ind", 5));
        tasks.add(new Task("lav lektier", 2));
        tasks.add(new Task("ring til mor", 1));
        tasks.add(new Task("se en film", 10));
        tasks.add(new Task("gå en tur", 3));

        System.out.println(new Task("Køb ind", 5).isUrgent());
        System.out.println(new Task("ring til mor", 1).isUrgent());

        for (Task task : tasks){
            System.out.println(task);
        }

        Collections.sort(tasks, new PrioComparator());
        System.out.println();
        for (Task task : tasks){
            System.out.println(task);
        }
    }
}
