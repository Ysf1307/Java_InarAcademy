package chapters.chapter_06;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = 0;

        System.out.println("Enter 1st side of triangle:");
        double side1 = input.nextDouble();
        System.out.println("Enter 2nd side of triangle:");
        double side2 = input.nextDouble();
        System.out.println("Enter 3rd side of triangle:");
        double side3 = input.nextDouble();

        boolean validation = MyTriangle.isValid(side1, side2, side3);
        if (validation == false){
            System.out.println("The input is invalid");
        }
        else {
            area = MyTriangle.area(side1, side2, side3);
            System.out.println("The area is " + area);
        }
    }
}


