package chapters.chapter_06;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int number = input.nextInt();

        boolean doesPalindrome = isPalindrome(number);
        System.out.println(doesPalindrome);

    }
    public static boolean isPalindrome(int number){
        String number1 = number + "";
        String number2 = reverse(number) + "";

        return number1.equals(number2);
    }
    public static int reverse(int number){
        String number1 = number + "";
        String numberStr = "";

        for (int i = number1.length() -1 ; i >= 0 ; i--) {
            numberStr += number1.charAt(i);
        }
        int number2 = Integer.parseInt(numberStr);

        return number2;
    }
}
