package Travel.App;

import Travel.conversion.DistanceConverter;
import Travel.conversion.TemperatureConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistanceConverter distanceConverter = new DistanceConverter();
        /*System.out.println(distanceConverter.toMiles(1));
        System.out.println(distanceConverter.toKilometers(1));
        System.out.println(TemperatureConverter.toFahrenheit(212));
        System.out.println(TemperatureConverter.toCelsius(90.0));*/

        tempApp();
    }

    private static void tempApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- TempConverter Program running --");
        System.out.println("Press \"1\" to use toFahrenheit");
        System.out.println("Press \"2\" to use toCelsius");

        int toFahrenheitOrToCelsius = scanner.nextInt();

        if(toFahrenheitOrToCelsius == 1){
            System.out.println("Using toFahrenheit()\nType celsius to convert:");
            int cel = scanner.nextInt();
            System.out.println("Anwser: " + TemperatureConverter.toFahrenheit(cel));

        } else if (toFahrenheitOrToCelsius == 2) {
            System.out.println("Using toCelsius()\nType Fahrenheit to convert:");
            int far = scanner.nextInt();
            System.out.println("Anwser: " + TemperatureConverter.toCelsius(far));
        }
    }
}
