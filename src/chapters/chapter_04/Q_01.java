package chapters.chapter_04;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length from the center to a vertex:");
		double radius = input.nextDouble();

		double length = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 5));

		System.out.println("The area of the pentagon is " + area);
	}

}
