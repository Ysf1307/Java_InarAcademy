package chapters.chapter_05;

import java.util.Scanner;

public class Q_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word1 = input.next();

        String word2 = "";

        for (int i = word1.length() - 1; i >= 0 ; i--){
            word2 += word1.charAt(i);
        }
        System.out.println(word1 + "\n" + word2);
    }
}
