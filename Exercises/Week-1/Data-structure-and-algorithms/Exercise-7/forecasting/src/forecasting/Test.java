package forecasting;

public class Test {
	 public static void main(String[] args) {
	        double currentValue = 10000; // e.g., ₹10,000
	        double growthRate = 0.1;     // 10% growth
	        int years = 5;

	        double futureValue = Forecast.predictFutureValue(currentValue, growthRate, years);
	        System.out.printf("Predicted value after %d years: ₹%.2f%n", years, futureValue);
	    }

}
