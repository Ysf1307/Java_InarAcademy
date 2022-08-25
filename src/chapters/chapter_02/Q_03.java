package chapters.chapter_02;

import java.util.Scanner;

public class Q_03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in feet: ");
		double feet = input.nextDouble();
		
		double meter = feet * 0.305;
		
		System.out.println("The value in meter: " + meter);
	}

}
