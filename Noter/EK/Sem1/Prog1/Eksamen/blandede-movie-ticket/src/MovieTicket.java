public class MovieTicket {
    private String movieTitle;
    private int seatNumber;
    private boolean isScanned;

    public MovieTicket(String movieTitle, int seatNumber){
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.isScanned = false;
    }

    public boolean isScanned(){
        return isScanned;
    }

    public void scanTicket() throws Exception {
        if (isScanned()){
            throw new Exception("Ticket already scanned!");
        }
        isScanned = true;
    }
}
