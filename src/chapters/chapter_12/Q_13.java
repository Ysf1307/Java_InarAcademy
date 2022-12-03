package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {

        File sourceFile = new File(args[0]);

        int numberOfChars = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;
        String temp = "";

        try (Scanner input = new Scanner(sourceFile)) {
            while (input.hasNext()) {
                temp = input.nextLine();
                numberOfLines++;

                String[] tempArr = temp.split(" ");
                numberOfWords += tempArr.length;

                for (int i = tempArr.length - 1; i >= 0; i--) {
                    numberOfChars += tempArr[i].length();
                }
            }
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file " + sourceFile.getName() + " has:");
        System.out.println(numberOfChars + " Characters");
        System.out.println(numberOfWords + " Words");
        System.out.println(numberOfLines + " Lines");
    }
}
