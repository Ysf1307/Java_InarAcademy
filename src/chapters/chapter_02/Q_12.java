package chapters.chapter_02;

import java.util.Scanner;

public class Q_12 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Acceleration:");
		double a = input.nextDouble();
		
		System.out.println("Enter the Take-Off Velocity");
		double v = input.nextDouble();
		
		double length = (v * v) / (2 * a);
		System.out.println("Minimum Runway Length: " + length);

	}

}
