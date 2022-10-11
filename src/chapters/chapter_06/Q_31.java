package chapters.chapter_06;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer:");
        long cardNumber = input.nextLong();

    }
    public static boolean isValid(long number){

    }
    public static int sumOfDoubleEvenPlace(long number){
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 2; i >= 0 ; i-=2) {
            char ch = numberStr.charAt(i);
            int num = ch -48;
            sum += num;
        }
    }
    public static int getDigit(int number){

    }
    public static int sumOfOddPlace(long number){

    }
    public static boolean prefixMatched(long number, int d){

    }
    public static int getSize(long d){

    }
    public static long getPrefix(long number, int k){

    }
}
