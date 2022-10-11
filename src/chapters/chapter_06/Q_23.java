package chapters.chapter_06;

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string value:");
        String str = input.next();
        System.out.println("Enter a character value");
        String character = input.next();
        char a = character.charAt(0);

        int occurence = count(str, a);

        System.out.println("Number of occurence is " + occurence);
    }
    public static int count(String str, char a){
        int occurence = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                occurence++;
            }
        }

        return occurence;
    }
}
