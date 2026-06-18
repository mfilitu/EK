public class Task {
    private String description;
    private boolean isDone;

    public Task(String description, boolean isDone){
        this.description = description;
        this.isDone = isDone;
    }

    public void markDone(){
        isDone = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone(){
        return isDone;
    }

    public String toString(){
        return String.format("%s, %s", description, isDone);
    }
}
