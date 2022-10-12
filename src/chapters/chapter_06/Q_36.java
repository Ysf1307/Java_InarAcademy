package chapters.chapter_06;

import java.util.Scanner;

public class Q_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.println("Enter the length of a side:");
        double lengthOfSide = input.nextDouble();

        double area = computeArea(numberOfSides, lengthOfSide);

        System.out.println("The area of polygon is " + area);
    }

    private static double computeArea(int numberOfSides, double lengthOfSide) {
        double area = (numberOfSides * (Math.pow(lengthOfSide, 2))) / (4 * Math.tan(Math.PI / numberOfSides));

        return area;
    }
}
