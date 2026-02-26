package Travel.conversion;
import Math.Math;

public class TemperatureConverter {

    public static double toFahrenheit(double celsius) {
        return Math.add((Math.multiply(celsius, Math.divide(9, 5))), 32);

    }

    public static double toCelsius(double fahrenheit) {
        return Math.multiply((Math.subtract(fahrenheit, 32)), Math.divide(5, 9));
    }

}
