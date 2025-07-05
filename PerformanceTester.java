public class PerformanceTester {
    public void performTask() {
        // Simulating a short task with 200ms sleep
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
