import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Mateusz", "Filipowski"));
        personList.add(new Person("Adam", "Adamsen"));
        personList.add(new Person("Jan", "Bolilson"));

        writePersons(personList);

        readPersons(personList);

        for (Person person : personList){
            System.out.println(person.getFullName());
        }
    }

    private static void readPersons(List<Person> personList) {
        try {
            File file = new File("persons.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String firstName = data[0];
                String lastName = data[1];

                personList.add(new Person(firstName, lastName));
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("fejl");
        }
    }

    private static void writePersons(List<Person> personList) {
        try {
            Writer writer = new FileWriter("persons.csv");
            for (Person person : personList){
                writer.write(person.getFirstName() + "," + person.getLastName() + "\n");
            }
            writer.close();

        } catch (IOException e){
            System.out.println("Fejl");
        }
    }
}
