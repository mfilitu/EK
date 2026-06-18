import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LogEntry log1 = new LogEntry("Hello!");

        System.out.println(log1);

        ArrayList<LogEntry> logEntries = new ArrayList<>();
        logEntries.add(new LogEntry("hej"));
        logEntries.add(new LogEntry("med"));
        logEntries.add(new LogEntry("dig"));
        logEntries.add(new LogEntry("!"));
        logEntries.add(new LogEntry(":)"));

        saveLogs(logEntries);

        System.out.println(loadLogs());
    }

    public static void saveLogs(ArrayList<LogEntry> logs){
        File file = new File("logs.txt");

        try {
            Writer writer = new FileWriter(file);
            for (LogEntry log : logs){
                writer.write(log.getTimeStamp() + "," + log.getMessage() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<LogEntry> loadLogs() throws FileNotFoundException {
        ArrayList<LogEntry> newLogs = new ArrayList<>();
        File file = new File("logs.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] data = line.split(",");

            String time = data[0];
            String message = data[1];
            newLogs.add(new LogEntry(LocalTime.parse(time), message));
        }
        return newLogs;
    }
}
