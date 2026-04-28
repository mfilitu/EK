public class Producer {
    private String name;

    public Producer(String name){
        this.name = name;
    }

    public String toString(){
        return String.format("%s", name);
    }
}
