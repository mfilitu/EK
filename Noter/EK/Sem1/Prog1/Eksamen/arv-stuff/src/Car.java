public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, String year, int numOfDoors){
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }


}
