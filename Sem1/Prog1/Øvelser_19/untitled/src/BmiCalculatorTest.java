import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiCalculatorTest {
    @Test
    public void testCalculateBmi() {
        // Arrange
        double h = 1.81;
        double w = 84.4;

        // Act
        double bmi = Bmi.calculate(h, w);

        // Assert
        assertEquals(25.76, bmi, 0.1);
    }
}