package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<double[]> points =  new ArrayList<>();

        System.out.println("Enter number of points:");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter the coordinates of points:");

        for (int i = 0; i < numberOfPoints; i++) {
            double[] point = new double[2];
            for (int j = 0; j < point.length; j++) {
                point[j] = input.nextDouble();
            }
            points.add(point);
        }

        System.out.println("The area of the points is " + getAreaOfConvex(points));
    }
    public static double getAreaOfConvex(ArrayList<double[]> points){
        double[] firstPoint = points.get(0);
        double[] lastPoint = points.get(points.size() - 1);
        double operand1 = firstPoint[0] * lastPoint[1];
        for (int i = 0; i < points.size() - 1; i++) {
            double[] point1 = points.get(i);
            double[] point2 = points.get(i+1);
            operand1 += point1[0] * point2[1];
        }
        double operand2 = firstPoint[1] * lastPoint[0];
        for (int i = 0; i < points.size() - 1; i++) {
            double[] point1 = points.get(i);
            double[] point2 = points.get(i+1);
            operand2 += point1[1] * point2[0];
        }
        return Math.abs((operand1 -operand2) * 0.5);
    }
}
