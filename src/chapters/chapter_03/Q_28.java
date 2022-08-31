package chapters.chapter_03;

import java.util.Scanner;

public class Q_28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter x position of rectangle 1: ");
		double x1 = input.nextDouble();
		System.out.println("Enter y position of rectangle 1: ");
		double y1 = input.nextDouble();
		System.out.println("Enter width of rectangle 1: ");
		double width = input.nextDouble();
		System.out.println("Enter height of rectangle 1: ");
		double height = input.nextDouble();

		double rectangleRight1 = x1 + width / 2;
		double rectangleLeft1 = x1 - width / 2;
		double rectangleTop1 = y1 + height / 2;
		double rectangleBottom1 = y1 - height / 2;

		System.out.println("Enter x position of rectangle 2: ");
		double x2 = input.nextDouble();
		System.out.println("Enter y position of rectangle 2: ");
		double y2 = input.nextDouble();
		System.out.println("Enter width position of rectangle 2: ");
		double width2 = input.nextDouble();
		System.out.println("Enter height position of rectangle 2: ");
		double height2 = input.nextDouble();

		double rectangleRight2 = x2 + width2 / 2;
		double rectangleLeft2 = x2 - width2 / 2;
		double rectangleTop2 = y2 + height2 / 2;
		double rectangleBottom2 = y2 - height2 / 2;

		if (rectangleBottom1 <= rectangleBottom2 && rectangleLeft1 <= rectangleLeft2
				&& rectangleRight1 >= rectangleRight2 && rectangleTop1 >= rectangleTop2)
			System.out.println("Rectangle 2 is inside Rectangle 1");
		else if (rectangleRight1 < rectangleRight2 && rectangleRight1 > rectangleLeft2
				|| rectangleLeft1 > rectangleLeft2 && rectangleLeft1 < rectangleRight2
				|| rectangleTop1 < rectangleTop2 && rectangleTop1 > rectangleBottom2
				|| rectangleBottom1 > rectangleBottom2 && rectangleBottom1 < rectangleTop1)
			System.out.println("Rectangle 2 overlaps Rectangle 1");
		else System.out.println("Rectangle 2 does not overlap Rectangle 1");
		

	}
}