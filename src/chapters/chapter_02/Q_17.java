package chapters.chapter_02;

import java.util.Scanner;

public class Q_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the degree in Fahrenheit between -58, +41:");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind in velocity that must be greater than 2:");
		double velocity = input.nextDouble();
		
		double coldness = 35.74 + (0.6215 * temperature) 
				- (35.75 * Math.pow(velocity, 0.16)) 
				+ (0.4275 * temperature * Math.pow(velocity, 0.16));
		
		System.out.println("The Wind Chill Temperature: " + coldness);
		
		
	}
}