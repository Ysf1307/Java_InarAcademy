package chapters.chapter_05;

import java.util.Scanner;

public class Q_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = input.nextLine();
        word = word.toLowerCase();

        int vowel = 0;
        int consonant = 0;
        int space = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a'
                    || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u'){
                vowel++;
            }
            else if (word.charAt(i) == 32) {
                space++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("The number of vowels is " + vowel);
        System.out.println("The number of consonants is " + consonant);
    }
}
