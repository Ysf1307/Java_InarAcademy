package chapters.chapter_08;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }
    public static double sumMajorDiagonal(double[][] m){
        double sumLeft = 0;
        double sumRight = 0;
        int row = 0;
        int column = 0;
        while (row < m.length){
            sumLeft += m[row][column];
            row++;
            column++;
        }
        row = 0;
        column = 3;
        while (row < m.length){
            sumRight += m[row][column];
            row++;
            column--;
        }
        if (sumLeft > sumRight){
            return sumLeft;
        }else return sumRight;
    }
}
