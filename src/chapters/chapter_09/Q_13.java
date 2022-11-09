package chapters.chapter_09;

import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int column = input.nextInt();
        double array[][] = new double[row][column];
        Location findMaxValue = new Location(row, column);
        findMaxValue.fillTheArray(array);
        findMaxValue.getMaxValue(array);
        System.out.println(findMaxValue.printArray(array));;
    }

}
