import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    @Test
    public void yearsInPeriodBetweenTwoDates() {
        LocalDate to = LocalDate.of(2000, 2, 15);
        LocalDate from = LocalDate.of(2000, 1, 1);

        Period result = Period.between(to, from);

        assertEquals(0, result.getYears());
    }
}