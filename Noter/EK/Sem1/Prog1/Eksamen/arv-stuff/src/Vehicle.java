import java.time.LocalDate;

public class Vehicle {
    protected String brand;
    protected String model;
    protected String year;

    public Vehicle(String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    protected int getAge(){
        return LocalDate.now().getYear() - Integer.parseInt(year);
    }


    public String toString(){
        return String.format("Brand: %s, Model: %s, Year: %s", brand, model, year);
    }
}
