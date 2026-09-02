import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Telefonliste {
    private HashMap<String, Integer> telefonliste;

    public Telefonliste(){
        telefonliste = new HashMap<>();
    }

    public HashMap<String, Integer> getTelefonliste(){
        return telefonliste;
    }

    public String printNamesOnly(){
        String result = "Telefonliste kun navne:\n";

        for (String name : getTelefonliste().keySet()){
            result += String.format("Navn: %s\n", name);
        }

        return result;
    }

    public void deletePerson(String targetName){


        for (String name : getTelefonliste().keySet()){
            if (targetName.equalsIgnoreCase(name)){
                getTelefonliste().remove(name);
                return;
            }
        }
        System.out.println("Personen findes ikke!");
    }

    public void doesThisPersonExist(String targetName){

        for (String name : getTelefonliste().keySet()){
            if (targetName.equalsIgnoreCase(name)){
                System.out.println("ja!");
                return;
            }
        }
        System.out.println("Personen findes ikke!");

    }

    public String seatchNumberByName(String targetName){


        for (String name : getTelefonliste().keySet()){
            if (targetName.equalsIgnoreCase(name)){
                return String.format("Nummer på %s er %d", targetName, getTelefonliste().get(name));
            }
        }
        return "Name not in list!";
    }

    public void addToList(String name, Integer number){
        telefonliste.put(name, number);
    }

    public void updateFile(){
        File file = new File("telefonliste.csv");

        try (PrintWriter writer = new PrintWriter(file)) {
            for (String name : getTelefonliste().keySet()){
                writer.println(name + ", " + getTelefonliste().get(name) + ", ");
            }
        } catch (FileNotFoundException e){
            System.out.println("Filen findes ikke.");
        }
    }

    public void loadFromFile(){
        File file = new File("telefonliste.csv");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String name = data[0].trim();
                int number = Integer.parseInt(data[1].trim());

                addToList(name, number);

            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke.");
        }
    }

    @Override
    public String toString(){
        String result = "Telefonliste:\n";

        for (String name : getTelefonliste().keySet()){
            result += String.format("Navn: %s Nummer: %d \n", name, getTelefonliste().get(name));
        }

        return result;
    }
}
