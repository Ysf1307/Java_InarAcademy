package chapters.chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean inputMismatchException = true;

        while (inputMismatchException){
            System.out.println("Enter two integers");
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("Sum = " + (number1 + number2));
                inputMismatchException = false;
            }
            catch (InputMismatchException ex) {
                inputMismatchException = true;
                System.out.println("Incorrect input type! Try again!");
                input.nextLine();
            }
        }
        input.close();
    }
}
