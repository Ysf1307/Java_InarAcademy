package chapters.chapter_05;

import java.util.Scanner;

public class Q_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ISBN-13 Number:");
        String isbn = input.next();

        int d13 = 0;
        int digit = 0;
        int sum = 0;

        for (int i = 0; i < 12; i++){
            if (i % 2 == 0){
                digit = isbn.charAt(i) - 48;
            }
            else {
                digit = (isbn.charAt(i) - 48) * 3;
            }
            sum += digit;
        }
        d13 = 10 - sum % 10;

        if (d13 == 10){
            d13 = 0;
        }

        isbn += "" + d13;
        System.out.println("The ISBN-13 Number is " + isbn);

    }
}
