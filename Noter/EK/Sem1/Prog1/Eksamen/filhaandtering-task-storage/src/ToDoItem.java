public class ToDoItem {
    private String title;
    private boolean isCompleted;

    public ToDoItem(String title, boolean isCompleted){
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public String getTitle(){
        return title;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }

    public String toString(){
        return String.format("%s %s", isCompleted ? "ø" : "o", title);
    }
}
