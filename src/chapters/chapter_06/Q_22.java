package chapters.chapter_06;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value:");
        long n = input.nextLong();

        double root = sqrt(n);

        System.out.println("Root is " + root);
    }
    public static double sqrt(long n){
        double nextGuess = n;
        double lastGuess = n+1;

        while (lastGuess - nextGuess > 0.0001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        return nextGuess;
    }
}
