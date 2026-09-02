import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Telefonliste telefonliste = new Telefonliste();
        telefonliste.loadFromFile();
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running){
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("1 - Se liste");
            System.out.println("2 - Tilføj til liste");
            System.out.println("3 - Søg på navn");
            System.out.println("4 - Slet person");
            System.out.println("5 - Findes denne person?");
            System.out.println("6 - Udskriv alle navne");
            System.out.println("7 - Slut");
            System.out.println("--------------------------------------");


            while (!scanner.hasNextInt()) {
                System.out.println("Indtast et tal:");
                scanner.next();
            }
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input){
                case 1:
                    System.out.println(telefonliste);
                    break;
                case 2:
                    System.out.println("Indtast navn på person:");
                    String name = scanner.nextLine();
                    System.out.println("Indtast nummer på person:");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    telefonliste.addToList(name, number);
                    break;
                case 3:
                    System.out.println("Indtast navn på person:");
                    String searchName = scanner.nextLine();
                    System.out.println(telefonliste.seatchNumberByName(searchName));
                    break;
                case 4:
                    System.out.println("Indtast navn på person:");
                    String deleteName = scanner.nextLine();
                    telefonliste.deletePerson(deleteName);
                    break;
                case 5:
                    System.out.println("Indtast navn på person:");
                    String existName = scanner.nextLine();
                    telefonliste.doesThisPersonExist(existName);
                    break;
                case 6:
                    System.out.println(telefonliste.printNamesOnly());
                    break;
                case 7:
                    telefonliste.updateFile();
                    running = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg.");
                    break;
            }
        }
    }
}
