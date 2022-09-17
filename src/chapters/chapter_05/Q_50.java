package chapters.chapter_05;

import java.util.Scanner;

public class Q_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = input.next();
        int uppercase = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) > 64 && word.charAt(i) < 91){
                uppercase++;
            }
        }
        System.out.println("The number of uppercase letters is " + uppercase);
    }
}
