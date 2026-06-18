public class Costomer {
    private String name;
    private int loyaltyPoints;

    public Costomer(String name, int loyaltyPoints){
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
    }

    public boolean isVIP(){
        return loyaltyPoints > 1000;
    }

    public String toString(){
        return String.format("Name: %s, Points: %s", name, loyaltyPoints);
    }
}
