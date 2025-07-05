import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(3)
    public void testC() {
        System.out.println("Test C");
        assertTrue(true);
    }

    @Test
    @Order(1)
    public void testA() {
        System.out.println("Test A");
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void testB() {
        System.out.println("Test B");
        assertTrue(true);
    }
}
