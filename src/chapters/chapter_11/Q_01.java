package chapters.chapter_11;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("Enter three sides of triangle: ");
        triangle.setSide1(input.nextDouble());
        triangle.setSide2(input.nextDouble());
        triangle.setSide3(input.nextDouble());

        System.out.println(triangle.toString());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("Is filled? : " + triangle.isFilled());
    }
}
