package chapters.chapter_06;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int number = input.nextInt();

        reverse(number);
    }
    public static void reverse(int number){
        String number1 = number + "";
        String number2 = "";

        for (int i = number1.length() - 1; i >= 0; i--) {
            number2 += number1.charAt(i);
        }
        System.out.println(number2);
    }
}
