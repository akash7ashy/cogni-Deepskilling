public class FinancialForecast {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double currentValue = 10000;   // Current investment
        double growthRate = 0.10;      // 10% growth
        int years = 5;

        double futureValue =
                predictFutureValue(currentValue, growthRate, years);

        System.out.printf(
                "Predicted value after %d years = %.2f%n",
                years,
                futureValue
        );
    }
}