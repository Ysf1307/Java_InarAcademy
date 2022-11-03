package chapters.chapter_07;

import java.util.Scanner;

public class Q_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"program", "infrastructure", "hospitality", "salt"};
        boolean isGameFinish = false;


        while (!isGameFinish) {
            int randomNum = ((int) (Math.random() * 100)) % 4;
            String word = words[randomNum];

            char[] characters = new char[word.length()];
            for (int i = 0; i < characters.length; i++) {
                characters[i] = '*';
            }

            int count = 0;
            boolean isGuessFinish = false;
            while (!isGuessFinish) {
                System.out.print("Enter a letter in word ");
                for (int i = 0; i < characters.length; i++) {
                    System.out.print(characters[i]);
                }

                int temp = 0;
                String str = input.next();
                char ch = str.charAt(0);
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == ch) {
                        characters[i] = ch;
                    } else temp++;
                }

                if (temp == word.length()){
                    count++;
                }

                isGuessFinish = true;
                for (int i = 0; i < characters.length; i++) {
                    if (characters[i] == '*') {
                        isGuessFinish = false;
                        break;
                    }
                }
            }
            System.out.println("The word is " + word);
            System.out.println("You missed " + count + "time(s)");
            System.out.println("Do you want to guess another word? Enter y or n >");
            String finish = input.next();
            char decision = finish.charAt(0);
            if (decision == 'y'){
                isGameFinish = false;
            }
            else isGameFinish = true;
        }
    }
}
