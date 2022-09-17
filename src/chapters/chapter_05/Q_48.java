package chapters.chapter_05;

import java.util.Scanner;

public class Q_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word1 = input.nextLine();

        String word2 = "";

        for (int i = 0; i < word1.length(); i++){
            if (i % 2 == 0){
                word2 += word1.charAt(i) + "";
            }
        }
        System.out.println(word2);
    }
}
