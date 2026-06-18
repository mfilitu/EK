import java.time.LocalTime;

public class Flight {
    private String destination;
    private int duration;
    private LocalTime departure;

    public Flight(String destination, int duration, LocalTime departure){
        this.destination = destination;
        this.duration = duration;
        this.departure = departure;
    }

    public boolean isShortFlight(){
        return duration < 90;
    }

    public String getDestination(){
        return destination;
    }

    public LocalTime getDeparture(){
        return departure;
    }

    public String toString(){
        return String.format("Destination: %s, Duration: %s, DepTime: %s", getDestination(), duration, getDeparture());
    }
}
