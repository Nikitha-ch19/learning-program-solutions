import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class LifecycleTest {

    private MathUtils math;

    // Setup: runs BEFORE each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        math = new MathUtils();
    }

    // Teardown: runs AFTER each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        math = null;
    }

    @Test
    public void testAdd() {
        // Arrange: already done in @Before
        // Act
        int result = math.add(2, 3);
        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = math.subtract(10, 4);
        assertEquals(6, result);
    }
}
