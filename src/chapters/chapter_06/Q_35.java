package chapters.chapter_06;

import java.util.Scanner;

public class Q_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        double area = area(side);

        System.out.println("The area of pentagon is " + area);
    }
    public static double area(double side){

        double area = (5 * (Math.pow(side, 2))) / (4 * Math.tan(Math.PI / 5));

        return area;
    }
}
