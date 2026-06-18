public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String make, int topSpeed, int batteryCapacity){
        super(make, topSpeed);
        this.batteryCapacity = batteryCapacity;
    }
}
