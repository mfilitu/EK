import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void addLine() {
        Product bread = new Product("Bread", 100);
        Product milk = new Product("Milk", 50);
        //InvoiceLine line1 = new InvoiceLine(bread, 2); //200
        //InvoiceLine line2 = new InvoiceLine(milk, 1); //50
        Address address = new Address("Mateusz","Vejgade 15","Måneby");
        Invoice invoice = new Invoice(address);
        invoice.addLine(bread, 2);
        invoice.addLine(milk, 1);

    }

    @Test
    void getTotal() {
        Product bread = new Product("Bread", 100);
        Product milk = new Product("Milk", 50);
        //InvoiceLine line1 = new InvoiceLine(bread, 2); //200
        //InvoiceLine line2 = new InvoiceLine(milk, 1); //50
        Address address = new Address("Mateusz","Vejgade 15","Måneby");
        Invoice invoice = new Invoice(address);
        invoice.addLine(bread, 2);
        invoice.addLine(milk, 1);
        assertEquals(250, invoice.getTotal());
    }

    @Test
    void stringTest() {
        Product bread = new Product("Bread", 100);
        Product milk = new Product("Milk", 50);
        //InvoiceLine line1 = new InvoiceLine(bread, 2); //200
        //InvoiceLine line2 = new InvoiceLine(milk, 1); //50
        Address address = new Address("Mateusz","Vejgade 15","Måneby");
        Invoice invoice = new Invoice(address);
        invoice.addLine(bread, 2);
        invoice.addLine(milk, 1);
        invoice.toString();
        //String expected = """
        //        2 x Bread: 100,00 kr
        //        1 x Milk: 50,00 kr
        //        --------------------------
        //        Total: 250,00
        //        """;
        //assertEquals(expected, invoice.toString());
    }
}