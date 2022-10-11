package chapters.chapter_06;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String newNumber = "";
        System.out.println("Enter phone oldNumber:");
        String oldNumber = input.next();

        for (int i = 0; i < oldNumber.length(); i++) {
            int num = getNumber(oldNumber.charAt(i));

            if (num == 11){
                continue;
            }
            else {
                newNumber += num + "";
            }
        }

        System.out.println(newNumber);
    }
    public static int getNumber(char letter){
        int number = 11;

        if (letter == '1')
            number = 1;
        else if (letter == 'A' || letter == 'a' || letter == 'B' || letter == 'b' || letter == 'C' || letter == 'c' || letter == '2')
            number = 2;
        else if (letter == 'D' || letter == 'E' || letter == 'F' || letter == 'd' || letter == 'e' || letter == 'f' || letter == '3')
            number = 3;
        else if (letter == 'G' || letter == 'H' || letter == 'I' || letter == 'g' || letter == 'h' || letter == 'i' || letter == '4')
            number = 4;
        else if (letter == 'J' || letter == 'K' || letter == 'L' || letter == 'j' || letter == 'k' || letter == 'l' || letter == '5')
            number = 5;
        else if (letter == 'M' || letter == 'N' || letter == 'O' || letter == 'm' || letter == 'n' || letter == 'o' || letter == '6')
            number = 6;
        else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S' || letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' || letter == '7')
            number = 7;
        else if (letter == 'T' || letter == 'U' || letter == 'V' || letter == 't' || letter == 'u' || letter == 'v' || letter == '8')
            number = 8;
        else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' || letter == '9')
            number = 9;
        else if (letter == '0')
            number = 0;

        return number;
    }
}
