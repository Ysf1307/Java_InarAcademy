package chapters.chapter_07;

import java.util.Scanner;
public class Q_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double array[] = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum number is " + min(array));
    }
    public static double min(double[] array){
        double minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
