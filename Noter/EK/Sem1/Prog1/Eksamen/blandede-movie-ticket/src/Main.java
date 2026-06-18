import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Star Wars", 13);
        MovieTicket ticket2 = new MovieTicket("Bee Movie", 3);
        MovieTicket ticket3 = new MovieTicket("Godzilla", 7);

        ArrayList<MovieTicket> movieTickets = new ArrayList<>();

        movieTickets.add(ticket);
        movieTickets.add(ticket2);
        movieTickets.add(ticket3);

        try {
            ticket.scanTicket();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ticket.scanTicket();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ticketsNotScannedYet(movieTickets));

    }

    public static int ticketsNotScannedYet(ArrayList<MovieTicket> movieTickets) {
        int amount = 0;

        for (MovieTicket ticket : movieTickets) {
            if (!ticket.isScanned()){
                amount++;
            }
        }
        return amount;
    }
}
