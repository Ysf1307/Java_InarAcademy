package chapters.chapter_06;

import java.util.Scanner;

public class Q_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int number = input.nextInt();
        System.out.println("Enter width of value:");
        int width = input.nextInt();

        String numberStr = format(number, width);
        System.out.println("Formatted number is " + numberStr);
    }
    public static String format(int number, int width){
        String numberStr = number + "";
        int digit = numberStr.length();
        String output = "";

        for (int i = 0; i < width - digit; i++) {
            output += "0";
        }

        output += numberStr;
        return output;
    }
}
