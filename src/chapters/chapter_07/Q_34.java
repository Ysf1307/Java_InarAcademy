package chapters.chapter_07;

import java.util.Scanner;

public class Q_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String value:");
        String str = input.next();
        

        str = sort(str);

        System.out.println(str);
    }
    public static String sort(String s){
        char[] characters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            characters[i] = s.charAt(i);
        }
        for (int i = 0; i < characters.length; i++) {
            for (int j = i+1; j < characters.length; j++) {
                if (characters[j] < characters[i]){
                    char ch = characters[i];
                    characters[i] = characters[j];
                    characters[j] = ch;
                }
            }
        }
        String outputString = "";
        for (int i = 0; i < characters.length; i++) {
            outputString += String.valueOf(characters[i]);
        }
        return outputString;
    }
}
