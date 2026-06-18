import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<ToDoItem> toDoItemList = new ArrayList<>();

        ToDoItem gørRent = new ToDoItem("Gør rent", true);
        ToDoItem gåTur = new ToDoItem("gå en tur", false);
        ToDoItem købInd = new ToDoItem("køb ind", false);

        toDoItemList.add(gørRent);
        toDoItemList.add(gåTur);
        toDoItemList.add(købInd);

        System.out.println(gørRent);

        writeToFile(toDoItemList);

        readFile(toDoItemList);

        System.out.println(toDoItemList);


    }

    private static void readFile(List<ToDoItem> toDoItemList) {
        try {
            File file = new File("ToDoList.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String title = data[0];
                boolean isCompleted = Boolean.parseBoolean(data[1]);

                toDoItemList.add(new ToDoItem(title, isCompleted));
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

    private static void writeToFile(List<ToDoItem> toDoItemList) {
        try {
            FileWriter writer = new FileWriter("ToDoList.csv");
            for (ToDoItem todo : toDoItemList) {
                writer.write(todo.getTitle() + "," + todo.getIsCompleted() + "\n");
            }
            writer.close();
            System.out.println("todo list written to file!");
        } catch (IOException e) {
            System.out.println("Fejl");
        }
    }
}
