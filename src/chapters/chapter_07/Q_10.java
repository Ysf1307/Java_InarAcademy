package chapters.chapter_07;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double array[] = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The index of smallest number is " + indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array){
        int index = -1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] < array[i]){
                index = i+1;
            }
        }
        return index;
    }
}
