import java.time.LocalDate;

public class Film {
    private String name;
    private int year;
    private Producer producer;

    public Film(String name, int year){
        this.name = name;
        this.year = year;
    }

    public Film(String name){
        this.name = name;
        this.year = LocalDate.now().getYear();
    }

    public void addProducer(Producer producer){
        this.producer = producer;
    }

    public String toString(){
        return String.format("Name: %s\nYear: %s\nProducer: %s", name, year, producer);
    }

}
