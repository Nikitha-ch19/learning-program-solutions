import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    public void testThrowsExceptionWhenInputIsNull() {
        ExceptionThrower et = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            et.throwException(null);
        });
    }

    @Test
    public void testDoesNotThrowWhenInputIsNotNull() {
        ExceptionThrower et = new ExceptionThrower();

        assertDoesNotThrow(() -> {
            et.throwException("Hello");
        });
    }
}
