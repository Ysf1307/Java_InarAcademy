package chapters.chapter_03;

import java.util.Scanner;

public class Q_29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x and y coordinates of Circle 1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter radius of Circle 1:");
		double r1 = input.nextDouble();
		
		System.out.println("Enter x and y coordinates of Circle 2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter radius of Circle 2:");
		double r2 = input.nextDouble();
		
		double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
		System.out.println("Distance: " + distance);
		
		if (distance <= (r2 - r1) || distance <= (r1 - r2))
			System.out.println("Circle 2 is inside Circle 1");
		else if (distance <= (r1 + r2))
			System.out.println("Circle 2 overlaps Circle 1");
		else System.out.println("Circle 2 does not overlap Circle 1");

}
}