package chapters.chapter_09;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 and y1 points");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2 points");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x3 and y3 points");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.println("Enter x4 and y4 points");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 -y2;
        double b = -1 * (x1 - x2);
        double c = y3 -y4;
        double d = -1 * (x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable()){
            System.out.println("The equation has no solution.");
        }else {
            System.out.println("X Value is " + equation.getX());
            System.out.println("Y Value is " + equation.getY());
        }
    }
}
