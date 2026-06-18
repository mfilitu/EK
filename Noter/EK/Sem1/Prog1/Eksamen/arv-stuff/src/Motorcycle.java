public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, String year, boolean hasSideCar){
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString(){
        return String.format("Brand: %s, Model: %s, Year: %s, hasSideCar: %s", brand, model, year, hasSideCar);
    }
}
