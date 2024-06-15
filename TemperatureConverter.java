import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of measurement (C for Celsius, F for Fahrenheit):");
        char unit = scanner.next().charAt(0);

        double convertedTemperature;

        if (unit == 'C' || unit == 'c') {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature + " °F");
        } else if (unit == 'F' || unit == 'f') {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + convertedTemperature + " °C");
        } else {
            System.out.println("Invalid unit of measurement. Please enter C or F.");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}