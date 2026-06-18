import java.time.LocalDateTime;

public class Plant {
    private String type;
    private int daysSinceWatered = 0;

    public Plant(String type, int daysSinceWatered){
        this.type = type;
        this.daysSinceWatered = daysSinceWatered;
    }

    public boolean needsWater(){
        if (daysSinceWatered < 0){
            System.out.println("Ugyldigt daysSinceWatered");
        }
        return daysSinceWatered >= 3;
    }

    public void water(){
        daysSinceWatered = 0;
    }

    public String toString(){
        return String.format("%s %s", type, daysSinceWatered);
    }
}
