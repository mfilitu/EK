import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineTest {

    @Test
    void getQuantity() {
        Product product = new Product("Bread", 100);
        InvoiceLine invoiceLine = new InvoiceLine(product, 5);

        int quntity = invoiceLine.getQuantity();

        assertEquals(5,quntity);

    }

    @Test
    void getProduct() {
        Product product = new Product("Bread", 100);
        InvoiceLine invoiceLine = new InvoiceLine(product, 5);

        Product prod = invoiceLine.getProduct();

        // How to test objects????
        assertEquals("Bread", prod.getName());
        assertEquals(100, prod.getPrice());
        //"bread".equals();
        //assertEquals(new Product("Bread", 100), prod); //no work
    }

    @Test
    void getLineTotal() {
        Product product = new Product("Bread", 100);
        InvoiceLine invoiceLine = new InvoiceLine(product, 5);

        double total = invoiceLine.getLineTotal();

        assertEquals(500, total);
    }
}