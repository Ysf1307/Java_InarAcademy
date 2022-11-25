package chapters.chapter_10;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.println("Enter 5 points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        MyRectangle2D rectangle1 = getRectangle(points);
        System.out.println("The bounding rectangle's center ( " + rectangle1.getX() + " , " + rectangle1.getY() + " ), width "
                + rectangle1.getWidth() + " , height " + rectangle1.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points){
        double xMax = Double.MIN_VALUE;
        double xMin = Double.MAX_VALUE;
        double yMax = Double.MIN_VALUE;
        double yMin = Double.MAX_VALUE;

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
            if (points[i][1] > yMax){
                yMax = points[i][1];
            }
        }

        double xCenter = (xMax + xMin) / 2;
        double yCenter = (yMax + yMin) / 2;
        double width = xMax - xMin;
        double height = yMax - yMin;

        return new MyRectangle2D(xCenter, yCenter, width, height);
    }
}
