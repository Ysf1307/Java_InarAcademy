package chapters.chapter_03;

import java.util.Scanner;

public class Q_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a,b and c values of the equation respectly:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double delta = (Math.pow(b, 2) - (4*a*c));
		
		if (delta > 0) {
			double r_1 = (-b + Math.pow(delta, 0.5) / (2*a));
			double r_2 = (-b - Math.pow(delta, 0.5) / (2*a));
			System.out.println("There are 2 roots:");
			System.out.println("Root 1: " + r_1);
			System.out.println("Root 2: " + r_2);	
		}
		else if (delta == 0) {
			double r_1 = (-b + Math.pow(delta, 0.5) / (2*a));
			System.out.println("There is 1 root:");
			System.out.println("Root: " + r_1);
		}
		else System.out.println("The equation has no real roots!");
			
		
				
	}

}
