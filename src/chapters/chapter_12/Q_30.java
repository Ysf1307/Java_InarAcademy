package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) throws Exception{

        File file = new File(getFileName());

        int[] count = new int[26];
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                String line = (input.nextLine()).toUpperCase();
                count = countLetters(count,line);
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "\'s: " + count[i]);
        }
    }

    public static String getFileName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File Name:");
        return input.next();
    }

    public static int[] countLetters(int[] count, String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                count[(int)(str.charAt(i) - 'A')]++;
            }
        }
        return count;
    }
}
