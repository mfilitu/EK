public class Car {
    private String make;
    private int topSpeed;

    public Car(String make, int topSpeed){
        this.make = make;
        this.topSpeed = topSpeed;
    }

    protected String isFast(){
        if (topSpeed > 180){
            return "Fast";
        } else return "Standard";
    }

}
