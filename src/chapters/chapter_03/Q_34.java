package chapters.chapter_03;

import java.util.Scanner;

public class Q_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter points x0 and y0 points for P0: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		System.out.println("Enter points x1 and y1 points for P1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter points x2 and y2 points for P2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double equation = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

		if (equation == 0)
			System.out.println("p2 is on the line segment");
		else
			System.out.println("p2 is not on the line segment");

	}
}