import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // assertEquals: checks if values are equal
        assertEquals(5, 2 + 3);

        // assertTrue: checks if condition is true
        assertTrue(5 > 3);

        // assertFalse: checks if condition is false
        assertFalse(5 < 3);

        // assertNull: checks if value is null
        assertNull(null);

        // assertNotNull: checks if value is not null
        assertNotNull(new Object());
    }
}
