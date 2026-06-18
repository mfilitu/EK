import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("BMW", "v8", "1999", 4);
        Vehicle car2 = new Car("Jaguar", "v8", "1966", 4);

        Vehicle motor1 = new Motorcycle("BMW", "v8", "2012", false);
        Vehicle motor2 = new Motorcycle("Hamaha", "v8", "2022", true);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motor1);
        vehicles.add(motor2);

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        System.out.println(car1.getAge());
        System.out.println(getOldest(vehicles));
    }

    public static Vehicle getOldest(ArrayList<Vehicle> vehicles){
        Vehicle oldest = vehicles.getFirst();

        for (Vehicle vehicle : vehicles){
            if (oldest.getAge() < vehicle.getAge()){
                oldest = vehicle;
            }
        }
        return oldest;
    }
}
