import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();

        flights.add(new Flight("London", 80, LocalTime.of(8, 30)));
        flights.add(new Flight("London", 89, LocalTime.of(8, 10)));
        flights.add(new Flight("Denmark", 120, LocalTime.of(10, 45)));
        flights.add(new Flight("Germany", 45, LocalTime.of(15, 0)));

        System.out.println(getBestFlight(flights, "london"));
    }

    public static Flight getBestFlight(ArrayList<Flight> flights, String destination){
        Collections.sort(flights, new DepComparator());

        for (Flight flight: flights){
            if (flight.getDestination().equalsIgnoreCase(destination) && flight.isShortFlight()){
                return flight;
            }
        }
        return null;
    }
}
