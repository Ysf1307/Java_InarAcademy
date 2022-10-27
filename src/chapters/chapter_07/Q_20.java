package chapters.chapter_07;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter ten double values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        numbers = sortList(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static double[] sortList(double[] numbers) {
        for (int i = numbers.length-1; i >= 0; i--) {
            double max = numbers[i];
            int index = i;
            for (int j = i; j >= 0; j--) {
                if (numbers[j] > max){
                    max = numbers[j];
                    index = j;
                }
            }
            double temp = numbers[i];
            numbers[i] = max;
            numbers[index] = temp;
        }
        return numbers;
    }
}
