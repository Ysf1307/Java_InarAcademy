package chapters.chapter_02;

import java.util.Scanner;

public class Q_19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x_1:");
		double x_1 = input.nextDouble();
		
		System.out.println("Enter y_1:");
		double y_1 = input.nextDouble();
		
		System.out.println("Enter x_2:");
		double x_2 = input.nextDouble();
		
		System.out.println("Enter y_2:");
		double y_2 = input.nextDouble();
		
		System.out.println("Enter x_3:");
		double x_3 = input.nextDouble();
		
		System.out.println("Enter y_3:");
		double y_3 = input.nextDouble();
		
		double side_1 = Math.pow((Math.pow((x_2 - x_1), 2) + Math.pow((y_2 - y_1), 2) ), 0.5);
		double side_2 = Math.pow((Math.pow((x_3 - x_2), 2) + Math.pow((y_3 - y_2), 2) ), 0.5);
		double side_3 = Math.pow((Math.pow((x_1 - x_3), 2) + Math.pow((y_1 - y_3), 2) ), 0.5);
		double s = (side_1 + side_2 + side_3) / 2;
		double area = Math.pow(
				( s * (s-side_1) * (s-side_2) * (s-side_3)), 0.5);
		System.out.println("Area: " + area);



}
}