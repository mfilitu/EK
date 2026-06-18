public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 250);
        ElectricCar electricCar = new ElectricCar("Tesla", 170, 100);

        System.out.println(car.isFast());
        System.out.println(electricCar.isFast());

    }
}
