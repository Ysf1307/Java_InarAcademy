package chapters.chapter_03;

import java.util.Scanner;

public class Q_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1 and y1 points:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2 points:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter x3 and y3 points:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Enter x4 and y4 points:");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		if ((y2 - y1) / (x2 - x1) == (y4 - y3) / (x4 - x3))
			System.out.println("Lines are parallel");
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("Intersection point is ( " + x + " , " + y + " )");
		}
	}
}