import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Invoice {
    private ArrayList<InvoiceLine> lines;
    private Address address;

    public Invoice(Address address){
        this.lines = new ArrayList<>(); //Laver en array liste når objektet instantieres (smart)
        this.address = address;
    }

    public void addLine(Product product, int quantity){
        InvoiceLine line = new InvoiceLine(product, quantity);
        lines.add(line);
    }

    public double getTotal(){
        double total = 0;

        for(InvoiceLine line : lines){
            double price = line.getLineTotal();
            total +=price;
        }
        return total;
    }

    public String toString(){
        Random random = new Random();
        System.out.println("F A K T U R A\n");
        address.toString();
        System.out.printf("Faktura nr: %d\nDato: %s\n\n", random.nextInt(100)+1, LocalDate.now());
        for(InvoiceLine elm : lines){
            System.out.printf("%s x %s\n", elm.getQuantity(), elm.getProduct());
        }
        System.out.println("--------------------------");
        System.out.printf("Total: %.2f", getTotal());
        return String.format("");
    }
}
