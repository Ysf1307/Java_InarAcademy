package chapters.chapter_02;

import java.util.Scanner;

public class Q_02 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter the radius:");
		double radius = keyboard.nextDouble();
		
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		
		
	}

}
