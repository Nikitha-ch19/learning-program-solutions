import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    
    MathUtils mu = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(9, mu.add(4, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mu.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, mu.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(3, mu.divide(9, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        mu.divide(10, 0);
    }
}
