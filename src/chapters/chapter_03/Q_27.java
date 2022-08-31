package chapters.chapter_03;

import java.util.Scanner;

public class Q_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter points x and y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double x0 = 200;
		double y0 = 0;
		double x1 = 0;
		double y1 = 100;
		double equation = (x1 - x0) * (y - y0) - (x - x0) * (y1 - y0); // Taken from exercise 3.32

		if (equation >= 0)
			System.out.println("The point is in the triangle.");
		else
			System.out.println("The point is not in the triangle.");

	}
}