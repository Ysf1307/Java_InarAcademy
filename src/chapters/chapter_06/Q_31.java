package chapters.chapter_06;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer:");
        long cardNumber = input.nextLong();

        if (isValid(cardNumber)){
            System.out.println(cardNumber + " is valid");
        }
        else {
            System.out.println(cardNumber + " is invalid");
        }

    }
    public static boolean isValid(long number){
        boolean validity = true;

        if (getSize(number) > 16 && getSize(number) < 13){
            validity = false;
        }
        if (!prefixMatched(number, 2)){
            validity = false;
        }
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (sum % 10 != 0){
            validity = false;
        }
        return validity;
    }
    public static int sumOfDoubleEvenPlace(long number){
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 2; i >= 0 ; i-=2) {
            char ch = numberStr.charAt(i);
            int num = ch - 48;
            num = num * 2;
            num = getDigit(num);
            sum += num;
        }
        return sum;
    }
    public static int getDigit(int number){
        if (number / 10 != 0){
            number = (number / 10) + (number % 10);
        }
        return number;
    }
    public static int sumOfOddPlace(long number){
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 1; i >= 0 ; i-=2) {
            char ch = numberStr.charAt(i);
            int num = ch - 48;
            sum += num;
        }
        return sum;
    }

    public static int getSize(long d){
        String number = d + "";
        int size = number.length();
        return size;
    }
    public static boolean prefixMatched(long number, int d){
        boolean match = false;
        if ((getPrefix(number, (d-1)) == 4 || getPrefix(number, (d-1)) == 5
                || getPrefix(number, (d-1)) == 6  || getPrefix(number, d) == 37)){
            match = true;
        }
        return match;
    }
    public static long getPrefix(long number, int k){
        String numberStr = number + "";
        numberStr = numberStr.substring(0,k);

        long prefix = (numberStr.charAt(0)) - 48;

        if (numberStr.charAt(0) == '3' && numberStr.charAt(1) == '7') {
            prefix = 37;
        }
        return prefix;
    }
}
