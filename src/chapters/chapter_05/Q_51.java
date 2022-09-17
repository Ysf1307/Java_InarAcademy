package chapters.chapter_05;

import java.util.Scanner;

public class Q_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String word1 = input.nextLine();
        System.out.println("Enter the second string:");
        String word2 = input.nextLine();

        String output = "";

        if (word2.length() < word1.length()){
            String temp = word1;
            word1 = word2;
            word2 = temp;
        }
        int i = 0;

        while (word1.charAt(i) == word2.charAt(i)){
            output += word1.charAt(i) + "";
            i++;
        }
        if (output.length() > 0){
            System.out.println("The common prefix is " + output);
        }
        else {
            System.out.println(word1 + " and " + word2 + " have no common prefix");
        }
    }
}
