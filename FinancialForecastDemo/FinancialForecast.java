public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000; // ₹10,000
        double annualGrowthRate = 0.10; // 10%
        int forecastYears = 5;

        double futureValue = predictFutureValue(currentValue, annualGrowthRate, forecastYears);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", forecastYears, futureValue);
    }
}
