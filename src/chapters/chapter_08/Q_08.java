package chapters.chapter_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of points:");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points:");
        for (int i = 0; i < numberOfPoints; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        int numberOfDistances = 1;
        for (int i = 1; i < numberOfPoints; i++) {
            numberOfDistances = numberOfDistances * i;
        }
        double[] distances = new double[numberOfDistances];
        int[][] indices = new int[2][numberOfDistances];
        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    indices[0][i] = j;
                    indices[1][i] = k;
                    distances[i] = findDistance(points, j, k);
                }
            }
        }
        int indice1 = -1;
        int indice2 = -1;
        double nearestDistance = findMinimumValue(distances);
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == nearestDistance) {
                indice1 = indices[0][i];
                indice2 = indices[1][i];
                System.out.println("The closest two points are " + "(" + points[indice1][0] + ", " + points[indice1][1] + ") " +
                        "and (" + points[indice2][0] + ", " + points[indice2][1] + ")");
            }
        }
        System.out.println("Their distance is " + nearestDistance);
    }

    public static double findDistance(double[][] array, int indice1, int indice2) {
        double distance = 0;

        double x1 = array[indice1][0];
        double y1 = array[indice1][1];
        double x2 = array[indice2][0];
        double y2 = array[indice2][1];
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distance;
    }

    public static double findMinimumValue(double[] array) {
        double minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}