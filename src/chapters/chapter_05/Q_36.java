package chapters.chapter_05;

import java.util.Scanner;

public class Q_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ISBN number:");
        String number = input.next();

        int total = 0;

        for (int i = 0; i < 9; i++){
            total += (number.charAt(i) - 48) * (i + 1);
        }
        int lastCharacter = total % 11;

        if (lastCharacter == 10){
            System.out.println("The last digit is 'X'");
        }
        else {
            System.out.println("The last digit is " + lastCharacter);
        }
    }
}
