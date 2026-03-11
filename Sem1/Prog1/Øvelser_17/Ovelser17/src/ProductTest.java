import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName() {
        // Arrange
        Product product = new Product("Bread", 100);
        // Act
        String name = product.getName();
        // Assert
        assertEquals("Bread", name);
    }

    @Test
    void getPrice() {
        // Arrange
        Product product = new Product("Bread", 100);
        // Act
        double price = product.getPrice();
        // Assert
        assertEquals(100, price);
    }
}