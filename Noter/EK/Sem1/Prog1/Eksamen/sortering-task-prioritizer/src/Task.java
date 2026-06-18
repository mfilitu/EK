public class Task {
    private String description;
    private int priorityLevel;

    public Task(String description, int priorityLevel){
        this.description = description;
        this.priorityLevel = priorityLevel;
    }

    public boolean isUrgent(){
        return priorityLevel < 3;
    }

    public int getPriorityLevel(){
        return priorityLevel;
    }

    public String toString(){
        return String.format("Description: %s, PrioLevel: %s", description, priorityLevel);
    }
}
