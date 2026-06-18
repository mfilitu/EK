import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task("gå tur", false));
        taskList.add(new Task("køb ind", true));
        taskList.add(new Task("lav mad", false));


        markDone(taskList, "gå tur");

        for (Task task : taskList){
            System.out.println(task);
        }

        deleteDoneTasks(taskList);

        for (Task task : taskList){
            System.out.println(task);
        }
    }

    private static void deleteDoneTasks(List<Task> taskList) {
        taskList.removeIf(Task::isDone);
    }

    private static void markDone(List<Task> taskList, String desc) {
        for (Task task : taskList){
            if (task.getDescription().contentEquals(desc)){
                task.markDone();
            }
        }
    }
}
