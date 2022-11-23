package chapters.chapter_10;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];
        double xMax = Integer.MIN_VALUE;
        double xMin = Integer.MAX_VALUE;
        double yMax = Integer.MIN_VALUE;
        double yMin = Integer.MAX_VALUE;

        System.out.println("Enter 5 points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < xMin){
                xMin = points[i][0];
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > xMax){
                xMax = points[i][0];
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < yMin){
                yMin = points[i][1];
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < yMin){
                yMin = points[i][1];
            }
        }
        
    }
}
