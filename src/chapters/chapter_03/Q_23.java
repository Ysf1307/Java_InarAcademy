package chapters.chapter_03;

import java.util.Scanner;

public class Q_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter x and y points:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5)
			System.out.println("Point ( " + x + ", " + y + " ) is in the rectangle");
		else
			System.out.println("Point ( " + x + ", " + y + " ) is not in the circle");
	}
}