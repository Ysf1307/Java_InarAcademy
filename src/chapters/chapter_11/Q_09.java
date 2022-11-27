package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the array size n: ");
        int n = input.nextInt();
        System.out.println("The random array is");
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> rowSum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            rowSum.add(sum);
        }

        ArrayList<Integer> columnSum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[j][i];
            }
            columnSum.add(sum);
        }

        int maxRowIndex = -1;
        for (int i = 0; i < n; i++) {
            if (rowSum.get(i) == Collections.max(rowSum)){
                maxRowIndex = i;
            }
        }

        int maxColumnIndex = -1;
        for (int i = 0; i < n; i++) {
            if (columnSum.get(i) == Collections.max(columnSum)){
                maxColumnIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
        System.out.println(rowSum.toString());
        System.out.println(columnSum.toString());
    }
}
