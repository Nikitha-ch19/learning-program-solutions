import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    public void testPerformTaskCompletesInTime() {
        PerformanceTester pt = new PerformanceTester();

        assertTimeout(Duration.ofMillis(500), () -> {
            pt.performTask();
        });
    }
}
