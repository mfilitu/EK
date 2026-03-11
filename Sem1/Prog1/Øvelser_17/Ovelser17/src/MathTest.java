import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MathTest {
    @Test
    public void maxTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        assertEquals(10, Math.max(list.getFirst(),list.getLast()));
    }

    @Test
    public void minTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        assertEquals(1, Math.min(list.getFirst(),list.getLast()));
    }

    @Test
    public void floorTest() {
        double x = 1.3;
        assertEquals(1, Math.floor(x));
    }
}