package chapters.chapter_06;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string value:");
        String s = input.next();

        int length = countLetters(s);

        System.out.println("Length of your string is " + length);
    }
    public static int countLetters(String s){
        int count = 0;

        while (count < s.length()){
            count++;
        }

        return count;
    }
}
