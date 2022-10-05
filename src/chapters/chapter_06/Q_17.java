package chapters.chapter_06;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 'n' value for matrix:");
        int n = input.nextInt();

        printMatrix(n);
    }
    public static void printMatrix(int n){

        int value = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomNumber = (int)(Math.random() * 10);
                if (randomNumber % 2 == 0){
                    value = 0;
                }
                else {
                    value = 1;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
