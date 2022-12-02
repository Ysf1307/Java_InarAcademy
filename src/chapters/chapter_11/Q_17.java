package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();

        System.out.println("Enter an integer:");
        int number = input.nextInt();
        int m = number;
        int divisor = 2;
        
        while (m != 1){
            if (m % divisor == 0){
                factors.add(divisor);
                m = m / divisor;
            } else divisor++;
        }
        
        ArrayList<Integer> oddNumberOfFactors = new ArrayList<>();
        for (int i = 2; i <= Collections.max(factors); i++) {
            int count = 0;
            for (int j = 0; j < factors.size(); j++) {
                if (i == factors.get(j)){
                    count++;
                }
            }
            if (count % 2 != 0){
                oddNumberOfFactors.add(i);
            }
        }

        int perfectSquare = 1;
        for (int i = 0; i < oddNumberOfFactors.size(); i++) {
            perfectSquare = perfectSquare * oddNumberOfFactors.get(i);
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + perfectSquare);
        System.out.println("m * n is " + (number * perfectSquare));
    }
}
