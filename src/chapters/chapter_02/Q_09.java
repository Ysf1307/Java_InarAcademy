package chapters.chapter_02;

import java.util.Scanner;

public class Q_09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Initial Velocity:");
		double v_0 = input.nextDouble();
		
		System.out.println("Enter the Last Velocity:");
		double v_1 = input.nextDouble();
		
		System.out.println("Enter the Time in Seconds:");
		double t = input.nextDouble();
		
		double average = (v_1 - v_0) / t;
		System.out.println("Average Velocity: " + average);
		
	}

}
