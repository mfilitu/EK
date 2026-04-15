import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mobtr\\Desktop\\EK\\Sem1\\Prog1\\Øvelser_20\\Ovelser_20\\src\\pizza.txt");
        System.out.println("Er filen læsbar? " + file.canRead());

        //a
        readFileWithScanner(file);

        Pizza pizza = createPizzaWithReadFileScanner(file);

        System.out.println(pizza);

        //b
        writePizzaToFile(new Pizza("Pep", 67, "Ost pep dres"),
                "C:\\Users\\mobtr\\Desktop\\EK\\Sem1\\Prog1\\Øvelser_20\\Ovelser_20\\src\\pizza_pep.txt");

        //c
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Thorkild Hansen", 39485732, "thorkild@hotmail.com"));
        customers.add(new Customer("Mateusz Filipowski", 40535463, "mateuszfilipowski00@gmail.com"));
        customers.add(new Customer("bob Filipowski", 12312312, "bob@gmail.com"));
        writeCustomersToCSV(customers,
                "C:\\Users\\mobtr\\Desktop\\EK\\Sem1\\Prog1\\Øvelser_20\\Ovelser_20\\src\\customers.csv");

        //d
        File invoice = new File("C:\\Users\\mobtr\\Desktop\\EK\\Sem1\\Prog1\\Øvelser_20\\Ovelser_20\\src\\invoice.txt");

        ArrayList<InvoiceLine> invoiceLines = readFixedWidthFile(invoice);

        for (InvoiceLine line : invoiceLines) {
            System.out.println(line);
        }
    }

    public static ArrayList<InvoiceLine> readFixedWidthFile(File file) {
        ArrayList<InvoiceLine> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.trim().split("\\s+");

                String itemNumber = parts[0];
                int quantity = Integer.parseInt(parts[parts.length - 2]);
                double price = Double.parseDouble(parts[parts.length - 1]);

                // description = alt imellem
                StringBuilder description = new StringBuilder();
                for (int i = 1; i < parts.length - 2; i++) {
                    description.append(parts[i]).append(" ");
                }

                lines.add(new InvoiceLine(
                        itemNumber,
                        description.toString().trim(),
                        quantity,
                        price
                ));
            }

        } catch (Exception e) {
            System.out.println("Fejl i format!");
        }

        return lines;
    }

    public static void writeCustomersToCSV(List<Customer> customers, String filePath) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));
            for (int i = 0; i < customers.size(); i++){
                writer.printf("%s,%s,%s\n", customers.get(i).getName(), customers.get(i).getPhone(), customers.get(i).getEmail());
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Kunne ikke skrive til filen!");
        }
    }
    public static void writePizzaToFile(Pizza pizza, String filePath) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));
            writer.printf("%s\n", pizza.getName());
            writer.printf("%s\n", pizza.getPrice());
            writer.printf("%s\n", pizza.getIngredients());
            writer.close();
        } catch (IOException e) {
            System.out.println("Kunne ikke skrive til filen!");
        }
    }

    private static void writeFile(File file) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.println("Jeg elsker også burger!\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Kunne ikke skrive til filen!");
        }
    }

    private static Pizza createPizzaWithReadFileScanner(File file) {
        try {
            Scanner scanner = new Scanner(file);
            ArrayList<String> pizza = new ArrayList<>();

            while (scanner.hasNextLine()) {
                pizza.add(scanner.nextLine());
            }
            scanner.close();

            String name = pizza.get(0);
            double price = Double.parseDouble(pizza.get(1));
            String ingredients = pizza.get(2);

            return new Pizza(name, price, ingredients);
        } catch (FileNotFoundException e) {
            System.out.println("filen findes ikke!");
            return null;
        }

    }

    private static void readFileWithScanner(File file) {
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Content:\n");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("filen findes ikke!");
        }
    }

    private static void readFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            System.out.println("Content:\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke!");
        } catch (IOException e) {
            System.out.println("Filen kan ikke læses!");
        }
    }
}
