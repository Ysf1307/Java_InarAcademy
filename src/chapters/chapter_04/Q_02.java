package chapters.chapter_04;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double radius = 6371.01;

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1d = input.nextDouble();
		double y1d = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2d = input.nextDouble();
		double y2d = input.nextDouble();
		
		double x1 = Math.toRadians(x1d);
		double y1 = Math.toRadians(y1d);
		double x2 = Math.toRadians(x2d);
		double y2 = Math.toRadians(y2d);
		
		double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is " + distance + " km");

		
		
}
}