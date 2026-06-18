import java.util.Comparator;

public class PrioComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2){
        return o1.getPriorityLevel() - o2.getPriorityLevel();
    }
}
