package chapters.chapter_07;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(array));
        System.out.println("The standard deviation is " + deviation(array));

    }
    public static double mean(double[] array){
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        mean =  sum / array.length;
        return mean;
    }
    public static double deviation(double[] array){
        double deviation = 0;
        double powSum = 0;
        for (int i = 0; i < array.length; i++) {
            powSum += Math.pow((array[i] - mean(array)), 2);
        }
        deviation = Math.sqrt(powSum / (array.length-1));
        return deviation;
    }
}
