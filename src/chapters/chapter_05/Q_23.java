package chapters.chapter_05;

public class Q_23 {
    public static void main(String[] args) {

        double number1 = 0;
        double number2 = 0;

        for (double i = 50000; i > 0; i--) {
            number1 += 1 / i;
        }

        for (double j = 1; j <= 50000; j++) {
            number2 += 1 / j;
        }

        if (number1 > number2) {
            System.out.println("The difference between " + number1 + " and " + number2 + " is " + (number1 - number2));

        } else if (number2 > number1) {
            System.out.println("The difference between " + number2 + " and " + number1 + " is " + (number2 - number1));
        }
        else {
            System.out.println("Numbers are " + number1 + " and " + number2 + " and there is no difference");
        }
    }
}
