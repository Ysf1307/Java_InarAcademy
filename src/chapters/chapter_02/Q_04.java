package chapters.chapter_02;

import java.util.Scanner;

public class Q_04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in pounds:");
		double pound = input.nextDouble();
		
		double kilogram = pound * 0.454;
		
		System.out.println("The value in kilogram: " + kilogram);
	}

}
