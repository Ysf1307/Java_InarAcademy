package chapters.chapter_06;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = input.nextInt();

        displayPattern(n);
    }
    public static void displayPattern(int n){
        String output = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                output += "  ";
            }
            for (int j = i; j > 0; j--) {
                output += j + " ";
            }
            output += "\n";
        }

        System.out.println(output);
    }
}
