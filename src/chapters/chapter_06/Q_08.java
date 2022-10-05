package chapters.chapter_06;

public class Q_08 {
    public static void main(String[] args) {

        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Celsius\t\tFahrenheit\n-------------------");

        for (celsius = 40; celsius > 30; celsius--){
            fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "\t\t" + fahrenheit);
        }

        System.out.println("Celsius\t\tFahrenheit\n-------------------");

        for (fahrenheit = 120; fahrenheit >= 30; fahrenheit -=10){
            celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "\t\t" + celsius);
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;
    }
}
