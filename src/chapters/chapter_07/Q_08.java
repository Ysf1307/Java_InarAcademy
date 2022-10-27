package chapters.chapter_07;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.println("Enter 10 double values:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("Average: " + average(array));
    }

    public static int average(int[] array){
        int sum = 0;
        int averageOfArray = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        averageOfArray = sum / array.length;

        return averageOfArray;
    }
    public static double average(double[] array){
        double sum = 0;
        double averageOfArray = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        averageOfArray = sum / array.length;

        return averageOfArray;
    }
}
