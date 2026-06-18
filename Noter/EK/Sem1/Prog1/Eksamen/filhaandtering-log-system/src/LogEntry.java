import java.time.LocalTime;

public class LogEntry {
    private String message;
    private LocalTime timeStamp;

    public LogEntry(String message){
        this.message = message;
        this.timeStamp = LocalTime.now();
    }

    public LogEntry(LocalTime time, String message){
        this.message = message;
        this.timeStamp = time;
    }

    public String getMessage(){
        return message;
    }

    public LocalTime getTimeStamp(){
        return timeStamp;
    }

    public String toString(){
        return String.format("Tidspunkt: [%s] - [%s]", getTimeStamp(), getMessage());
    }
}
