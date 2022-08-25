package chapters.chapter_02;

import java.util.Scanner;

public class Q_15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x_1 value:");
		double x_1 = input.nextDouble();
		System.out.println("Enter y_1 value:");
		double y_1 = input.nextDouble();
		System.out.println("Enter x_2 value:");
		double x_2 = input.nextDouble();
		System.out.println("Enter y_2 value:");
		double y_2 = input.nextDouble();
		
		double distance = Math.pow((Math.pow((x_2 - x_1), 2) + Math.pow((y_2 - y_1), 2) ), 0.5);
		System.out.println("Distance: " + distance);
	}

}
