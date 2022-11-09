package chapters.chapter_08;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.println("Enter matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
    }
    /*
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2){
        double[][] multiplyMatrix = new double[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

            }
        }
    }

     */
}
